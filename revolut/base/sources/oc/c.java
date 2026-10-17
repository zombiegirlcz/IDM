package oc;

import android.icu.text.DecimalFormat;
import android.icu.text.NumberFormat;
import aw0.o9;
import bn4.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import com.revolut.feature.transfer.core.models.DeFiBalanceSource;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.PocketSource;
import com.revolut.feature.transfer.core.models.SavingsAccount;
import com.revolut.feature.transfer.core.models.WealthPortfolio;
import com.revolut.feature_travel_hotels_models.amenity.HotelsAmenity;
import com.revolut.feature_travel_hotels_models.amenity.HotelsCategorisedAmenities;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTerminal;
import com.revolut.revolut.feature_fourthline_impl.R;
import em2.e;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import k4l.o0;
import k4l.p0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import n68.x;
import oq9.n;
import oq9.o;
import oti.z1;
import skm.e0;
import skm.h0;
import y6h.r;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes16.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static kpj.f f224001a;

    public static final l2l.a A(tdh.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = l2l.b.f191826a[aVar.ordinal()];
        if (i == 1) {
            return l2l.a.PORTFOLIO;
        }
        if (i == 2) {
            return l2l.a.WATCHLIST;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final t02.d B(ApmPaymentSource apmPaymentSource) {
        Intrinsics.checkNotNullParameter(apmPaymentSource, "<this>");
        return new t02.d(apmPaymentSource.f62207a, apmPaymentSource.f62208b.a());
    }

    public static final h24.d C(vu3.e eVar) {
        String strName;
        String strName2;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (!(eVar instanceof vu3.d)) {
            if (!(eVar instanceof vu3.c)) {
                throw new NoWhenBranchMatchedException();
            }
            vu3.c cVar = (vu3.c) eVar;
            return new h24.b(cVar.f292207a, cVar.f292208b);
        }
        vu3.d dVar = (vu3.d) eVar;
        String str = dVar.f292209a;
        it3.k kVar = dVar.f292211c;
        if (kVar != null) {
            strName2 = kVar.name();
            strName = null;
        } else {
            strName = null;
            strName2 = null;
        }
        String str2 = dVar.f292210b;
        String str3 = dVar.d;
        String str4 = dVar.e;
        hha.i iVar = dVar.f;
        if (iVar != null) {
            strName = iVar.name();
        }
        return new h24.c(str, str2, strName2, str3, str4, strName, dVar.f292212g);
    }

    public static final so3.c D(Address address) {
        Intrinsics.checkNotNullParameter(address, "<this>");
        return new so3.c(address.getStreetLine1(), address.getStreetLine2(), address.getRegion(), address.getCity(), address.getPostcode(), address.getCountry(), address.getNeighborhood());
    }

    public static final long E(LocalDate localDate, ZoneId zoneId) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        return G(localDate, zoneId).toEpochMilli();
    }

    public static /* synthetic */ long F(LocalDate localDate) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
        return E(localDate, zoneIdSystemDefault);
    }

    public static final Instant G(LocalDate localDate, ZoneId zoneId) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Instant instant = localDate.atStartOfDay(zoneId).toInstant();
        Intrinsics.checkNotNullExpressionValue(instant, "toInstant(...)");
        return instant;
    }

    public static final LocalDate H(long j2, ZoneId zoneId) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        LocalDate localDate = Instant.ofEpochMilli(j2).atZone(zoneId).toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        return localDate;
    }

    public static /* synthetic */ LocalDate I(long j2) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
        return H(j2, zoneIdSystemDefault);
    }

    public static final f8l.f J(SourcePocketWrapper sourcePocketWrapper) {
        Intrinsics.checkNotNullParameter(sourcePocketWrapper, "<this>");
        SourcePocket sourcePocket = sourcePocketWrapper.f91794a;
        if ((sourcePocket instanceof SourcePocket.InvestAccountCombinedBuyingPower) || (sourcePocket instanceof SourcePocket.Holding)) {
            return f8l.f.TRADING;
        }
        if ((sourcePocket instanceof SourcePocket.Pocket) || (sourcePocket instanceof SourcePocket.Savings) || (sourcePocket instanceof SourcePocket.VaultWrapper)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final rcf.a K(SourcePocketWrapper sourcePocketWrapper) {
        Intrinsics.checkNotNullParameter(sourcePocketWrapper, "<this>");
        SourcePocket sourcePocket = sourcePocketWrapper.f91794a;
        if (sourcePocket instanceof SourcePocket.InvestAccountCombinedBuyingPower) {
            return rcf.a.TRADING_GIA_CBP;
        }
        if (sourcePocket instanceof SourcePocket.Holding) {
            return rcf.a.TRADING_POCKET;
        }
        if ((sourcePocket instanceof SourcePocket.Pocket) || (sourcePocket instanceof SourcePocket.Savings) || (sourcePocket instanceof SourcePocket.VaultWrapper)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final List L(Data data) {
        List list = data != null ? (List) iii.c.f(data, new bng.a(1), new y(2), new b0c.a(13)) : null;
        return list == null ? f0.f322471a : list;
    }

    public static final ArrayList M(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<HotelsCategorisedAmenities> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (HotelsCategorisedAmenities hotelsCategorisedAmenities : list2) {
            oei.b bVar = hotelsCategorisedAmenities.f97840a;
            List list3 = hotelsCategorisedAmenities.f97841b;
            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                arrayList2.add(new ieg.a((HotelsAmenity) it8.next(), false));
            }
            arrayList.add(new ieg.b(bVar, arrayList2));
        }
        return arrayList;
    }

    public static final long N(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        ZoneId zoneId = g0m.a.f139502a;
        return E(localDate, g0m.a.f139502a);
    }

    public static final LocalDate O(LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        LocalDate localDateWithDayOfMonth = localDate.withDayOfMonth(localDate.lengthOfMonth());
        Intrinsics.checkNotNullExpressionValue(localDateWithDayOfMonth, "withDayOfMonth(...)");
        return localDateWithDayOfMonth;
    }

    public static final long P(LocalDate localDate, LocalDate other) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return ChronoUnit.YEARS.between(localDate, other);
    }

    public static final ResourceImage a(int i) {
        return new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246);
    }

    public static final ArrayList b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<oti.c> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (oti.c cVar : list2) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            String str = cVar.d;
            String str2 = cVar.f229618b;
            List list3 = cVar.f229620g;
            Object obj2 = qti.b.f249158a;
            Intrinsics.checkNotNullParameter(list3, "<this>");
            List list4 = list3;
            ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
            Iterator it8 = list4.iterator();
            while (it8.hasNext()) {
                arrayList2.add(qti.b.a((z1) it8.next()));
            }
            String str3 = cVar.f229617a;
            wi0.a aVar = wi0.b.Companion;
            String str4 = cVar.e;
            aVar.getClass();
            arrayList.add(new bti.a(str, str2, str3, wi0.a.a(str4), cVar.f229619c, nz8.d.N(cVar.f), arrayList2));
        }
        return arrayList;
    }

    public static final ArrayList c(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            bti.a aVar = (bti.a) it8.next();
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            String str = aVar.f18581a;
            String str2 = aVar.f18582b;
            ArrayList arrayList3 = aVar.f18584g;
            Object obj2 = qti.b.f249158a;
            Intrinsics.checkNotNullParameter(arrayList3, "<this>");
            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
            Iterator it9 = arrayList3.iterator();
            while (it9.hasNext()) {
                arrayList4.add(qti.b.b((AsftTerminal) it9.next()));
            }
            String str3 = aVar.e;
            String str4 = aVar.f18583c;
            String str5 = aVar.d.f297794a;
            TimeZone timeZone = aVar.f;
            Intrinsics.checkNotNullParameter(timeZone, "<this>");
            String string = timeZone.toZoneId().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            arrayList2.add(new oti.c(str4, str2, str3, str, str5, string, arrayList4));
        }
        return arrayList2;
    }

    public static final CompositeClause d(TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(textLocalisedClause, "<this>");
        TextClause textClause = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        rvl.c.Companion.getClass();
        return new CompositeClause(v.k(textLocalisedClause, textClause, new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "LEARN_MORE_CLICK_ID", false), 10)), null, null, null, 14);
    }

    public static final List e(Map map, Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        if (map != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : collection) {
                Integer num = (Integer) map.get((FavouritesAssetTypeKey) obj2);
                if (num == null || num.intValue() != Integer.MAX_VALUE) {
                    arrayList.add(obj2);
                }
            }
            List listP0 = d0.P0(arrayList, new dcj.c(map, 2));
            if (listP0 != null) {
                return listP0;
            }
        }
        return d0.d1(collection);
    }

    public static final h0 f(efm.b bVar, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return e0.g(scope, null, null, new x(bVar, null, 19), 3);
    }

    public static final h0 g(efm.d0 d0Var, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return e0.g(scope, null, null, new x(d0Var, null, 18), 3);
    }

    public static final long h(LocalDate localDate, LocalDate other) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return ChronoUnit.DAYS.between(localDate, other);
    }

    public static final DecimalFormat i(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        Intrinsics.i(currencyInstance, "null cannot be cast to non-null type android.icu.text.DecimalFormat");
        return (DecimalFormat) currencyInstance;
    }

    public static final ArrayList j(PaymentGroup paymentGroup) {
        Intrinsics.checkNotNullParameter(paymentGroup, "<this>");
        List list = paymentGroup.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!(((o) obj2) instanceof n)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final char k(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        return i(locale).getDecimalFormatSymbols().getMonetaryDecimalSeparator();
    }

    public static final char l(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        return i(locale).getDecimalFormatSymbols().getMonetaryGroupingSeparator();
    }

    public static final Object m(mk0.a aVar, tk0.g key, Serializable serializable) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(serializable, "default");
        Object objA = aVar.a(key);
        return objA == null ? serializable : objA;
    }

    public static final dda.f n(String str, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Object obj2 = null;
        if (list.isEmpty()) {
            return null;
        }
        if (str == null) {
            return (dda.f) d0.b0(list);
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(((dda.f) next).getType(), str)) {
                obj2 = next;
                break;
            }
        }
        dda.f fVar = (dda.f) obj2;
        return fVar == null ? (dda.f) d0.b0(list) : fVar;
    }

    public static final boolean o(o0 o0Var) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        int i = p0.f180994a[o0Var.ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    public static final boolean p(em2.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (eVar instanceof em2.d) {
            em2.d dVar = (em2.d) eVar;
            return !Intrinsics.f(dVar.f127578b, dVar.f127579c);
        }
        if (eVar instanceof em2.f) {
            em2.f fVar = (em2.f) eVar;
            return !Intrinsics.f(fVar.f127584b, fVar.f127585c);
        }
        if ((eVar instanceof em2.c) || (eVar instanceof e.a)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int q(uib.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int i = vib.b.f289560a[cVar.ordinal()];
        if (i == 1) {
            return R$string.savings_account_switcher_total_title_savings_and_funds;
        }
        if (i == 2) {
            return R$string.savings_account_switcher_total_title_flexible_cash_funds;
        }
        if (i == 3) {
            return R$string.savings_account_switcher_total_title_flexible_accounts;
        }
        if (i == 4) {
            return R$string.savings_account_switcher_total_title_interest;
        }
        if (i == 5) {
            return R$string.savings_account_switcher_total_title;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int r(uib.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int i = vib.b.f289560a[cVar.ordinal()];
        if (i == 1) {
            return R$string.savings_umbrella_products_group_name_savings_and_funds;
        }
        if (i == 2) {
            return R$string.savings_umbrella_products_group_name_flexible_cash_funds;
        }
        if (i == 3) {
            return R$string.savings_umbrella_products_group_name_flexible_account;
        }
        if (i == 4) {
            return R$string.savings_umbrella_products_group_name_interest;
        }
        if (i == 5) {
            return R$string.savings_umbrella_products_group_name_savings;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final long s(LocalDate localDate, LocalDate other) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return ChronoUnit.MONTHS.between(localDate, other);
    }

    public static final vkm.y t(mk0.a aVar, tk0.g key, Serializable serializable) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(serializable, "default");
        return new vkm.y(new km2.n(aVar, key, serializable, (Continuation) null, 28), aVar.j(key));
    }

    public static final ApmPaymentSource u(FundingSource fundingSource) {
        t02.c cVar;
        Intrinsics.checkNotNullParameter(fundingSource, "<this>");
        String str = fundingSource.f92240a;
        if (fundingSource instanceof PocketSource) {
            cVar = t02.c.POCKET;
        } else if (fundingSource instanceof SavingsAccount) {
            cVar = t02.c.SAVINGS_ACCOUNT;
        } else {
            if (!(fundingSource instanceof WealthPortfolio)) {
                if (fundingSource instanceof DeFiBalanceSource) {
                    throw new IllegalStateException("DeFi is not supported as an APM payment source");
                }
                throw new NoWhenBranchMatchedException();
            }
            cVar = t02.c.INVEST;
        }
        return new ApmPaymentSource(str, cVar);
    }

    public static final String v(xzg.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        int i = r.f311312a[oVar.ordinal()];
        if (i == 1) {
            return "COLLECTIONS_STOCKS";
        }
        if (i == 2) {
            return "COLLECTIONS_CRYPTO";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String w(xzg.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        int i = r.f311312a[oVar.ordinal()];
        if (i == 1) {
            return "COLLECTIONS_CONFIG_STOCKS";
        }
        if (i == 2) {
            return "COLLECTIONS_CONFIG_CRYPTO";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final om1.a x(dn1.a aVar) {
        om1.c cVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        dn1.b bVarB = aVar.getTerms();
        om1.b bVar = null;
        if (bVarB != null) {
            Intrinsics.checkNotNullParameter(bVarB, "<this>");
            cVar = new om1.c(bVarB.getId(), bVarB.getUri());
        } else {
            cVar = null;
        }
        String strA = aVar.getStatus();
        if (strA != null) {
            om1.b[] bVarArrValues = om1.b.values();
            int length = bVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                om1.b bVar2 = bVarArrValues[i];
                if (a0.z(bVar2.name(), strA, true)) {
                    bVar = bVar2;
                    break;
                }
                i++;
            }
        }
        return new om1.a(cVar, bVar);
    }

    public static final p02.a y(yz1.c cVar) {
        Object next;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        p02.b bVar = p02.c.Companion;
        String value = cVar.getPaymentMethod();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        Iterator<E> it8 = p02.c.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (a0.z(((p02.c) next).b(), value, true)) {
                break;
            }
        }
        p02.c cVar2 = (p02.c) next;
        if (cVar2 == null) {
            return null;
        }
        String strC = cVar.getId();
        dj0.d dVarO = mo3.a.o(cVar.getAmount());
        String strB = cVar.getComment();
        yz1.d dVarD = cVar.getPayer();
        Intrinsics.checkNotNullParameter(dVarD, "<this>");
        return new p02.a(strC, cVar2, new p02.d(dVarD.getId(), dVarD.getContactName()), dVarO, strB, oi0.d.d0(cVar.getUpdateDate()));
    }

    public static final vu3.e z(h24.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        if (!(dVar instanceof h24.c)) {
            if (!(dVar instanceof h24.b)) {
                throw new NoWhenBranchMatchedException();
            }
            h24.b bVar = (h24.b) dVar;
            return new vu3.c(bVar.getLabel(), bVar.getDeeplink());
        }
        h24.c cVar = (h24.c) dVar;
        String strD = cVar.getLabel();
        it3.j jVar = it3.k.Companion;
        String strF = cVar.getProductMetadata();
        jVar.getClass();
        it3.k kVarA = it3.j.a(strF);
        String strC = cVar.getIntendedPlanId();
        String strA = cVar.getAppType();
        String strG = cVar.getSubtype();
        String strB = cVar.getBillingOption();
        hha.i iVar = null;
        Object obj2 = null;
        if (strB != null) {
            Iterator<E> it8 = hha.i.a().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (Intrinsics.f(((hha.i) next).name(), strB)) {
                    obj2 = next;
                    break;
                }
            }
            iVar = (hha.i) obj2;
        }
        return new vu3.d(strD, strC, kVarA, strA, strG, iVar, cVar.getOfferToken());
    }
}
