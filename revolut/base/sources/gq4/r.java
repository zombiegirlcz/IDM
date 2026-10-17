package gq4;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.cancellation.repayment.CreditCardTerminatedRepaymentScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import om4.x2;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class r extends oki.h implements k {
    public final CreditCardTerminatedRepaymentScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final al4.n f145559p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vt4.b f145560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mw4.a f145561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wie.a f145562s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f145563t;

    public r(CreditCardTerminatedRepaymentScreenContract$InputData inputData, al4.n creditCardInteractor, vt4.b creditCardDialogMapper, mw4.a creditCardTopupDialogMapper, wie.a creditAccountDestinationResolver, t stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardDialogMapper, "creditCardDialogMapper");
        Intrinsics.checkNotNullParameter(creditCardTopupDialogMapper, "creditCardTopupDialogMapper");
        Intrinsics.checkNotNullParameter(creditAccountDestinationResolver, "creditAccountDestinationResolver");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f145559p = creditCardInteractor;
        this.f145560q = creditCardDialogMapper;
        this.f145561r = creditCardTopupDialogMapper;
        this.f145562s = creditAccountDestinationResolver;
        this.f145563t = mra.d.b(this, new i(inputData.f69162b, j6.a.p("toString(...)"), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        CreditCardTerminatedRepaymentScreenContract$InputData creditCardTerminatedRepaymentScreenContract$InputData = this.o;
        String str = creditCardTerminatedRepaymentScreenContract$InputData.f69161a;
        x2 x2Var = (x2) this.f145559p;
        w4l.i iVar = w4l.i.f294643c;
        yji.l.a1(this, rd0.e.n(nim.a.v(u0.m(x2Var.y(str, iVar), x2Var.A(creditCardTerminatedRepaymentScreenContract$InputData.f69161a, iVar)), new gn.a(25)), h0.f322473a), null, null, new gii.b(this, null, 17), 3);
    }

    public final void I2() {
        n2(new p(this, null), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f145563t;
    }
}
