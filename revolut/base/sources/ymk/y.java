package ymk;

import android.net.Uri;
import android.os.Parcelable;
import aw0.ka;
import aw0.o9;
import aw0.v8;
import c55.n0;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TransferAmountPagePreviewDelegate;
import com.revolut.core.ui_kit.delegates.eg;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.of;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.v4;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.timer.TimerViewLabels;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UriVideo;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasType;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanState;
import com.revolut.feature.defi.asset_details.api.model.DefiCurrency;
import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilLinkedAccountsGroup;
import com.revolut.feature.external_accounts.impl.model.account_linking.AccountLinkingExpirationOption;
import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.payments.transfers.personalisation.api.navigation.StyleScreenInput;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.style.TransferPersonalisationStyleSelectorContract$InputData;
import com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation;
import com.revolut.feature.salary_switch.impl.models.v2.SalarySwitchV2StatusSummary;
import com.revolut.feature.spending_analytics.api.R$plurals;
import com.revolut.feature.trading_orders.api.investment_plan.projection.InvestmentProjectionsContract$Context;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import ip0.bd;
import ip0.dd;
import ip0.iq;
import ip0.qd0;
import ip0.qe0;
import ip0.we0;
import ip0.yt;
import ip0.zj;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import ms0.h4;
import org.jmrtd.lds.LDSFile;
import org.joda.time.DateTimeUtils;
import tof.a3;
import z66.t;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class y implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f315052b;

    public /* synthetic */ y(int i, cli.j jVar, cli.n nVar) {
        this.f315051a = i;
        this.f315052b = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r54, java.lang.Object r55, java.lang.Object r56) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ymk.y.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        UriVideo uriVideo;
        yq5.d dVar = (yq5.d) this.f315052b;
        List personalisations = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(personalisations, "personalisations");
        aim.e eVarB = zhm.u.b();
        z2a.d dVar2 = (z2a.d) dVar.f315990b;
        TransferPersonalisationStyleSelectorContract$InputData transferPersonalisationStyleSelectorContract$InputData = dVar2.f319038a;
        StyleScreenInput styleScreenInput = transferPersonalisationStyleSelectorContract$InputData.f79968a;
        int i = 0;
        TransferAmountPagePreviewDelegate.Model model = styleScreenInput.d != null ? new TransferAmountPagePreviewDelegate.Model("REMOVE_PERSONALISATION_LIST_ID", new v8(new ColorImage(new ColorImage.ColorAttr(R$attr.uikit_colorGreyTone2), null), null, new MoneyClause(styleScreenInput.f79957a, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(new Custom.Color.Solid(R$attr.uikit_colorWhite), false, false, 254), null, 8), null, new bv0.b(styleScreenInput.f79959c, styleScreenInput.f79958b), false), null, 12) : null;
        if (model != null) {
            eVarB.add(model);
        }
        List list = personalisations;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            P2pPersonalisation personalisation = (P2pPersonalisation) it8.next();
            Intrinsics.checkNotNullParameter(personalisation, "personalisation");
            r2a.a aVar = dVar2.f319039b;
            StyleScreenInput styleScreenInput2 = transferPersonalisationStyleSelectorContract$InputData.f79968a;
            f2a.a aVarA = f2a.b.a(aVar, personalisation, styleScreenInput2.f79957a.k(), 2);
            P2pPersonalisation.Content content = personalisation.f79970b;
            String f79974a = content.getF79974a();
            UrlImage urlImage = new UrlImage(content.getF79976c(), null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
            if (content instanceof P2pPersonalisation.Content.Image) {
                uriVideo = null;
            } else {
                if (!(content instanceof P2pPersonalisation.Content.Video)) {
                    throw new NoWhenBranchMatchedException();
                }
                uriVideo = new UriVideo(((f80.b) dVar2.f319040c).f(((P2pPersonalisation.Content.Video) content).f79975b), (Uri) null, false, (oz0.b) null, (Boolean) null, (oz0.c) null, 126);
            }
            arrayList.add(new TransferAmountPagePreviewDelegate.Model(f79974a, new v8(urlImage, uriVideo, new MoneyClause(styleScreenInput2.f79957a, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(new Custom.Color.SolidInt(aVarA.f131491c), false, false, 254), null, 8), aVarA.f131490b, new bv0.b(styleScreenInput2.f79959c, styleScreenInput2.f79958b), false), personalisation, 8));
            i = 0;
            it8 = it8;
            dVar2 = dVar2;
        }
        eVarB.addAll(arrayList);
        aim.e eVarA = zhm.u.a(eVarB);
        Intrinsics.checkNotNullParameter(personalisations, "personalisations");
        Iterator it9 = personalisations.iterator();
        while (true) {
            if (!it9.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.f(((P2pPersonalisation) it9.next()).f79969a, transferPersonalisationStyleSelectorContract$InputData.f79968a.d)) {
                break;
            }
            i++;
        }
        return new z2a.j(eVarA, i > -1 ? Integer.valueOf(i + 1) : null);
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        Clause textLocalisedClause;
        Clause compositeClause;
        int i;
        z55.b bVar = (z55.b) this.f315052b;
        Loan loan = (Loan) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(loan, "loan");
        n0 n0Var = (n0) bVar.f319490a;
        LayeredImage layeredImageH = n0Var.h(loan.o);
        LoanState loanState = loan.i;
        boolean z = loanState instanceof LoanState.Planned;
        Clause clauseC = z ? n0Var.c(loan) : sx4.f.b(2, null, new MoneyClause.Format.Headers(null, null, null, false, false, 31), loan.getBalance());
        Clause clauseC2 = n0Var.c(loan);
        int i2 = R$attr.uikit_colorForeground;
        Clause clauseC3 = n0Var.c(loan);
        wi0.b bVar2 = loan.f70112h;
        Clause clauseF = sx4.g.f(clauseC3, new Custom(Integer.valueOf(i2), false, null, false, null, 254));
        if (loanState instanceof LoanState.Cancelled) {
            textLocalisedClause = z55.b.a(R$string.credit_loan_account_details_header_subtitle_cancelled, R$attr.uikit_colorRed);
        } else if (loanState instanceof LoanState.Outstanding) {
            textLocalisedClause = z55.b.a(R$string.credit_loan_account_details_header_subtitle_outstanding, R$attr.uikit_colorTerracotta);
        } else if (loanState instanceof LoanState.Overdue) {
            com.revolut.feature.credit.loan.api.models.rev10.k kVar = ((LoanState.Overdue) loanState).f;
            int i3 = R$attr.uikit_colorRed;
            int i5 = z55.a.f319489b[kVar.ordinal()];
            if (i5 == 1 || i5 == 2) {
                i = R$string.credit_loan_account_details_header_subtitle_overdue;
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.credit_loan_account_details_header_subtitle_termination_process;
            }
            textLocalisedClause = CompositeClause.a(sx4.g.g(new TextLocalisedClause(i, null, new Custom(Integer.valueOf(i3), false, null, false, null, 254), 10), new ImageClauseTint.Color(i3)), null, new Click(30, (Integer) null, (Object) null, "description", false), 11);
        } else if (loanState instanceof LoanState.Terminated) {
            wi0.b.Companion.getClass();
            textLocalisedClause = Intrinsics.f(bVar2, wi0.b.f297756l) ? z55.b.a(R$string.loan_management_widget_terminated_subtitle_au, R$attr.uikit_colorRed) : z55.b.a(R$string.credit_loan_account_details_header_subtitle_terminated, R$attr.uikit_colorRed);
        } else if (loanState instanceof LoanState.Repaid) {
            textLocalisedClause = new TextLocalisedClause(R$string.credit_loan_account_details_header_subtitle_repaid, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        } else {
            if (!(loanState instanceof LoanState.Forbearance) && !(loanState instanceof LoanState.Healthy)) {
                if (!z) {
                    throw new NoWhenBranchMatchedException();
                }
                compositeClause = new CompositeClause(zhm.v.k(new ImageClause(R$drawable.uikit_icn_16_time, (Integer) null, (Float) null, (Float) null, 30), bVar.f319491b.a(com.revolut.feature.credit.loan.api.models.rev10.e.a(loan))), sx4.g.e(1), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8);
                return new z55.r(layeredImageH, clauseC, clauseC2, compositeClause);
            }
            int i6 = z55.a.f319488a[loan.o.ordinal()];
            if (i6 == 1 || i6 == 2) {
                wi0.b.Companion.getClass();
                textLocalisedClause = Intrinsics.f(bVar2, wi0.b.p0) ? new TextLocalisedClause(R$string.credit_common_outstanding_balance, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10) : new TextLocalisedClause(R$string.loan_management_details_active_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
            } else {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.loan_management_details_loan_balance, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
            }
        }
        compositeClause = yoj.b.w(yoj.b.w(clauseF, new DotDividerClause(Integer.valueOf(i2))), textLocalisedClause);
        return new z55.r(layeredImageH, clauseC, clauseC2, compositeClause);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        z66.b bVar = (z66.b) this.f315052b;
        List assets = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        t.a aVar = z66.t.Companion;
        Intrinsics.checkNotNullParameter(assets, "assets");
        Data data = bVar.f319686c;
        String str = bVar.f319687g;
        Map mapG = (Map) data.getContent();
        if (mapG == null) {
            mapG = r0.g();
        }
        aim.e eVarB = zhm.u.b();
        if (!assets.isEmpty() || str.length() <= 0) {
            List list = assets;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                q66.e eVar = (q66.e) it8.next();
                qta.c cVar = (qta.c) mapG.get(eVar.f242515a.getCurrency());
                DefiCurrency defiCurrency = eVar.f242515a;
                String str2 = defiCurrency.f71671a;
                RowDelegate.Model.MainImage.Image40 image40A = z66.a.a(defiCurrency);
                TextClause textClause = new TextClause(defiCurrency.f71672b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextClause textClause2 = new TextClause(defiCurrency.f71673c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                if (cVar == null) {
                    cVar = eVar.f242516b;
                }
                Iterator it9 = it8;
                List list2 = assets;
                CompositeClause compositeClauseB = null;
                MoneyClause moneyClauseB = u5l.a.b(u80.q.a(cVar.f249048c, cVar.f249047b), o9.NON_SENSITIVE, null, null, 14);
                BigDecimal bigDecimalM = ofm.q.m(cVar);
                if (bigDecimalM != null) {
                    compositeClauseB = xqi.a.b(bigDecimalM, false, 7);
                }
                arrayList.add(new RowDelegate.Model(str2, image40A, textClause, null, 0, textClause2, null, null, 0, new RowDelegate.Model.c.b(moneyClauseB, compositeClauseB, null, false, 124), false, null, false, null, null, null, null, null, null, defiCurrency, null, 0, 0, 0, 0, 532675544));
                it8 = it9;
                assets = list2;
            }
            List list3 = assets;
            eVarB.addAll(arrayList);
            if (zBooleanValue && !list3.isEmpty()) {
                eVarB.addAll(z66.t.a(3));
            }
        } else {
            eVarB.add(hn5.a.a(str));
        }
        aim.e eVarA = zhm.u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        yp0.b.b(R$attr.uikit_dp24, eVarA);
        return eVarA;
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        z8b.g gVar = (z8b.g) this.f315052b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Set set = gVar.f320058b;
        String str = gVar.f320059c;
        ArrayList<xi0.b> arrayList = new ArrayList();
        for (Object obj5 : content) {
            xi0.b bVar = (xi0.b) obj5;
            if (!d0.J(cp5.d.K(bVar), str, true)) {
                String strE = cp5.d.e(bVar);
                if (strE.length() == 0) {
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                    strE = cp5.d.q(locale, bVar);
                    if (strE == null) {
                        strE = bVar.f306286a;
                    }
                }
                if (d0.J(strE, str, true)) {
                }
            }
            arrayList.add(obj5);
        }
        int i = 14;
        if (arrayList.isEmpty()) {
            List listC = zhm.u.c(new FullScreenStateDelegate.Model("SEARCH_EMPTY_ITEM_ID", new TextLocalisedClause(com.revolut.feature.retail.crypto.advanced_charts.api.R$string.crypto_currencies_picker_search_empty_state_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.retail.crypto.advanced_charts.api.R$string.crypto_currencies_picker_search_empty_state_description, zhm.u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d086", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32672));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (xi0.b bVar2 : arrayList) {
            boolean zContains = set.contains(bVar2);
            String str2 = bVar2.f306286a;
            String str3 = bVar2.f306286a;
            arrayList2.add(new SelectableDelegate.Model(j6.a.q("CRYPTO_SELECTABLE_ITEM_ID_", str2), new RowDelegate.Model(j6.a.q("CRYPTO_SELECTABLE_INNER_ITEM_ID__", str3), new CurrencyImage(str3, (ImageTransformations) null, (TextLocalisedClause) null, i), null, null, new CurrencyClause(bVar2, null, null, 6), new CurrencyClause(bVar2, CurrencyClause.Format.Ticker.f57756a, null, 4), null, null, 0, null, false, false, null, null, null, null, null, bVar2, null, 0, 0, 0, 0, 1056964460), zContains ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760));
            i = 14;
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return arrayList2;
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        Collection collectionA;
        Collection collectionA2;
        String str;
        zaj.n nVar = (zaj.n) this.f315052b;
        taj.i iVar = (taj.i) obj2;
        ((Boolean) obj3).getClass();
        if (iVar == null) {
            return f0.f322471a;
        }
        aim.e eVarB = zhm.u.b();
        dd ddVar = new dd(new bd(DateTimeUtils.currentTimeMillis() + (iVar.f269352b.toEpochMilli() - nVar.f320737c.a().toEpochMilli())), ev0.c.UP_TO_DAYS, new TimerViewLabels(new TextClause("d", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause("h", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause("m", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause("s", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)));
        yp0.b.r(ddVar, R$attr.uikit_dp16, R$attr.uikit_dp24, 0, 0, 12);
        eVarB.add(ddVar);
        taj.g gVar = iVar.f269353c;
        ArrayList arrayList = gVar.f269349b;
        ArrayList arrayList2 = gVar.f269350c;
        int i = 0;
        if (arrayList.isEmpty()) {
            collectionA = f0.f322471a;
        } else {
            aim.e eVarB2 = zhm.u.b();
            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList, 10));
            int i2 = 0;
            for (Object obj5 : arrayList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    zhm.v.s();
                    throw null;
                }
                taj.b bVar = (taj.b) obj5;
                String strN = a0.d.n("LIST_ID_ABOUT_ITEM_", i2);
                TextClause textClause = new TextClause(bVar.f269342a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextClause textClause2 = new TextClause(bVar.f269343b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                int iA = nVar.f320736b.a(bVar.f269344c);
                Integer numValueOf = Integer.valueOf(iA);
                if (iA == 0) {
                    numValueOf = null;
                }
                arrayList3.add(new RowDelegate.Model(strN, new RowDelegate.Model.MainImage.Image40(new ResourceImage(numValueOf != null ? numValueOf.intValue() : R$drawable.uikit_icn_24_apps, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, false, null, false, 62), textClause, null, 0, textClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                i2 = i3;
            }
            eVarB2.addAll(yp0.b.g(arrayList3, new ListSubheaderDelegate.Model("LIST_ID_ABOUT_HEADER", (Image) null, (Clause) new TextClause(j6.a.q("About ", gVar.f269348a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
            collectionA = zhm.u.a(eVarB2);
        }
        eVarB.addAll(collectionA);
        if (arrayList2.isEmpty()) {
            collectionA2 = f0.f322471a;
        } else {
            aim.e eVarB3 = zhm.u.b();
            eVarB3.add(new ListSubheaderDelegate.Model("LIST_ID_LINKS_HEADER", (Image) null, (Clause) new TextClause("Links", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp12, 0, 0, 57338));
            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList2, 10));
            for (Object obj6 : arrayList2) {
                int i5 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                taj.d dVar = (taj.d) obj6;
                String strT = v1.c.t(i, "LIST_ID_LINK_", dVar.f269345a.name(), "_");
                h4 h4Var = h4.SEMIACCENT;
                UrlImage urlImage = new UrlImage(dVar.f269347c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
                int i6 = zaj.o.f320738a[dVar.f269345a.ordinal()];
                if (i6 == 1) {
                    str = "Website";
                } else if (i6 == 2) {
                    str = "Whitepaper";
                } else if (i6 == 3) {
                    str = "X";
                } else {
                    if (i6 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "Link";
                }
                arrayList4.add(new SmallActionButtonDelegate.Model(strT, h4Var, urlImage, null, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, dVar.f269346b, null, 0, 0, 0, 0, 32216));
                i = i5;
            }
            eVarB3.add(new eg("LIST_ID_LINKS_SCROLLER", arrayList4, null, 8.0f, R$attr.uikit_dp0, 0, 948));
            collectionA2 = zhm.u.a(eVarB3);
        }
        eVarB.addAll(collectionA2);
        return zhm.u.a(eVarB);
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        zj6.k kVar = (zj6.k) this.f315052b;
        OpenBankingBrazilLinkedAccountsGroup linkedAccountsGroup = (OpenBankingBrazilLinkedAccountsGroup) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(linkedAccountsGroup, "linkedAccountsGroup");
        ArrayList<OpenBankingBrazilLinkedAccountsGroup.LinkedAccount> arrayList = linkedAccountsGroup.f72391b;
        ThirdPartyBrazil thirdPartyBrazil = linkedAccountsGroup.f72390a;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (OpenBankingBrazilLinkedAccountsGroup.LinkedAccount linkedAccount : arrayList) {
            arrayList2.add(new RowDelegate.Model(linkedAccount.f72392a, new RowDelegate.Model.MainImage.Image40(((di6.a) kVar.f322766a).c(thirdPartyBrazil.f73115a), null, null, false, null, false, 60), new TextClause(thirdPartyBrazil.f73116b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(linkedAccount.f72393b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new pf(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.consent_action_revoke, null, null, 14), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, linkedAccount.f72392a, null, 0, 0, 0, 0, 532675544));
        }
        return yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("LINKED_ACCOUNTS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_banking_linked_accounts_list_subheader, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65528), null, 0, 0, 126);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r29, java.lang.Object r30, java.lang.Object r31) {
        /*
            r28 = this;
            r0 = r28
            java.lang.Object r1 = r0.f315052b
            zjh.b0 r1 = (zjh.b0) r1
            r2 = r29
            kotlin.Pair r2 = (kotlin.Pair) r2
            r3 = r30
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.getClass()
            r3 = r31
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.String r3 = "<destruct>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.lang.Object r3 = r2.f186385a
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r3 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount) r3
            java.lang.Object r2 = r2.f186386b
            com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation r2 = (com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation) r2
            hel.b r2 = r2.f105106a
            hel.b r4 = hel.b.MX
            r5 = 0
            if (r2 == r4) goto Lc6
            boolean r11 = com.revolut.shared.feature.wealth.models.trading_accounts.d.i(r3)
            boolean r2 = com.revolut.shared.feature.wealth.models.trading_accounts.d.k(r3)
            boolean r4 = r3 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage.JIsa
            r16 = 0
            r17 = 1
            if (r4 == 0) goto L3e
            if (r2 != 0) goto L3e
            r4 = r17
            goto L40
        L3e:
            r4 = r16
        L40:
            tzg.h r1 = r1.i
            x8h.a0 r1 = (x8h.a0) r1
            boolean r1 = r1.a(r3)
            aw0.m6 r18 = aw0.n6.Companion
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r6 = com.revolut.retail.wealth.resources.R$string.common_action_top_up
            r8 = 14
            r7.<init>(r6, r5, r5, r8)
            r6 = r8
            com.revolut.core.ui_kit.views.LargeActionButton$ButtonStyle$DefaultFilledButton r8 = com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle.f58725a
            if (r11 == 0) goto L5c
            zjh.o r9 = zjh.o.ADD_MONEY
            r14 = r9
            goto L5d
        L5c:
            r14 = r5
        L5d:
            r15 = 476(0x1dc, float:6.67E-43)
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r0 = r6
            r6 = r18
            aw0.n6 r7 = aw0.m6.c(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r4 == 0) goto L8d
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$TaxAdvantage$JIsa r3 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage.JIsa) r3
            boolean r6 = r3 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage.JIsa.Custodian
            if (r6 == 0) goto L7e
            com.revolut.feature.junior.isa.api.navigation.JuniorIsaAccountOwnership$Custodian r6 = new com.revolut.feature.junior.isa.api.navigation.JuniorIsaAccountOwnership$Custodian
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$TaxAdvantage$JIsa$Custodian r3 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage.JIsa.Custodian) r3
            com.revolut.shared.feature.wealth.models.trading_accounts.Beneficiary r3 = r3.f105237n
            java.lang.String r3 = r3.f105176b
            r6.<init>(r3)
            goto L84
        L7e:
            boolean r3 = r3 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage.JIsa.Personal
            if (r3 == 0) goto L87
            com.revolut.feature.junior.isa.api.navigation.JuniorIsaAccountOwnership$Personal r6 = com.revolut.feature.junior.isa.api.navigation.JuniorIsaAccountOwnership.Personal.f76736a
        L84:
            r26 = r6
            goto L94
        L87:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L8d:
            if (r2 == 0) goto L92
            zjh.o r6 = zjh.o.WITHDRAW_MONEY
            goto L84
        L92:
            r26 = r5
        L94:
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            if (r1 == 0) goto L9b
            int r1 = com.revolut.feature.wealth.ui.impl.R$string.wealth_action_move_money
            goto L9d
        L9b:
            int r1 = com.revolut.retail.wealth.resources.R$string.wealth_plan_action_withdraw
        L9d:
            r3.<init>(r1, r5, r5, r0)
            com.revolut.core.ui_kit.views.LargeActionButton$ButtonStyle$DefaultFilledButton r20 = com.revolut.core.ui_kit.views.LargeActionButton.ButtonStyle.f58726b
            if (r2 != 0) goto Laa
            if (r4 == 0) goto La7
            goto Laa
        La7:
            r23 = r16
            goto Lac
        Laa:
            r23 = r17
        Lac:
            r25 = 0
            r27 = 476(0x1dc, float:6.67E-43)
            r21 = 0
            r22 = 0
            r24 = 0
            r19 = r3
            aw0.n6 r20 = aw0.m6.c(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            aw0.g r18 = new aw0.g
            r23 = 24
            r19 = r7
            r18.<init>(r19, r20, r21, r22, r23)
            return r18
        Lc6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ymk.y.i(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        zk1.r rVar = (zk1.r) this.f315052b;
        pk1.a paymentCode = (pk1.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(paymentCode, "paymentCode");
        TextDelegate.Model model = new TextDelegate.Model(R$attr.uikit_dp24, R$attr.uikit_dp32, 828, new TextLocalisedClause(com.revolut.feature.alipay.api.R$string.alipay_plus_show_code_tap_to_enlarge, null, null, 14), "ID_ENLARGE_HINT");
        zk1.c cVar = rVar.f322900a;
        String str = paymentCode.f236912a;
        zk1.c.Companion.getClass();
        zk1.e eVar = (zk1.e) cVar;
        we0 we0Var = new we0("ID_BARCODE", new qe0((int) 60.0f, eVar.a(str, zk1.b.f322887b)));
        QrCodeImage qrCodeImageB = eVar.b(paymentCode.f236912a);
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp0;
        int i3 = R$attr.uikit_dp32;
        List listK = zhm.v.k(model, we0Var, new QRCodeDelegate.Model("ID_QR_CODE", null, qrCodeImageB, null, null, null, i, i2, i3, i3, 50138), new TextDelegate.Model(0, R$attr.uikit_dp16, 892, new TextLocalisedClause(com.revolut.feature.alipay.api.R$string.alipay_plus_show_code_renew_down_counter, zhm.u.c(Integer.valueOf(paymentCode.f236913b)), null, 12), "ID_RENEWAL_COUNTDOWN"));
        yp0.b.k(listK, R$attr.uikit_dp32, R$attr.uikit_dp16, 0, 0, 28);
        return listK;
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        zl1.t tVar = (zl1.t) this.f315052b;
        zl1.b settingsData = (zl1.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(settingsData, "settingsData");
        List list = settingsData.f323157a;
        boolean z = settingsData.f323158b;
        aim.e eVarB = zhm.u.b();
        List listC = zhm.u.c(new RowDelegate.Model("ITEM_DEFAULT_RECEIVER_ID", null, new TextLocalisedClause(com.revolut.feature.apm.aani.api.R$string.aani_settings_default_revolut_title, null, null, 14), null, 0, new TextLocalisedClause(z ? com.revolut.feature.apm.aani.api.R$string.aani_settings_default_revolut_description_on : com.revolut.feature.apm.aani.api.R$string.aani_settings_default_revolut_description_off, null, null, 14), null, null, 0, new vf(z, !z), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869850));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        eVarB.addAll(listC);
        List<Alias> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (Alias alias : list2) {
            v02.a aVar = tVar.f323172a;
            AliasType aliasType = alias.f61878a;
            boolean z3 = Intrinsics.f(aliasType, AliasType.PHONE.f61895b) || Intrinsics.f(aliasType, AliasType.EMAIL.f61894b);
            j12.a aVar2 = (j12.a) aVar;
            arrayList.add(new RowDelegate.Model(j6.a.q("ITEM_ALIAS_ID", alias.f61879b), new RowDelegate.Model.MainImage.Image40(new GlyphImage(aVar2.a(aliasType), null, null, 6), null, null, false, null, false, 62), aVar2.d(alias), null, 0, Intrinsics.f(aliasType, AliasType.DOCUMENT_ID.f61893b) ? new TextLocalisedClause(com.revolut.feature.apm.aani.api.R$string.apm_alias_kind_emirates_id, null, null, 14) : aVar2.c(aliasType), null, null, 0, null, z3, null, false, null, null, null, null, null, null, z3 ? alias : null, null, 0, 0, 0, 0, 532674520));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        List listC2 = zhm.u.c(new RowDelegate.Model("ITEM_UNLINK_ID", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_unlink, GlyphImageTint.DANGER.f59929a, null, 4), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.apm.aani.api.R$string.aani_settings_unlink_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        yp0.b.k(listC2, 0, 0, 0, 0, 31);
        eVarB.addAll(listC2);
        return new zl1.h(zhm.u.a(eVarB));
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        boolean z;
        zm3.a aVar = (zm3.a) this.f315052b;
        Map profiles = (Map) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(profiles, "profiles");
        Collection collectionValues = profiles.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            z = true;
        } else {
            Iterator it8 = collectionValues.iterator();
            while (it8.hasNext()) {
                if (Intrinsics.f(((JuniorBankingProfile) it8.next()).f77101g, ((zm3.l) aVar).getCode())) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        List listF0;
        zmd.q qVar = (zmd.q) this.f315052b;
        zmd.j content = (zmd.j) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ArrayList arrayList = content.d.f298652b;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(a9e.a.b(qVar.f323478b, (qua.p) it8.next(), true, true, content.e));
        }
        RowDelegate.Model modelA = zmd.q.a("budget_upcoming_payments_see_all", com.revolut.feature.spending_analytics.api.R$string.analytics_budget_upcoming_see_all, zmd.b.f323460a);
        RowDelegate.Model modelA2 = zmd.q.a("budget_upcoming_payments_find_subscription", com.revolut.feature.spending_analytics.api.R$string.analytics_budget_upcoming_find_subscriptions, zmd.a.f323459a);
        yp0.b.l(modelA2, 0, 0, 0, 0, null, false, 63);
        if (arrayList2.isEmpty()) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("budget_upcoming_payments_empty", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_budget_upcoming_empty_title, null, null, 14), new TextLocalisedClause(gj7.b.A(content.f323469c) ? com.revolut.feature.spending_analytics.api.R$string.analytics_budget_upcoming_empty_subtitle_month : com.revolut.feature.spending_analytics.api.R$string.analytics_budget_upcoming_empty_subtitle_week, null, null, 14), new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_calendar_recurring, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, new ImageTransformations(null, null, null, null, null, 42, 42, 31), (Clause) null, 182)), null, zj.REGULAR, false, null, null, null, 1856);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
            listF0 = zhm.v.k(model, modelA, modelA2);
        } else {
            ArrayList arrayListF0 = zhm.d0.F0(modelA, arrayList2);
            yp0.b.k(arrayListF0, 0, 0, 0, 0, 31);
            listF0 = zhm.d0.F0(modelA2, arrayListF0);
        }
        Clause clauseD = otd.f.d(content.d.f298651a);
        long jBetween = ChronoUnit.DAYS.between(((l80.f) qVar.f323477a).e(), content.f323468b.f99211b);
        if (jBetween < 0) {
            jBetween = 0;
        }
        if (jBetween != 0) {
            clauseD = new CompositeClause(zhm.v.k(clauseD, new TextLocalisedQuantityClause(R$plurals.analytics_budget_upcoming_next_days, Long.valueOf(jBetween), (List) null, (Style) null, 28)), new DotDividerClause((Integer) null), null, null, 12);
        }
        return new zmd.i(listF0, new zmd.f(clauseD));
    }

    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    private final Object n(Object obj2, Object obj3, Object obj4) {
        Clause textClause;
        char c2;
        ?? r62;
        RowDelegate.Model.c.b bVar;
        zn6.h hVar = (zn6.h) this.f315052b;
        oh6.e preview = (oh6.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(preview, "preview");
        Set set = hVar.f323674b;
        AccountLinkingExpirationOption accountLinkingExpirationOption = hVar.d;
        Float fValueOf = Float.valueOf(16.0f);
        ArrayList<oh6.b> arrayList = preview.f225319c;
        oh6.a aVar = preview.d;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (oh6.b bVar2 : arrayList) {
            arrayList2.add(preview.f225318b ? new InputChecklistDelegate.Model(bVar2.f225315a, new TextClause(bVar2.f225316b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), set.contains(bVar2.f225315a), false, null, iq.CHECK_BUTTON, null, null, null, null, 0, 0, 0, 524248) : new ListCellDelegate.Model(bVar2.f225315a, new j8(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), yt.TOP), new TextClause(bVar2.f225316b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, 0, 0, 0, 0, 4088));
        }
        if (accountLinkingExpirationOption == null) {
            c2 = 0;
            r62 = 1;
            bVar = new RowDelegate.Model.c.b(new TimeClause(aVar.f225313a, new TimeClause.Format.DateMedium(0), null, null, 12), null, null, false, 126);
        } else {
            if (accountLinkingExpirationOption instanceof AccountLinkingExpirationOption.DateOption) {
                textClause = new TimeClause(((AccountLinkingExpirationOption.DateOption) accountLinkingExpirationOption).f72477b, new TimeClause.Format.DateMedium(0), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8);
            } else {
                if (!(accountLinkingExpirationOption instanceof AccountLinkingExpirationOption.OneTimeOption)) {
                    throw new NoWhenBranchMatchedException();
                }
                textClause = new TextClause(((AccountLinkingExpirationOption.OneTimeOption) accountLinkingExpirationOption).f72478a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
            }
            c2 = 0;
            r62 = 1;
            bVar = new RowDelegate.Model.c.b(new CompositeClause(zhm.v.k(new ImageClause(R$drawable.uikit_icn_24_edit, new ImageClauseTint.Color(R$attr.uikit_colorAccent), fValueOf, fValueOf, 16), textClause), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, false, 126);
        }
        ArrayList arrayListG = yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("PERMISSIONS_SECTION_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_account_linking_review_authorisation_information_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, R$attr.uikit_dp16, LDSFile.EF_DG4_TAG);
        List listC = zhm.u.c(new RowDelegate.Model("AUTHORIZATION_ENDS", null, new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_account_linking_review_authorisation_authorisation_ends, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, bVar, !aVar.f225314b.isEmpty(), null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867834));
        yp0.b.k(listC, 0, R$attr.uikit_dp16, 0, 0, 29);
        List[] listArr = new List[2];
        listArr[c2] = arrayListG;
        listArr[r62] = listC;
        return new zn6.l(zn6.n.a(hVar.f323675c, preview.f225317a), zhm.w.u(zhm.v.k(listArr)), r62);
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        List listC;
        zqc.j jVar = (zqc.j) this.f315052b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List list = content;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : list) {
            if (((SalarySwitchV2StatusSummary) obj5).f85261b == bqc.k.IN_PROGRESS) {
                arrayList.add(obj5);
            }
        }
        List listA = zqc.j.a(jVar.f324457a, arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj6 : list) {
            if (((SalarySwitchV2StatusSummary) obj6).f85261b != bqc.k.IN_PROGRESS) {
                arrayList2.add(obj6);
            }
        }
        ArrayList arrayListE0 = zhm.d0.E0(zqc.j.a(jVar.f324458b, arrayList2), listA);
        if ((list instanceof Collection) && list.isEmpty()) {
            listC = zhm.u.c(new ActionsView.Item("NEW_REQUEST_ACTION_ID", null, false, null, null, new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_requests_list_action_new_request, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670));
        } else {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (((SalarySwitchV2StatusSummary) it8.next()).f85261b == bqc.k.IN_PROGRESS) {
                    listC = f0.f322471a;
                    break;
                }
            }
            listC = zhm.u.c(new ActionsView.Item("NEW_REQUEST_ACTION_ID", null, false, null, null, new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_requests_list_action_new_request, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670));
        }
        return new zqc.i(arrayListE0, listC, (List) jVar.f324459c.getValue());
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        wpa.f fVarA;
        TextLocalisedClause textLocalisedClause;
        wpa.f fVarA2;
        String str;
        String str2;
        zqf.d dVar = (zqf.d) this.f315052b;
        a3 transaction = (a3) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        tof.q qVar = transaction.f272597k0;
        if (qVar == null || (str2 = qVar.e) == null) {
            fVarA = null;
        } else {
            wpa.f.Companion.getClass();
            fVarA = wpa.b.a(str2);
        }
        wpa.e eVar = wpa.e.f299211a;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(Intrinsics.f(fVarA, eVar) ? com.revolut.feature.transfer.core.R$string.transfer_locate_header_description_visa : com.revolut.feature.transfer.core.R$string.transfer_locate_header_description, null, null, 14);
        hpf.a aVar = dVar.f324477b;
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ID_IMAGE", null, null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D310", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 31716);
        ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("ID_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.transfer.core.R$string.transfer_recall_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        int i = zqf.g.f324481a[aVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.transfer.core.R$string.transfer_recall_section_item_duration_subtitle, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.transfer.core.R$string.transfer_recall_section_item_duration_subtitle_card, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause3 = textLocalisedClause;
        int i2 = com.revolut.feature.transfer.core.R$string.transfer_recall_section_item_duration_title;
        Intrinsics.checkNotNullParameter(transaction, "<this>");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        tof.q qVar2 = transaction.f272597k0;
        if (qVar2 == null || (str = qVar2.e) == null) {
            fVarA2 = null;
        } else {
            wpa.f.Companion.getClass();
            fVarA2 = wpa.b.a(str);
        }
        List listC = zhm.u.c(new RowDelegate.Model("ID_ITEM_1", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(i2, zhm.u.c(Integer.valueOf(Intrinsics.f(fVarA2, eVar) ? 13 : 40)), null, 12), null, 0, textLocalisedClause3, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        aim.e eVarB = zhm.u.b();
        eVarB.add(model);
        eVarB.add(model2);
        eVarB.addAll(listC);
        return new zqf.e(textLocalisedClause2, zhm.u.a(eVarB), true);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v0 zr4.w, still in use, count: 2, list:
          (r4v0 zr4.w) from 0x030e: MOVE (r35v0 zr4.w) = (r4v0 zr4.w)
          (r4v0 zr4.w) from 0x02be: MOVE (r35v2 zr4.w) = (r4v0 zr4.w)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    private final java.lang.Object q(java.lang.Object r65, java.lang.Object r66, java.lang.Object r67) {
        /*
            Method dump skipped, instruction units count: 1777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ymk.y.q(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        zt4.a aVar = (zt4.a) this.f315052b;
        gl4.a screenContent = (gl4.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(screenContent, "screenContent");
        boolean z = aVar.f325068b;
        aim.e eVarB = zhm.u.b();
        dj0.d dVar = screenContent.f144554b;
        LocalDate localDate = screenContent.f144555c;
        CounterTextDelegate.Model.Companion companion = CounterTextDelegate.Model.INSTANCE;
        LayeredImage.Companion companion2 = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_scan_card;
        int i2 = R$attr.uikit_colorAccentNeutral;
        CounterTextDelegate.Model modelA = CounterTextDelegate.Model.Companion.a(companion, "id_credit_card_boleto_copy_text_counter", new v4(companion2.l(i, new Color.Solid(i2), new Color.ModifiedColor(new Color.Solid(i2), 0.1f))), sx4.f.b(3, null, null, dVar), new TextLocalisedClause(R$string.credit_card_boleto_valid_until, zhm.u.c(new TimeClause(ebm.a.P(localDate), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12), null, null, 0, 0, 4080);
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        eVarB.add(modelA);
        String str = screenContent.d;
        String str2 = screenContent.e;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_boleto_boleto_code_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_boleto_boleto_code_description, null, null, 14);
        yy0.i iVar = yy0.l.Companion;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246);
        iVar.getClass();
        tf tfVar = new tf(yy0.i.a(resourceImage));
        int i3 = R$drawable.uikit_icn_24_receipt;
        int i5 = R$attr.uikit_colorAccentNeutral;
        RowDelegate.Model model = new RowDelegate.Model("id_credit_card_boleto_copy_boleto_code", new RowDelegate.Model.MainImage.Image40(wp5.y.h(new Color.Solid(i5), 0.1f, companion2, i3, new Color.Solid(i5)), null, null, false, null, false, 60), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, tfVar, false, null, false, null, null, null, null, null, null, new zt4.p(str), null, 0, 0, 0, 0, 532675544);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_card_boleto_pix_code_title, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_card_boleto_pix_code_description, null, null, 14);
        tf tfVar2 = new tf(yy0.i.a(new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246)));
        int i6 = R$drawable.uikit_icn_24_logo_pix_outline;
        int i21 = R$attr.uikit_colorAccentNeutral;
        List listK = zhm.v.k(model, new RowDelegate.Model("id_credit_card_boleto_copy_pix_code", new RowDelegate.Model.MainImage.Image40(wp5.y.h(new Color.Solid(i21), 0.1f, companion2, i6, new Color.Solid(i21)), null, null, false, null, false, 60), textLocalisedClause3, null, 0, textLocalisedClause4, null, null, 0, tfVar2, false, null, false, null, null, null, null, null, null, new zt4.p(str2), null, 0, 0, 0, 0, 532675544));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        CellDetailsActionDelegate.Model model2 = new CellDetailsActionDelegate.Model("id_credit_card_boleto_share", new TextLocalisedClause(R$string.credit_card_boleto_pdf, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_share_ios, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.credit_card_boleto_pdf_share, null, null, 14), null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        RowDelegate.Model model3 = new RowDelegate.Model("id_credit_card_boleto_cancel", null, new TextLocalisedClause(R$string.credit_card_boleto_cancel, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10), of.SMALL, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870898);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model3);
        return new zt4.i(zhm.u.a(eVarB), new zt4.f(new TextLocalisedClause(R$string.credit_card_boleto_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_boleto_subtitle, null, null, 14), new ResourceImage(z ? R$drawable.uikit_icn_24_cross : R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)));
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        ztk.g gVar = (ztk.g) this.f315052b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        mel.g gVar2 = (mel.g) pair.f186385a;
        List[] elements = {gVar.f325179a.c(new zh0.b(gVar2, 20), "expected-annual-return-value", com.revolut.retail.wealth.resources.R$string.instrument_insights_indicator_expected_annual_return_label, com.revolut.retail.wealth.resources.R$string.instrument_insights_indicator_expected_annual_return_description, null), gVar.f325180b.g(gVar2.f204747a, com.revolut.retail.wealth.resources.R$string.instrument_insights_indicator_rank_description)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return zhm.w.u(kotlin.collections.d.L(elements));
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        List list;
        TextLocalisedClause textLocalisedClause;
        zug.a aVar = (zug.a) this.f315052b;
        wbl.e content = (wbl.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = zhm.u.b();
        EnumEntries<zug.c> enumEntriesA = zug.c.a();
        ArrayList arrayList = new ArrayList(zhm.w.t(enumEntriesA, 10));
        for (zug.c cVar : enumEntriesA) {
            int i = zug.l.f325464a[cVar.ordinal()];
            if (i == 1) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth.account_closure.impl.R$string.trading_upcoming_dividends_tab_stock, null, null, 14);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth.account_closure.impl.R$string.trading_upcoming_dividends_tab_cash, null, null, 14);
            }
            arrayList.add(new FixedTabs.Item(cVar.name(), textLocalisedClause, (AnalyticsContext) null, 12));
        }
        eVarB.add(new FixedTabsDelegate.Model("TABS_LIST_ID", arrayList, aVar.f325452a.name(), false, null, SyslogConstants.LOG_CLOCK));
        if (aVar.f325452a == zug.c.STOCK) {
            ArrayList<wbl.d> arrayList2 = content.f296258a;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
            for (wbl.d dVar : arrayList2) {
                wbl.f fVar = dVar.f296255a;
                InstrumentTicker instrumentTicker = dVar.f296257c;
                dj0.d dVarV = pyd.c.V(instrumentTicker.e, fVar.f296262c);
                String str = zug.c.STOCK + fVar.f296260a;
                String str2 = dVar.f296256b.f183173a.f;
                List listK = zhm.v.k(new NumberClause(fVar.f296262c, new NumberClause.Format.FixedDigitsAfterDot(2, 14, null, null, null), null, null, 12), new TextClause(instrumentTicker.f105113c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                m70.a.t(t0.f186434a);
                arrayList3.add(zug.k.a(str, fVar, str2, new RowDelegate.Model.c.b(new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), new MoneyClause(dVarV, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, false, 124)));
            }
            boolean zIsEmpty = arrayList3.isEmpty();
            List listC = arrayList3;
            if (zIsEmpty) {
                listC = zhm.u.c(zug.k.b(com.revolut.feature.wealth.account_closure.impl.R$string.trading_upcoming_dividends_stocks_empty, R$drawable.uikit_icn_24_bar_chart_percent, zug.c.STOCK + "EMPTY_LIST_ITEM_ID"));
            }
            list = listC;
        } else {
            ArrayList<wbl.c> arrayList4 = content.f296259b;
            ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
            for (wbl.c cVar2 : arrayList4) {
                wbl.a aVar2 = cVar2.f296253a;
                arrayList5.add(zug.k.a(zug.c.CASH + aVar2.f296250a, aVar2, cVar2.f296254b.f183173a.f, new RowDelegate.Model.c.b(new MoneyClause(aVar2.f296252c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126)));
            }
            boolean zIsEmpty2 = arrayList5.isEmpty();
            List listC2 = arrayList5;
            if (zIsEmpty2) {
                listC2 = zhm.u.c(zug.k.b(com.revolut.feature.wealth.account_closure.impl.R$string.trading_upcoming_dividends_cash_empty, R$drawable.uikit_icn_24_coins, zug.c.CASH + "EMPTY_LIST_ITEM_ID"));
            }
            list = listC2;
        }
        List list2 = list;
        yp0.b.k(list2, 0, 0, 0, 0, 31);
        eVarB.addAll(list2);
        return zhm.u.a(eVarB);
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        zul.n nVar = (zul.n) this.f315052b;
        nel.n instrument = (nel.n) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        InstrumentImage instrumentImageB = nbh.a.b(instrument);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.trading.orders.R$string.wealth_trading_invest_order_investment_plan_projections_toolbar_title, null, null, 14);
        TextClause textClause = new TextClause(instrument.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        InvestmentProjectionsContract$Context investmentProjectionsContract$Context = nVar.f325542c;
        if (!(investmentProjectionsContract$Context instanceof InvestmentProjectionsContract$Context.InvestmentPlansCollection)) {
            investmentProjectionsContract$Context = null;
        }
        InvestmentProjectionsContract$Context.InvestmentPlansCollection investmentPlansCollection = (InvestmentProjectionsContract$Context.InvestmentPlansCollection) investmentProjectionsContract$Context;
        return new zul.v(instrumentImageB, textLocalisedClause, textClause, investmentPlansCollection != null ? investmentPlansCollection.f91734a : null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:242:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0b98  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0c03  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0ce6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r62, java.lang.Object r63, java.lang.Object r64) {
        /*
            Method dump skipped, instruction units count: 3484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ymk.y.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ y(Object obj2, int i) {
        this.f315051a = i;
        this.f315052b = obj2;
    }

    public /* synthetic */ y(Object obj2, Object obj3, int i) {
        this.f315051a = i;
        this.f315052b = obj3;
    }
}
