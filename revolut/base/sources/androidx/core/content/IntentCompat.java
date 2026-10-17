package androidx.core.content;

import android.content.Intent;
import android.os.Build;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public abstract class IntentCompat {

    public static class Api33Impl {
        public static <T> T getParcelableExtra(Intent intent, String str, Class<T> cls) {
            return (T) intent.getParcelableExtra(str, cls);
        }

        public static <T extends Serializable> T getSerializableExtra(Intent intent, String str, Class<T> cls) {
            return (T) intent.getSerializableExtra(str, cls);
        }
    }

    public static <T> T getParcelableExtra(Intent intent, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) Api33Impl.getParcelableExtra(intent, str, cls);
        }
        T t2 = (T) intent.getParcelableExtra(str);
        if (cls.isInstance(t2)) {
            return t2;
        }
        return null;
    }

    public static <T extends Serializable> T getSerializableExtra(Intent intent, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) Api33Impl.getSerializableExtra(intent, str, cls);
        }
        T t2 = (T) intent.getSerializableExtra(str);
        if (cls.isInstance(t2)) {
            return t2;
        }
        return null;
    }
}
