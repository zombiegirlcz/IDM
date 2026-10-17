package d9;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes16.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface w0 {
    boolean enabled() default true;

    String prefix() default "";

    String suffix() default "";
}
