package q2e;

import aw0.n6;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct;
import com.revolut.feature.store.api.model.StoreCampaignOffer;
import com.revolut.feature.store.api.model.StoreGiftcardsOffer;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.feature.store.impl.ui.brand_detail.flow.StoreBrandDetailFlow;
import com.revolut.feature.store.impl.ui.brand_detail.flow.StoreBrandDetailFlowContract$ModalStep;
import com.revolut.feature.store.impl.ui.brand_detail.flow.StoreBrandDetailFlowContract$PagerItem;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ StoreBrandDetailFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(StoreBrandDetailFlow storeBrandDetailFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = storeBrandDetailFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        f fVar;
        StoreCampaignOffer storeCampaignOffer;
        StoreCampaignOffer storeCampaignOffer2;
        StoreCampaignOffer storeCampaignOffer3;
        StoreGiftcardsOffer storeGiftcardsOffer;
        StoreCampaignOffer storeCampaignOffer4;
        int i = this.u;
        StoreBrandDetailFlowContract$PagerItem.Earn earn = StoreBrandDetailFlowContract$PagerItem.Earn.f88658a;
        StoreBrandDetailFlow storeBrandDetailFlow = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.store.impl.ui.brand_detail.flow.c) storeBrandDetailFlow.e3()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar = (com.revolut.feature.store.impl.ui.brand_detail.flow.c) storeBrandDetailFlow.e3();
                cli.y yVar = cVar.T;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                String str = ((h) j2Var.getValue()).f241583b;
                if (Intrinsics.f(str, earn.getF94249a())) {
                    f fVar2 = (f) ((h) j2Var2.getValue()).f241588l.getContent();
                    if (fVar2 != null) {
                        StoreCampaignOffer storeCampaignOffer5 = fVar2.f241578b;
                        StoreCampaignOffer storeCampaignOffer6 = fVar2.f241577a;
                        if ((storeCampaignOffer6 != null && storeCampaignOffer5 != null) || storeCampaignOffer6 != null) {
                            storeCampaignOffer5 = storeCampaignOffer6;
                        } else if (storeCampaignOffer5 == null) {
                            storeCampaignOffer5 = fVar2.f241579c;
                        }
                        if (storeCampaignOffer5 != null) {
                            cVar.l2(new z(cVar, storeCampaignOffer5, null, 1), new t(cVar, 1));
                        }
                    }
                } else if (Intrinsics.f(str, StoreBrandDetailFlowContract$PagerItem.Redeem.f88660a.getF94249a())) {
                    StoreMegaOffer storeMegaOffer = (StoreMegaOffer) ((h) j2Var2.getValue()).f241584c.getContent();
                    if (storeMegaOffer != null) {
                        StoreMegaOffer.StoreRedeem storeRedeem = storeMegaOffer.f88550g;
                        boolean z = (storeRedeem != null ? storeRedeem.f88559b : null) != null;
                        f fVar3 = (f) ((h) j2Var2.getValue()).f241588l.getContent();
                        if (fVar3 == null || (storeCampaignOffer3 = fVar3.d) == null || z) {
                            storeCampaignOffer3 = null;
                        }
                        if (storeRedeem == null || (storeGiftcardsOffer = storeRedeem.f88558a) == null || z) {
                            storeGiftcardsOffer = null;
                        }
                        boolean zA = o2e.e.a(storeMegaOffer, storeCampaignOffer3);
                        if (storeGiftcardsOffer != null && !zA) {
                            VoucherProduct voucherProduct = ((h) j2Var2.getValue()).f;
                            if (voucherProduct != null) {
                                oki.h.v2(cVar.V, new StoreBrandDetailFlowContract$ModalStep.Checkout(storeGiftcardsOffer.f88527a, voucherProduct.f83639a, voucherProduct.f83640b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            }
                        } else if (storeCampaignOffer3 != null) {
                            cVar.l2(new z(cVar, storeCampaignOffer3, null, 4), new t(cVar, 3));
                        }
                    }
                } else if (Intrinsics.f(str, StoreBrandDetailFlowContract$PagerItem.Msi.f88659a.getF94249a())) {
                    f fVar4 = (f) ((h) j2Var2.getValue()).f241588l.getContent();
                    if (fVar4 != null && (storeCampaignOffer2 = fVar4.e) != null) {
                        cVar.l2(new z(cVar, storeCampaignOffer2, null, 3), new t(cVar, 4));
                    }
                } else if (Intrinsics.f(str, StoreBrandDetailFlowContract$PagerItem.Discount.f88657a.getF94249a()) && (fVar = (f) ((h) j2Var2.getValue()).f241588l.getContent()) != null && (storeCampaignOffer = fVar.f) != null) {
                    cVar.l2(new z(cVar, storeCampaignOffer, null, 0), new t(cVar, 10));
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar2 = (com.revolut.feature.store.impl.ui.brand_detail.flow.c) storeBrandDetailFlow.e3();
                cli.y yVar2 = cVar2.T;
                if (Intrinsics.f(((h) ((j2) yVar2.f22677a).getValue()).f241583b, earn.getF94249a())) {
                    f fVar5 = (f) ((h) ((j2) yVar2.f22677a).getValue()).f241588l.getContent();
                    if (fVar5 == null || (storeCampaignOffer4 = fVar5.f241578b) == null) {
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "StoreSecondaryCta", "In-store campaign not available", null, h0Var);
                    } else {
                        cVar2.l2(new z(cVar2, storeCampaignOffer4, null, 2), new t(cVar2, 0));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
