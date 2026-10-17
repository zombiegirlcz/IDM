package nv6;

import cli.y;
import et6.u0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nfj.g2;
import tof.cc;
import tof.i7;
import tof.q7;
import tof.xa;
import tof.y6;
import vkm.z1;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends oki.h implements p {
    public final gr6.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u0 f219532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final whf.b f219533q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q7 f219534r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f219535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f219536t;

    public s(gr6.h freelancerCashbackInteractor, u0 freelancerCapabilitiesInteractor, whf.b transactionsContentProvider, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(freelancerCashbackInteractor, "freelancerCashbackInteractor");
        Intrinsics.checkNotNullParameter(freelancerCapabilitiesInteractor, "freelancerCapabilitiesInteractor");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = freelancerCashbackInteractor;
        this.f219532p = freelancerCapabilitiesInteractor;
        this.f219533q = transactionsContentProvider;
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {new xa(io3.l.MERCHANT), new cc(u.c(y6.REWARD))};
        cVar.getClass();
        this.f219534r = i7.c.a(i7VarArr);
        z1 z1VarB = vkm.q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.f219535s = z1VarB;
        this.f219536t = mra.d.b(this, new l(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, nim.a.u(new g2(this, null), vkm.q.Q(this.f219535s, new ns9.h(continuation, this, 4))), null, new nn7.d(this, continuation, 27), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f219536t;
    }
}
