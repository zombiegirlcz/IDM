package u6l;

import com.revolut.feature.address.models.Address;
import h93.b0;
import h93.c0;
import h93.d0;
import h93.e0;
import h93.f0;
import h93.i0;
import h93.j0;
import h93.k0;
import h93.l0;
import h93.s;
import h93.s0;
import h93.t;
import h93.t0;
import h93.u0;
import h93.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.LocalDate;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f277675a = r0.k(new Pair("NONE", h93.r.NONE), new Pair("ACTIVE", h93.r.ACTIVE), new Pair("BLOCKED", h93.r.BLOCKED), new Pair("LOST", h93.r.LOST), new Pair("EXPIRED", h93.r.EXPIRED), new Pair("LOCKED", h93.r.LOCKED), new Pair("COMPROMISED", h93.r.COMPROMISED), new Pair("TERMINATED", h93.r.TERMINATED), new Pair("DELETED", h93.r.DELETED), new Pair("ORDERED", h93.r.ORDERED), new Pair("CREATED", h93.r.CREATED), new Pair("PENDING", h93.r.PENDING));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f277676b = r0.k(new Pair("NONE", s.NONE), new Pair("APP", s.APP), new Pair("SMS", s.SMS));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f277677c = r0.k(new Pair("NONE", h93.g.NONE), new Pair("ORDERED", h93.g.ORDERED), new Pair("PRINTED", h93.g.PRINTED), new Pair("POSTED", h93.g.POSTED), new Pair("DELIVERED", h93.g.DELIVERED));
    public static final Object d = r0.k(new Pair("IN_REVIEW", t.IN_REVIEW), new Pair("APPROVED", t.APPROVED), new Pair("REJECTED", t.REJECTED));
    public static final Object e = r0.k(new Pair("PROFANITY", z.PROFANITY), new Pair("OFFENSIVE", z.OFFENSIVE), new Pair("POLITICAL", z.POLITICAL), new Pair("TRADEMARK", z.TRADEMARK), new Pair("COPYRIGHT", z.COPYRIGHT), new Pair("NOT_ENGLISH", z.NOT_LATIN), new Pair("HARMING", z.HARMING));
    public static final Object f = r0.k(new Pair("ALL", i93.d.ALL), new Pair("ALL_FIAT", i93.d.ALL_FIAT), new Pair("ALL_CRYPTO", i93.d.ALL_CRYPTO), new Pair("NONE", i93.d.NONE), new Pair("POCKETS", i93.d.POCKETS));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f277678g = r0.k(new Pair("IN_TRANSIT", h93.e.IN_TRANSIT), new Pair("OUT_FOR_DELIVERY", h93.e.OUT_FOR_DELIVERY), new Pair("AVAILABLE_FOR_PICKUP", h93.e.AVAILABLE_FOR_PICKUP), new Pair("DELIVERED", h93.e.DELIVERED), new Pair("EXCEPTION", h93.e.EXCEPTION), new Pair("FAILED_ATTEMPT", h93.e.FAILED_ATTEMPT));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    public static final f0 a(j jVar) {
        i93.c cVarB;
        Address address;
        h93.e eVar;
        c0 c0VarA;
        String str;
        String str2;
        boolean z;
        h93.c cVar;
        c0 c0VarA2;
        j0 j0Var;
        h93.c cVar2;
        Map mapG;
        o oVar;
        String str3;
        String str4;
        t0 r0Var;
        p details;
        Integer minAge;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String id10 = jVar.getId();
        String label = jVar.getLabel();
        boolean isVirtual = jVar.getIsVirtual();
        Boolean disposable = jVar.getDisposable();
        boolean zBooleanValue = disposable != null ? disposable.booleanValue() : false;
        h93.r rVar = (h93.r) u1.v(jVar.getState(), f277675a);
        if (rVar == null) {
            rVar = h93.r.NONE;
        }
        d cardSettings = jVar.getCardSettings();
        if (cardSettings != null) {
            cVarB = b(cardSettings);
            address = null;
        } else {
            cVarB = null;
            address = null;
        }
        b93.j jVar2 = new b93.j(new b93.b(jVar.getCardCode()), jVar.getBrand());
        Address address2 = address;
        String color = jVar.getColor();
        String lastFour = jVar.getLastFour();
        c deliveryStatus = jVar.getDeliveryStatus();
        Intrinsics.checkNotNullParameter(deliveryStatus, "<this>");
        h93.g gVar = (h93.g) u1.v(deliveryStatus.getDeliveryStatus(), f277677c);
        if (gVar == null) {
            gVar = h93.g.NONE;
        }
        h93.g gVar2 = gVar;
        s trackingChannel = deliveryStatus.getTrackingChannel();
        String trackingLink = deliveryStatus.getTrackingLink();
        String address3 = deliveryStatus.getAddress();
        Boolean deliveryUpdateAllowed = deliveryStatus.getDeliveryUpdateAllowed();
        so3.c addressDetails = deliveryStatus.getAddressDetails();
        Address addressA = addressDetails != null ? to3.a.a(addressDetails) : address2;
        String issueDate = deliveryStatus.getIssueDate();
        LocalDate localDate = issueDate != null ? new LocalDate(issueDate) : address2;
        String printDate = deliveryStatus.getPrintDate();
        LocalDate localDate2 = printDate != null ? new LocalDate(printDate) : address2;
        String deliveryDate = deliveryStatus.getDeliveryDate();
        LocalDate localDate3 = deliveryDate != null ? new LocalDate(deliveryDate) : address2;
        b deliveryDateRange = deliveryStatus.getDeliveryDateRange();
        h93.f fVar = deliveryDateRange != null ? new h93.f(new LocalDate(deliveryDateRange.getFrom()), new LocalDate(deliveryDateRange.getTo())) : null;
        LocalDate localDate4 = (deliveryStatus.getEventDate() == null || deliveryStatus.getEventDate().longValue() <= 0) ? null : new LocalDate(deliveryStatus.getEventDate().longValue());
        String postedDate = deliveryStatus.getPostedDate();
        LocalDate localDate5 = postedDate != null ? new LocalDate(postedDate) : null;
        String estimatedPostedDate = deliveryStatus.getEstimatedPostedDate();
        LocalDate localDate6 = estimatedPostedDate != null ? new LocalDate(estimatedPostedDate) : null;
        String deliveryMethod = deliveryStatus.getDeliveryMethod();
        String courier = deliveryStatus.getCourier();
        String localCourier = deliveryStatus.getLocalCourier();
        Boolean isBulkShipment = deliveryStatus.getIsBulkShipment();
        boolean zBooleanValue2 = isBulkShipment != null ? isBulkShipment.booleanValue() : false;
        String courierStatus = deliveryStatus.getCourierStatus();
        if (courierStatus == null || (eVar = (h93.e) u1.v(courierStatus, f277678g)) == null) {
            eVar = h93.e.UNKNOWN;
        }
        h93.h hVar = new h93.h(gVar2, trackingChannel, trackingLink, address3, deliveryUpdateAllowed, addressA, localDate, localDate2, localDate3, fVar, localDate4, localDate5, localDate6, deliveryMethod, courier, localCourier, zBooleanValue2, eVar, deliveryStatus.getLocation(), deliveryStatus.getLocalisedMessage());
        Long usage = jVar.getUsage();
        long jLongValue = usage != null ? usage.longValue() : -1L;
        LocalDate localDate7 = new LocalDate(jVar.getExpiryDate());
        Boolean replaced = jVar.getReplaced();
        Boolean preExpired = jVar.getPreExpired();
        String stateReason = jVar.getStateReason();
        if (stateReason != null) {
            c0.Companion.getClass();
            c0VarA = b0.a(stateReason);
        } else {
            c0VarA = null;
        }
        String walletId = jVar.getWalletId();
        boolean googlePayEligible = jVar.getGooglePayEligible();
        Boolean digitised = jVar.getDigitised();
        boolean zBooleanValue3 = digitised != null ? digitised.booleanValue() : false;
        Boolean everDigitised = jVar.getEverDigitised();
        boolean zBooleanValue4 = everDigitised != null ? everDigitised.booleanValue() : false;
        Boolean panActivation = jVar.getPanActivation();
        boolean zBooleanValue5 = panActivation != null ? panActivation.booleanValue() : false;
        String pin = jVar.getPin();
        Long lastUsedDate = jVar.getLastUsedDate();
        Long createdDate = jVar.getCreatedDate();
        boolean customised = jVar.getCustomised();
        a customisation = jVar.getCustomisation();
        if (customisation != null) {
            Intrinsics.checkNotNullParameter(customisation, "<this>");
            String reviewStatus = customisation.getReviewStatus();
            t tVar = reviewStatus != null ? (t) u1.v(reviewStatus, d) : null;
            List rejectionReasons = customisation.getRejectionReasons();
            if (rejectionReasons != null) {
                List list = rejectionReasons;
                arrayList = new ArrayList();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    String str5 = id10;
                    String str6 = label;
                    z zVar = (z) u1.v((String) it8.next(), e);
                    if (zVar != null) {
                        arrayList.add(zVar);
                    }
                    label = str6;
                    id10 = str5;
                }
            } else {
                arrayList = null;
            }
            str = id10;
            str2 = label;
            String estimatedReviewDate = customisation.getEstimatedReviewDate();
            LocalDate localDate8 = estimatedReviewDate != null ? new LocalDate(estimatedReviewDate) : null;
            String approvedDate = customisation.getApprovedDate();
            z = isVirtual;
            cVar = new h93.c(tVar, arrayList, localDate8, approvedDate != null ? new LocalDate(approvedDate) : null);
        } else {
            str = id10;
            str2 = label;
            z = isVirtual;
            cVar = null;
        }
        String replacedCardId = jVar.getReplacedCardId();
        String str7 = str2;
        String designGroup = jVar.getDesignGroup();
        Boolean cardClickActivationEligible = jVar.getCardClickActivationEligible();
        boolean zBooleanValue6 = cardClickActivationEligible != null ? cardClickActivationEligible.booleanValue() : false;
        Boolean inAppPinChangeEligible = jVar.getInAppPinChangeEligible();
        boolean zBooleanValue7 = inAppPinChangeEligible != null ? inAppPinChangeEligible.booleanValue() : false;
        h93.p pVar = h93.q.Companion;
        String cvvStatus = jVar.getCvvStatus();
        pVar.getClass();
        h93.q qVarA = h93.p.a(cvvStatus);
        h93.q qVarA2 = jVar.getPinStatus() != null ? h93.p.a(jVar.getPinStatus()) : null;
        k0 k0Var = l0.Companion;
        String subProductType = jVar.getSubProductType();
        k0Var.getClass();
        l0 l0VarA = k0.a(subProductType);
        i0 i0Var = j0.Companion;
        String productType = jVar.getProductType();
        i0Var.getClass();
        j0 j0VarA = i0.a(productType);
        String cardName = jVar.getCardName();
        String cardProfileId = jVar.getCardProfileId();
        Map mapA = o6l.d.a(jVar.getTokenizationEligibility());
        Boolean designChangeEligible = jVar.getDesignChangeEligible();
        boolean zBooleanValue8 = designChangeEligible != null ? designChangeEligible.booleanValue() : false;
        Boolean renewable = jVar.getRenewable();
        boolean zBooleanValue9 = renewable != null ? renewable.booleanValue() : false;
        Boolean renewed = jVar.getRenewed();
        boolean zBooleanValue10 = renewed != null ? renewed.booleanValue() : false;
        String replacementReason = jVar.getReplacementReason();
        if (replacementReason != null) {
            c0.Companion.getClass();
            c0VarA2 = b0.a(replacementReason);
        } else {
            c0VarA2 = null;
        }
        Map tokenisationEligibilities = jVar.getTokenisationEligibilities();
        if (tokenisationEligibilities == null) {
            j0Var = j0VarA;
            mapG = r0.g();
            cVar2 = cVar;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : tokenisationEligibilities.entrySet()) {
                String str8 = (String) entry.getKey();
                e0.Companion.getClass();
                j0 j0Var2 = j0VarA;
                e0 e0VarA = d0.a(str8);
                h93.c cVar3 = cVar;
                if (e0VarA != null) {
                    linkedHashMap.put(e0VarA, entry.getValue());
                }
                cVar = cVar3;
                j0VarA = j0Var2;
            }
            j0Var = j0VarA;
            cVar2 = cVar;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
            Iterator it9 = linkedHashMap.entrySet().iterator();
            while (it9.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it9.next();
                Object key = entry2.getKey();
                o oVar2 = (o) entry2.getValue();
                Iterator it10 = it9;
                boolean eligible = oVar2.getEligible();
                if (oVar2.getEligible()) {
                    str4 = str7;
                    r0Var = null;
                } else {
                    q error = oVar2.getError();
                    if (error != null) {
                        String code = error.getCode();
                        oVar = oVar2;
                        str3 = code;
                    } else {
                        oVar = oVar2;
                        str3 = null;
                    }
                    str4 = str7;
                    boolean zF = Intrinsics.f(str3, "BELOW_MIN_AGE");
                    r0Var = s0.f150161a;
                    if (zF && (details = oVar.getError().getDetails()) != null && (minAge = details.getMinAge()) != null) {
                        r0Var = new h93.r0(minAge.intValue());
                    }
                }
                linkedHashMap2.put(key, new u0(eligible, r0Var));
                it9 = it10;
                str7 = str4;
            }
            mapG = linkedHashMap2;
        }
        return new f0(str, str7, z, zBooleanValue, false, rVar, cVarB, jVar2, color, lastFour, hVar, jLongValue, customised, cVar2, replacedCardId, designGroup, localDate7, replaced, preExpired, c0VarA, walletId, googlePayEligible, zBooleanValue3, zBooleanValue4, zBooleanValue5, pin, lastUsedDate, createdDate, zBooleanValue6, zBooleanValue7, qVarA, qVarA2, l0VarA, j0Var, cardName, cardProfileId, mapA, zBooleanValue8, zBooleanValue9, zBooleanValue10, c0VarA2, mapG, jVar.getNameless());
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
    public static final i93.c b(d dVar) {
        i93.k kVar;
        ArrayList arrayList;
        Object next;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        boolean locationSecurityEnabled = dVar.getLocationSecurityEnabled();
        boolean ecommerceDisabled = dVar.getEcommerceDisabled();
        m securityOptions = dVar.getSecurityOptions();
        if (securityOptions != null) {
            Intrinsics.checkNotNullParameter(securityOptions, "<this>");
            l atmWithdrawal = securityOptions.getAtmWithdrawal();
            i93.i iVarC = atmWithdrawal != null ? c(atmWithdrawal, i93.e.ATM_WITHDRAWAL) : null;
            l ecommerce = securityOptions.getEcommerce();
            i93.i iVarC2 = ecommerce != null ? c(ecommerce, i93.e.ECOMMERCE) : null;
            l contactless = securityOptions.getContactless();
            i93.i iVarC3 = contactless != null ? c(contactless, i93.e.CONTACTLESS) : null;
            l pointOfSale = securityOptions.getPointOfSale();
            i93.i iVarC4 = pointOfSale != null ? c(pointOfSale, i93.e.POINT_OF_SALE) : null;
            l magstripe = securityOptions.getMagstripe();
            i93.i iVarC5 = magstripe != null ? c(magstripe, i93.e.MAGNET) : null;
            l locationSecurity = securityOptions.getLocationSecurity();
            kVar = new i93.k(iVarC, iVarC2, iVarC3, iVarC4, iVarC5, locationSecurity != null ? c(locationSecurity, i93.e.LOCATION) : null);
        } else {
            kVar = null;
        }
        jo3.b limit = dVar.getLimit();
        dj0.d dVarV = limit != null ? hx7.a.v(limit) : null;
        Boolean initial = dVar.getInitial();
        boolean zBooleanValue = initial != null ? initial.booleanValue() : true;
        List pockets = dVar.getPockets();
        if (pockets != null) {
            List<h> list = pockets;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            for (h hVar : list) {
                Intrinsics.checkNotNullParameter(hVar, "<this>");
                arrayList2.add(new i93.h(hVar.getId(), hVar.getType()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        List<String> accountsAvailableForBinding = dVar.getAccountsAvailableForBinding();
        i93.a aVar = i93.b.Companion;
        ArrayList arrayList3 = new ArrayList();
        for (String type : accountsAvailableForBinding) {
            aVar.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            Iterator<E> it8 = i93.b.a().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((i93.b) next).name(), type)) {
                    break;
                }
            }
            i93.b bVar = (i93.b) next;
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        String bindingStrategy = dVar.getBindingStrategy();
        return new i93.c(locationSecurityEnabled, ecommerceDisabled, kVar, dVarV, zBooleanValue, arrayList, arrayList3, bindingStrategy != null ? (i93.d) u1.v(bindingStrategy, f) : null, dVar.getLabel());
    }

    public static final i93.i c(l lVar, i93.e type) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        boolean enabled = lVar.getEnabled();
        boolean editable = lVar.getEditable();
        r transactionLimit = lVar.getTransactionLimit();
        i93.l lVar2 = null;
        if (transactionLimit != null) {
            Intrinsics.checkNotNullParameter(transactionLimit, "<this>");
            xi0.a aVar = xi0.b.Companion;
            String currency = transactionLimit.getCurrency();
            aVar.getClass();
            xi0.b bVarA = xi0.a.a(currency);
            jo3.b value = transactionLimit.getValue();
            dj0.d dVarV = value != null ? hx7.a.v(value) : null;
            jo3.b maxValue = transactionLimit.getMaxValue();
            lVar2 = new i93.l(bVarA, dVarV, maxValue != null ? hx7.a.v(maxValue) : null, transactionLimit.getRequired());
        }
        return new i93.i(type, enabled, editable, lVar2);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
    public static final d d(i93.c cVar) {
        m mVar;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        boolean z = cVar.f159549a;
        boolean z3 = cVar.f159550b;
        i93.k kVar = cVar.f159551c;
        if (kVar != null) {
            Intrinsics.checkNotNullParameter(kVar, "<this>");
            i93.i iVar = kVar.f159565a;
            l lVarF = iVar != null ? f(iVar) : null;
            i93.i iVar2 = kVar.f159566b;
            l lVarF2 = iVar2 != null ? f(iVar2) : null;
            i93.i iVar3 = kVar.f159567c;
            l lVarF3 = iVar3 != null ? f(iVar3) : null;
            i93.i iVar4 = kVar.d;
            l lVarF4 = iVar4 != null ? f(iVar4) : null;
            i93.i iVar5 = kVar.e;
            l lVarF5 = iVar5 != null ? f(iVar5) : null;
            i93.i iVar6 = kVar.f;
            mVar = new m(lVarF, lVarF2, lVarF3, lVarF4, lVarF5, iVar6 != null ? f(iVar6) : null);
        } else {
            mVar = null;
        }
        dj0.d dVar = cVar.d;
        jo3.b bVarA = dVar != null ? hx7.a.A(dVar) : null;
        Boolean boolValueOf = Boolean.valueOf(cVar.e);
        List list = cVar.f;
        if (list != null) {
            List<i93.h> list2 = list;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            for (i93.h hVar : list2) {
                Intrinsics.checkNotNullParameter(hVar, "<this>");
                arrayList2.add(new h(hVar.f159559a, hVar.f159560b));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        List list3 = cVar.f159552g;
        ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
        Iterator it8 = list3.iterator();
        while (it8.hasNext()) {
            arrayList3.add(((i93.b) it8.next()).name());
        }
        i93.d dVar2 = cVar.f159553h;
        return new d(z, z3, mVar, bVarA, boolValueOf, arrayList, arrayList3, dVar2 != null ? u1.h(dVar2, f) : null, cVar.i);
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    public static final j e(f0 f0Var) {
        String str;
        boolean z;
        b bVar;
        boolean z3;
        String str2;
        String str3;
        a aVar;
        String str4;
        q qVar;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        String str5 = f0Var.f150110a;
        String str6 = f0Var.f150111b;
        boolean z4 = f0Var.f150112c;
        boolean z6 = f0Var.d;
        b93.j jVar = f0Var.f150114h;
        String str7 = jVar.f13639a.f13615a;
        String str8 = jVar.f13640b;
        String str9 = f0Var.i;
        String strG = u1.g(f0Var.f, f277675a);
        i93.c cVar = f0Var.f150113g;
        d dVarD = cVar != null ? d(cVar) : null;
        String str10 = f0Var.f150115j;
        h93.h hVar = f0Var.k;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        String strG2 = u1.g(hVar.f150132a, f277677c);
        s sVar = hVar.f150133b;
        String str11 = hVar.f150134c;
        String str12 = hVar.d;
        Address address = hVar.f;
        so3.c cVarD = address != null ? oc.c.D(address) : null;
        LocalDate localDate = hVar.f150135g;
        String string = localDate != null ? localDate.toString() : null;
        LocalDate localDate2 = hVar.f150136h;
        String string2 = localDate2 != null ? localDate2.toString() : null;
        LocalDate localDate3 = hVar.i;
        String string3 = localDate3 != null ? localDate3.toString() : null;
        Boolean bool = hVar.e;
        String str13 = hVar.f150140n;
        h93.f fVar = hVar.f150137j;
        if (fVar != null) {
            str = str6;
            String string4 = fVar.f150108a.toString();
            z = z4;
            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
            String string5 = fVar.f150109b.toString();
            Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
            bVar = new b(string4, string5);
        } else {
            str = str6;
            z = z4;
            bVar = null;
        }
        LocalDate localDate4 = hVar.k;
        long jB = localDate4 != null ? jli.b.b(localDate4) : 0L;
        LocalDate localDate5 = hVar.f150138l;
        String string6 = localDate5 != null ? localDate5.toString() : null;
        LocalDate localDate6 = hVar.f150139m;
        c cVar2 = new c(strG2, string, string3, string2, sVar, str11, str12, bool, cVarD, bVar, str13, Long.valueOf(jB), string6, localDate6 != null ? localDate6.toString() : null, hVar.o, hVar.f150141p, Boolean.valueOf(hVar.f150142q), u1.h(hVar.f150143r, f277678g), hVar.f150144s, hVar.f150145t);
        long j2 = f0Var.f150116l;
        String strValueOf = String.valueOf(f0Var.f150120q);
        Boolean bool2 = f0Var.f150121r;
        Boolean bool3 = f0Var.f150122s;
        c0 c0Var = f0Var.f150123t;
        String strA = c0Var != null ? c0Var.a() : null;
        String str14 = f0Var.u;
        boolean z11 = f0Var.v;
        boolean z12 = f0Var.f150124w;
        boolean z29 = f0Var.f150125x;
        boolean z31 = f0Var.f150126y;
        String str15 = f0Var.z;
        Long l2 = f0Var.A;
        Long l3 = f0Var.B;
        boolean z41 = f0Var.f150117m;
        h93.c cVar3 = f0Var.f150118n;
        if (cVar3 != null) {
            Intrinsics.checkNotNullParameter(cVar3, "<this>");
            t tVar = cVar3.f150098a;
            z3 = z31;
            String strG3 = tVar != null ? u1.g(tVar, d) : null;
            List list = cVar3.f150099b;
            if (list != null) {
                List list2 = list;
                str2 = strA;
                str3 = str14;
                arrayList = new ArrayList(w.t(list2, 10));
                for (Iterator it8 = list2.iterator(); it8.hasNext(); it8 = it8) {
                    arrayList.add(u1.g((z) it8.next(), e));
                }
            } else {
                str2 = strA;
                str3 = str14;
                arrayList = null;
            }
            LocalDate localDate7 = cVar3.f150100c;
            String string7 = localDate7 != null ? localDate7.toString() : null;
            LocalDate localDate8 = cVar3.d;
            aVar = new a(strG3, string7, localDate8 != null ? localDate8.toString() : null, arrayList);
        } else {
            z3 = z31;
            str2 = strA;
            str3 = str14;
            aVar = null;
        }
        String str16 = f0Var.o;
        String str17 = f0Var.f150119p;
        boolean z49 = f0Var.C;
        boolean z54 = f0Var.D;
        String strA2 = f0Var.E.a();
        h93.q qVar2 = f0Var.F;
        String strA3 = qVar2 != null ? qVar2.a() : null;
        l0 l0Var = f0Var.G;
        String strName = l0Var != null ? l0Var.name() : null;
        j0 j0Var = f0Var.H;
        String strName2 = j0Var != null ? j0Var.name() : null;
        String str18 = f0Var.I;
        String str19 = f0Var.J;
        Map map = f0Var.K;
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
        for (Iterator it9 = map.entrySet().iterator(); it9.hasNext(); it9 = it9) {
            Map.Entry entry = (Map.Entry) it9.next();
            linkedHashMap.put(((e0) entry.getKey()).a(), entry.getValue());
            z49 = z49;
        }
        boolean z74 = z49;
        boolean z83 = f0Var.L;
        boolean z89 = f0Var.M;
        boolean z96 = f0Var.N;
        c0 c0Var2 = f0Var.O;
        String strA4 = c0Var2 != null ? c0Var2.a() : null;
        Map map2 = f0Var.P;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(map2.size()));
        for (Iterator it10 = map2.entrySet().iterator(); it10.hasNext(); it10 = it10) {
            Map.Entry entry2 = (Map.Entry) it10.next();
            linkedHashMap2.put(((e0) entry2.getKey()).a(), entry2.getValue());
            z89 = z89;
        }
        boolean z100 = z89;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(q0.b(linkedHashMap2.size()));
        Iterator it11 = linkedHashMap2.entrySet().iterator();
        while (it11.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it11.next();
            Iterator it12 = it11;
            Object key = entry3.getKey();
            u0 u0Var = (u0) entry3.getValue();
            boolean z101 = z54;
            a aVar2 = aVar;
            boolean z102 = u0Var.f150162a;
            t0 t0Var = u0Var.f150163b;
            boolean z103 = z11;
            if (t0Var instanceof h93.r0) {
                str4 = str7;
                qVar = new q("BELOW_MIN_AGE", new p(Integer.valueOf(((h93.r0) t0Var).f150160a)));
            } else {
                str4 = str7;
                if (Intrinsics.f(t0Var, s0.f150161a)) {
                    qVar = new q("UNKNOWN", null);
                } else {
                    if (t0Var != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qVar = null;
                }
            }
            linkedHashMap3.put(key, new o(z102, qVar));
            it11 = it12;
            z54 = z101;
            aVar = aVar2;
            z11 = z103;
            str7 = str4;
        }
        return new j(str5, str7, str, z, Boolean.valueOf(z6), strG, Long.valueOf(j2), str10, str8, str9, strValueOf, bool2, bool3, str2, str3, z11, Boolean.valueOf(z12), Boolean.valueOf(z29), Boolean.valueOf(z3), str15, dVarD, cVar2, l2, l3, z41, aVar, str16, str17, Boolean.valueOf(z74), Boolean.valueOf(z54), strA2, strA3, strName, strName2, str18, str19, linkedHashMap, Boolean.valueOf(z83), Boolean.valueOf(z100), Boolean.valueOf(z96), strA4, linkedHashMap3, f0Var.Q);
    }

    public static final l f(i93.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        boolean z = iVar.f159562b;
        boolean z3 = iVar.f159563c;
        i93.l lVar = iVar.d;
        r rVar = null;
        if (lVar != null) {
            Intrinsics.checkNotNullParameter(lVar, "<this>");
            String str = lVar.f159568a.f306286a;
            dj0.d dVar = lVar.f159569b;
            jo3.b bVarA = dVar != null ? hx7.a.A(dVar) : null;
            dj0.d dVar2 = lVar.f159570c;
            rVar = new r(str, bVarA, dVar2 != null ? hx7.a.A(dVar2) : null, lVar.d);
        }
        return new l(z, z3, rVar);
    }
}
