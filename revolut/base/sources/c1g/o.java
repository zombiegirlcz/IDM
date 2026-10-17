package c1g;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.trading.orders.R$string;
import cul.i0;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.CancellationException;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20504c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ o(cd0.d dVar, Function2 function2, Function3 function3) {
        this.f20502a = 10;
        this.f20503b = dVar;
        this.f20504c = function2;
        this.d = (gim.i) function3;
    }

    private final Object a(Object obj2) throws Throwable {
        com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f20503b;
        bfl.g tradeSide = (bfl.g) this.f20504c;
        r0 orderType = (r0) this.d;
        k4l.a aVar = (k4l.a) obj2;
        i0 i0Var = (i0) eVar.o;
        i0Var.getClass();
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        ((rvl.e) i0Var.f109117b).getClass();
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        if (aVar != null) {
            int i = aVar.f180941b;
            int i2 = aVar.d;
            int i3 = rvl.d.f257789b[orderType.ordinal()];
            if (i3 == 1) {
                int i5 = rvl.d.f257788a[tradeSide.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i6 = aVar.f180942c;
                    if (i6 <= i2) {
                        if (i6 <= i) {
                            return null;
                        }
                        rvl.c.Companion.getClass();
                        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_pdt_dialog_action_continue, null, null, 14);
                        int i21 = R$attr.uikit_dp16;
                        int i22 = R$attr.uikit_dp24;
                        return new rp0.y(zhm.u.c(new LargeActionButtonDelegate.Model("ACTION_CONTINUE_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i22, i22, i21, i21, 496)), new rp0.t(new TextLocalisedClause(R$string.wealth_trading_pdt_dialog_sell_warning_title, null, null, 14), oc.c.d(new TextLocalisedClause(R$string.wealth_trading_pdt_dialog_sell_warning_description, null, null, 14)), new rp0.v("DIALOG_ICON_ID", new ResourceImage(R$drawable.uikit_icn_24_warning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246)), 24), null, null, null, null, 1020);
                    }
                    rvl.c.Companion.getClass();
                    LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58725a;
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_trading_pdt_dialog_action_wait, null, null, 14);
                    int i32 = R$attr.uikit_dp16;
                    LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ACTION_WAIT_ID", defaultFilledButton2, null, textLocalisedClause2, false, null, null, R$attr.uikit_dp24, i32, i32, i32, 496);
                    LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton3 = LargeActionButton.ButtonStyle.f58726b;
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_trading_pdt_dialog_action_continue, null, null, 14);
                    int i33 = R$attr.uikit_dp16;
                    return new rp0.y(zhm.v.k(model, new LargeActionButtonDelegate.Model("ACTION_CONTINUE_LIST_ID", defaultFilledButton3, null, textLocalisedClause3, false, null, null, 0, R$attr.uikit_dp24, i33, i33, 1008)), new rp0.t(new TextLocalisedClause(R$string.wealth_trading_pdt_dialog_sell_suspension_title, null, null, 14), oc.c.d(new TextLocalisedClause(R$string.wealth_trading_pdt_dialog_sell_suspension_description, null, null, 14)), new rp0.v("DIALOG_ICON_ID", new ResourceImage(R$drawable.uikit_icn_24_warning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246)), 24), null, null, null, null, 1020);
                }
                if (i >= i2) {
                    rvl.c.Companion.getClass();
                    LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton4 = LargeActionButton.ButtonStyle.f58725a;
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.wealth_trading_pdt_dialog_action_wait, null, null, 14);
                    int i43 = R$attr.uikit_dp16;
                    LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ACTION_WAIT_ID", defaultFilledButton4, null, textLocalisedClause4, false, null, null, R$attr.uikit_dp24, i43, i43, i43, 496);
                    LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton5 = LargeActionButton.ButtonStyle.f58726b;
                    TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.wealth_trading_pdt_dialog_action_continue, null, null, 14);
                    int i59 = R$attr.uikit_dp16;
                    return new rp0.y(zhm.v.k(model2, new LargeActionButtonDelegate.Model("ACTION_CONTINUE_LIST_ID", defaultFilledButton5, null, textLocalisedClause5, false, null, null, 0, R$attr.uikit_dp24, i59, i59, 1008)), new rp0.t(new TextLocalisedClause(R$string.wealth_trading_pdt_dialog_buy_warning_title, null, null, 14), oc.c.d(new TextLocalisedClause(R$string.wealth_trading_pdt_dialog_buy_warning_description, null, null, 14)), new rp0.v("DIALOG_ICON_ID", new ResourceImage(R$drawable.uikit_icn_24_warning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246)), 24), null, null, null, null, 1020);
                }
            } else if (i3 == 2 || i3 == 3) {
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    throw new IllegalStateException("Limit and Stop order types are unsupported.");
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    Throwable thA = yhm.m.a(yhm.o.a(th10));
                    if (thA != null) {
                        hx7.e.n(thA);
                    }
                }
            } else if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    private final Object b(Object obj2) {
        Amount amount;
        boolean zF;
        com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f20503b;
        nel.n instrument = (nel.n) this.f20504c;
        TradingAccount tradingAccount = (TradingAccount) this.d;
        SourcePocket sourcePocket = (SourcePocket) obj2;
        gul.e0 e0Var = eVar.C;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
        SourcePocket.Balance e = sourcePocket.getE();
        if (e == null) {
            xi0.b f91784h = sourcePocket.getF91784h();
            if (f91784h != null) {
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                amount = new Amount(ZERO, e0Var.f(f91784h));
            } else {
                BigDecimal ZERO2 = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
                xi0.b.Companion.getClass();
                amount = new Amount(ZERO2, e0Var.f(xi0.b.f306271c));
            }
        } else {
            if (!(e instanceof SourcePocket.Balance.MoneyBalance)) {
                throw new NoWhenBranchMatchedException();
            }
            dj0.d dVar = ((SourcePocket.Balance.MoneyBalance) e).f91775a;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            e0Var.e().getClass();
            amount = l4i.a.e(dVar);
        }
        Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        boolean zF2 = Intrinsics.f(sourcePocket.getF91784h(), instrument.i);
        Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        if (sourcePocket instanceof SourcePocket.Holding) {
            zF = Intrinsics.f(((SourcePocket.Holding) sourcePocket).f91776a.f183148a.f183146b, com.revolut.shared.feature.wealth.models.trading_accounts.d.l(tradingAccount).f105210a.toString());
        } else if (sourcePocket instanceof SourcePocket.InvestAccountCombinedBuyingPower) {
            zF = Intrinsics.f(((SourcePocket.InvestAccountCombinedBuyingPower) sourcePocket).f91781b.getF105262a(), tradingAccount.getF105262a());
        } else {
            if (!(sourcePocket instanceof SourcePocket.Pocket) && !(sourcePocket instanceof SourcePocket.VaultWrapper) && !(sourcePocket instanceof SourcePocket.Savings)) {
                throw new NoWhenBranchMatchedException();
            }
            zF = false;
        }
        return new SourcePocketWrapper(sourcePocket, amount, zF2, zF);
    }

    /* JADX WARN: Removed duplicated region for block: B:374:0x0a57  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0158  */
    /* JADX WARN: Type inference failed for: r4v67, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v11, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 3060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1g.o.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ o(Object obj2, int i, Object obj3, Object obj4) {
        this.f20502a = i;
        this.f20503b = obj2;
        this.f20504c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ o(Object obj2, Object obj3, String str, int i) {
        this.f20502a = i;
        this.f20503b = obj2;
        this.d = obj3;
        this.f20504c = str;
    }
}
