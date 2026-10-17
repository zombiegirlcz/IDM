package dah;

import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends oki.h implements dli.b {
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zjh.j f112539p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f112540q;

    public k(j stateMapper, g inputData, zjh.j wealthDisclaimerStateProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(wealthDisclaimerStateProvider, "wealthDisclaimerStateProvider");
        this.o = inputData;
        this.f112539p = wealthDisclaimerStateProvider;
        this.f112540q = mra.d.b(this, new f(inputData.f112535a, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        mzg.a type = this.o.f112535a;
        zjh.j jVar = this.f112539p;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        yji.l.a1(this, nim.a.v(((z0h.d) jVar.f322839a).w0(), new d3i.k(type, jVar, 28)), null, null, new d8j.c(this, (Continuation) null, 5), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f112540q;
    }
}
