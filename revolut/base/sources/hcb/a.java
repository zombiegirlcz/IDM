package hcb;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import ecm.q;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f150870a;

    public a(Context context) {
        this.f150870a = context;
    }

    public final q a() {
        c.Companion.getClass();
        Context context = this.f150870a;
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        s.k(defaultSharedPreferences);
        return new q(defaultSharedPreferences);
    }
}
