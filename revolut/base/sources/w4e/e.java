package w4e;

import ael.k;
import kotlin.jvm.internal.Intrinsics;
import w4l.h;
import yji.n;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f294557l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ybl.b f294558m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vki.a f294559n;

    public e(c inputData, ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f294557l = inputData;
        this.f294558m = instrumentTickerInteractor;
        this.f294559n = pyd.c.a(this, new b(null, null));
    }

    @Override // yji.n
    public final void H2() {
        c cVar = this.f294557l;
        String str = cVar.f294555a;
        k kVar = (k) this.f294558m;
        n.l2(this, rd0.e.b(kVar.f(str)), null, new d(this, null, 0), 3);
        n.l2(this, kVar.o(cVar.f294555a, h.f294642c), null, new d(this, null, 1), 3);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f294559n;
    }
}
