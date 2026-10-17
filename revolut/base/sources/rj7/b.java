package rj7;

import aw0.o9;
import bka.e1;
import bka.n0;
import bu7.b0;
import ch.qos.logback.core.CoreConstants;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.insurance.api.models.CFACClaimExpense;
import com.revolut.feature.insurance.impl.ui.cfac.claim.coverage_info.CFACInsuranceCoverageInfoScreen;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_details.CFACClaimDetailsScreen;
import com.revolut.feature.insurance_embedded.api.models.RemoteDocument;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.wealth.models.config.Links;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import do3.q;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlinx.serialization.json.JsonElement;
import org.jmrtd.cbeff.ISO781611;
import pka.f0;
import pkh.d;
import rj7.g;
import rk9.p;
import rk9.r;
import slm.i0;
import zhm.d0;
import zhm.q0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254616a;

    public /* synthetic */ b(int i) {
        this.f254616a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        HtmlLocalisedClause htmlLocalisedClause;
        HtmlLocalisedClause htmlLocalisedClause2 = null;
        switch (this.f254616a) {
            case 0:
                RowDelegate.Model it8 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = CFACInsuranceCoverageInfoScreen.c0;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj3 = it8.u;
                if (obj3 instanceof RemoteDocument) {
                    return (RemoteDocument) obj3;
                }
                return null;
            case 1:
                b0 insuranceDetails = (b0) obj2;
                Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
                return new h(insuranceDetails.d, insuranceDetails.f, insuranceDetails.k.f75849b);
            case 2:
                j updateState = (j) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return j.a(updateState, new Data(g.a.f254618a, null, false, 6, null));
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                List listK = v.k(new s7("ID_POLICY_NUMBER_ITEM", 0, i, i2, i3, false, null, 126), new s7("ID_LOADING_SUMMARY_ITEM", i, i2, i3, 0 == true ? 1 : 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                pb0 pb0Var = new pb0("ID_PRODUCT_COVERAGE_ITEM");
                yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                return i2b.a.p(listK, pb0Var);
            case 4:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 5:
                Intrinsics.checkNotNullParameter((NaviCommand) obj2, "it");
                return Boolean.TRUE;
            case 6:
                m70.a.c(t0.f186434a);
                return rk3.e.a((rk3.e) obj2, "", 0L, false, null, null, ISO781611.SMT_TAG);
            case 7:
                ListSubheaderDelegate.Model it9 = (ListSubheaderDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = CFACClaimDetailsScreen.f75126e0;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj4 = it9.f52715m;
                if (obj4 instanceof List) {
                    return (List) obj4;
                }
                return null;
            case 8:
                RowDelegate.Model it10 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = CFACClaimDetailsScreen.f75126e0;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object obj5 = it10.u;
                if (obj5 instanceof CFACClaimExpense) {
                    return (CFACClaimExpense) obj5;
                }
                return null;
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return rk7.n.c();
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return rk7.n.b();
            case 11:
                rk9.i update = (rk9.i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return rk9.i.a(update, null, !update.f254773b, 1);
            case 12:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                List list = (List) getDefaultLoadingItems2.invoke();
                int i5 = R$string.credit_right_to_cancel_cancellation_summary_title;
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                TextLocalisedClause textLocalisedClauseA = ky4.a.a(i5, "");
                int i6 = R$string.credit_right_to_cancel_cancellation_summary_description;
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                return new r(list, new p(textLocalisedClauseA, ky4.a.a(i6, "")), null);
            case 13:
                return e1.INSTANCE.serializer();
            case 14:
                return pka.t0.INSTANCE.serializer();
            case 15:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                tlm.e eVar = Json.f255103h;
                tlm.f fVar = new tlm.f();
                p0 p0Var = o0.f186429a;
                fVar.b(p0Var.b(n0.class), new b(13));
                fVar.b(p0Var.b(f0.class), new b(14));
                Unit unit = Unit.f186387a;
                tlm.d dVarA = tlm.h.a(eVar, fVar.a());
                Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                Json.f255103h = dVarA;
                return Unit.f186387a;
            case 16:
                l71.d userCompany = (l71.d) obj2;
                Intrinsics.checkNotNullParameter(userCompany, "userCompany");
                Pair pair = rkh.b.f254867b;
                if (!Intrinsics.f(userCompany.f192500c, "SG")) {
                    pair = null;
                }
                Pair[] elements = {pair, rkh.b.f254868c, rkh.b.d};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                ArrayList arrayList = new ArrayList(w.t(listL, 10));
                int i21 = 0;
                for (Object obj6 : listL) {
                    int i22 = i21 + 1;
                    if (i21 < 0) {
                        v.s();
                        throw null;
                    }
                    arrayList.add(pkh.m.a("DISCLOSURES_" + i21, (Pair) obj6));
                    i21 = i22;
                }
                return arrayList;
            case 17:
                wi0.b countryCode = (wi0.b) obj2;
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                od0.h hVar = od0.i.Companion;
                Object textLocalisedClause = com.bumptech.glide.d.p(countryCode) ? new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_disclosures_compound_description_plain, v.k(new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_disclosures_compound_description_terms, null, new Click(28, (Integer) null, (Object) new pkh.f(countryCode), "DISCLOSURE_DESCRIPTION_CLICK_ID", false), 10), new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_disclosures_compound_description_conflicts, null, new Click(28, (Integer) null, (Object) new pkh.e(countryCode), "DISCLOSURE_DESCRIPTION_CLICK_ID", false), 10)), null, 12) : yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.crypto_disclosures_description_plain, null, null, 14), new TextLocalisedClause(com.revolut.feature.mainscreen.api.R$string.commodities_home_disclaimer_link, null, new Click(28, (Integer) null, (Object) new pkh.f(countryCode), "DISCLOSURE_DESCRIPTION_CLICK_ID", false), 10)));
                hVar.getClass();
                return od0.h.a(textLocalisedClause);
            case 18:
                wi0.b countryCode2 = (wi0.b) obj2;
                Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
                Pair pair2 = rkh.d.f254870b;
                Pair pair3 = rkh.d.f254871c;
                Pair pair4 = rkh.d.d;
                Pair pair5 = rkh.d.e;
                wi0.b.Companion.getClass();
                Pair[] elements2 = {pair2, pair3, pair4, pair5, Intrinsics.f(countryCode2, wi0.b.f297770q3) ? rkh.d.f254872g : rkh.d.f, rkh.d.f254873h, (Intrinsics.f(countryCode2, wi0.b.J2) || Intrinsics.f(countryCode2, wi0.b.A)) ? rkh.d.f254874j : rkh.d.i};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                List listL2 = kotlin.collections.d.L(elements2);
                ArrayList arrayList2 = new ArrayList(w.t(listL2, 10));
                int i32 = 0;
                for (Object obj7 : listL2) {
                    int i33 = i32 + 1;
                    if (i32 < 0) {
                        v.s();
                        throw null;
                    }
                    arrayList2.add(pkh.m.a("DISCLOSURES_" + i32, (Pair) obj7));
                    i32 = i33;
                }
                return arrayList2;
            case 19:
                do3.n it11 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return q.y(it11);
            case 20:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                e7l.f fVar2 = (e7l.f) rVar.f314201a;
                hel.a aVar = (hel.a) rVar.f314202b;
                List list2 = (List) rVar.f314203c;
                rkh.g gVar = rkh.h.Companion;
                Links links = aVar.e;
                String str = links.f105092g;
                String str2 = links.d;
                String str3 = fVar2.f123399w;
                gVar.getClass();
                Pair pair6 = str3 != null ? new Pair(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclosures_combined_uk_general_information_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclosures_combined_uk_general_information_content, v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_uk_commodities_terms_of_business, null, new Click(28, (Integer) null, (Object) new pkh.g(str), "disclosure-trading-terms-of-business", false), 10), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_uk_commodities_risk_disclosure, null, new Click(28, (Integer) null, (Object) new pkh.g(str2), "disclosure-trading-risk-disclosure", false), 10), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_uk_commodities_terms_of_business, null, new Click(28, (Integer) null, (Object) new pkh.g(str3), "disclosure-commodities-risk-disclosure", false), 10)), null, 12)) : null;
                lbf.m mVar = (lbf.m) d0.d0(list2);
                String str4 = mVar != null ? mVar.f193683g : null;
                Pair[] elements3 = {pair6, str4 != null ? new Pair(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclosures_combined_uk_trading_subscription_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclosures_combined_uk_trading_subscription_content, u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclosures_combined_uk_link_trading_pro_terms, null, new Click(28, (Integer) null, (Object) new pkh.g(str4), "uk_link_trading_pro_terms", false), 10)), null, 12)) : null, rkh.h.d};
                Intrinsics.checkNotNullParameter(elements3, "elements");
                List listL3 = kotlin.collections.d.L(elements3);
                ArrayList arrayList3 = new ArrayList(w.t(listL3, 10));
                int i43 = 0;
                for (Object obj8 : listL3) {
                    int i59 = i43 + 1;
                    if (i43 < 0) {
                        v.s();
                        throw null;
                    }
                    arrayList3.add(pkh.m.a("DISCLOSURES_" + i43, (Pair) obj8));
                    i43 = i59;
                }
                return arrayList3;
            case 21:
                Pair pair7 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair7, "<destruct>");
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) pair7.f186385a;
                Links links2 = (Links) pair7.f186386b;
                hel.b bVar = tradingLegalEntityInformation.f105106a;
                if (bVar != null) {
                    int i66 = rkh.i.f254880a[bVar.ordinal()];
                    d.b bVar2 = d.b.f237182a;
                    switch (i66) {
                        case 1:
                            Intrinsics.checkNotNullParameter(links2, "links");
                            htmlLocalisedClause = new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_description_us_format_v2, u.c(links2.f105092g), (Integer) null, bVar2, 12);
                            break;
                        case 2:
                        case 3:
                            Intrinsics.checkNotNullParameter(links2, "links");
                            htmlLocalisedClause = new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_description_format, v.k(links2.d, links2.f105092g, links2.f105093h), (Integer) null, bVar2, 12);
                            break;
                        case 4:
                            Intrinsics.checkNotNullParameter(links2, "links");
                            htmlLocalisedClause = new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_description_eea_format, v.k(links2.d, links2.f105092g, links2.f105093h), (Integer) null, bVar2, 12);
                            break;
                        case 5:
                        case 6:
                        case 7:
                            Intrinsics.checkNotNullParameter(links2, "links");
                            htmlLocalisedClause = new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_description_sg_format, v.k(links2.f105092g, links2.f105093h), (Integer) null, bVar2, 12);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    htmlLocalisedClause2 = htmlLocalisedClause;
                }
                od0.i.Companion.getClass();
                return od0.h.a(htmlLocalisedClause2);
            case 22:
                Function0 getDefaultLoadingItems3 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems3, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems3.invoke();
            case 23:
                Pair pair8 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair8, "<destruct>");
                return Boolean.valueOf(((List) pair8.f186385a).isEmpty() && ((List) pair8.f186386b).isEmpty());
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 25:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                List list3 = it12;
                int iB = q0.b(w.t(list3, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj9 : list3) {
                    linkedHashMap.put(((yk5.a) obj9).f314566a, obj9);
                }
                return linkedHashMap;
            case 26:
                olm.a buildSerialDescriptor = (olm.a) obj2;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                rlm.l lVar = new rlm.l(new re3.d(25));
                zhm.f0 f0Var = zhm.f0.f322471a;
                buildSerialDescriptor.a("JsonPrimitive", lVar, f0Var, false);
                buildSerialDescriptor.a("JsonNull", new rlm.l(new re3.d(26)), f0Var, false);
                buildSerialDescriptor.a("JsonLiteral", new rlm.l(new re3.d(27)), f0Var, false);
                buildSerialDescriptor.a("JsonObject", new rlm.l(new re3.d(28)), f0Var, false);
                buildSerialDescriptor.a("JsonArray", new rlm.l(new re3.d(29)), f0Var, false);
                return Unit.f186387a;
            case 27:
                Map.Entry entry = (Map.Entry) obj2;
                Intrinsics.checkNotNullParameter(entry, "<destruct>");
                String str5 = (String) entry.getKey();
                JsonElement jsonElement = (JsonElement) entry.getValue();
                StringBuilder sb6 = new StringBuilder();
                i0.a(str5, sb6);
                sb6.append(CoreConstants.COLON_CHAR);
                sb6.append(jsonElement);
                return sb6.toString();
            case 28:
                rm2.h update2 = (rm2.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return rm2.h.a(update2, null, null, true, null, 27);
            default:
                rm2.h update3 = (rm2.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return rm2.h.a(update3, null, null, false, null, 27);
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f254616a = i;
    }
}
