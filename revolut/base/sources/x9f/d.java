package x9f;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.number_of_shares.NumberOfSharesScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.d0;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ NumberOfSharesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(NumberOfSharesScreen numberOfSharesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = numberOfSharesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVarE3 = this.v.d();
        Intrinsics.h(model);
        m mVar = (m) kVarE3;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        bw0.m mVar2 = model.e;
        if ((mVar2 != null ? mVar2.e : null) instanceof f) {
            j60.a aVar2 = mVar.f303709p;
            mVar.o.getClass();
            aVar2.x(d0.a(new TextLocalisedClause(R$string.trading_stocks_transfer_in_asset_amount_sheet_title, null, null, 14), new TextLocalisedClause(R$string.trading_stocks_transfer_in_asset_amount_sheet_subtitle, null, null, 14), new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), "WHOLE_SHARES_ONLY_GOTIT_BUTTON_ID", g.f303702a, 992));
        }
        return Unit.f186387a;
    }
}
