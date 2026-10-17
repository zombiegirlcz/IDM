package o4h;

import aw0.k7;
import aw0.n6;
import aw0.o9;
import aw0.t0;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.assetdetails.ui.impl.R$string;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import x2h.b;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3h.c f222287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kpj.f f222288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ufl.b f222289c;

    public n(m3h.c actionsPanelMapper, kpj.f wealthAccountHeaderUiMapper, ufl.b wealthHoldingsClauseFactory) {
        Intrinsics.checkNotNullParameter(actionsPanelMapper, "actionsPanelMapper");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(wealthHoldingsClauseFactory, "wealthHoldingsClauseFactory");
        this.f222287a = actionsPanelMapper;
        this.f222288b = wealthAccountHeaderUiMapper;
        this.f222289c = wealthHoldingsClauseFactory;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        j jVar2;
        aw0.i eVar;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f222272a;
        Data data2 = domainState.f222273b;
        List list = null;
        if (data == null || data2 == null) {
            jVar2 = null;
        } else {
            final int i = 1;
            jVar2 = (j) iii.c.f(t1.t(data, data2), new o2g.f(26), new o4a.a(2), new Function3(this) { // from class: o4h.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f222286b;

                {
                    this.f222286b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    Clause textClause;
                    Clause textClause2;
                    dj0.d dVar;
                    switch (i) {
                        case 0:
                            ufl.b bVar = this.f222286b.f222289c;
                            od0.i tradingAccountWithInstrumentBalanceOptional = (od0.i) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(tradingAccountWithInstrumentBalanceOptional, "tradingAccountWithInstrumentBalanceOptional");
                            z2h.h hVar = (z2h.h) tradingAccountWithInstrumentBalanceOptional.f224257a;
                            CellDetailsDelegate.Model model = null;
                            if (hVar == null) {
                                return null;
                            }
                            del.a aVar = hVar.f319090b;
                            kel.n nVar = aVar.e;
                            CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("NUMBER_OF_SHARES_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.wealth_details_stocks_shares, null, null, 14), (Image) null, 0, false, 30), sfl.b.a(bVar, nVar.f183174b, nVar.f183178j, nVar.f), null, null, null, null, 0, null, false, false, null, null, 32760);
                            dj0.d dVarB = aVar.b();
                            CellDetailsDelegate.Model[] elements = {model2, dVarB != null ? new CellDetailsDelegate.Model("CURRENT_VALUE_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.wealth_trading_orders_value, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVarB, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760) : null};
                            Intrinsics.checkNotNullParameter(elements, "elements");
                            List listL = kotlin.collections.d.L(elements);
                            yp0.b.k(listL, 0, 0, 0, 0, 31);
                            dj0.d dVar2 = nVar.f183177h;
                            CellDetailsDelegate.Model model3 = dVar2 != null ? new CellDetailsDelegate.Model("AVERAGE_PRICE_LIST_ID", new t0((Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_details_stocks_avg_price, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, f.f222275a, null, null, 0, null, false, false, null, null, 32696) : null;
                            dj0.d dVarA = aVar.a();
                            BigDecimal bigDecimal = aVar.d;
                            if (dVarA != null && bigDecimal != null) {
                                model = new CellDetailsDelegate.Model("UNREALISED_RETURN_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.wealth_details_stocks_pnl, null, null, 14), (Image) null, 0, false, 30), bVar.c(dVarA, bigDecimal, true, o9.SENSITIVE, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14)), null, null, null, null, 0, null, false, false, null, null, 32760);
                            }
                            CellDetailsDelegate.Model[] elements2 = {model3, model};
                            Intrinsics.checkNotNullParameter(elements2, "elements");
                            List listL2 = kotlin.collections.d.L(elements2);
                            yp0.b.k(listL2, 0, 0, 0, 0, 31);
                            return d0.E0(listL2, listL);
                        default:
                            kpj.f fVar = this.f222286b.f222288b;
                            Pair pair = (Pair) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(pair, "<destruct>");
                            od0.i iVar = (od0.i) pair.f186385a;
                            TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) pair.f186386b;
                            if (!iVar.d()) {
                                return h.f222279a;
                            }
                            z2h.h hVar2 = (z2h.h) iVar.c();
                            TradingAccount tradingAccount = hVar2.f319089a;
                            del.a aVar2 = hVar2.f319090b;
                            InstrumentTicker instrumentTicker = aVar2.f;
                            if (instrumentTicker == null || (dVar = instrumentTicker.e) == null) {
                                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                                textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            } else {
                                textClause = new MoneyClause(pyd.c.V(dVar, aVar2.e.f183174b), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                            }
                            hel.b bVar2 = tradingLegalEntityInformation.f105106a;
                            n2l.j jVarB = n2l.l.b(tradingAccount);
                            if (jVarB != null) {
                                textClause2 = fVar.h(jVarB, bVar2, null);
                            } else {
                                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                                textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            }
                            LayeredImage.Companion companion = LayeredImage.INSTANCE;
                            n2l.j jVarB2 = n2l.l.b(tradingAccount);
                            return new g(textClause, textClause2, nz8.d.L(companion.i(jVarB2 != null ? fVar.g(jVarB2) : R$drawable.uikit_icn_24_rates, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10)));
                    }
                }
            });
        }
        x2h.b bVarA = this.f222287a.a(domainState.f222274c.f211545a);
        if (bVarA instanceof x2h.a) {
            x2h.a aVar = (x2h.a) bVarA;
            eVar = new aw0.g(new n6(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_action_buy, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, aVar.f302570a, null, null, 988), new n6(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_action_sell, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, aVar.f302571b, null, null, 988), (Clause) null, (aw0.f) null, 25);
        } else if (bVarA instanceof b.a) {
            eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_action_get_started, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        } else {
            if (!Intrinsics.f(bVarA, b.C1676b.f302573a)) {
                throw new NoWhenBranchMatchedException();
            }
            eVar = null;
        }
        Data data3 = domainState.f222272a;
        if (data3 != null) {
            final int i2 = 0;
            list = (List) iii.c.f(data3, new o2g.f(this, 25), new o4a.a(1), new Function3(this) { // from class: o4h.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f222286b;

                {
                    this.f222286b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    Clause textClause;
                    Clause textClause2;
                    dj0.d dVar;
                    switch (i2) {
                        case 0:
                            ufl.b bVar = this.f222286b.f222289c;
                            od0.i tradingAccountWithInstrumentBalanceOptional = (od0.i) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(tradingAccountWithInstrumentBalanceOptional, "tradingAccountWithInstrumentBalanceOptional");
                            z2h.h hVar = (z2h.h) tradingAccountWithInstrumentBalanceOptional.f224257a;
                            CellDetailsDelegate.Model model = null;
                            if (hVar == null) {
                                return null;
                            }
                            del.a aVar2 = hVar.f319090b;
                            kel.n nVar = aVar2.e;
                            CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("NUMBER_OF_SHARES_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.wealth_details_stocks_shares, null, null, 14), (Image) null, 0, false, 30), sfl.b.a(bVar, nVar.f183174b, nVar.f183178j, nVar.f), null, null, null, null, 0, null, false, false, null, null, 32760);
                            dj0.d dVarB = aVar2.b();
                            CellDetailsDelegate.Model[] elements = {model2, dVarB != null ? new CellDetailsDelegate.Model("CURRENT_VALUE_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.wealth_trading_orders_value, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVarB, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760) : null};
                            Intrinsics.checkNotNullParameter(elements, "elements");
                            List listL = kotlin.collections.d.L(elements);
                            yp0.b.k(listL, 0, 0, 0, 0, 31);
                            dj0.d dVar2 = nVar.f183177h;
                            CellDetailsDelegate.Model model3 = dVar2 != null ? new CellDetailsDelegate.Model("AVERAGE_PRICE_LIST_ID", new t0((Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_details_stocks_avg_price, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, f.f222275a, null, null, 0, null, false, false, null, null, 32696) : null;
                            dj0.d dVarA = aVar2.a();
                            BigDecimal bigDecimal = aVar2.d;
                            if (dVarA != null && bigDecimal != null) {
                                model = new CellDetailsDelegate.Model("UNREALISED_RETURN_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.wealth_details_stocks_pnl, null, null, 14), (Image) null, 0, false, 30), bVar.c(dVarA, bigDecimal, true, o9.SENSITIVE, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14)), null, null, null, null, 0, null, false, false, null, null, 32760);
                            }
                            CellDetailsDelegate.Model[] elements2 = {model3, model};
                            Intrinsics.checkNotNullParameter(elements2, "elements");
                            List listL2 = kotlin.collections.d.L(elements2);
                            yp0.b.k(listL2, 0, 0, 0, 0, 31);
                            return d0.E0(listL2, listL);
                        default:
                            kpj.f fVar = this.f222286b.f222288b;
                            Pair pair = (Pair) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(pair, "<destruct>");
                            od0.i iVar = (od0.i) pair.f186385a;
                            TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) pair.f186386b;
                            if (!iVar.d()) {
                                return h.f222279a;
                            }
                            z2h.h hVar2 = (z2h.h) iVar.c();
                            TradingAccount tradingAccount = hVar2.f319089a;
                            del.a aVar22 = hVar2.f319090b;
                            InstrumentTicker instrumentTicker = aVar22.f;
                            if (instrumentTicker == null || (dVar = instrumentTicker.e) == null) {
                                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                                textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            } else {
                                textClause = new MoneyClause(pyd.c.V(dVar, aVar22.e.f183174b), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                            }
                            hel.b bVar2 = tradingLegalEntityInformation.f105106a;
                            n2l.j jVarB = n2l.l.b(tradingAccount);
                            if (jVarB != null) {
                                textClause2 = fVar.h(jVarB, bVar2, null);
                            } else {
                                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                                textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            }
                            LayeredImage.Companion companion = LayeredImage.INSTANCE;
                            n2l.j jVarB2 = n2l.l.b(tradingAccount);
                            return new g(textClause, textClause2, nz8.d.L(companion.i(jVarB2 != null ? fVar.g(jVarB2) : R$drawable.uikit_icn_24_rates, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10)));
                    }
                }
            });
        }
        if (list == null) {
            list = f0.f322471a;
        }
        return new k(jVar2, eVar, list);
    }
}
