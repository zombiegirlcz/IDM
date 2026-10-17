package b80;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import tfm.z0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f13080a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f13081b;

    public b(z0 z0Var) {
        this.f13081b = z0Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        this.f13080a.incrementAndGet();
        this.f13081b.c(al0.a.ONLINE);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        AtomicInteger atomicInteger = this.f13080a;
        atomicInteger.decrementAndGet();
        if (atomicInteger.get() == 0) {
            this.f13081b.c(al0.a.OFFLINE);
        }
    }
}
