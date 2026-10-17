package b20;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes19.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface d {
    int readTimeoutSeconds() default 60;

    int writeTimeoutSeconds() default 60;
}
