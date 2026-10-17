package b1j;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import kotlin.jvm.internal.Intrinsics;
import zm0.c;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1j.a f11806a;

    public a(d1j.a storage, c sessionProvider) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        this.f11806a = storage;
    }

    public final String a() {
        d1j.a aVar = this.f11806a;
        String str = (String) aVar.f110652b.T2("fcm_token", String.class);
        if (str != null) {
            return str;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(aVar.f110651a);
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        return defaultSharedPreferences.getString("fcm_token", null);
    }
}
