package bx5;

import bw0.l;
import bw0.m;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cryptocommodity_invest.api.R$string;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.amount.v2.CryptoCommodityBuyCollectionAmountScreenV2;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import yhm.o;
import zhm.u;
import zw5.n;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoCommodityBuyCollectionAmountScreenV2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CryptoCommodityBuyCollectionAmountScreenV2 cryptoCommodityBuyCollectionAmountScreenV2, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoCommodityBuyCollectionAmountScreenV2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        zw5.e eVarI3 = this.v.T2();
        m mVar = model.e;
        Object obj3 = mVar != null ? mVar.e : null;
        n nVar = (n) eVarI3;
        Object objI = zi0.c.I(((zw5.a) nVar.t2()).f325727g);
        xzg.m mVar2 = objI instanceof xzg.m ? (xzg.m) objI : null;
        if (mVar2 != null) {
            if (obj3 == l.INFO) {
                ((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.a) nVar.v).P2();
            } else {
                if (obj3 != l.ERROR) {
                    throw new IllegalStateException(("Amount edit end hint with parcel " + obj3 + " not supported").toString());
                }
                j60.a aVar2 = nVar.f325748t;
                vw5.a aVar3 = nVar.u;
                dj0.d minimumAmountPerCrypto = ((zw5.a) nVar.t2()).f325726c.f95268g;
                dj0.d minimumTotalAmount = ((zw5.a) nVar.t2()).f325726c.f95269h;
                mVar2.d.size();
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(minimumTotalAmount, "minimumTotalAmount");
                Intrinsics.checkNotNullParameter(minimumAmountPerCrypto, "minimumAmountPerCrypto");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cryptocommodity_invest_collections_amount_screen_below_minimum, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.cryptocommodity_invest_collections_limit_lower_dialog_message, u.c(new MoneyClause(minimumTotalAmount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R.string.common_action_got_it, null, null, 14);
                int i = R$attr.uikit_dp24;
                int i2 = R$attr.uikit_dp16;
                aVar2.x(new y(u.c(new LargeActionButtonDelegate.Model("MINIMUM_INVESTMENT_DIALOG_ID", defaultFilledButton, null, textLocalisedClause3, false, null, null, i, i, i2, i2, 496)), new t(textLocalisedClause, textLocalisedClause2, null, 28), rp0.l.WINDOW, null, null, null, 1016));
            }
        }
        return Unit.f186387a;
    }
}
