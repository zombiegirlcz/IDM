package pc1;

import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.payment.CardReaderPaymentScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ma1.t;
import ma1.x;
import rp0.g1;
import skm.a2;

/* JADX INFO: loaded from: classes20.dex */
public final class q extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CardReaderPaymentScreenContract$InputData f234796p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final da1.e f234797q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final da1.d f234798r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cfc.b f234799s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g1 f234800t;
    public final b u;
    public final xc1.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a2 f234801w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final jki.j f234802x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(jki.p stateMapper, CardReaderPaymentScreenContract$InputData inputData, da1.e paymentInteractor, da1.d connectionInteractor, cfc.b cardReaderUiMerchantInteractor, g1 shotDialogDisplayer, b dialogFactory, xc1.d stickyActionExtension) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(paymentInteractor, "paymentInteractor");
        Intrinsics.checkNotNullParameter(connectionInteractor, "connectionInteractor");
        Intrinsics.checkNotNullParameter(cardReaderUiMerchantInteractor, "cardReaderUiMerchantInteractor");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(stickyActionExtension, "stickyActionExtension");
        this.f234796p = inputData;
        this.f234797q = paymentInteractor;
        this.f234798r = connectionInteractor;
        this.f234799s = cardReaderUiMerchantInteractor;
        this.f234800t = shotDialogDisplayer;
        this.u = dialogFactory;
        this.v = stickyActionExtension;
        this.f234802x = jki.j.f175191a;
    }

    public static void z2(String str) {
        ea1.b.a("Bottom dialog displayed: ".concat(str), fa1.k.INFO);
    }

    public final void A2() {
        Continuation continuation = null;
        if (!((t) this.f234798r).c()) {
            n2(new h(this, continuation, 0), new whi.b(6));
            return;
        }
        a2 a2Var = this.f234801w;
        if (a2Var != null) {
            a2Var.f(null);
        }
        dj0.d dVarY2 = y2();
        CardReaderPaymentScreenContract$InputData cardReaderPaymentScreenContract$InputData = this.f234796p;
        this.f234801w = yji.l.a1(this, rd0.e.b(((x) this.f234797q).a(dVarY2, cardReaderPaymentScreenContract$InputData.f60656b, cardReaderPaymentScreenContract$InputData.f60657c, cardReaderPaymentScreenContract$InputData.d)), null, null, new k(this, null), 3);
    }

    @Override // yji.l
    public final void I1() {
        A2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f234802x;
    }

    public final dj0.d y2() {
        CardReaderPaymentScreenContract$InputData cardReaderPaymentScreenContract$InputData = this.f234796p;
        return pyd.c.O(cardReaderPaymentScreenContract$InputData.f60655a, cardReaderPaymentScreenContract$InputData.f60656b);
    }
}
