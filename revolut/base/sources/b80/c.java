package b80;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import efm.r;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f13082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f13083b;

    public c(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        this.f13082a = connectivityManager;
        this.f13083b = j.b(new androidx.lifecycle.b(this, 5));
    }

    public final al0.a a() {
        NetworkInfo activeNetworkInfo = this.f13082a.getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? al0.a.OFFLINE : al0.a.ONLINE;
    }

    public final boolean b() {
        return a() == al0.a.ONLINE;
    }

    public final r c(boolean z) {
        Lazy lazy = this.f13083b;
        if (z) {
            r rVarStartWith = ((r) lazy.getValue()).startWith(a());
            Intrinsics.h(rVarStartWith);
            return rVarStartWith;
        }
        r rVar = (r) lazy.getValue();
        Intrinsics.h(rVar);
        return rVar;
    }
}
