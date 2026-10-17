package l9;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes16.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface i {
    Class as() default Void.class;

    Class contentAs() default Void.class;

    Class contentConverter() default x9.g.class;

    Class contentUsing() default k9.j.class;

    Class converter() default x9.g.class;

    g include() default g.DEFAULT_INCLUSION;

    Class keyAs() default Void.class;

    Class keyUsing() default k9.j.class;

    Class nullsUsing() default k9.j.class;

    h typing() default h.DEFAULT_TYPING;

    Class using() default k9.j.class;
}
