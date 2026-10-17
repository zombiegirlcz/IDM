package jb8;

import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.DetailGridItemDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.delegates.df;
import com.revolut.core.ui_kit.delegates.h5;
import com.revolut.core.ui_kit.delegates.i5;
import com.revolut.core.ui_kit.delegates.kj;
import com.revolut.core.ui_kit.delegates.lj;
import com.revolut.core.ui_kit.delegates.mj;
import com.revolut.core.ui_kit.delegates.sf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CustomColors;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfo;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.SavingsDocument;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.tab.accounts.api.exceptions.ProductAccountNotFoundException;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import com.revolut.feature.teen_profile.api.models.TeenProfile;
import com.revolut.feature.trading.managed_portfolios.impl.R$plurals;
import com.revolut.feature.wealth.api.domain.model.SelectedCurrencyInfo;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.PropertyDescription;
import com.revolut.retail.feature.plan_gifting.impl.R$string;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import com.youTransactor.uCube.rpc.Constants;
import d9.t0;
import eb8.m;
import eb8.n;
import ip0.ck0;
import ip0.cp0;
import ip0.xk;
import ip0.zj;
import j19.a0;
import j19.e0;
import j6b.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jd7.e;
import jd7.g;
import k19.q;
import k6f.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import m1c.y;
import m1c.z;
import m6f.d;
import m6f.v;
import mx0.t5;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import yy0.i;
import yy0.l;
import zh9.h;
import zh9.i0;
import zh9.r1;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172607a;

    public /* synthetic */ b(int i) {
        this.f172607a = i;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        CobrandedCardsPlanHubInfo planHubInfo = (CobrandedCardsPlanHubInfo) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(planHubInfo, "planHubInfo");
        TextClause textClause = new TextClause(planHubInfo.f82340b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = planHubInfo.f82341c;
        TextClause textClause2 = str != null ? new TextClause(str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124) : null;
        i iVar = l.Companion;
        UrlImage urlImage = new UrlImage(planHubInfo.f82339a, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, gz0.b.CenterCrop, null, null, null, LDSFile.EF_DG2_TAG), null, null, false, false, 507902);
        iVar.getClass();
        return new f(textClause, textClause2, i.a(urlImage));
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        d allocationItems = (d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(allocationItems, "allocationItems");
        List listP0 = d0.P0(allocationItems.d, new o());
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        Iterator it8 = listP0.iterator();
        while (it8.hasNext()) {
            arrayList.add(((v) it8.next()).f203083a);
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            return f0.f322471a;
        }
        List listV0 = d0.V0(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(w.t(listV0, 10));
        Iterator it9 = listV0.iterator();
        while (it9.hasNext()) {
            arrayList2.add(new InstrumentImage((String) it9.next(), 30, null, null));
        }
        TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.managed_portfolios_details_allocation_top_holdings_title_plural, Integer.valueOf(arrayList.size()), (List) null, (Style) null, 28);
        i iVar = l.Companion;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
        iVar.getClass();
        RowDelegate.Model model = new RowDelegate.Model("ALLOCATION_TOP_TEN_ASSETS_LIST_ID", null, null, null, textLocalisedQuantityClause, null, null, null, 0, new tf(i.a(resourceImage), sf.TOP), false, false, null, null, null, new df(arrayList2, (Integer) null, 6), null, null, null, 0, 0, 0, 0, 1071642606);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.lang.Object, java.lang.Object[], koi.j[]] */
    /* JADX WARN: Type inference failed for: r3v40, types: [aim.e, java.util.List] */
    /* JADX WARN: Type inference failed for: r45v7 */
    /* JADX WARN: Type inference failed for: r4v22, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        WebViewDelegate.a mjVar;
        ?? arrayList;
        Integer numValueOf;
        PlainTextDelegate.Model model;
        lj9.a aVarA;
        MoneyClause moneyClauseA;
        int i;
        Clause textLocalisedClause;
        List listA;
        String str;
        String str2;
        int i2;
        TextLocalisedClause textLocalisedClause2;
        LargeActionButtonDelegate.Model model2;
        int i3;
        boolean z;
        DetailGridItemDelegate.a h5Var;
        List list;
        boolean z3 = true;
        boolean z4 = false;
        switch (this.f172607a) {
            case 0:
                n pendingGraduation = (n) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(pendingGraduation, "pendingGraduation");
                if (Intrinsics.f(pendingGraduation, eb8.l.f124309a)) {
                    z3 = false;
                } else if (!(pendingGraduation instanceof m)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Boolean.valueOf(z3);
            case 1:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ((Boolean) obj3).getClass();
                return zBooleanValue ? f0.f322471a : com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.b.f(R$drawable.uikit_icn_24_person, new TextLocalisedClause(R$string.premium_gift_recipient_enable_contacts_permissions_banner_title, null, null, 14), new TextLocalisedClause(R$string.premium_gift_recipient_enable_contacts_permissions_banner_subtitle, null, null, 14), "id_enable_contacts_permissions");
            case 2:
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return (((Boolean) pair.f186385a).booleanValue() || ((Number) pair.f186386b).intValue() > 0) ? f0.f322471a : com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.b.f(R$drawable.uikit_icn_24_present, new TextLocalisedClause(R$string.premium_gift_recipient_enable_birthday_sharing_banner_title, null, null, 14), new TextLocalisedClause(R$string.premium_gift_recipient_enable_birthday_sharing_banner_subtitle, null, null, 14), "id_enable_birthday_sharing");
            case 3:
                uc3.c limit = (uc3.c) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(limit, "limit");
                return od3.b.a(limit);
            case 4:
                Optional productAccountOptional = (Optional) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(productAccountOptional, "productAccountOptional");
                return productAccountOptional.isPresent() ? new Data(productAccountOptional.get(), null, false, 6, null) : new Data(null, new ProductAccountNotFoundException("No Cashback product present, probably user's plan is lower than Metal or Ultra, or it's terminated"), false, 5, null);
            case 5:
                g content = (g) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                if (content instanceof e) {
                    mjVar = new lj(((e) content).f172987a, "utf-8");
                } else {
                    if (!(content instanceof jd7.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mjVar = new mj(((jd7.f) content).f172988a, null);
                }
                return u.c(new kj("HTML_DOCUMENT_WEB_VIEW_LIST_ID", mjVar, new cp0(true, null, null, null, 126), Constants.TAG_FULL_SVPP_IDENTIFICATION));
            case 6:
                HotelsProperty property = (HotelsProperty) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(property, "property");
                List<PropertyDescription> list2 = property.f97983c;
                if (list2 != null) {
                    if (list2.isEmpty()) {
                        arrayList = f0.f322471a;
                    } else {
                        arrayList = new ArrayList();
                        for (PropertyDescription propertyDescription : list2) {
                            ufi.i iVar = propertyDescription.f98072a;
                            Intrinsics.checkNotNullParameter(iVar, "<this>");
                            switch (h9g.d.f150249a[iVar.ordinal()]) {
                                case 1:
                                    numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_property_amenities_title);
                                    break;
                                case 2:
                                    numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_property_attractions_title);
                                    break;
                                case 3:
                                    numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_property_dining_title);
                                    break;
                                case 4:
                                    numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_property_renovations_title);
                                    break;
                                case 5:
                                    numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_property_national_title);
                                    break;
                                case 6:
                                    numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_property_business_title);
                                    break;
                                case 7:
                                    numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_property_rooms_title);
                                    break;
                                case 8:
                                    numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_property_location_title);
                                    break;
                                case 9:
                                    numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_property_headline_title);
                                    break;
                                case 10:
                                    numValueOf = Integer.valueOf(com.revolut.feature.travel.hotels.api.R$string.hotels_property_property_overall_title);
                                    break;
                                case 11:
                                    numValueOf = null;
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            if (numValueOf != null) {
                                model = new PlainTextDelegate.Model("ADDITIONAL_DETAILS_ITEM_ID", (UrlImage) null, new TextLocalisedClause(numValueOf.intValue(), null, null, 14), new TextClause(propertyDescription.f98073b, (Style) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), false, (o9) null, (List) null, 122), t5.e, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32714);
                                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                            } else {
                                model = null;
                            }
                            if (model != null) {
                                arrayList.add(model);
                            }
                        }
                    }
                    if (arrayList != 0) {
                        return arrayList;
                    }
                }
                return f0.f322471a;
            case 7:
                nel.n instrument = (nel.n) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                return new feh.i(new TextClause(instrument.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new InstrumentImage(instrument.f214596b, 30, null, null));
            case 8:
                z status = (z) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(status, "status");
                if (status instanceof z.a) {
                    return f0.f322471a;
                }
                if (status instanceof y) {
                    return u.c(new LabelNavBarMenuItem("NAV_BAR_ACTION_ID_REV_POINTS", new ResourceImage(R$drawable.uikit_icn_24_revpoints, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), v1.c.g(0, ((y) status).f201475a.f201472c, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 4), null, null, 504));
                }
                throw new NoWhenBranchMatchedException();
            case 9:
                hfg.f availability = (hfg.f) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(availability, "availability");
                ?? B = u.b();
                ArrayList arrayList2 = availability.f151831a;
                ArrayList arrayList3 = availability.f151832b;
                if (!arrayList2.isEmpty()) {
                    B.add(new ListSubheaderDelegate.Model("AVAILABLE_SUB_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_search_reward_flights_section_available, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                }
                ArrayList arrayList4 = availability.f151831a;
                ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
                Iterator it8 = arrayList4.iterator();
                while (it8.hasNext()) {
                    arrayList5.add(jig.f.a((hfg.g) it8.next(), true));
                }
                B.addAll(arrayList5);
                if (!arrayList3.isEmpty()) {
                    B.add(new ListSubheaderDelegate.Model("UNAVAILABLE_SUB_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_search_reward_flights_section_unavailable, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                }
                ArrayList arrayList6 = new ArrayList(w.t(arrayList3, 10));
                Iterator it9 = arrayList3.iterator();
                while (it9.hasNext()) {
                    arrayList6.add(jig.f.a((hfg.g) it9.next(), false));
                }
                B.addAll(arrayList6);
                aim.e eVarA = u.a(B);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                return eVarA;
            case 10:
                Pair pair2 = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                i0 management = (i0) pair2.f186385a;
                Image icon = (Image) pair2.f186386b;
                Intrinsics.checkNotNullParameter(management, "management");
                Intrinsics.checkNotNullParameter(icon, "icon");
                zh9.i iVar2 = management.f322286b;
                r1 r1VarH = t0.h(iVar2);
                h hVar = iVar2.f;
                switch (lj9.b.f195615b[r1VarH.ordinal()]) {
                    case 1:
                        aVarA = lj9.c.a(com.revolut.feature.pay_later.api.R$string.credit_pay_later_account_switcher_accessory_max_purchase, R$attr.uikit_colorGrey50, hVar != null && hVar.f322272j);
                        break;
                    case 2:
                    case 3:
                    case 4:
                        aVarA = lj9.c.a(com.revolut.feature.pay_later.api.R$string.credit_pay_later_account_state_outstanding, R$attr.uikit_colorTerracotta, true);
                        break;
                    case 5:
                    case 6:
                        aVarA = lj9.c.a(com.revolut.feature.pay_later.api.R$string.credit_pay_later_account_state_overdue, R$attr.uikit_colorRed, true);
                        break;
                    case 7:
                    case 8:
                        aVarA = lj9.c.a(com.revolut.feature.pay_later.api.R$string.pay_later_repayment_cancelled, R$attr.uikit_colorTerracotta, true);
                        break;
                    case 9:
                    case 10:
                        aVarA = lj9.c.a(com.revolut.feature.pay_later.api.R$string.credit_pay_later_account_state_terminated, R$attr.uikit_colorRed, true);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                yx4.b bVar = !aVarA.f195613b ? null : new yx4.b("description", new mj9.a(management), null);
                dj0.d dVar = iVar2.e;
                zh9.e eVar = hVar != null ? hVar.o : null;
                int i5 = eVar == null ? -1 : lj9.b.f195614a[eVar.ordinal()];
                if (i5 == -1) {
                    moneyClauseA = pi9.b.a(dVar, null, 3);
                } else if (i5 == 1) {
                    if (hVar != null) {
                        dVar = hVar.f322270g;
                    }
                    moneyClauseA = pi9.b.a(dVar, null, 3);
                } else {
                    if (i5 != 2 && i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    moneyClauseA = pi9.b.a(dVar, null, 3);
                }
                return new jj9.d(moneyClauseA, aVarA.f195612a, bVar, icon);
            case 11:
                SelectedCurrencyInfo data = (SelectedCurrencyInfo) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                List<xi0.b> list3 = data.f95229b;
                ArrayList arrayList7 = new ArrayList(w.t(list3, 10));
                for (xi0.b bVar2 : list3) {
                    arrayList7.add(new AccountCellItemDelegate.Model(j6.a.q("CURRENCY_LIST_ID_", bVar2.f306286a), bVar2.equals(data.f95228a), (Image) new CurrencyImage(bVar2.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), (Clause) new CurrencyClause(bVar2, CurrencyClause.Format.Ticker.f57756a, null, 4), (com.revolut.core.ui_kit.delegates.c) null, false, (Clause) new CurrencyClause(bVar2, null, null, 6), (RowDelegate.Model.c.b) null, (ProgressStyle) null, (Object) new kih.a(bVar2), (Parcelable) null, 128944));
                }
                yp0.b.k(arrayList7, 0, R$attr.uikit_dp16, 0, 0, 29);
                return arrayList7;
            case 12:
                TradingLegalEntityInformation tradingLegalEntity = (TradingLegalEntityInformation) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(tradingLegalEntity, "tradingLegalEntity");
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_currency_changer_title, null, null, 14);
                hel.b bVar3 = tradingLegalEntity.f105106a;
                switch (bVar3 == null ? -1 : jkh.b.f175170a[bVar3.ordinal()]) {
                    case -1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        i = com.revolut.retail.wealth.resources.R$string.wealth_invest_currency_changer_description;
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        i = com.revolut.retail.wealth.resources.R$string.wealth_invest_currency_changer_uk_description;
                        break;
                }
                return new lw0.a(textLocalisedClause3, new TextLocalisedClause(i, null, null, 14), null, null, false, 28);
            case 13:
                l71.d company = (l71.d) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(company, "company");
                if (l71.f.f(company)) {
                    return new TextLocalisedClause(com.revolut.feature.tab.lifestyle.impl.R$string.legal_product_loyalty_linkout_disclaimer_mx, null, null, 14);
                }
                return null;
            case 14:
                Integer num = (Integer) obj2;
                num.intValue();
                ((Boolean) obj3).booleanValue();
                return num;
            case 15:
                jnb.a aVar = (jnb.a) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                SavingsProductData savingsProductData = aVar.f176666a;
                List list4 = aVar.f176667b;
                Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
                ProductGroup.DocumentsConfig documentsConfig = savingsProductData.f86684b.f86531q;
                if (documentsConfig == null || (str2 = documentsConfig.f86548a) == null) {
                    Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
                    textLocalisedClause = new TextLocalisedClause(ocd.a.d(savingsProductData) ? com.revolut.feature.vaults.R$string.vaults_common_regulatory_documents : com.revolut.feature.vaults.R$string.vaults_details_edit_documents_title, null, null, 14);
                } else {
                    textLocalisedClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                ProductGroup.DocumentsConfig documentsConfig2 = savingsProductData.f86684b.f86531q;
                TextClause textClause = (documentsConfig2 == null || (str = documentsConfig2.f86549b) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                if (list4.isEmpty()) {
                    FullScreenStateDelegate.Model model3 = new FullScreenStateDelegate.Model("EMPTY_STATE_LIST_ITEM_ID", new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_document_reacceptance_empty_document_list_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D021", null, null, null, 30)), null, zj.REGULAR, false, null, null, null, 1860);
                    yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                    listA = u.c(model3);
                } else {
                    Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
                    if (ocd.a.d(savingsProductData)) {
                        Pair pair3 = new Pair(new ArrayList(), new ArrayList());
                        Iterator it10 = list4.iterator();
                        while (true) {
                            boolean zHasNext = it10.hasNext();
                            Object obj5 = pair3.f186386b;
                            Object obj6 = pair3.f186385a;
                            if (zHasNext) {
                                bjb.a aVar2 = (bjb.a) it10.next();
                                List list5 = (List) obj6;
                                List list6 = (List) obj5;
                                SavingsDocument savingsDocument = aVar2.f15590b;
                                if (savingsDocument instanceof SavingsDocument.Scope) {
                                    list5.add(aVar2);
                                } else {
                                    if (!(savingsDocument instanceof SavingsDocument.Link)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    list6.add(aVar2);
                                }
                                pair3 = new Pair(list5, list6);
                            } else {
                                List list7 = (List) obj6;
                                List list8 = (List) obj5;
                                aim.e eVarB = u.b();
                                if (!list7.isEmpty()) {
                                    eVarB.addAll(jnb.m.a(list7, new ListSubheaderDelegate.Model("SCOPED_DOCS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_product_documents_revolut_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530)));
                                }
                                if (!list8.isEmpty()) {
                                    eVarB.addAll(jnb.m.a(list8, new ListSubheaderDelegate.Model("LINKED_DOCS_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_product_documents_fund_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530)));
                                }
                                listA = u.a(eVarB);
                            }
                        }
                    } else {
                        listA = jnb.m.a(list4, null);
                    }
                }
                return new jnb.h(listA, new jnb.c(textLocalisedClause, textClause));
            case 16:
                List connectedApps = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(connectedApps, "connectedApps");
                return jpl.f.a(connectedApps);
            case 17:
                Map teenProfilesMap = (Map) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(teenProfilesMap, "teenProfilesMap");
                List<TeenProfile> listP0 = d0.P0(teenProfilesMap.values(), new jqe.a());
                ArrayList arrayList8 = new ArrayList(w.t(listP0, 10));
                for (TeenProfile teenProfile : listP0) {
                    arrayList8.add(new vfe.a(new TextClause(teenProfile.f90335b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ProductSpaceIdentifier.Teen(teenProfile.f90334a), zhm.v.k(pie.m.e, pie.n.e, pie.o.e)));
                }
                return new go.g(arrayList8, 2);
            case 18:
                String html = (String) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(html, "html");
                return new jqg.e(html);
            case 19:
                Pair pair4 = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                pdh.e eVar2 = (pdh.e) pair4.f186385a;
                if (((Boolean) pair4.f186386b).booleanValue()) {
                    int i6 = jsk.i.f178191a[eVar2.ordinal()];
                    if (i6 == 1) {
                        i3 = com.revolut.retail.wealth.resources.R$string.wealth_trading_account_purpose_update_content_changeable_new;
                    } else if (i6 == 2) {
                        i3 = com.revolut.retail.wealth.resources.R$string.wealth_trading_account_purpose_update_content_changeable_active_daily;
                    } else {
                        if (i6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = com.revolut.retail.wealth.resources.R$string.wealth_trading_account_purpose_update_content_changeable_generic;
                    }
                    textLocalisedClause2 = new TextLocalisedClause(i3, null, null, 14);
                    LargeActionButtonDelegate.Model model4 = new LargeActionButtonDelegate.Model("notice-dialog-change-answer-list-id", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_account_purpose_update_action_modify, null, null, 14), false, null, null, jsk.g.f178189a, null, 744);
                    yp0.b.l(model4, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
                    model2 = model4;
                } else {
                    int i21 = jsk.i.f178191a[eVar2.ordinal()];
                    if (i21 == 1) {
                        i2 = com.revolut.retail.wealth.resources.R$string.wealth_trading_account_purpose_update_content_unchangeable_new;
                    } else if (i21 == 2) {
                        i2 = com.revolut.retail.wealth.resources.R$string.wealth_trading_account_purpose_update_content_unchangeable_active_daily;
                    } else {
                        if (i21 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = com.revolut.retail.wealth.resources.R$string.wealth_trading_account_purpose_update_content_unchangeable_generic;
                    }
                    textLocalisedClause2 = new TextLocalisedClause(i2, null, null, 14);
                    model2 = null;
                }
                TextDelegate.Model model5 = new TextDelegate.Model("analysts-info-dialog-text-list-id", textLocalisedClause2, false, new ck0(0), null, null, 0, 0, 0, 0, 2036);
                LargeActionButtonDelegate.Model model6 = new LargeActionButtonDelegate.Model("notice-dialog-got-it-list-id", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_instrument_details_forecasts_dialog_button, null, null, 14), false, null, null, jsk.h.f178190a, null, 744);
                yp0.b.l(model6, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
                ?? elements = {model5, model6, model2};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.L(elements);
            case 20:
                ru.y content2 = (ru.y) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content2, "content");
                if (content2.i != null) {
                    return new ResourceImage(R$drawable.uikit_icn_24_time, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                }
                return null;
            case 21:
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter((ru.y) obj2, "<unused var>");
                return Boolean.TRUE;
            case 22:
                od0.i upgradeEntryPointItemModel = (od0.i) obj2;
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(upgradeEntryPointItemModel, "upgradeEntryPointItemModel");
                return upgradeEntryPointItemModel;
            case 23:
                f19.g placement = (f19.g) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(placement, "placement");
                List list9 = placement.f131192b;
                ArrayList arrayList9 = new ArrayList();
                for (Object obj7 : list9) {
                    if (obj7 instanceof j19.f0) {
                        arrayList9.add(obj7);
                    }
                }
                j19.f0 f0Var = (j19.f0) d0.d0(arrayList9);
                e0 e0Var = f0Var != null ? f0Var.f : null;
                if (e0Var == null) {
                    return f0.f322471a;
                }
                a0 a0Var = e0Var.f170192a;
                Float fValueOf = Float.valueOf(8.0f);
                String str3 = a0Var.f170164a;
                k19.c cVar = a0Var.f170165b;
                TextClause textClause2 = new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str4 = cVar.d;
                ListSubheaderDelegate.Model model7 = new ListSubheaderDelegate.Model("TOP_BRANDS_TITLE_ID", (Image) null, (Clause) textClause2, (Image) null, (Clause) (str4 != null ? new TextClause(str4, (Style) new Click(14, Integer.valueOf(R$attr.uikit_colorForeground), (Object) null, "TOP_BRANDS_SEE_ALL_ID", false), (Integer) null, false, (o9) null, (List) null, 124) : null), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) new jzb.w(cVar.f180147a), (Parcelable) null, 0, R$attr.uikit_dp12, 0, 0, 56234);
                List list10 = e0Var.f170193b;
                ArrayList arrayList10 = new ArrayList(w.t(list10, 10));
                int i22 = 0;
                for (Object obj8 : list10) {
                    int i32 = i22 + 1;
                    if (i22 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    j19.d0 d0Var = (j19.d0) obj8;
                    String strN = a0.d.n("TOP_BRANDS_SECTION_ID_content_", i22);
                    TextClause textClause3 = new TextClause(d0Var.f170184a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    UrlImage urlImage = new UrlImage(d0Var.f170185b, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, z4, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902);
                    q qVar = d0Var.e;
                    int i33 = jzb.y.f179725a[qVar.f180165c.ordinal()];
                    if (i33 == 1) {
                        z = z4;
                        h5Var = new h5(new TagViewData(new UrlImage(qVar.f180164b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), new TextClause(qVar.f180163a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TagViewData.TagBackground.Gradient(zhm.v.k(new Color.Solid(R$attr.uikit_colorPurple), new Color.Solid(R$attr.uikit_colorIndigo)), GradientDrawable.Orientation.TL_BR), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorTransparent), false, null, null, null, R$attr.uikit_colorWhite, null, 1512));
                    } else {
                        if (i33 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z = z4;
                        h5Var = new i5(new TagViewData(new UrlImage(qVar.f180164b, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, null, new CustomColors(1, null, new Color.Solid(R$attr.uikit_colorForeground)), null, null, null, null, 123), null, null, false, false, 507902), new TextClause(qVar.f180163a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TagViewData.TagBackground.Solid(new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorForeground), 0.2f)), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorTransparent), false, null, null, null, R$attr.uikit_colorForeground, null, 1512));
                    }
                    DetailGridItemDelegate.Model model8 = new DetailGridItemDelegate.Model(strN, urlImage, textClause3, h5Var, new jzb.w(d0Var.f170186c.f180147a), null);
                    yp0.b.l(model8, 0, 0, 0, 0, null, false, 63);
                    arrayList10.add(model8);
                    i22 = i32;
                    z4 = z;
                }
                xk xkVar = new xk("TOP_BRANDS_SECTION_ID", arrayList10, 3, fValueOf, fValueOf, R$attr.uikit_dp0, 0, 0, 0, 65376);
                qv0.i[] iVarArr = new qv0.i[2];
                iVarArr[z4 ? 1 : 0] = model7;
                iVarArr[1] = xkVar;
                return zhm.v.k(iVarArr);
            case 24:
                uib.b content3 = (uib.b) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content3, "content");
                return new k0e.i(nz8.d.s(content3));
            case 25:
                wi0.b countryCode = (wi0.b) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                return new TextLocalisedClause(com.bumptech.glide.d.l(countryCode) ? com.revolut.feature.statements.R$string.savings_statements_footer_au : com.revolut.feature.statements.R$string.savings_statements_footer, null, null, 14);
            case 26:
                z status2 = (z) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(status2, "status");
                if (status2 instanceof z.a) {
                    return f0.f322471a;
                }
                if (status2 instanceof y) {
                    return u.c(new LabelNavBarMenuItem("NAV_BAR_ACTION_ID_REV_POINTS", new ResourceImage(R$drawable.uikit_icn_24_revpoints, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), v1.c.g(0, ((y) status2).f201475a.f201472c, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 4), null, null, 504));
                }
                throw new NoWhenBranchMatchedException();
            case 27:
                return a(obj2, obj3, obj4);
            case 28:
                return b(obj2, obj3, obj4);
            default:
                nel.n instrument2 = (nel.n) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(instrument2, "instrument");
                nel.e0 e0VarK = ifk.b.k(instrument2);
                if (e0VarK == null || (list = e0VarK.d) == null) {
                    return null;
                }
                if (list.isEmpty()) {
                    list = null;
                }
                if (list == null) {
                    return null;
                }
                List list11 = list;
                ArrayList arrayList11 = new ArrayList(w.t(list11, 10));
                Iterator it11 = list11.iterator();
                while (it11.hasNext()) {
                    arrayList11.add(new InstrumentImage((String) it11.next(), 30, null, null));
                }
                return new m8b.a(arrayList11);
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f172607a = i;
    }
}
