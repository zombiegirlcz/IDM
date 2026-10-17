package twb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.giftcards.api.R$string;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductTermsAndConditions;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.RevPointsGiftcardDetailsScreen;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.RevPointsGiftcardDetailsScreenContract$ModalStep;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RevPointsGiftcardDetailsScreen f274975w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(RevPointsGiftcardDetailsScreen revPointsGiftcardDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f274975w = revPointsGiftcardDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f274975w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f274975w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevPointsGiftcardDetailsScreen revPointsGiftcardDetailsScreen = this.f274975w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE3 = revPointsGiftcardDetailsScreen.d();
                Intrinsics.h(id10);
                com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a aVar2 = (com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a) mVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("REV_POINTS_BALANCE_MENU_ID")) {
                    oki.h.v2(aVar2.K, RevPointsGiftcardDetailsScreenContract$ModalStep.Balance.f83711a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE32 = revPointsGiftcardDetailsScreen.d();
                Intrinsics.h(clickData);
                com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a aVar4 = (com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a) mVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "SECTION_TERMS_CLICKABLE_TEXT_ID")) {
                    Object obj3 = clickData.d;
                    Pair pair = obj3 instanceof Pair ? (Pair) obj3 : null;
                    if (pair == null) {
                        aVar4.X1(aVar4.K2());
                    } else {
                        Object obj4 = pair.f186385a;
                        VoucherProductTermsAndConditions voucherProductTermsAndConditions = obj4 instanceof VoucherProductTermsAndConditions ? (VoucherProductTermsAndConditions) obj4 : null;
                        if (voucherProductTermsAndConditions == null) {
                            aVar4.X1(aVar4.K2());
                        } else {
                            Object obj5 = pair.f186386b;
                            String str = obj5 instanceof String ? (String) obj5 : null;
                            String str2 = voucherProductTermsAndConditions.f83653a;
                            if (str2 == null || aVar4.C1(u0.c(new WebViewFeatureConfig(str2, new TextLocalisedClause(R$string.gift_cards_details_terms_and_conditions_key, null, null, 14), 0, false, true, false, 130972))) == null) {
                                aVar4.C2(new uvb.g(voucherProductTermsAndConditions, str));
                                Unit unit = Unit.f186387a;
                            }
                        }
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
