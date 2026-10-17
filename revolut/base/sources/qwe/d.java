package qwe;

import com.revolut.feature.checkout.models.ThreeDsCheckout;
import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$Step;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import we6.c0;
import we6.d0;
import we6.e0;
import y5i.b;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249889a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yki.l f249890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.checkout.flow.e f249891c;

    public /* synthetic */ d(com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar, yki.l lVar) {
        this.f249891c = eVar;
        this.f249890b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f249889a) {
            case 0:
                com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar = this.f249891c;
                CheckoutFlowContract$InputData checkoutFlowContract$InputData = eVar.o;
                y5i.b flowResult = (y5i.b) obj2;
                Intrinsics.checkNotNullParameter(flowResult, "flowResult");
                if (!(flowResult instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                boolean z = checkoutFlowContract$InputData.f90669b instanceof ThreeDsCheckout;
                yki.l lVar = this.f249890b;
                if (z) {
                    oki.h.D2(lVar);
                } else {
                    oki.h.r2(lVar);
                    oki.h.t2(eVar, lVar, new CheckoutFlowContract$Step.Checkout(new CheckoutScreenContract$InputData(checkoutFlowContract$InputData.f90668a, checkoutFlowContract$InputData.f90669b, checkoutFlowContract$InputData.f90670c, checkoutFlowContract$InputData.d, checkoutFlowContract$InputData.e, eVar.E.a(checkoutFlowContract$InputData))), false, null, false, 12);
                }
                return Unit.f186387a;
            default:
                e0 result = (e0) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                this.f249890b.e(true);
                if (result instanceof d0) {
                    String str = ((d0) result).f296634a;
                    com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar2 = this.f249891c;
                    eVar2.l2(new n(eVar2, str, null, 0), new yi5.b(26));
                } else if (!Intrinsics.f(result, c0.f296633a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ d(yki.l lVar, com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar) {
        this.f249890b = lVar;
        this.f249891c = eVar;
    }
}
