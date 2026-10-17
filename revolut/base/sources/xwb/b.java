package xwb;

import aw0.n6;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroupDetails;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductTermsAndConditions;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase.RevPointsGiftCardPurchaseScreen;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase.RevPointsGiftCardPurchaseScreenContract$ModalStep;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.terms_and_conditions.RevPointsGiftcardsTermsAndConditionsScreenContract$InputData;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import uvb.k;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RevPointsGiftCardPurchaseScreen f309340w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(RevPointsGiftCardPurchaseScreen revPointsGiftCardPurchaseScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f309340w = revPointsGiftCardPurchaseScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f309340w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            default:
                b bVar2 = new b(this.f309340w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        VoucherProductTermsAndConditions voucherProductTermsAndConditions;
        String str2;
        int i = this.u;
        RevPointsGiftCardPurchaseScreen revPointsGiftCardPurchaseScreen = this.f309340w;
        switch (i) {
            case 0:
                n6 model = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase.a aVar2 = (com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase.a) revPointsGiftCardPurchaseScreen.R2();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = model.k;
                Continuation continuation = null;
                d dVar = obj3 instanceof d ? (d) obj3 : null;
                if (dVar != null) {
                    if (dVar.f309341a) {
                        VoucherProduct voucherProduct = ((e) ((j2) aVar2.u.f22677a).getValue()).d;
                        if (voucherProduct != null && (str = voucherProduct.d) != null) {
                            aVar2.l2(new xge.f(aVar2, voucherProduct, str, continuation, 19), new yi5.b(26));
                        }
                    } else {
                        aVar2.C2(k.f283354a);
                    }
                }
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase.a aVar4 = (com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase.a) revPointsGiftCardPurchaseScreen.R2();
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "SECTION_TERMS_CLICKABLE_TEXT_ID")) {
                    Object obj4 = clickData.d;
                    VoucherProductGroupDetails voucherProductGroupDetails = obj4 instanceof VoucherProductGroupDetails ? (VoucherProductGroupDetails) obj4 : null;
                    if (voucherProductGroupDetails != null && ((str2 = (voucherProductTermsAndConditions = voucherProductGroupDetails.f).f83653a) == null || aVar4.C1(new ExternalDestination.Browser(str2, null)) == null)) {
                        oki.h.v2(aVar4.v, new RevPointsGiftCardPurchaseScreenContract$ModalStep.TermsAndConditions(new RevPointsGiftcardsTermsAndConditionsScreenContract$InputData(voucherProductTermsAndConditions, voucherProductGroupDetails.f83647b != tvb.e.INTERNAL ? voucherProductGroupDetails.f83648c : null)), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                        Unit unit = Unit.f186387a;
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
