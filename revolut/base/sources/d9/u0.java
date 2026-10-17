package d9;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes16.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface u0 {
    Class defaultImpl() default u0.class;

    r0 include() default r0.PROPERTY;

    String property() default "";

    s0 use();

    boolean visible() default false;
}
