package d9;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes16.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface a0 {
    y content() default y.ALWAYS;

    Class contentFilter() default Void.class;

    y value() default y.ALWAYS;

    Class valueFilter() default Void.class;
}
