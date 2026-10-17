package l9;

import d9.y;

/* JADX INFO: loaded from: classes16.dex */
public @interface c {
    y include() default y.NON_NULL;

    String name() default "";

    String namespace() default "";

    boolean required() default false;

    Class type() default Object.class;

    Class value();
}
