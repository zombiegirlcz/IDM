package akl;

import android.net.Network;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Network f6078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1 f6079b;

    public q1(Network network, r1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f6078a = network;
        this.f6079b = callback;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj2;
        return Intrinsics.f(this.f6078a, q1Var.f6078a) && this.f6079b.equals(q1Var.f6079b);
    }

    public final int hashCode() {
        Network network = this.f6078a;
        return this.f6079b.hashCode() + ((network == null ? 0 : network.hashCode()) * 31);
    }
}
