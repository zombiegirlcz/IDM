package h7l;

import android.content.SharedPreferences;
import je0.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.g;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends g {

    @NotNull
    public static final C0864a Companion = new C0864a();

    /* JADX INFO: renamed from: h7l.a$a, reason: collision with other inner class name */
    public static final class C0864a {
        private C0864a() {
        }
    }

    public a() {
        super(1, 2, 0);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPref, d mapper) {
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        if (sharedPref.contains("CONFIGURATION_TIME_KEY")) {
            sharedPref.edit().remove("CONFIGURATION_TIME_KEY").putString("COMMON_CONFIG_LAST_MODIFIED_DATE", String.valueOf(sharedPref.getLong("CONFIGURATION_TIME_KEY", 0L))).commit();
        }
    }
}
