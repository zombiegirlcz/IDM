package o6l;

import b93.j;
import com.revolut.feature.address.models.Address;
import h93.b0;
import h93.c0;
import h93.d0;
import h93.e;
import h93.e0;
import h93.f;
import h93.f0;
import h93.g;
import h93.h;
import h93.i0;
import h93.j0;
import h93.k0;
import h93.l0;
import h93.p;
import h93.r;
import h93.s;
import h93.s0;
import h93.t;
import h93.t0;
import h93.u0;
import i93.i;
import i93.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.LocalDate;
import org.joda.time.format.ISODateTimeFormat;
import p6l.a0;
import p6l.o;
import p6l.q;
import p6l.v;
import p6l.z;
import u6l.k;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {
    public static final Map a(Map map) {
        if (map == null) {
            return r0.g();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            ((Boolean) entry.getValue()).getClass();
            e0.Companion.getClass();
            e0 e0VarA = d0.a(str);
            if (e0VarA != null) {
                linkedHashMap.put(e0VarA, entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    public static final f0 b(q qVar) {
        i93.c cVarC;
        s sVar;
        g gVar;
        e eVar;
        c0 c0VarA;
        String str;
        h93.c cVar;
        c0 c0VarA2;
        j0 j0Var;
        String str2;
        String str3;
        Map linkedHashMap;
        z zVar;
        String str4;
        String str5;
        t0 r0Var;
        a0 details;
        Integer minAge;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        String id10 = qVar.getId();
        String label = qVar.getLabel();
        boolean virtual = qVar.getVirtual();
        Boolean disposable = qVar.getDisposable();
        boolean zBooleanValue = disposable != null ? disposable.booleanValue() : false;
        r rVar = (r) u1.v(qVar.getState(), k.f277675a);
        if (rVar == null) {
            rVar = r.NONE;
        }
        p6l.e settings = qVar.getSettings();
        if (settings != null) {
            cVarC = c(settings);
            sVar = null;
        } else {
            cVarC = null;
            sVar = null;
        }
        j jVar = new j(new b93.b(qVar.getDesign()), qVar.getBrand());
        s sVar2 = sVar;
        String color = qVar.getColor();
        String lastFour = qVar.getLastFour();
        p6l.c dto = qVar.getDelivery();
        Intrinsics.checkNotNullParameter(dto, "<this>");
        Intrinsics.checkNotNullParameter(dto, "dto");
        String deliveryStatus = dto.getDeliveryStatus();
        if (deliveryStatus == null || (gVar = (g) u1.v(deliveryStatus, k.f277677c)) == null) {
            gVar = g.NONE;
        }
        g gVar2 = gVar;
        String trackingChannel = dto.getTrackingChannel();
        s sVar3 = trackingChannel != null ? (s) u1.v(trackingChannel, k.f277676b) : sVar2;
        String trackingLink = dto.getTrackingLink();
        String address = dto.getAddress();
        Boolean deliveryUpdateAllowed = dto.getDeliveryUpdateAllowed();
        no3.b addressDetails = dto.getAddressDetails();
        Address addressA = addressDetails != null ? oo3.a.a(addressDetails) : sVar2;
        String issueDate = dto.getIssueDate();
        LocalDate localDate = issueDate != null ? new LocalDate(issueDate) : sVar2;
        String printDate = dto.getPrintDate();
        LocalDate localDate2 = printDate != null ? new LocalDate(printDate) : sVar2;
        String deliveryDate = dto.getDeliveryDate();
        LocalDate localDate3 = deliveryDate != null ? new LocalDate(deliveryDate) : sVar2;
        p6l.b deliveryDateRange = dto.getDeliveryDateRange();
        f fVar = deliveryDateRange != null ? new f(new LocalDate(deliveryDateRange.getFrom()), new LocalDate(deliveryDateRange.getTo())) : null;
        String eventDate = dto.getEventDate();
        LocalDate localDate4 = eventDate != null ? LocalDate.parse(eventDate, ISODateTimeFormat.dateTimeParser().withZoneUTC()) : null;
        String postedDate = dto.getPostedDate();
        LocalDate localDate5 = postedDate != null ? new LocalDate(postedDate) : null;
        String estimatedPostedDate = dto.getEstimatedPostedDate();
        LocalDate localDate6 = estimatedPostedDate != null ? new LocalDate(estimatedPostedDate) : null;
        String deliveryMethod = dto.getDeliveryMethod();
        String courier = dto.getCourier();
        String localCourier = dto.getLocalCourier();
        Boolean isBulkShipment = dto.getIsBulkShipment();
        boolean zBooleanValue2 = isBulkShipment != null ? isBulkShipment.booleanValue() : false;
        String courierStatus = dto.getCourierStatus();
        if (courierStatus == null || (eVar = (e) u1.v(courierStatus, k.f277678g)) == null) {
            eVar = e.UNKNOWN;
        }
        h hVar = new h(gVar2, sVar3, trackingLink, address, deliveryUpdateAllowed, addressA, localDate, localDate2, localDate3, fVar, localDate4, localDate5, localDate6, deliveryMethod, courier, localCourier, zBooleanValue2, eVar, dto.getLocation(), dto.getLocalisedMessage());
        Long usage = qVar.getUsage();
        long jLongValue = usage != null ? usage.longValue() : -1L;
        String expiryDate = qVar.getExpiryDate();
        LocalDate localDate7 = expiryDate != null ? new LocalDate(expiryDate) : null;
        Boolean replaced = qVar.getReplaced();
        Boolean preExpired = qVar.getPreExpired();
        String stateReason = qVar.getStateReason();
        if (stateReason != null) {
            c0.Companion.getClass();
            c0VarA = b0.a(stateReason);
        } else {
            c0VarA = null;
        }
        String walletId = qVar.getWalletId();
        boolean googlePayEligible = qVar.getGooglePayEligible();
        boolean digitised = qVar.getDigitised();
        Boolean everDigitised = qVar.getEverDigitised();
        boolean zBooleanValue3 = everDigitised != null ? everDigitised.booleanValue() : false;
        Boolean panActivation = qVar.getPanActivation();
        boolean zBooleanValue4 = panActivation != null ? panActivation.booleanValue() : false;
        Long lastUsedDate = qVar.getLastUsedDate();
        Long createdDate = qVar.getCreatedDate();
        boolean customised = qVar.getCustomised();
        o customisation = qVar.getCustomisation();
        if (customisation != null) {
            Intrinsics.checkNotNullParameter(customisation, "<this>");
            t tVar = (t) u1.v(customisation.getStatus(), k.d);
            List rejectionReasons = customisation.getRejectionReasons();
            if (rejectionReasons != null) {
                List list = rejectionReasons;
                arrayList = new ArrayList();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    String str6 = id10;
                    String str7 = label;
                    h93.z zVar2 = (h93.z) u1.v((String) it8.next(), k.e);
                    if (zVar2 != null) {
                        arrayList.add(zVar2);
                    }
                    label = str7;
                    id10 = str6;
                }
            } else {
                arrayList = null;
            }
            str = id10;
            String str8 = label;
            String estimatedReviewDate = customisation.getEstimatedReviewDate();
            LocalDate localDate8 = estimatedReviewDate != null ? new LocalDate(estimatedReviewDate) : null;
            String approvedDate = customisation.getApprovedDate();
            cVar = new h93.c(tVar, arrayList, localDate8, approvedDate != null ? new LocalDate(approvedDate) : null);
            label = str8;
        } else {
            str = id10;
            cVar = null;
        }
        String replacedCardId = qVar.getReplacedCardId();
        String str9 = str;
        String designGroup = qVar.getDesignGroup();
        Boolean cardClickActivationEligible = qVar.getCardClickActivationEligible();
        boolean zBooleanValue5 = cardClickActivationEligible != null ? cardClickActivationEligible.booleanValue() : false;
        Boolean inAppPinChangeEligible = qVar.getInAppPinChangeEligible();
        boolean zBooleanValue6 = inAppPinChangeEligible != null ? inAppPinChangeEligible.booleanValue() : false;
        p pVar = h93.q.Companion;
        String cvvStatus = qVar.getCvvStatus();
        pVar.getClass();
        h93.q qVarA = p.a(cvvStatus);
        h93.q qVarA2 = qVar.getPinStatus() != null ? p.a(qVar.getPinStatus()) : null;
        k0 k0Var = l0.Companion;
        String subProductType = qVar.getSubProductType();
        k0Var.getClass();
        l0 l0VarA = k0.a(subProductType);
        i0 i0Var = j0.Companion;
        String productType = qVar.getProductType();
        i0Var.getClass();
        j0 j0VarA = i0.a(productType);
        String cardName = qVar.getCardName();
        if (cardName == null) {
            m70.a.c(kotlin.jvm.internal.t0.f186434a);
            cardName = "";
        }
        String cardProfileId = qVar.getCardProfileId();
        Map mapA = a(qVar.getTokenizationEligibility());
        Boolean designChangeEligible = qVar.getDesignChangeEligible();
        boolean zBooleanValue7 = designChangeEligible != null ? designChangeEligible.booleanValue() : false;
        Boolean renewable = qVar.getRenewable();
        boolean zBooleanValue8 = renewable != null ? renewable.booleanValue() : false;
        Boolean renewed = qVar.getRenewed();
        boolean zBooleanValue9 = renewed != null ? renewed.booleanValue() : false;
        String replacementReason = qVar.getReplacementReason();
        if (replacementReason != null) {
            c0.Companion.getClass();
            c0VarA2 = b0.a(replacementReason);
        } else {
            c0VarA2 = null;
        }
        Map tokenisationEligibilities = qVar.getTokenisationEligibilities();
        if (tokenisationEligibilities == null) {
            linkedHashMap = r0.g();
            j0Var = j0VarA;
            str2 = cardName;
            str3 = str9;
        } else {
            j0Var = j0VarA;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : tokenisationEligibilities.entrySet()) {
                String str10 = (String) entry.getKey();
                e0.Companion.getClass();
                String str11 = cardName;
                e0 e0VarA = d0.a(str10);
                String str12 = str9;
                if (e0VarA != null) {
                    linkedHashMap2.put(e0VarA, entry.getValue());
                }
                str9 = str12;
                cardName = str11;
            }
            str2 = cardName;
            str3 = str9;
            linkedHashMap = new LinkedHashMap(q0.b(linkedHashMap2.size()));
            Iterator it9 = linkedHashMap2.entrySet().iterator();
            while (it9.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it9.next();
                Object key = entry2.getKey();
                z zVar3 = (z) entry2.getValue();
                Iterator it10 = it9;
                boolean eligible = zVar3.getEligible();
                if (zVar3.getEligible()) {
                    str5 = label;
                    r0Var = null;
                } else {
                    p6l.b0 reason = zVar3.getReason();
                    if (reason != null) {
                        String code = reason.getCode();
                        zVar = zVar3;
                        str4 = code;
                    } else {
                        zVar = zVar3;
                        str4 = null;
                    }
                    str5 = label;
                    boolean zF = Intrinsics.f(str4, "BELOW_MIN_AGE");
                    r0Var = s0.f150161a;
                    if (zF && (details = zVar.getReason().getDetails()) != null && (minAge = details.getMinAge()) != null) {
                        r0Var = new h93.r0(minAge.intValue());
                    }
                }
                linkedHashMap.put(key, new u0(eligible, r0Var));
                it9 = it10;
                label = str5;
            }
        }
        return new f0(str3, label, virtual, zBooleanValue, false, rVar, cVarC, jVar, color, lastFour, hVar, jLongValue, customised, cVar, replacedCardId, designGroup, localDate7, replaced, preExpired, c0VarA, walletId, googlePayEligible, digitised, zBooleanValue3, zBooleanValue4, null, lastUsedDate, createdDate, zBooleanValue5, zBooleanValue6, qVarA, qVarA2, l0VarA, j0Var, str2, cardProfileId, mapA, zBooleanValue7, zBooleanValue8, zBooleanValue9, c0VarA2, linkedHashMap, qVar.getNameless());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0144  */
    /* JADX WARN: Type inference failed for: r8v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final i93.c c(p6l.e r15) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6l.d.c(p6l.e):i93.c");
    }

    public static final i d(v vVar, i93.e type) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        boolean zB = vVar.getEnabled();
        boolean zA = vVar.getEditable();
        p6l.c0 c0VarC = vVar.getTransactionLimit();
        l lVar = null;
        if (c0VarC != null) {
            Intrinsics.checkNotNullParameter(c0VarC, "<this>");
            xi0.a aVar = xi0.b.Companion;
            String currency = c0VarC.getCurrency();
            aVar.getClass();
            xi0.b bVarA = xi0.a.a(currency);
            jo3.a value = c0VarC.getValue();
            dj0.d dVarO = value != null ? mo3.a.o(value) : null;
            jo3.a maxValue = c0VarC.getMaxValue();
            lVar = new l(bVarA, dVarO, maxValue != null ? mo3.a.o(maxValue) : null, c0VarC.getRequired());
        }
        return new i(type, zB, zA, lVar);
    }
}
