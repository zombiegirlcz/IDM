package mlm;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes13.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface g {
    Class with() default KSerializer.class;
}
