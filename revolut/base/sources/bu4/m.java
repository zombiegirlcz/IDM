package bu4;

import cli.y;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.payment_amount.CreditCardBoletoPaymentAmountContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import om4.w;
import om4.x2;
import vkm.j2;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends oki.h implements dli.b {
    public final w o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f18683p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wj0.a f18684q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f18685r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f18686s;

    public m(CreditCardBoletoPaymentAmountContract$InputData inputData, w creditCardBoletoInteractor, w80.b amountFormatter, wj0.a idempotencyKeyHolder, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardBoletoInteractor, "creditCardBoletoInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = creditCardBoletoInteractor;
        this.f18683p = amountFormatter;
        this.f18684q = idempotencyKeyHolder;
        this.f18685r = mra.d.b(this, new a(0), stateMapper, null, false, 12);
        this.f18686s = inputData.f69560a;
    }

    @Override // yji.l
    public final void I1() {
        this.f18684q.a("BOLETO_IDEMPOTENCY_TAG");
        w wVar = this.o;
        wVar.getClass();
        String facilityId = this.f18686s;
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        x2 x2Var = (x2) wVar.f226727b;
        yji.l.a1(this, rd0.e.n(nim.a.v(u0.i(x2Var.A(facilityId, loadingStrategy), x2Var.h(facilityId, loadingStrategy), x2Var.C(facilityId, ll4.w.MAIN_POCKET, loadingStrategy)), new okk.d(21)), h0.f322473a), null, null, new btd.e(this, null, 6), 3);
    }

    public final gl4.d I2() {
        return (gl4.d) zi0.c.I(((a) ((j2) this.f18685r.f22677a).getValue()).f18670a);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f18685r;
    }
}
