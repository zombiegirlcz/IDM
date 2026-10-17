package d9;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes16.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface n0 {
    z0 contentNulls() default z0.DEFAULT;

    z0 nulls() default z0.DEFAULT;

    String value() default "";
}
