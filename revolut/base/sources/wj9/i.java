package wj9;

import com.revolut.data.model.Data;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xh9.a f298030p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f298031q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xh9.a payLaterInteractor, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f298030p = payLaterInteractor;
        this.f298031q = new d(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        ti9.g gVar = (ti9.g) this.f298030p;
        l.a1(this, rd0.e.b(w.l(nim.a.w(rd0.e.c(gVar.k(w4l.h.f294642c), kotlin.coroutines.g.f186406a), new wgk.f(24)), gVar.i())), null, null, new w50.g(this, (Continuation) null, 28), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f298031q;
    }
}
