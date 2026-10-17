package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.os.LocaleListCompat;

/* JADX INFO: loaded from: classes15.dex */
public abstract class LocaleManagerCompat {

    public static class Api33Impl {
        public static LocaleList localeManagerGetApplicationLocales(Object obj2) {
            return ((LocaleManager) obj2).getApplicationLocales();
        }
    }

    public static LocaleListCompat getApplicationLocales(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return LocaleListCompat.forLanguageTags(AppLocalesStorageHelper.readLocales(context));
        }
        Object localeManagerForApplication = getLocaleManagerForApplication(context);
        return localeManagerForApplication != null ? LocaleListCompat.wrap(Api33Impl.localeManagerGetApplicationLocales(localeManagerForApplication)) : LocaleListCompat.getEmptyLocaleList();
    }

    private static Object getLocaleManagerForApplication(Context context) {
        return context.getSystemService("locale");
    }
}
