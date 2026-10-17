package d9;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes16.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface h {
    g creatorVisibility() default g.DEFAULT;

    g fieldVisibility() default g.DEFAULT;

    g getterVisibility() default g.DEFAULT;

    g isGetterVisibility() default g.DEFAULT;

    g setterVisibility() default g.DEFAULT;
}
