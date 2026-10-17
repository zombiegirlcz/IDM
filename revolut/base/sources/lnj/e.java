package lnj;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.EsimRefundScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.EsimRefundScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.EsimRefundScreenContract$RefundInfo;
import dej.f3;
import dej.g3;
import dej.t1;
import ip0.e8;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EsimRefundScreen f197269w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(EsimRefundScreen esimRefundScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f197269w = esimRefundScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f197269w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f197269w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f197269w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((e8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((t1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        Object[] objArr = 0;
        EsimRefundScreen esimRefundScreen = this.f197269w;
        switch (i) {
            case 0:
                e8 e8Var = (e8) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE3 = esimRefundScreen.d();
                Object obj3 = e8Var.e;
                com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c cVar = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c) hVarE3;
                if (obj3 instanceof EsimRefundScreenContract$RefundInfo) {
                    EsimRefundScreenContract$RefundInfo esimRefundScreenContract$RefundInfo = (EsimRefundScreenContract$RefundInfo) obj3;
                    oki.h.v2(cVar.v, (esimRefundScreenContract$RefundInfo.f101451b || esimRefundScreenContract$RefundInfo.f101450a != null) ? new EsimRefundScreenContract$ModalStep.RefundSummary(esimRefundScreenContract$RefundInfo) : EsimRefundScreenContract$ModalStep.HowRefundsCalculated.f101446a, bottom_dialog);
                } else {
                    cVar.getClass();
                }
                return Unit.f186387a;
            case 1:
                t1 subscription = (t1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE32 = esimRefundScreen.d();
                Intrinsics.h(subscription);
                com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c cVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c) hVarE32;
                com.revolut.kompot.navigable.vc.modal.a aVar3 = cVar2.v;
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                g3 g3Var = subscription.f113663t;
                f3 f3Var = g3Var != null ? g3Var.f113541a : null;
                int i2 = f3Var == null ? -1 : k.f197281a[f3Var.ordinal()];
                if (i2 != -1) {
                    int i3 = 1;
                    if (i2 == 1) {
                        cVar2.H2(cVar2.u, new bnj.i(subscription, i3));
                    } else if (i2 == 2) {
                        oki.h.v2(aVar3, EsimRefundScreenContract$ModalStep.RefundPending.f101448a, bottom_dialog);
                    } else if (i2 == 3) {
                        oki.h.v2(aVar3, new EsimRefundScreenContract$ModalStep.NonEligibleForRefund(g3Var != null ? g3Var.d : null), bottom_dialog);
                    } else if (i2 != 4 && i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f186387a;
            default:
                ty0.a aVar4 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE33 = esimRefundScreen.d();
                Object obj4 = aVar4.d;
                com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c cVar3 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.c) hVarE33;
                cVar3.getClass();
                if (obj4 instanceof EsimDescriptorValue.Link) {
                    cVar3.A1(new ll6.i(cVar3, ((EsimDescriptorValue.Link) obj4).f100253a, objArr == true ? 1 : 0, 12), new yi5.b(25));
                }
                return Unit.f186387a;
        }
    }
}
