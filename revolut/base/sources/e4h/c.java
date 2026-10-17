package e4h;

import ael.d0;
import e2j.j;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends a3h.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a3h.e f122552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f122553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vki.a f122554n;

    public c(a3h.e inputData, d0 stocksInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        this.f122552l = inputData;
        this.f122553m = stocksInteractor;
        this.f122554n = pyd.c.a(this, new a3h.d(null, a3h.f.COUNTRIES));
    }

    @Override // yji.n
    public final void H2() {
        n.l2(this, nim.a.v(rd0.e.b(this.f122553m.a(this.f122552l.f1134a, false)), new e1d.h(18)), null, new e0b.c(this, null, 12), 3);
    }

    @Override // a3h.c
    public final void Z2(a3h.f section) {
        Intrinsics.checkNotNullParameter(section, "section");
        X2(this.f122554n, new j(section, 13));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f122554n;
    }
}
