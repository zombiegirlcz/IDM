package n2i;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.OrderTypeDialogContract$DialogParcel;
import g1i.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import rp0.t;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f211547b;

    public /* synthetic */ c(j jVar, int i) {
        this.f211546a = i;
        this.f211547b = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f211546a) {
            case 0:
                CellDetailsSwitcherDelegate.Model it8 = (CellDetailsSwitcherDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                j jVar = this.f211547b;
                pfm.h hVarN = pd.b.n(kotlin.coroutines.g.f186406a, new f(jVar, it8, null));
                c2i.j jVar2 = jVar.o;
                boolean z = !it8.f51915c;
                d0 d0Var = (d0) jVar2;
                d0Var.getClass();
                pfm.a aVarE = hVarN.e(d0Var.R3(new a6j.a(d0Var, z, 24)));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            case 1:
                ExchangeOrderDraft draft = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft, "draft");
                if (draft.f96881c != wd6.e.BUY || draft.e != wd6.h.MARKET) {
                    return m.f235744a;
                }
                j jVar3 = this.f211547b;
                c2i.j jVar4 = jVar3.o;
                boolean zA = jVar3.f211555q.a();
                d0 d0Var2 = (d0) jVar4;
                d0Var2.getClass();
                return d0Var2.R3(new a6j.a(d0Var2, zA, 24));
            default:
                j jVar5 = this.f211547b;
                opi.d dVar = jVar5.f211557s;
                ((com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.b) jVar5.f211556r).getClass();
                t tVar = new t(new TextLocalisedClause(R$string.cryptobuysell_take_profit_stop_loss_order_title, null, null, 14), new TextLocalisedClause(R$string.fx_orders_take_profit_stop_loss_tpsl_dialog_text, null, null, 14), null, 28);
                LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("TAKE_PROFIT_STOP_LOSS_LARGE_BUTTON_LIST_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.fx_orders_take_profit_stop_loss_tpsl_dialog_got_it, null, null, 14), false, null, null, null, null, 1000);
                yp0.b.r(model, 0, 0, 0, 0, 15);
                return ((opi.b) dVar).a0(new y(u.c(model), tVar, null, null, OrderTypeDialogContract$DialogParcel.TakeProfitStopLoss.f96926a, null, 988));
        }
    }
}
