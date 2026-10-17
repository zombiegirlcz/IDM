package occ;

import aii.q;
import aw0.n6;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.PromotedMerchantCheckoutContract$ModalStep;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.PromotedMerchantCheckoutController;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PromotedMerchantCheckoutController f224212w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(PromotedMerchantCheckoutController promotedMerchantCheckoutController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f224212w = promotedMerchantCheckoutController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f224212w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f224212w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            case 2:
                g gVar3 = new g(this.f224212w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
            default:
                g gVar4 = new g(this.f224212w, continuation, 3);
                gVar4.v = obj2;
                return gVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PromotedMerchantCheckoutController promotedMerchantCheckoutController = this.f224212w;
        switch (i) {
            case 0:
                n6 model = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.a aVar2 = (com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.a) promotedMerchantCheckoutController.R2();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                String str = ((a) ((j2) aVar2.f84685w.f22677a).getValue()).f224206a.d;
                if (str == null) {
                    throw new IllegalArgumentException("website shouldn't be null");
                }
                aVar2.C1(new ExternalDestination.Browser(str, null));
                aVar2.C2(q.f5292a);
                return Unit.f186387a;
            case 1:
                n6 model2 = (n6) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.a aVar4 = (com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.a) promotedMerchantCheckoutController.R2();
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                oki.h.v2(aVar4.u, PromotedMerchantCheckoutContract$ModalStep.OptIn.f84679a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                return Unit.f186387a;
            case 2:
                ty0.a aVar5 = (ty0.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.a) promotedMerchantCheckoutController.R2()).y(aVar5);
                return Unit.f186387a;
            default:
                ty0.a aVar7 = (ty0.a) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b bVarM3 = promotedMerchantCheckoutController.R2();
                Intrinsics.h(aVar7);
                ((com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout.a) bVarM3).y(aVar7);
                return Unit.f186387a;
        }
    }
}
