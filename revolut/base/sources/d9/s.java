package d9;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes16.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface s {
    Class generator();

    String property() default "@id";

    Class resolver() default e1.class;

    Class scope() default Object.class;
}
