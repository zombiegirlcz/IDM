package i5f;

import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.feature.wealth.ui.api.navigation.cash_balance.UnsettledDialogInputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import rp0.l;
import rp0.t;
import rp0.y;
import t1h.m;
import t1h.o;
import t1h.p;
import yji.n;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends o {

    @NotNull
    private static final i Companion = new i();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v4f.a f158832l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f158833m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gte.a f158834n;
    public final j60.a o;

    public j(v4f.a stockWithdrawInfoDialogFactory, a mapper, gte.a featureToggleInteractor, j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(stockWithdrawInfoDialogFactory, "stockWithdrawInfoDialogFactory");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        this.f158832l = stockWithdrawInfoDialogFactory;
        this.f158833m = mapper;
        this.f158834n = featureToggleInteractor;
        this.o = bottomExpandableDialogControllerExtension;
    }

    @Override // t1h.o
    public final void Z2(m parcel) throws Throwable {
        TextLocalisedClause textLocalisedClause;
        Clause textLocalisedClause2;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (!(parcel instanceof f)) {
            hx7.e.n(new IllegalArgumentException("Unknown parcel: " + parcel + " received in " + j.class.getSimpleName()));
            return;
        }
        f fVar = (f) parcel;
        d dVar = d.f158826a;
        if (fVar.equals(dVar)) {
            A2(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("question.what-s-an-external-account", 2))));
            return;
        }
        c cVar = c.f158825a;
        boolean zEquals = fVar.equals(cVar);
        j60.a aVar = this.o;
        if (zEquals) {
            j60.a.v(aVar, false, null, 3);
            return;
        }
        boolean z = fVar instanceof b;
        v4f.a aVar2 = this.f158832l;
        if (!z) {
            if (!(fVar instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            xi0.b cashHoldingCurrency = ((e) parcel).f158827a;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(cashHoldingCurrency, "cashHoldingCurrency");
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_cash_info_unsettled_title, null, null, 14);
            xi0.b.Companion.getClass();
            t tVar = new t(textLocalisedClause3, cashHoldingCurrency.equals(xi0.b.i) ? new TextLocalisedClause(R$string.wealth_cash_info_unsettled_description_usd, null, null, 14) : new TextLocalisedClause(R$string.wealth_cash_info_unsettled_description, null, null, 14), null, 28);
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14);
            int i = R$attr.uikit_dp24;
            int i2 = R$attr.uikit_dp16;
            aVar.x(new y(u.c(new LargeActionButtonDelegate.Model("ACTION_BUTTON_CLOSE_BOTTOM_DIALOG", defaultFilledButton, null, textLocalisedClause4, false, null, cVar, i, i, i2, i2, 368)), tVar, null, null, null, null, 1020));
            return;
        }
        b bVar = (b) parcel;
        hel.b bVar2 = bVar.f158823a;
        xi0.b cashHoldingCurrency2 = bVar.f158824b;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(cashHoldingCurrency2, "cashHoldingCurrency");
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_title, null, null, 14);
        switch (bVar2 == null ? -1 : v4f.b.f286071a[bVar2.ordinal()]) {
            case -1:
            case 4:
                textLocalisedClause = textLocalisedClause5;
                textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_description, null, null, 14);
                t tVar2 = new t(textLocalisedClause, textLocalisedClause2, null, 28);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58725a;
                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14);
                int i3 = R$attr.uikit_dp24;
                int i5 = R$attr.uikit_dp16;
                aVar.x(new y(u.c(new LargeActionButtonDelegate.Model("ACTION_BUTTON_CLOSE_BOTTOM_DIALOG", defaultFilledButton2, null, textLocalisedClause6, false, null, cVar, i3, i3, i5, i5, 368)), tVar2, null, null, null, null, 1020));
                return;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
                textLocalisedClause = textLocalisedClause5;
                List listK = v.k(new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_description_sg, null, null, 14), new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_description_learn_more, null, new Click(28, (Integer) null, (Object) dVar, "CLICK_ID_WITHDRAWABLE_DESCRIPTION_LEARN_MORE", false), 10));
                m70.a.t(t0.f186434a);
                textLocalisedClause2 = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                t tVar22 = new t(textLocalisedClause, textLocalisedClause2, null, 28);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton22 = LargeActionButton.ButtonStyle.f58725a;
                TextLocalisedClause textLocalisedClause62 = new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14);
                int i32 = R$attr.uikit_dp24;
                int i59 = R$attr.uikit_dp16;
                aVar.x(new y(u.c(new LargeActionButtonDelegate.Model("ACTION_BUTTON_CLOSE_BOTTOM_DIALOG", defaultFilledButton22, null, textLocalisedClause62, false, null, cVar, i32, i32, i59, i59, 368)), tVar22, null, null, null, null, 1020));
                return;
            case 5:
                xi0.b.Companion.getClass();
                textLocalisedClause2 = new TextLocalisedClause(cashHoldingCurrency2.equals(xi0.b.i) ? R$string.wealth_cash_info_withdrawable_description_eea_usd : R$string.wealth_cash_info_withdrawable_description_eea, null, null, 14);
                textLocalisedClause = textLocalisedClause5;
                t tVar222 = new t(textLocalisedClause, textLocalisedClause2, null, 28);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton222 = LargeActionButton.ButtonStyle.f58725a;
                TextLocalisedClause textLocalisedClause622 = new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14);
                int i322 = R$attr.uikit_dp24;
                int i592 = R$attr.uikit_dp16;
                aVar.x(new y(u.c(new LargeActionButtonDelegate.Model("ACTION_BUTTON_CLOSE_BOTTOM_DIALOG", defaultFilledButton222, null, textLocalisedClause622, false, null, cVar, i322, i322, i592, i592, 368)), tVar222, null, null, null, null, 1020));
                return;
            case 6:
                textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_description_us, null, null, 14);
                textLocalisedClause = textLocalisedClause5;
                t tVar2222 = new t(textLocalisedClause, textLocalisedClause2, null, 28);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2222 = LargeActionButton.ButtonStyle.f58725a;
                TextLocalisedClause textLocalisedClause6222 = new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14);
                int i3222 = R$attr.uikit_dp24;
                int i5922 = R$attr.uikit_dp16;
                aVar.x(new y(u.c(new LargeActionButtonDelegate.Model("ACTION_BUTTON_CLOSE_BOTTOM_DIALOG", defaultFilledButton2222, null, textLocalisedClause6222, false, null, cVar, i3222, i3222, i5922, i5922, 368)), tVar2222, null, null, null, null, 1020));
                return;
            case 7:
                textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_description_au, null, null, 14);
                textLocalisedClause = textLocalisedClause5;
                t tVar22222 = new t(textLocalisedClause, textLocalisedClause2, null, 28);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton22222 = LargeActionButton.ButtonStyle.f58725a;
                TextLocalisedClause textLocalisedClause62222 = new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14);
                int i32222 = R$attr.uikit_dp24;
                int i59222 = R$attr.uikit_dp16;
                aVar.x(new y(u.c(new LargeActionButtonDelegate.Model("ACTION_BUTTON_CLOSE_BOTTOM_DIALOG", defaultFilledButton22222, null, textLocalisedClause62222, false, null, cVar, i32222, i32222, i59222, i59222, 368)), tVar22222, null, null, null, null, 1020));
                return;
        }
    }

    @Override // t1h.o
    public final void b3(p state) throws Throwable {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!(state instanceof k)) {
            hx7.e.n(new IllegalArgumentException("Unexpected state: " + state + " received in " + j.class.getSimpleName()));
            return;
        }
        if (((jte.d) this.f158834n).c(FeatureWealthApi$Toggles.InvestUnsettledOrdersImprovements.f95163c)) {
            n.P2(this, o2(new pih.i(new UnsettledDialogInputData(((k) state).f158836b, pih.j.AvailableToWithdraw))), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
            return;
        }
        k kVar = (k) state;
        kel.b cashHolding = kVar.f158836b;
        hel.b bVar = kVar.f158835a;
        this.f158833m.getClass();
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        l lVar = l.WINDOW;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_cash_info_available_title, null, null, 14);
        xi0.a aVar = xi0.b.Companion;
        String str = cashHolding.f183148a.e;
        aVar.getClass();
        t tVar = new t(textLocalisedClause, new TextLocalisedClause(xi0.a.a(str).equals(xi0.b.i) ? R$string.wealth_cash_info_available_description_usd : R$string.wealth_cash_info_available_description, null, null, 14), null, 28);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_title, null, null, 14);
        dj0.d dVar = cashHolding.e;
        k7 k7Var = k7.ONLY_NEGATIVE;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("WITHDRAWABLE_CASH", textLocalisedClause2, new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7Var, null, false, false, 14), null, null, 12), null, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, new b(bVar, xi0.a.a(str)), null, null, 0, null, false, null, 0, 0, 0, 0, 1048008);
        if (bVar == hel.b.MX) {
            model = null;
        }
        CellDetailsDelegate.Model[] elements = {model, new CellDetailsDelegate.Model("UNSETTLED_CASH", new TextLocalisedClause(R$string.wealth_cash_info_unsettled_title, null, null, 14), new MoneyClause(cashHolding.f, new MoneyClause.Format.Defaults(k7Var, null, false, false, 14), null, null, 12), null, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, new e(xi0.a.a(str)), null, null, 0, null, false, null, 0, 0, 0, 0, 1048008), new CellDetailsDelegate.Model("COMMITTED", new TextLocalisedClause(R$string.wealth_cash_info_committed_title, null, null, 14), new MoneyClause(cashHolding.f183151g, new MoneyClause.Format.Defaults(k7Var, null, false, false, 14), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14);
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp16;
        this.o.x(new y(d0.E0(u.c(new LargeActionButtonDelegate.Model("LIST_ID_BUTTON_GOT_IT", defaultFilledButton, null, textLocalisedClause3, false, null, c.f158825a, i, i, i2, i2, 368)), listL), tVar, lVar, null, null, null, "STOCKS_WITHDRAW_DIALOG_DELEGATES", null, null, null, 3832));
    }
}
