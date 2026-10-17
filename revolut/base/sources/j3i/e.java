package j3i;

import cli.y;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.ChartLimitPickerController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ChartLimitPickerController f171194w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ChartLimitPickerController chartLimitPickerController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f171194w = chartLimitPickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f171194w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f171194w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        int i2;
        int i3 = this.u;
        ChartLimitPickerController chartLimitPickerController = this.f171194w;
        switch (i3) {
            case 0:
                g6 g6Var = (g6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE3 = chartLimitPickerController.d();
                String selectedId = g6Var.f54199a;
                com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b bVar = (com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b) iVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                bVar.f96999w.setValue(selectedId);
                bVar.H2(bVar.v, new ik3.a(selectedId, 19));
                return Unit.f186387a;
            default:
                String str = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(str, "INFO_MENU_ITEM_ID")) {
                    com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b bVar2 = (com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b) chartLimitPickerController.d();
                    j60.a aVar3 = bVar2.f96997s;
                    t tVar = bVar2.f96994p;
                    y yVar = bVar2.v;
                    j2 j2Var = (j2) yVar.f22677a;
                    j2 j2Var2 = (j2) yVar.f22677a;
                    wd6.e exchangeMode = ((k) j2Var.getValue()).f171201h;
                    r0i.c orderType = ((k) j2Var2.getValue()).f171200g;
                    xi0.b currency = ((k) j2Var2.getValue()).f;
                    tVar.getClass();
                    Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    int[] iArr = s.f171212a;
                    int i5 = iArr[orderType.ordinal()];
                    if (i5 == 1) {
                        i = R$string.cryptobuysell_take_profit_stop_loss_order_title;
                    } else if (i5 == 2) {
                        i = R$string.fx_orders_limit_order;
                    } else {
                        if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R$string.fx_orders_stop_order;
                    }
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
                    int i6 = iArr[orderType.ordinal()];
                    if (i6 == 1) {
                        i2 = R$string.fx_orders_take_profit_stop_loss_tpsl_dialog_text;
                    } else if (i6 == 2) {
                        i2 = exchangeMode == wd6.e.BUY ? R$string.cryptobuysell_orders_limit_order_info_buy : R$string.cryptobuysell_orders_limit_order_info_sell;
                    } else {
                        if (i6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = exchangeMode == wd6.e.BUY ? R$string.cryptobuysell_orders_stop_order_info_buy : R$string.cryptobuysell_orders_stop_order_info_sell;
                    }
                    rp0.t tVar2 = new rp0.t(textLocalisedClause, new TextLocalisedClause(i2, u.c(currency.f306286a), null, 12), null, 28);
                    LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.fx_orders_take_profit_stop_loss_tpsl_dialog_got_it, null, null, 14);
                    int i21 = R$attr.uikit_dp16;
                    aVar3.x(new rp0.y(u.c(new LargeActionButtonDelegate.Model("DIALOG_CTA_ID", defaultFilledButton, null, textLocalisedClause2, false, null, null, i21, R$attr.uikit_dp24, i21, i21, 496)), tVar2, null, null, null, null, 1020));
                }
                return Unit.f186387a;
        }
    }
}
