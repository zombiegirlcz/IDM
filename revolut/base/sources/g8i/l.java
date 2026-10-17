package g8i;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import com.revolut.feature_move_money.impl.R$string;
import com.revolut.feature_move_money.impl.review.MoveMoneyReviewScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MoveMoneyReviewScreen f141382w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(MoveMoneyReviewScreen moveMoneyReviewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f141382w = moveMoneyReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f141382w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            case 1:
                l lVar2 = new l(this.f141382w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
            default:
                l lVar3 = new l(this.f141382w, continuation, 2);
                lVar3.v = obj2;
                return lVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ty0.a aVar = (ty0.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        MoveMoneyReviewScreen moveMoneyReviewScreen = this.f141382w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarT2 = moveMoneyReviewScreen.T2();
                Intrinsics.h(clickData);
                e0 e0Var = (e0) vVarT2;
                e0Var.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                h8i.e eVar = e0Var.u;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                CryptoFcaRisksDestination cryptoFcaRisksDestinationD = ((gi5.d) eVar.f150055a).d(clickData);
                if (cryptoFcaRisksDestinationD != null) {
                    e0Var.C1(cryptoFcaRisksDestinationD);
                }
                break;
            case 1:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarT22 = moveMoneyReviewScreen.T2();
                String clickId = aVar2.f275445a;
                e0 e0Var2 = (e0) vVarT22;
                e0Var2.getClass();
                Intrinsics.checkNotNullParameter(clickId, "clickId");
                if (Intrinsics.f(clickId, "MOVE_MONEY_REVIEW_DESCRIPTION_CLICK")) {
                    e0Var2.f141373y.getClass();
                    lw0.a aVar4 = new lw0.a(new TextLocalisedClause(R$string.move_money_amount_screen_fees_bottom_sheet_title, null, null, 14), new TextLocalisedClause(R$string.move_money_amount_screen_fees_bottom_sheet_description, null, null, 14), null, null, false, 28);
                    k9 k9Var = k9.Payments;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    yji.l.j2(e0Var2, new ActionsBottomSheetController(new dii.a(aVar4, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
                } else {
                    hx7.e.n(new IllegalArgumentException(p.a.p("clickId ", clickId, " not found")));
                }
                break;
            default:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarT23 = moveMoneyReviewScreen.T2();
                Intrinsics.h(clickData2);
                e0 e0Var3 = (e0) vVarT23;
                e0Var3.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                e0Var3.n2(new g1k.i(e0Var3, clickData2, continuation, 19), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
