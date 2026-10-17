package a2g;

import a83.z0;
import android.os.Parcelable;
import aw0.c7;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ComparisonCellDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.b9;
import com.revolut.core.ui_kit.delegates.c4;
import com.revolut.core.ui_kit.delegates.d9;
import com.revolut.core.ui_kit.delegates.dc;
import com.revolut.core.ui_kit.delegates.f2;
import com.revolut.core.ui_kit.delegates.ff;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.delegates.z8;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.SuggestionViewStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.atm.api.model.Atm;
import com.revolut.feature.atm.api.model.AtmBoundBox;
import com.revolut.feature.atm.api.model.AtmLocation;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesV2;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangePricingFee;
import com.revolut.feature.insurance_common.data.model.Banner;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.onboarding.api.user_migration.model.UserMigration;
import com.revolut.feature.referrals.common.data.api.domain.model.common.InviteTransactionWidget;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucher;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAvailabilityDates;
import com.revolut.retail.wealth.resources.R$string;
import com.youTransactor.uCube.rpc.Constants;
import gu7.c3;
import gu7.d4;
import gu7.g4;
import gu7.j1;
import gu7.j4;
import gu7.p4;
import ip0.ck0;
import ip0.hb;
import ip0.jb;
import ip0.jh0;
import ip0.nl0;
import ip0.ww;
import ip0.xc;
import ip0.xn;
import ip0.y10;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jel.b0;
import jel.c0;
import jel.h1;
import jel.m1;
import jel.n1;
import jel.w2;
import k4l.e0;
import k4l.g0;
import k4l.i0;
import k4l.j0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import m1c.x;
import nr7.d;
import org.jmrtd.cbeff.ISO781611;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f845a;

    public /* synthetic */ m(int i) {
        this.f845a = i;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List<Terms> list = content;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (Terms terms : list) {
            boolean z = false;
            arrayList.add(new RowDelegate.Model(terms.f90355a, new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBlue), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6), new TextClause(terms.f90359h, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, terms, null, 0, 0, 0, 0, 532676600));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((Boolean) obj3).getClass();
        if (!zBooleanValue) {
            return f0.f322471a;
        }
        List listK = v.k(new TextLocalisedClause(R$string.wealth_trading_instrument_details_risk_alignment_warning_link, null, new Click(28, (Integer) null, (Object) atk.g.f9087a, "investment-notice-click-id", false), 10), new TextLocalisedClause(R$string.wealth_trading_instrument_details_risk_alignment_warning_text, null, null, 14));
        m70.a.t(t0.f186434a);
        return u.c(new TextDelegate.Model("investment-notice-list-id", new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, new ck0(0), null, null, 0, 0, 0, 0, 2036));
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        nr7.c cVar;
        nr7.c cVar2;
        nr7.c cVar3;
        String str;
        String str2;
        String str3;
        String str4;
        j1 coverage = (j1) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        List<p4> list = coverage.f146768a;
        ArrayList arrayList = new ArrayList();
        for (p4 p4Var : list) {
            List list2 = p4Var.f146811b;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList2.add(av7.n.b((j4) it8.next(), false));
            }
            a0.x(yp0.b.g(arrayList2, new ListSubheaderDelegate.Model(j6.a.q("SUBHEADER_", p4Var.f146810a), (Image) null, (Clause) new TextClause(p4Var.f146810a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayList);
        }
        j4 j4Var = coverage.f146769b;
        List listL = v.l(j4Var != null ? av7.n.b(j4Var, true) : null);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        ArrayList arrayListE0 = d0.E0(listL, arrayList);
        Banner banner = coverage.f146770c;
        Intrinsics.checkNotNullParameter(arrayListE0, "<this>");
        String str5 = "BANNER_ITEM";
        Intrinsics.checkNotNullParameter("BANNER_ITEM", "itemId");
        if (banner == null) {
            return arrayListE0;
        }
        Intrinsics.checkNotNullParameter("BANNER_ITEM", "itemId");
        Banner.Button button = banner.f75699h;
        Banner.Button button2 = banner.f75698g;
        String str6 = banner.e;
        Boolean bool = banner.i;
        TextClause textClause = new TextClause(banner.f75696b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause(banner.f75697c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        com.revolut.core.ui_kit.delegates.m mVar = new com.revolut.core.ui_kit.delegates.m(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_info_outline, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), (LayeredImage) null, (ProgressStyle) null, 6);
        Boolean bool2 = Boolean.TRUE;
        ActionWidgetDelegate.Model.b aVar = Intrinsics.f(bool, bool2) ? new ActionWidgetDelegate.Model.b.a(null) : ActionWidgetDelegate.Model.b.C0394b.f51606a;
        boolean z = str6 != null;
        com.revolut.core.ui_kit.delegates.k kVar = new com.revolut.core.ui_kit.delegates.k((button2 == null || (str4 = button2.f75708a) == null) ? null : sr7.c.a(str4, null), (button == null || (str3 = button.f75708a) == null) ? null : sr7.c.a(str3, null), null, null, Constants.TAG_FC_SPEED_MODE);
        if (str6 != null) {
            Intrinsics.checkNotNullParameter(str6, "<this>");
            cVar = new nr7.c(str6);
        } else {
            cVar = null;
        }
        Pair pair = new Pair(ActionWidgetDelegate.a.b.f51608a, cVar);
        if (button2 == null || (str2 = button2.f75709b) == null) {
            cVar2 = null;
        } else {
            Intrinsics.checkNotNullParameter(str2, "<this>");
            cVar2 = new nr7.c(str2);
        }
        Pair pair2 = new Pair(ActionWidgetDelegate.a.c.f51609a, cVar2);
        if (button == null || (str = button.f75709b) == null) {
            cVar3 = null;
        } else {
            Intrinsics.checkNotNullParameter(str, "<this>");
            cVar3 = new nr7.c(str);
        }
        List listC = u.c(new ActionWidgetDelegate.Model(str5, textClause, textClause2, mVar, aVar, kVar, null, new sr7.a(foh.i.q(pair, pair2, new Pair(ActionWidgetDelegate.a.d.f51610a, cVar3), new Pair(ActionWidgetDelegate.a.C0395a.f51607a, Intrinsics.f(bool, bool2) ? d.a.f218592a : null))), null, z, 5952));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return d0.E0(arrayListE0, listC);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        g4 planComparison = (g4) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(planComparison, "planComparison");
        if (planComparison.f146753a.size() == 1) {
            return f0.f322471a;
        }
        List<d4> list = planComparison.f146753a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (d4 d4Var : list) {
            arrayList.add(new com.revolut.core.ui_kit.views.q(d4Var.f146730a, new com.revolut.core.ui_kit.views.t(new TextClause(d4Var.f146731b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), 50));
        }
        return arrayList;
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        g4 planComparison = (g4) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(planComparison, "planComparison");
        List<d4> list = planComparison.f146753a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (d4 d4Var : list) {
            String strQ = j6.a.q("PLAN_PAGE_", d4Var.f146731b);
            aim.e eVarB = u.b();
            CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("CELL_DETAILS", new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_comparison_plan_price, null, null, 14), new CompositeClause(v.k(new MoneyClause(d4Var.f146732c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_comparison_month, null, null, 14)), new TextClause("/", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
            yp0.b.l(model, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
            eVarB.add(model);
            List<c3> list2 = d4Var.d;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            for (c3 c3Var : list2) {
                arrayList2.add(new ProductSelectionDelegate.Model(j6.a.q("PRODUCT_ITEM_", c3Var.f146724b), new dc(new UrlImage(c3Var.f146723a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286)), new TextClause(c3Var.f146724b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(c3Var.f146725c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, false, false, 624));
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            a0.x(arrayList2, eVarB);
            arrayList.add(new xc(strQ, u.a(eVarB), 0, null, null, 0, 0, 0, 1016));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v30, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v56 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        List listA;
        int i;
        qv0.i iVarA;
        Iterator it8;
        TextLocalisedClause textLocalisedClause;
        hb hbVar;
        CellDetailsDelegate.Model model;
        switch (this.f845a) {
            case 0:
                TravelExperienceAvailabilityDates availabilityDates = (TravelExperienceAvailabilityDates) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(availabilityDates, "availabilityDates");
                return availabilityDates.f92787a;
            case 1:
                List disclaimers = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
                return m72.b.x(disclaimers, od0.i.Companion);
            case 2:
                e0 l2 = (e0) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(l2, "l");
                List<j0> list = l2.f180958j;
                ArrayList arrayList = new ArrayList();
                for (j0 j0Var : list) {
                    e2b.a aVar = j0Var instanceof k4l.f0 ? e2b.a.LIMIT : j0Var instanceof g0 ? e2b.a.MARKET : j0Var instanceof i0 ? e2b.a.STOP : null;
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                return d0.i1(arrayList);
            case 3:
                jel.c instrumentDetails = (jel.c) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
                if (instrumentDetails instanceof b0) {
                    c0 c0Var = ((b0) instrumentDetails).f173414g;
                    listA = c0Var != null ? a4h.d.a(c0Var.f, c0Var.f173424c, c0Var.f173423b, c0Var.f173422a, c0Var.d, c0Var.e) : null;
                    if (listA == null) {
                        listA = f0.f322471a;
                    }
                } else if (instrumentDetails instanceof m1) {
                    n1 n1Var = ((m1) instrumentDetails).d;
                    listA = n1Var != null ? a4h.d.a(n1Var.f, n1Var.f173521c, n1Var.f173520b, n1Var.f173519a, n1Var.d, n1Var.e) : null;
                    if (listA == null) {
                        listA = f0.f322471a;
                    }
                } else {
                    if (!(instrumentDetails instanceof jel.m) && !(instrumentDetails instanceof jel.n) && !(instrumentDetails instanceof jel.q) && !(instrumentDetails instanceof h1) && !(instrumentDetails instanceof w2)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listA = f0.f322471a;
                }
                List<a4h.e> list2 = listA;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                for (a4h.e eVar : list2) {
                    String str = "LIST_ID_DOCUMENTS_WIDGET_ITEM" + eVar.f1274a;
                    boolean z = false;
                    RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), z, z, 6);
                    switch (a4h.g.f1276a[eVar.f1274a.ordinal()]) {
                        case 1:
                            i = com.revolut.feature.wealth.assetdetails.ui.impl.R$string.wealth_private_equity_fund_details_documents_annual_report;
                            break;
                        case 2:
                            i = com.revolut.feature.wealth.assetdetails.ui.impl.R$string.wealth_private_equity_fund_details_documents_semiannual_report;
                            break;
                        case 3:
                            i = com.revolut.feature.wealth.assetdetails.ui.impl.R$string.wealth_private_equity_fund_details_documents_quarterly_report;
                            break;
                        case 4:
                            i = com.revolut.feature.wealth.assetdetails.ui.impl.R$string.wealth_private_equity_fund_details_documents_monthly_report;
                            break;
                        case 5:
                            i = com.revolut.feature.wealth.assetdetails.ui.impl.R$string.wealth_private_equity_fund_details_documents_kid;
                            break;
                        case 6:
                            i = com.revolut.feature.wealth.assetdetails.ui.impl.R$string.wealth_private_equity_fund_details_documents_prospectus;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList2.add(new RowDelegate.Model(str, image24, new TextLocalisedClause(i, null, new Click(30, (Integer) null, (Object) null, "LIST_ID_DOCUMENTS_WIDGET_ITEM_CLICK_ID", false), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new v2h.d(eVar.f1275b), null, 0, 0, 0, 0, 532676600));
                }
                yp0.e0 e0Var = yp0.e0.OUTSIDE_BOX;
                int i2 = R$attr.uikit_dp8;
                int i3 = R$attr.uikit_dp16;
                return !arrayList2.isEmpty() ? yp0.b.d(arrayList2, new ListSubheaderDelegate.Model("LIST_ID_DOCUMENTS_WIDGET_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.wealth.assetdetails.ui.impl.R$string.wealth_trading_instrument_details_documents_widget_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, i2, i2, i3, i3) : arrayList2;
            case 4:
                a5d.k content = (a5d.k) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                return u.c(new xn(content.f1360a, new nl0(content.f1361b)));
            case 5:
                a5d.k content2 = (a5d.k) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                IntRange intRange = new IntRange(1, 5, 1);
                ArrayList arrayList3 = new ArrayList(w.t(intRange, 10));
                vim.f it9 = intRange.iterator();
                while (it9.f289625c) {
                    int iNextInt = it9.nextInt();
                    arrayList3.add(new SuggestionsBarDelegate.Suggestion(a0.d.n("TRANSACTION_AMOUNT_", iNextInt), new TextClause(String.valueOf(iNextInt), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, content2.f1361b == iNextInt ? new SuggestionViewStyle.Accent((Object) null) : new SuggestionViewStyle.Semiaccent((Object) null), false, Integer.valueOf(iNextInt), null, 364));
                }
                return u.c(new nh("suggestionsBarDelegate_transactionsCountSelector", arrayList3, jh0.FLEXBOX_CENTERED, R$attr.uikit_dp16, 0, 0, 0, 0, 496));
            case 6:
                Map content3 = (Map) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(content3, "content");
                return d0.d1(content3.values());
            case 7:
                sj2.b content4 = (sj2.b) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content4, "content");
                if (content4.f263673a.isEmpty()) {
                    iVarA = z0.a();
                } else {
                    AtmBoundBox atmBoundBox = content4.f263674b;
                    AtmLocation atmLocation = atmBoundBox.f63132a;
                    double d = atmLocation.f63139b;
                    AtmLocation atmLocation2 = atmBoundBox.f63133b;
                    z8 z8Var = new z8(d, atmLocation2.f63139b, atmLocation.f63138a, atmLocation2.f63138a);
                    List<Atm> list3 = content4.f263673a;
                    ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                    for (Atm atm : list3) {
                        yv0.b bVar = new yv0.b(new ResourceImage(R$drawable.uikit_icn_24_atm, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), true);
                        int i5 = R$attr.uikit_colorAccentNeutral_10;
                        yv0.e eVar2 = yv0.e.DP_24;
                        ah0.a aVar2 = new ah0.a(atm.e, atm.f);
                        m70.a.c(t0.f186434a);
                        arrayList4.add(new yv0.i(aVar2, bVar, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, eVar2, i5, 0, null, 200));
                    }
                    iVarA = new d9("ATM_MAP_LIST_ID", z8Var, content4.f263675c, new b9(arrayList4), new ww(new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_home_item_find_atms, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246)), null, yv0.j.DP_120, false, 3040);
                }
                qv0.i iVar = iVarA;
                yp0.b.l(iVar, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
                return u.c(iVar);
            case 8:
                ra3.a content5 = (ra3.a) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content5, "content");
                List list4 = content5.f252778a;
                if (!list4.isEmpty()) {
                    ArrayList arrayListF1 = d0.f1(d0.V0(list4, 5));
                    if (list4.size() > 5) {
                        arrayListF1.add(new LargeActionButtonDelegate.Model("CARDS_SEE_ALL_ITEM_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_section_all_items_button, null, null, 14), false, null, null, null, null, 1000));
                    }
                    return yp0.b.g(arrayListF1, new ListSubheaderDelegate.Model("CARDS_TITLE_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_section_cards_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), yp0.e0.OUTSIDE_BOX, 0, 0, 124);
                }
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.shared.help_centre.impl.R$string.help_center_section_cards_empty, null, null, 14);
                CdnImage cdnImageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D010", null, null, null, 30);
                ff ffVar = ff.DP_40;
                int i6 = R$attr.uikit_dp24;
                int i21 = R$attr.uikit_dp16;
                RowDelegate.Model model2 = new RowDelegate.Model("CARDS_LOADING_ITEM_ID", cdnImageC, ffVar, null, textLocalisedClause2, null, null, null, 0, null, false, false, null, null, null, null, null, null, null, i6, i6, i21, i21, 67104744);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                return u.c(model2);
            case 9:
                qua.p content6 = (qua.p) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(content6, "content");
                Optional optionalOf = Optional.of(content6);
                Intrinsics.checkNotNullExpressionValue(optionalOf, "of(...)");
                return optionalOf;
            case 10:
                of8.b content7 = (of8.b) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(content7, "content");
                return content7.f224757p.f235516b;
            case 11:
                ((Boolean) obj3).booleanValue();
                List list5 = (List) ((Pair) obj2).f186386b;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : list5) {
                    if (((io3.d) obj5).e == io3.l.CURRENT) {
                        arrayList5.add(obj5);
                    }
                }
                return arrayList5;
            case 12:
                UserMigration content8 = (UserMigration) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content8, "content");
                od0.i.Companion.getClass();
                return od0.h.a(content8);
            case 13:
                cfi.g destination = (cfi.g) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(destination, "destination");
                return new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_booking_details_suggested_experiences_title, u.c(destination.f23708b), null, 12);
            case 14:
                CryptoExchangeFeesV2 content9 = (CryptoExchangeFeesV2) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content9, "content");
                List list6 = content9.f70816c;
                dj0.d dVar = content9.f70815b;
                ArrayList arrayList6 = null;
                ?? r92 = 0;
                arrayList6 = null;
                arrayList6 = null;
                if (list6 != null && !list6.isEmpty() && dVar != null) {
                    ComparisonCellDelegate.Model model3 = new ComparisonCellDelegate.Model("COMPARISON_CELL_HEADER_LIST_ID", new c4(new TextLocalisedClause(com.revolut.feature.crypto.exchange.fees.api.R$string.crypto_exchange_fees_comparison_volume, null, null, 14), null, 6), new c4(new TextLocalisedClause(com.revolut.feature.crypto.exchange.fees.api.R$string.crypto_exchange_fees_comparison_fee, null, null, 14), null, 6), null, 0, 1016);
                    List list7 = list6;
                    ArrayList arrayList7 = new ArrayList(w.t(list7, 10));
                    Iterator it10 = list7.iterator();
                    boolean z3 = false;
                    int i22 = 0;
                    while (it10.hasNext()) {
                        Object next = it10.next();
                        int i32 = i22 + 1;
                        if (i22 < 0) {
                            v.s();
                            throw r92;
                        }
                        CryptoExchangePricingFee cryptoExchangePricingFee = (CryptoExchangePricingFee) next;
                        dj0.d dVar2 = cryptoExchangePricingFee.f70818b;
                        dj0.d dVar3 = cryptoExchangePricingFee.f70817a;
                        jb jbVar = dVar2 == null ? dVar.e(dVar3) ? jb.SELECTED : jb.DEFAULT : (dVar.e(dVar3) && dVar.i(dVar2)) ? jb.SELECTED : jb.DEFAULT;
                        String strN = a0.d.n("COMPARISON_CELL_LIST_ID_", i22);
                        dj0.d dVar4 = cryptoExchangePricingFee.f70818b;
                        if (dVar4 != null) {
                            int i33 = com.revolut.feature.crypto.exchange.fees.api.R$string.crypto_exchange_fees_comparison_volume_range;
                            dj0.d dVar5 = cryptoExchangePricingFee.f70817a;
                            it8 = it10;
                            MoneyClause.Format.Shorts shorts = new MoneyClause.Format.Shorts(z3, 63);
                            o9 o9Var = o9.NON_SENSITIVE;
                            List listK = v.k(new MoneyClause(dVar5, shorts, null, o9Var, 4), new MoneyClause(dVar4, new MoneyClause.Format.Shorts(z3, 63), null, o9Var, 4));
                            hbVar = null;
                            textLocalisedClause = new TextLocalisedClause(i33, listK, null, 12);
                        } else {
                            it8 = it10;
                            hbVar = null;
                            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.crypto.exchange.fees.api.R$string.crypto_exchange_fees_comparison_volume_last_range, u.c(new MoneyClause(cryptoExchangePricingFee.f70817a, new MoneyClause.Format.Shorts(z3, 63), null, o9.NON_SENSITIVE, 4)), null, 12);
                        }
                        arrayList7.add(new ComparisonCellDelegate.Model(strN, new c4(textLocalisedClause, hbVar, 6), new c4(new PercentageClause(cryptoExchangePricingFee.f70819c, (PercentageClause.Format) null, (Custom) null, 6), hbVar, 6), jbVar, 0, 1000));
                        i22 = i32;
                        it10 = it8;
                        z3 = false;
                        r92 = hbVar;
                    }
                    ArrayList arrayListJ = ue0.e.J(model3, arrayList7);
                    yp0.b.k(arrayListJ, R$attr.uikit_dp0, 0, 0, 0, 30);
                    arrayList6 = arrayListJ;
                }
                aim.e eVarB = u.b();
                CounterTextDelegate.Model model4 = new CounterTextDelegate.Model("CURRENT_PERCENTAGE_FEE_LIST_ID", new TextLocalisedClause(com.revolut.feature.crypto.exchange.fees.api.R$string.crypto_exchange_fees_percentage_fee, null, null, 14), new t4(new PercentageClause(content9.f70814a, (PercentageClause.Format) null, (Custom) null, 6)), dVar != null ? new TextLocalisedClause(com.revolut.feature.crypto.exchange.fees.api.R$string.crypto_exchange_fees_month_volume, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12) : null, false, null, null, 0, 0, 0, 0, 2032);
                yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                eVarB.add(model4);
                if (arrayList6 != null) {
                    eVarB.addAll(arrayList6);
                }
                return new cii.b(ag5.j.a(), u.a(eVarB), ag5.j.b());
            case 15:
                jg1.g walletType = (jg1.g) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(walletType, "walletType");
                int i43 = ah1.r.f4870a[walletType.ordinal()];
                if (i43 == 1) {
                    return new TextLocalisedClause(com.revolut.feature.add_card_to_google_pay_shared.impl.R$string.google_pay_in_app_verification_title, null, null, 14);
                }
                if (i43 == 2) {
                    return new TextLocalisedClause(com.revolut.feature.add_card_to_google_pay_shared.impl.R$string.apple_pay_in_app_verification_title, null, null, 14);
                }
                if (i43 == 3) {
                    return new TextLocalisedClause(com.revolut.feature.add_card_to_google_pay_shared.impl.R$string.samsung_wallet_in_app_verification, null, null, 14);
                }
                throw new NoWhenBranchMatchedException();
            case 16:
                hfg.e airline = (hfg.e) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(airline, "airline");
                return new ahg.f(new UrlImage(airline.e, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), 40, 40, false, false, 409598), new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_my_cards_details_title, null, null, 14), new TextClause(airline.f151823b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            case 17:
                List userVouchers = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(userVouchers, "userVouchers");
                long jCurrentTimeMillis = System.currentTimeMillis();
                aim.e eVarB2 = u.b();
                List list8 = userVouchers;
                ArrayList arrayList8 = new ArrayList();
                for (Object obj6 : list8) {
                    UserVoucher userVoucher = (UserVoucher) obj6;
                    if (userVoucher.f83620b == tvb.e.INTERNAL) {
                        tvb.d[] elements = {tvb.d.PENDING, tvb.d.COMPLETED};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        if (kotlin.collections.d.y0(elements).contains(userVoucher.i) && !hx7.b.p(userVoucher, jCurrentTimeMillis)) {
                            arrayList8.add(obj6);
                        }
                    }
                }
                eVarB2.addAll(ahg.q.a(arrayList8, true));
                ArrayList arrayList9 = new ArrayList();
                for (Object obj7 : list8) {
                    UserVoucher userVoucher2 = (UserVoucher) obj7;
                    if (userVoucher2.f83620b == tvb.e.INTERNAL && hx7.b.p(userVoucher2, jCurrentTimeMillis)) {
                        arrayList9.add(obj7);
                    }
                }
                eVarB2.addAll(ahg.q.a(arrayList9, false));
                return u.a(eVarB2);
            case 18:
                ((Boolean) obj3).getClass();
                return new Data(new ajd.k((x) obj2), null, false, 6, null);
            case 19:
                ((Boolean) obj3).booleanValue();
                String str2 = ((JuniorBankingProfile) obj2).e;
                return str2 == null ? "" : str2;
            case 20:
                akb.h contentData = (akb.h) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(contentData, "contentData");
                qib.i challengeAccount = contentData.f5770a;
                Intrinsics.checkNotNullParameter(contentData, "contentData");
                qib.i iVar2 = contentData.f5770a;
                PairedImage pairedImage = new PairedImage(new CurrencyImage(iVar2.d.d.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), nib.a.a(), R$attr.uikit_colorWidgetBackground, null);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_challenge_manage_details_header_title, u.c(new TextClause(contentData.f5771b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                qib.b bVar2 = iVar2.d;
                MoneyClause moneyClause = new MoneyClause(bVar2.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                int i59 = com.revolut.feature.retail.savings.api.R$string.savings_challenge_manage_details_cadence_weekly;
                com.revolut.core.ui_kit.models.j jVar = c7.Companion;
                LocalDate localDate = bVar2.f246678b.toLocalDate();
                Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(i59, u.c(com.revolut.core.ui_kit.models.j.b(jVar, localDate, LocalDateClause$DateFormat.DayOfWeek.f57808a)), null, 12);
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_pause, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_challenge_manage_details_action_pause, null, null, 14);
                mx0.d dVar6 = mx0.d.ACCENT;
                ActionsView.Item item = new ActionsView.Item("PAUSE_CHALLENGE_LIST_ITEM_ID", dVar6, false, null, null, textLocalisedClause5, resourceImage, null, null, null, false, null, null, null, null, 32668);
                if (bVar2.e != qib.a.ACTIVE) {
                    item = null;
                }
                akb.n nVar = new akb.n(pairedImage, textLocalisedClause3, moneyClause, textLocalisedClause4, v.l(item));
                aim.e eVarB3 = u.b();
                qib.b bVar3 = challengeAccount.d;
                if (bVar3.e == qib.a.INACTIVE) {
                    sa saVar = new sa("RESUME_CHALLENGE_LIST_ITEM_ID", (Clause) new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_challenge_manage_details_status_paused_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_challenge_manage_details_status_paused_description, null, null, 14), u.c(new ActionsView.Item("RESUME_CHALLENGE_LIST_ITEM_ACTION_ID", dVar6, false, null, null, new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_challenge_manage_details_action_resume, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_play, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, "CHALLENGE_RESUME_BUTTON_TAG", null, null, null, 30620)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4032);
                    yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
                    eVarB3.add(saVar);
                }
                Intrinsics.checkNotNullParameter(challengeAccount, "challengeAccount");
                List listK2 = v.k(ckb.a.a(com.revolut.feature.retail.savings.api.R$string.savings_challenge_manage_details_starts_on_title, bVar3.f246677a), ckb.a.a(com.revolut.feature.retail.savings.api.R$string.savings_challenge_manage_details_next_payment_title, bVar3.f246678b), ckb.a.a(com.revolut.feature.retail.savings.api.R$string.savings_challenge_manage_details_final_payment_title, bVar3.f246679c));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                eVarB3.addAll(listK2);
                io3.d dVar7 = contentData.f5772c;
                if (dVar7 != null) {
                    aw0.t0 t0Var = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_challenge_manage_details_payment_from_title, null, null, 14), (Image) null, 0, false, 30);
                    int i66 = com.revolut.feature.retail.savings.api.R$string.savings_challenge_manage_details_payment_from_text;
                    xi0.a aVar3 = xi0.b.Companion;
                    String str3 = dVar7.f163147c;
                    aVar3.getClass();
                    model = new CellDetailsDelegate.Model("ID_ROW_PAYMENT_FROM", t0Var, new TextLocalisedClause(i66, u.c(new CurrencyClause(xi0.a.a(str3), CurrencyClause.Format.Ticker.f57756a, null, 4)), new Click(30, (Integer) null, (Object) null, "ID_ROW_PAYMENT_FROM_ACTION", false), 8), null, null, null, null, 0, new ResourceImage(R$drawable.uikit_icn_24_revolut, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, null, null, 31736);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                } else {
                    CellDetailsDelegate.Model model5 = new CellDetailsDelegate.Model("ID_ROW_PAYMENT_FROM", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_challenge_manage_details_payment_from_title, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_challenge_manage_details_payment_from_any_account, null, null, 14), null, null, null, null, 0, new ResourceImage(R$drawable.uikit_icn_24_rates_converter_page, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, null, null, 29688);
                    yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
                    model = model5;
                }
                eVarB3.add(model);
                CellDetailsChevronDelegate.Model model6 = new CellDetailsChevronDelegate.Model("ID_ROW_GET_HELP", new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_common_action_get_help, null, null, 14), f2.INTERNAL, 0, null, null, 2040);
                yp0.b.l(model6, 0, 0, 0, 0, null, false, 63);
                eVarB3.add(model6);
                return new akb.r(nVar, u.a(eVarB3));
            case 21:
                InviteTransactionWidget content10 = (InviteTransactionWidget) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content10, "content");
                od0.i.Companion.getClass();
                return od0.h.a(content10);
            case 22:
                return a(obj2, obj3, obj4);
            case 23:
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return Boolean.valueOf(((od0.i) pair.f186385a).d() && ((Boolean) pair.f186386b).booleanValue());
            case 24:
                return b(obj2, obj3, obj4);
            case 25:
                return c(obj2, obj3, obj4);
            case 26:
                g4 planComparison = (g4) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(planComparison, "planComparison");
                d4 d4Var = (d4) d0.M0(planComparison.f146753a);
                return d4Var == null ? new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_comparison_description, null, null, 14) : new TextLocalisedClause(com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_comparison_description_single_plan, u.c(new TextClause(d4Var.f146731b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            case 27:
                return d(obj2, obj3, obj4);
            case 28:
                return e(obj2, obj3, obj4);
            default:
                List content11 = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content11, "content");
                List<UserVoucher> list9 = content11;
                ArrayList arrayList10 = new ArrayList(w.t(list9, 10));
                for (UserVoucher userVoucher3 : list9) {
                    arrayList10.add(new RowDelegate.Model(j6.a.q("SECTION_USED_CARDS_PREFIX", userVoucher3.f83619a), new RowDelegate.Model.MainImage.Image40(new UrlImage(userVoucher3.f, null, null, null, 0L, null, null, null, ez0.h.FitCenter, null, false, new ImageTransformations(null, new RoundedRectTransformation(4.0f), null, null, null, null, null, ISO781611.SMT_TAG), 44, 40, false, false, 409086), null, null, false, null, false, 62), new TextClause(userVoucher3.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 1, new TimeClause(userVoucher3.f83621c, new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(userVoucher3.f83622g, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), null, null, false, 126), false, null, false, null, null, null, null, null, null, userVoucher3.f83619a, null, 0, 0, 0, 0, 532675528));
                }
                yp0.b.k(arrayList10, 0, 0, 0, 0, 31);
                return arrayList10;
        }
    }

    public /* synthetic */ m(Object obj2, int i) {
        this.f845a = i;
    }
}
