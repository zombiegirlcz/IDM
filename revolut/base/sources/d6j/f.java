package d6j;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.commodity.asset_details.impl.R$string;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mx0.mc;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CommodityAssetDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(CommodityAssetDetailsScreen commodityAssetDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = commodityAssetDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            default:
                return new f(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((mc) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CommodityAssetDetailsScreen commodityAssetDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n0) commodityAssetDetailsScreen.R2()).I2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j60.a aVar3 = ((n0) commodityAssetDetailsScreen.R2()).I;
                rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.asset_details_investment_unrealised_return_dialog_title, null, null, 14), new TextLocalisedClause(R$string.asset_details_investment_unrealised_return_dialog_description, null, null, 14), null, 28);
                LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("UNREALISED_RETURN_INFO_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.asset_details_common_got_it, null, null, 14), false, null, null, null, null, 1000);
                yp0.b.r(model, 0, R$attr.uikit_dp8, 0, 0, 13);
                aVar3.x(new rp0.y(zhm.u.c(model), tVar, null, null, null, null, 1020));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n0) commodityAssetDetailsScreen.R2()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
