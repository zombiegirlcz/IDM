package lw6;

import cli.g;
import cli.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.q;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h implements dli.b {
    public final ppg.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f200415p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f200416q;

    public e(ppg.b vaultsInteractor, f stateMapper) {
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = vaultsInteractor;
        z1 z1VarB = q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.f200415p = z1VarB;
        this.f200416q = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, nim.a.v(q.Q(this.f200415p, new li2.f(continuation, this, 15)), new lv9.c(5)), null, null, new lph.h(this, continuation, 9), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f200416q;
    }
}
