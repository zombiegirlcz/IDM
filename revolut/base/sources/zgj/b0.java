package zgj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimUserPocket;
import com.youTransactor.uCube.rpc.Constants;
import dfj.e5;
import fej.d;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.checkout.a f322145b;

    public /* synthetic */ b0(com.revolut.retail.feature.esim.impl.ui.screens.checkout.a aVar, int i) {
        this.f322144a = i;
        this.f322145b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f322144a;
        com.revolut.retail.feature.esim.impl.ui.screens.checkout.a aVar = this.f322145b;
        switch (i) {
            case 0:
                fej.d output = (fej.d) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (Intrinsics.f(output, d.a.f134638a)) {
                    aVar.C2(u.f322185a);
                } else {
                    if (!Intrinsics.f(output, d.b.f134639a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.C2(s.f322183a);
                }
                return Unit.f186387a;
            case 1:
                w6c.e output2 = (w6c.e) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (!(output2 instanceof w6c.b) && !(output2 instanceof w6c.a)) {
                    boolean z = output2 instanceof w6c.c;
                    com.revolut.retail.feature.esim.impl.ui.screens.checkout.a aVar2 = this.f322145b;
                    if (z) {
                        PaymentMethod paymentMethod = ((w6c.c) output2).f295413a;
                        PaymentMethod.Pocket pocket = paymentMethod instanceof PaymentMethod.Pocket ? (PaymentMethod.Pocket) paymentMethod : null;
                        if (pocket == null) {
                            edl.a.n(paymentMethod, "EsimCheckoutScreenModel");
                            return Unit.f186387a;
                        }
                        aVar2.H2(aVar2.H, new c0(new EsimUserPocket(pocket.f84376a, pocket, pocket.i), 0));
                    } else {
                        if (!(output2 instanceof w6c.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        w6c.h hVar = ((w6c.d) output2).f295414a;
                        if (hVar == null) {
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "EsimCheckoutScreenModel", "Can not update topped-up balance: topUpTarget is null", null, h0Var);
                        } else {
                            bej.o oVar = aVar2.f100922r;
                            String pocketId = hVar.f295416b;
                            dj0.d previousBalance = hVar.f295417c;
                            String paymentMethodId = hVar.f295415a;
                            e5 e5Var = (e5) oVar;
                            e5Var.getClass();
                            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                            Intrinsics.checkNotNullParameter(previousBalance, "previousBalance");
                            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
                            yji.l.a1(aVar2, !((jte.d) e5Var.f113956b).c(EsimApi$Toggles.EsimAnyToAnyCheckout.f100168c) ? new go.g(previousBalance, 2) : e5Var.f113957c.f(new u6c.p(paymentMethodId, (String) null, (u6c.u) null, u6c.t.ESIM, (Long) null, (xi0.b) null, false, Constants.TAG_POWER_OFF_TIMEOUT), pocketId, previousBalance), null, null, new i0(aVar2, hVar, (Continuation) null, 0), 3);
                        }
                    }
                }
                return Unit.f186387a;
            default:
                r update = (r) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return r.a(update, null, null, null, null, null, wp5.y.u(aVar.o, "toString(...)"), null, null, null, null, null, null, null, null, null, 32735);
        }
    }
}
