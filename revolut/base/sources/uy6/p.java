package uy6;

import cli.y;
import et6.p1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends oki.h implements dli.b {
    public final p1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.b f284092p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f284093q;

    public p(p1 invoiceInteractor, tyc.l stateMapper) {
        Intrinsics.checkNotNullParameter(invoiceInteractor, "invoiceInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = invoiceInteractor;
        this.f284092p = new vii.b();
        this.f284093q = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f284092p, new uec.d(continuation, this, 11)), null, null, new up2.q(this, continuation, 13), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f284093q;
    }
}
