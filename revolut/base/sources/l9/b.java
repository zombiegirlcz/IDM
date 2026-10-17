package l9;

import d9.y;

/* JADX INFO: loaded from: classes16.dex */
public @interface b {
    y include() default y.NON_NULL;

    String propName() default "";

    String propNamespace() default "";

    boolean required() default false;

    String value();
}
