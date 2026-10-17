package l9;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k9.s;

/* JADX INFO: loaded from: classes16.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface f {
    Class value() default s.class;
}
