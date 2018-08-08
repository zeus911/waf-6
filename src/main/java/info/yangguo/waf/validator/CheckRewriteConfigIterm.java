package info.yangguo.waf.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {RewriteConfigItermValidator.class})
public @interface CheckRewriteConfigIterm {
    String message() default "iterm is illegal";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}