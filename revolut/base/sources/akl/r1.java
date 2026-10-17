package akl;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes12.dex */
public final class r1 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ skm.l f6083a;

    public r1(skm.l lVar) {
        this.f6083a = lVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        skm.l lVar = this.f6083a;
        if (lVar.y()) {
            return;
        }
        m.Companion companion = yhm.m.INSTANCE;
        lVar.resumeWith(new q1(network, this));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        skm.l lVar = this.f6083a;
        if (lVar.y()) {
            return;
        }
        m.Companion companion = yhm.m.INSTANCE;
        lVar.resumeWith(new q1(null, this));
    }
}
