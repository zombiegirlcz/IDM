package ldc;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$BreakdownDisclaimer;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ks0.n;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends oki.h implements f {
    public final PaymentBreakdownControllerDescriptor$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f194068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f194069q;

    public k(PaymentBreakdownControllerDescriptor$InputData inputData, n userInfoInteractor, j stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInfoInteractor, "userInfoInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f194068p = userInfoInteractor;
        this.f194069q = mra.d.b(this, new e(inputData.f84441a, inputData.f84442b, inputData.f84443c, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Flow flowI;
        PaymentBreakdownControllerDescriptor$BreakdownDisclaimer paymentBreakdownControllerDescriptor$BreakdownDisclaimer = this.o.d;
        if (paymentBreakdownControllerDescriptor$BreakdownDisclaimer instanceof PaymentBreakdownControllerDescriptor$BreakdownDisclaimer.Empty) {
            flowI = zi0.c.i(c.f194058a);
        } else if (paymentBreakdownControllerDescriptor$BreakdownDisclaimer instanceof PaymentBreakdownControllerDescriptor$BreakdownDisclaimer.Custom) {
            flowI = zi0.c.i(new a(((PaymentBreakdownControllerDescriptor$BreakdownDisclaimer.Custom) paymentBreakdownControllerDescriptor$BreakdownDisclaimer).f84437a));
        } else {
            if (!(paymentBreakdownControllerDescriptor$BreakdownDisclaimer instanceof PaymentBreakdownControllerDescriptor$BreakdownDisclaimer.Default)) {
                throw new NoWhenBranchMatchedException();
            }
            PaymentBreakdownControllerDescriptor$BreakdownDisclaimer.Default r06 = (PaymentBreakdownControllerDescriptor$BreakdownDisclaimer.Default) paymentBreakdownControllerDescriptor$BreakdownDisclaimer;
            com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e eVar = r06.f84438a;
            n6c.a aVar = r06.f84439b;
            flowI = aVar != null ? zi0.c.i(new b(eVar, aVar)) : nim.a.v(nim.a.v(rd0.e.b(hng.g.b(((ang.b) ((l61.a) this.f194068p.f189085b)).f7765a)), new q75.n(14)), new laj.b(eVar, 9));
        }
        l.a1(this, flowI, null, null, new l1g.e(this, (Continuation) null, 23), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f194069q;
    }
}
