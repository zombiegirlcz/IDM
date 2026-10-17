package d9;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes16.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface q {
    c1 lenient() default c1.DEFAULT;

    String locale() default "##default";

    String pattern() default "";

    o shape() default o.ANY;

    String timezone() default "##default";

    m[] with() default {};

    m[] without() default {};
}
