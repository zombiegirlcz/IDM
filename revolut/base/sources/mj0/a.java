package mj0;

import aii.u;
import b60.e;
import com.revolut.core.network.NetworkToggles$DisableCertificateFingerprintInUserAgent;
import com.revolut.core.network.NetworkToggles$SimulatedFailover;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nhi.f;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements nte.a, f, e {
    @Override // nhi.h, aii.p
    public final void b() {
    }

    @Override // nte.a
    public final List e() {
        return v.k(NetworkToggles$DisableCertificateFingerprintInUserAgent.f51444c, NetworkToggles$SimulatedFailover.f51445a);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
