package njj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.youTransactor.uCube.rpc.Constants;
import fej.d;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a f216574b;

    public /* synthetic */ l0(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar, int i) {
        this.f216573a = i;
        this.f216574b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f216573a;
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar = this.f216574b;
        switch (i) {
            case 0:
                b0 update = (b0) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return b0.a(update, wp5.y.u(aVar.o, "toString(...)"), null, null, null, null, null, null, false, null, 510);
            case 1:
                fej.d output = (fej.d) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (Intrinsics.f(output, d.a.f134638a)) {
                    aVar.C2(f0.f216559a);
                } else {
                    if (!Intrinsics.f(output, d.b.f134639a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.C2(d0.f216553a);
                }
                return Unit.f186387a;
            default:
                w6c.e output2 = (w6c.e) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (!(output2 instanceof w6c.b) && !(output2 instanceof w6c.a)) {
                    boolean z = output2 instanceof w6c.c;
                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar2 = this.f216574b;
                    Object[] objArr = 0;
                    if (z) {
                        PaymentMethod paymentMethod = ((w6c.c) output2).f295413a;
                        PaymentMethod.Pocket pocket = paymentMethod instanceof PaymentMethod.Pocket ? (PaymentMethod.Pocket) paymentMethod : null;
                        if (pocket == null) {
                            edl.a.n(paymentMethod, "EsimMobilePlanCheckoutScreenModel");
                            return Unit.f186387a;
                        }
                        aVar2.H2(aVar2.G, new dmj.f0(pocket, 2));
                    } else {
                        if (!(output2 instanceof w6c.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        w6c.h hVar = ((w6c.d) output2).f295414a;
                        if (hVar == null) {
                            zhm.h0 h0Var = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "EsimMobilePlanCheckoutScreenModel", "Can not update topped-up balance: topUpTarget is null", null, h0Var);
                        } else {
                            yji.l.a1(aVar2, aVar2.f101172q.f(new u6c.p(hVar.f295415a, (String) null, (u6c.u) null, u6c.t.ESIM_MOBILE_PLANS, (Long) null, (xi0.b) null, false, Constants.TAG_POWER_OFF_TIMEOUT), hVar.f295416b, hVar.f295417c), null, null, new lhk.a0(aVar2, hVar, objArr == true ? 1 : 0, 19), 3);
                        }
                    }
                }
                return Unit.f186387a;
        }
    }
}
