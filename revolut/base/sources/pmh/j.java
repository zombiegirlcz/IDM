package pmh;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import jel.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f237580w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f237580w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f237580w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j(this.f237580w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
            default:
                j jVar3 = new j(this.f237580w, continuation, 2);
                jVar3.v = obj2;
                return jVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        int i = this.u;
        k kVar = this.f237580w;
        switch (i) {
            case 0:
                d parcel = (d) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVar = kVar.f237581c;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                lVar.A2(new AssetDetailsDestination(parcel.f237572a.f214596b, null, false, null, null, null, 62));
                return Unit.f186387a;
            case 1:
                d parcel2 = (d) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVar2 = kVar.f237581c;
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                lVar2.A2(new AssetDetailsDestination(parcel2.f237572a.f214596b, null, false, null, null, null, 62));
                return Unit.f186387a;
            default:
                c parcel3 = (c) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVar3 = kVar.f237581c;
                Intrinsics.checkNotNullParameter(parcel3, "parcel");
                n nVar = lVar3.f237582l;
                w fundClass = parcel3.f237571a;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(fundClass, "fundClass");
                int[] iArr = m.f237583a;
                switch (iArr[fundClass.ordinal()]) {
                    case 1:
                        textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_trade_private_markets_fund_class_multi_asset, null, null, 14);
                        break;
                    case 2:
                        textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_trade_private_markets_fund_class_private_equity, null, null, 14);
                        break;
                    case 3:
                        textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_trade_private_markets_fund_class_venture_capital, null, null, 14);
                        break;
                    case 4:
                        textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_trade_private_markets_fund_class_private_credit, null, null, 14);
                        break;
                    case 5:
                        textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_trade_private_markets_fund_class_infrastructure, null, null, 14);
                        break;
                    case 6:
                        textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_trade_private_markets_fund_class_real_estate, null, null, 14);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                switch (iArr[fundClass.ordinal()]) {
                    case 1:
                        textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_invest_trade_private_markets_fund_class_multi_asset_info_description, null, null, 14);
                        break;
                    case 2:
                        textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_invest_trade_private_markets_fund_class_private_equity_info_description, null, null, 14);
                        break;
                    case 3:
                        textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_invest_trade_private_markets_fund_class_venture_capital_info_description, null, null, 14);
                        break;
                    case 4:
                        textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_invest_trade_private_markets_fund_class_private_credit_info_description, null, null, 14);
                        break;
                    case 5:
                        textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_invest_trade_private_markets_fund_class_infrastructure_info_description, null, null, 14);
                        break;
                    case 6:
                        textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_invest_trade_private_markets_fund_class_real_estate_info_description, null, null, 14);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar4 = new lw0.a(textLocalisedClause, textLocalisedClause2, null, null, false, 28);
                aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
                k9 k9Var = k9.Trading;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                yji.n.P2(lVar3, new ActionsBottomSheetController(new dii.a(aVar4, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
                return Unit.f186387a;
        }
    }
}
