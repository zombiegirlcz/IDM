package ff1;

import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nd1.c f134696p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f134697q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p stateMapper, nd1.c catalogueInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(catalogueInteractor, "catalogueInteractor");
        this.f134696p = catalogueInteractor;
        this.f134697q = new e(f0.f322471a);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, nz8.d.j(rd0.e.b(this.f134696p.c(false)), null, 3), null, null, new f9d.c(this, (Continuation) null, 10), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f134697q;
    }
}
