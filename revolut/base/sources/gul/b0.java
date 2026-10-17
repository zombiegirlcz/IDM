package gul;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.t0;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ppk.f f146977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l4i.a f146978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f146979c;

    public b0(ppk.f ratesInteractor, l4i.a amountConverter, gte.a featureToggleInteractor, z securityBalanceBuilder) {
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(securityBalanceBuilder, "securityBalanceBuilder");
        this.f146977a = ratesInteractor;
        this.f146978b = amountConverter;
        this.f146979c = featureToggleInteractor;
    }

    public final Flow a(cam.f fVar) {
        return vkm.q.q(nim.a.v(u0.i(new t0(fVar.B(new f(19)), 1), fVar.B(new f(20)), new t0(fVar.B(new f(21)), 1)), new f(this)));
    }
}
