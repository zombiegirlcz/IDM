package o69;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardPaymentDetails;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterValueId;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.CommodityTargetPriceScreenContract$TargetPriceInputValue;
import com.revolut.shared.feature.wealth.models.config.Links;
import ip0.gu;
import ip0.s7;
import ip0.yl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import n8i.k;
import n8i.v;
import o7h.p;
import o7j.j;
import xzg.n0;
import yhm.r;
import z0h.o0;
import z0h.p1;
import z0h.t1;
import zh9.u0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f222524a;

    public /* synthetic */ b(int i) {
        this.f222524a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        wi0.b bVar;
        boolean z = true;
        Object obj3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.f222524a) {
            case 0:
                LocationDomain it8 = (LocationDomain) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it8);
            case 1:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                o6d.a aVar = o6d.a.d;
                Intrinsics.checkNotNullParameter(null, "args");
                throw null;
            case 2:
                String str = (String) obj2;
                return a10.b.t(str, "params", "PERSONAL_SUBACCOUNT_LINK_CACHE_KEY", str);
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return u.c(new yl("LIST_ID_LOADING_HEADER", 0, 30));
            case 4:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                m70.a.c(t0.f186434a);
                return new y6f.a(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
            case 5:
                o6f.a state = (o6f.a) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                return state.f222572a;
            case 6:
                o6f.a it9 = (o6f.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9;
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 8:
                Collection collectionValues = ((Map) obj2).values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    z = false;
                } else {
                    Iterator it10 = collectionValues.iterator();
                    while (it10.hasNext()) {
                        if (((Boolean) it10.next()).booleanValue()) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 10:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 11:
                dj0.d topUpAmount = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(topUpAmount, "topUpAmount");
                return com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 6))), u0.f(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, topUpAmount, null, pte.a.REVOLUT_PAY, 22))));
            case 12:
                Intrinsics.checkNotNullParameter((NaviCommand) obj2, "it");
                return Boolean.TRUE;
            case 13:
                Function0 function0 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(function0, "default");
                return new o7e.i(null, (List) function0.invoke());
            case 14:
                InstrumentsCollectionFilterValueId it11 = (InstrumentsCollectionFilterValueId) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                Object obj4 = p.f222830a;
                Intrinsics.checkNotNullParameter(it11, "<this>");
                if (Intrinsics.f(it11, InstrumentsCollectionFilterValueId.BondsIssuerGovernment.f95306a)) {
                    return "GOVERNMENT";
                }
                if (Intrinsics.f(it11, InstrumentsCollectionFilterValueId.BondsIssuerCorporate.f95304a)) {
                    return "CORPORATE";
                }
                return null;
            case 15:
                InstrumentsCollectionFilterValueId it12 = (InstrumentsCollectionFilterValueId) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj5 = p.f222830a;
                Intrinsics.checkNotNullParameter(it12, "<this>");
                if (Intrinsics.f(it12, InstrumentsCollectionFilterValueId.BondsCreditQualityHighYield.f95302a)) {
                    return "HIGH_YIELD";
                }
                if (Intrinsics.f(it12, InstrumentsCollectionFilterValueId.BondsCreditQualityInvestmentGrade.f95303a)) {
                    return "INVESTMENT_GRADE";
                }
                return null;
            case 16:
                InstrumentsCollectionFilterValueId it13 = (InstrumentsCollectionFilterValueId) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                Object obj6 = p.f222830a;
                Intrinsics.checkNotNullParameter(it13, "<this>");
                if (Intrinsics.f(it13, InstrumentsCollectionFilterValueId.BondsMaturityTypeFixed.f95308a)) {
                    return "FIXED";
                }
                if (Intrinsics.f(it13, InstrumentsCollectionFilterValueId.BondsMaturityTypeCallable.f95307a)) {
                    return "CALLABLE";
                }
                if (Intrinsics.f(it13, InstrumentsCollectionFilterValueId.BondsMaturityTypePerpetual.f95309a)) {
                    return "PERPETUAL";
                }
                return null;
            case 17:
                InstrumentsCollectionFilterValueId it14 = (InstrumentsCollectionFilterValueId) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                Object obj7 = p.f222830a;
                Intrinsics.checkNotNullParameter(it14, "<this>");
                if (Intrinsics.f(it14, InstrumentsCollectionFilterValueId.BondsCouponTypeFixed.f95299a)) {
                    return "FIXED";
                }
                if (Intrinsics.f(it14, InstrumentsCollectionFilterValueId.BondsCouponTypeFloating.f95300a)) {
                    return "FLOATING";
                }
                if (Intrinsics.f(it14, InstrumentsCollectionFilterValueId.BondsCouponTypeZero.f95301a)) {
                    return "ZERO";
                }
                return null;
            case 18:
                InstrumentsCollectionFilterValueId it15 = (InstrumentsCollectionFilterValueId) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Object obj8 = p.f222830a;
                Intrinsics.checkNotNullParameter(it15, "<this>");
                InstrumentsCollectionFilterValueId.BondsIssuerCountry bondsIssuerCountry = it15 instanceof InstrumentsCollectionFilterValueId.BondsIssuerCountry ? (InstrumentsCollectionFilterValueId.BondsIssuerCountry) it15 : null;
                if (bondsIssuerCountry == null || (bVar = bondsIssuerCountry.f95305a) == null) {
                    return null;
                }
                return bVar.f297794a;
            case 19:
                j it16 = (j) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f222863a;
            case 20:
                CommodityTargetPriceScreenContract$TargetPriceInputValue it17 = (CommodityTargetPriceScreenContract$TargetPriceInputValue) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f99921a;
            case 21:
                j it18 = (j) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f;
            case 22:
                od0.i iVar = (od0.i) obj2;
                if (iVar.d()) {
                    return l38.a.c((n38.a) iVar.c());
                }
                throw new IllegalStateException("Joint account is not available");
            case 23:
                t1 disclaimersData = (t1) obj2;
                Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
                Links links = disclaimersData.f318563a;
                hel.b bVar2 = disclaimersData.f318564b;
                return new p1(u.c(new o0(links, bVar2)), bVar2);
            case 24:
                Locale locale = new Locale("", (String) obj2);
                String iSO3Country = locale.getISO3Country();
                Intrinsics.checkNotNullExpressionValue(iSO3Country, "getISO3Country(...)");
                String upperCase = iSO3Country.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                return new Pair(upperCase, locale);
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return o8d.h.a();
            case 26:
                IntRange intRangeU = t61.a.u((Function0) obj2, "<unused var>", 1, 3, 1);
                ArrayList arrayList = new ArrayList(w.t(intRangeU, 10));
                vim.f it19 = intRangeU.iterator();
                while (it19.f289625c) {
                    arrayList.add(new s7(a0.d.n("LOADING_STATE_ID_", it19.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                aim.e eVarB = u.b();
                vim.f it20 = new IntRange(0, 1, 1).iterator();
                while (it20.f289625c) {
                    eVarB.add(new gu(a0.d.h(it20.nextInt(), "_SUBHEADER__LOADING_STATE_ID"), 0, 0, 30));
                    eVarB.addAll(arrayList);
                }
                return u.a(eVarB);
            case 27:
                od0.i optional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optional, "optional");
                n0 n0Var = (n0) optional.f224257a;
                return n0Var == null ? n0.ALL : n0Var;
            case 28:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                k kVar = (k) rVar.f314201a;
                return new v((CreditCardPaymentDetails) rVar.f314202b, c8g.a.m(kVar), kVar.f213441c, v13.d.r(kVar.f213439a), (wi0.b) rVar.f314203c);
            default:
                List facilities = (List) obj2;
                Intrinsics.checkNotNullParameter(facilities, "facilities");
                od0.h hVar = od0.i.Companion;
                Iterator it21 = facilities.iterator();
                while (true) {
                    if (it21.hasNext()) {
                        Object next = it21.next();
                        if (((f95.d) next).f132831b == f95.e.ACTIVE) {
                            obj3 = next;
                        }
                    }
                }
                hVar.getClass();
                return od0.h.a(obj3);
        }
    }
}
