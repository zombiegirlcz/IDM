package rhh;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rp0.l;
import rp0.t;
import rp0.y;
import t1h.m;
import t1h.o;
import t1h.p;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f254478l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f254479m;

    public h(a mapper, j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        this.f254478l = mapper;
        this.f254479m = bottomExpandableDialogControllerExtension;
    }

    @Override // t1h.o
    public final void Z2(m parcel) throws Throwable {
        TextLocalisedClause textLocalisedClause;
        j60.a aVar;
        j60.a aVar2;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (!(parcel instanceof e)) {
            hx7.e.n(new IllegalArgumentException("Unknown parcel: " + parcel + " received in " + h.class.getSimpleName()));
            return;
        }
        e eVar = (e) parcel;
        c cVar = c.f254473a;
        boolean zEquals = eVar.equals(cVar);
        j60.a aVar3 = this.f254479m;
        y yVar = null;
        if (zEquals) {
            j60.a.v(aVar3, false, null, 3);
            return;
        }
        boolean z = eVar instanceof b;
        a aVar4 = this.f254478l;
        if (z) {
            TradingAccount.TaxAdvantage account = ((b) parcel).f254472a;
            aVar4.getClass();
            Intrinsics.checkNotNullParameter(account, "account");
            if ((account instanceof TradingAccount.TaxAdvantage.Pea) || (account instanceof TradingAccount.TaxAdvantage.Isa)) {
                t tVar = new t(new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_title, null, null, 14), new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_description, null, null, 14), null, 28);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14);
                int i = R$attr.uikit_dp24;
                int i2 = R$attr.uikit_dp16;
                List listC = u.c(new LargeActionButtonDelegate.Model("ACTION_BUTTON_CLOSE_BOTTOM_DIALOG", defaultFilledButton, null, textLocalisedClause2, false, null, cVar, i, i, i2, i2, 368));
                aVar2 = aVar3;
                yVar = new y(listC, tVar, null, null, null, null, 1020);
            } else {
                if (!(account instanceof TradingAccount.TaxAdvantage.JIsa) && !(account instanceof TradingAccount.TaxAdvantage.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
                r6.b.D("Account is not tax advantage");
                aVar2 = aVar3;
            }
            if (yVar != null) {
                aVar2.x(yVar);
                return;
            }
            return;
        }
        if (!(eVar instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        TradingAccount.TaxAdvantage account2 = ((d) parcel).f254474a;
        aVar4.getClass();
        Intrinsics.checkNotNullParameter(account2, "account");
        boolean z3 = account2 instanceof TradingAccount.TaxAdvantage.Unknown;
        if (z3) {
            r6.b.D("Account is not tax advantage");
            aVar = aVar3;
        } else {
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_cash_info_unsettled_title, null, null, 14);
            if ((account2 instanceof TradingAccount.TaxAdvantage.Pea) || (account2 instanceof TradingAccount.TaxAdvantage.Isa)) {
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_cash_info_unsettled_isa_description, null, null, 14);
            } else if (account2 instanceof TradingAccount.TaxAdvantage.JIsa) {
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_cash_info_unsettled_jisa_description, null, null, 14);
            } else {
                if (!z3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = null;
            }
            t tVar2 = new t(textLocalisedClause3, textLocalisedClause, null, 28);
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58725a;
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14);
            int i3 = R$attr.uikit_dp24;
            int i5 = R$attr.uikit_dp16;
            aVar = aVar3;
            yVar = new y(u.c(new LargeActionButtonDelegate.Model("ACTION_BUTTON_CLOSE_BOTTOM_DIALOG", defaultFilledButton2, null, textLocalisedClause4, false, null, cVar, i3, i3, i5, i5, 368)), tVar2, null, null, null, null, 1020);
        }
        if (yVar != null) {
            aVar.x(yVar);
        }
    }

    @Override // t1h.o
    public final void b3(p state) throws Throwable {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!(state instanceof i)) {
            hx7.e.n(new IllegalArgumentException("Unexpected state: " + state + " received in " + h.class.getSimpleName()));
            return;
        }
        i state2 = (i) state;
        this.f254478l.getClass();
        Intrinsics.checkNotNullParameter(state2, "state");
        l lVar = l.WINDOW;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_cash_info_available_title, null, null, 14);
        xi0.a aVar = xi0.b.Companion;
        kel.b bVar = state2.f254481b;
        TradingAccount.TaxAdvantage taxAdvantage = state2.f254480a;
        String str = bVar.f183148a.e;
        aVar.getClass();
        t tVar = new t(textLocalisedClause, new TextLocalisedClause(xi0.a.a(str).equals(xi0.b.i) ? R$string.wealth_cash_info_available_description_usd : R$string.wealth_cash_info_available_description, null, null, 14), null, 28);
        List listK = v.k(new CellDetailsDelegate.Model("WITHDRAWABLE_CASH_ID", new TextLocalisedClause(R$string.wealth_cash_info_withdrawable_title, null, null, 14), new MoneyClause(bVar.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, new b(taxAdvantage), null, null, 0, null, false, null, 0, 0, 0, 0, 1048008), new CellDetailsDelegate.Model("UNSETTLED_CASH_ID", new TextLocalisedClause(R$string.wealth_cash_info_unsettled_title, null, null, 14), new MoneyClause(bVar.f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, new d(taxAdvantage), null, null, 0, null, false, null, 0, 0, 0, 0, 1048008), new CellDetailsDelegate.Model("COMMITTED_CASH_ID", new TextLocalisedClause(R$string.wealth_cash_info_committed_title, null, null, 14), new MoneyClause(bVar.f183151g, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14);
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp16;
        this.f254479m.x(new y(d0.E0(u.c(new LargeActionButtonDelegate.Model("LIST_ID_BUTTON_GOT_IT", defaultFilledButton, null, textLocalisedClause2, false, null, c.f254473a, i, i, i2, i2, 368)), listK), tVar, lVar, null, null, null, "CASH_WITHDRAWABLE_AVAILABLE_DIALOG_KEY", null, null, null, 3832));
    }
}
