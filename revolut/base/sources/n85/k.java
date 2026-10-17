package n85;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentslist.LoanRepaymentsListScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends jki.g implements g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LoanRepaymentsListScreenContract$InputData f213216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l35.b f213217q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y45.i f213218r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ang.f f213219s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ky4.e f213220t;
    public final z1 u;
    public final f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(LoanRepaymentsListScreenContract$InputData inputData, l35.b loanInteractor, y45.i loanProductInteractor, ang.f userInteractor, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f213216p = inputData;
        this.f213217q = loanInteractor;
        this.f213218r = loanProductInteractor;
        this.f213219s = userInteractor;
        this.f213220t = new ky4.e(0);
        this.u = q.b(1, 4, null);
        this.v = new f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null);
    }

    @Override // yji.l
    public final void I1() {
        LoanRepaymentsListScreenContract$InputData loanRepaymentsListScreenContract$InputData = this.f213216p;
        yji.l.a1(this, ta6.a.h(rd0.e.b(this.f213218r.b(loanRepaymentsListScreenContract$InputData.f70580a, w4l.h.f294642c)), rd0.e.b(l35.b.e(this.f213217q, loanRepaymentsListScreenContract$InputData.f70580a)), this.f213219s.j(w4l.j.f294644c), new ate.b(this, null, 11)), null, null, new i(this, null, 0), 3);
        yji.l.a1(this, new t38.e(w2(), 24, this.u, j.f213215a), null, null, new i(this, null, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.v;
    }
}
