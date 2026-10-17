package ofj;

import com.revolut.retail.feature.esim.api.model.EsimAutoRenewalTerms;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPorting;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanPointsOptions;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberCheckoutPhoneNumberFee;
import com.revolut.retail.feature.esim.api.model.EsimPriceBreakdown;
import com.revolut.retail.feature.esim.api.model.EsimTerms;
import dej.c;
import dej.f0;
import dej.g0;
import dej.l2;
import dej.m2;
import dej.v3;
import java.time.Instant;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kfj.a1;
import kfj.c5;
import kfj.e0;
import kfj.m4;
import kfj.p3;
import kfj.r;
import kfj.t0;
import kfj.t2;
import kfj.u0;
import kfj.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.revolut.retail.feature.esim.api.model.EsimCheckoutPorting] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefund] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.time.Instant] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [dej.e] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r16v2, types: [dej.b] */
    /* JADX WARN: Type inference failed for: r17v1, types: [dej.c] */
    /* JADX WARN: Type inference failed for: r18v3, types: [dej.l2] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.time.Period] */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [com.revolut.retail.feature.esim.api.model.EsimMobilePlanPointsOptions] */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [com.revolut.retail.feature.esim.api.model.EsimPhoneNumberCheckoutFee] */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [com.revolut.retail.feature.esim.api.model.EsimPhoneNumberCheckoutFee] */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.time.Instant] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r2v11, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v10, types: [dej.m2] */
    /* JADX WARN: Type inference failed for: r4v12, types: [dej.m2] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [com.revolut.retail.feature.esim.api.model.EsimPhoneNumberCheckoutFee] */
    /* JADX WARN: Type inference failed for: r7v14, types: [com.revolut.retail.feature.esim.api.model.EsimPhoneNumberCheckoutFee] */
    /* JADX WARN: Type inference failed for: r7v6, types: [dej.e[]] */
    public static final dej.a a(kfj.d dVar) throws Throwable {
        dej.h hVar;
        Throwable th10;
        v3 v3Var;
        String str;
        int i;
        ?? esimMobilePlanPointsOptions;
        ?? r23;
        Object esimCheckoutPorting;
        Object obj2;
        Object obj3;
        ?? r142;
        Object bVar;
        Object obj4;
        Object obj5;
        EsimDataPlanOfferInfo esimDataPlanOfferInfo;
        Object l2Var;
        ?? arrayList;
        ?? r4;
        EsimDataPlanOfferInfo esimDataPlanOfferInfo2;
        ?? r152;
        dej.f fVar;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String previousSubscriptionId = dVar.getPreviousSubscriptionId();
        kfj.p offer = dVar.getOffer();
        EsimDataPlanOfferInfo esimDataPlanOfferInfoA = offer != null ? c.a(offer) : null;
        kfj.g selectedMobilePlan = dVar.getSelectedMobilePlan();
        if (selectedMobilePlan != null) {
            Intrinsics.checkNotNullParameter(selectedMobilePlan, "<this>");
            String id10 = selectedMobilePlan.getId();
            String priceConsistency = selectedMobilePlan.getPriceConsistency();
            dej.f[] fVarArrValues = dej.f.values();
            int length = fVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    fVar = null;
                    break;
                }
                fVar = fVarArrValues[i2];
                if (a0.z(fVar.name(), priceConsistency, true)) {
                    break;
                }
                i2++;
            }
            if (fVar == null) {
                fVar = dej.f.MATCHED;
            }
            hVar = new dej.h(id10, fVar);
        } else {
            hVar = null;
        }
        String phoneNumberId = dVar.getPhoneNumberId();
        String phoneNumber = dVar.getPhoneNumber();
        EsimTerms esimTermsH = n14.e.H(dVar.getTerms());
        kfj.a autoRenewal = dVar.getAutoRenewal();
        EsimAutoRenewalTerms esimAutoRenewalTermsF = autoRenewal != null ? knm.b.F(autoRenewal) : null;
        c5 validityDisclaimer = dVar.getValidityDisclaimer();
        if (validityDisclaimer != null) {
            Intrinsics.checkNotNullParameter(validityDisclaimer, "<this>");
            th10 = null;
            v3Var = new v3(validityDisclaimer.getNewSubscription(), validityDisclaimer.getTopUpSubscription(), validityDisclaimer.getEsimNotInstalled(), validityDisclaimer.getIsTopUp());
        } else {
            th10 = null;
            v3Var = null;
        }
        t2 priceBreakdown = dVar.getPriceBreakdown();
        Intrinsics.checkNotNullParameter(priceBreakdown, "<this>");
        dj0.d dVarO = mo3.a.o(priceBreakdown.getPrice());
        String recurringPeriod = priceBreakdown.getRecurringPeriod();
        ?? r192 = recurringPeriod != null ? Period.parse(recurringPeriod) : th10;
        u0 oneOffPointsRedemption = priceBreakdown.getOneOffPointsRedemption();
        if (oneOffPointsRedemption != null) {
            Intrinsics.checkNotNullParameter(oneOffPointsRedemption, "<this>");
            i = 0;
            String token = oneOffPointsRedemption.getToken();
            dj0.d dVarO2 = mo3.a.o(oneOffPointsRedemption.getOriginalPrice());
            List pointsOptions = oneOffPointsRedemption.getPointsOptions();
            str = previousSubscriptionId;
            ArrayList arrayList2 = new ArrayList(w.t(pointsOptions, 10));
            Iterator it8 = pointsOptions.iterator();
            while (it8.hasNext()) {
                arrayList2.add(ksj.b.y((t0) it8.next()));
            }
            esimMobilePlanPointsOptions = new EsimMobilePlanPointsOptions(dVarO2, token, arrayList2);
        } else {
            str = previousSubscriptionId;
            i = 0;
            esimMobilePlanPointsOptions = th10;
        }
        z0 featuredPhoneNumberFee = priceBreakdown.getFeaturedPhoneNumberFee();
        ?? V = featuredPhoneNumberFee != null ? l9.l.v(featuredPhoneNumberFee) : th10;
        z0 planFee = priceBreakdown.getPlanFee();
        ?? V2 = planFee != null ? l9.l.v(planFee) : th10;
        List phoneNumbers = priceBreakdown.getPhoneNumbers();
        if (phoneNumbers != null) {
            List<a1> list = phoneNumbers;
            ArrayList arrayList3 = new ArrayList(w.t(list, 10));
            for (a1 a1Var : list) {
                Intrinsics.checkNotNullParameter(a1Var, "<this>");
                z0 fee2 = a1Var.getFee();
                arrayList3.add(new EsimPhoneNumberCheckoutPhoneNumberFee(fee2 != null ? l9.l.v(fee2) : th10));
            }
            r23 = arrayList3;
        } else {
            r23 = th10;
        }
        Long nextInvoiceDueDate = priceBreakdown.getNextInvoiceDueDate();
        EsimPriceBreakdown esimPriceBreakdown = new EsimPriceBreakdown(dVarO, r192, esimMobilePlanPointsOptions, V, V2, r23, nextInvoiceDueDate != null ? Instant.ofEpochMilli(nextInvoiceDueDate.longValue()) : th10);
        kfj.e porting = dVar.getPorting();
        if (porting != null) {
            Intrinsics.checkNotNullParameter(porting, "<this>");
            esimCheckoutPorting = new EsimCheckoutPorting(ifk.b.v(porting.getTransferSteps()));
        } else {
            esimCheckoutPorting = th10;
        }
        m4 refund = dVar.getRefund();
        ?? A = refund != null ? n.a(refund) : th10;
        Long activationDate = dVar.getActivationDate();
        Object objOfEpochMilli = activationDate != null ? Instant.ofEpochMilli(activationDate.longValue()) : th10;
        String planChangeType = dVar.getPlanChangeType();
        if (planChangeType != null) {
            ?? Values = dej.e.values();
            int length2 = Values.length;
            int i3 = i;
            while (true) {
                if (i3 >= length2) {
                    obj2 = objOfEpochMilli;
                    obj3 = esimCheckoutPorting;
                    r152 = th10;
                    break;
                }
                r152 = Values[i3];
                obj2 = objOfEpochMilli;
                obj3 = esimCheckoutPorting;
                if (a0.z(r152.name(), planChangeType, true)) {
                    break;
                }
                i3++;
                objOfEpochMilli = obj2;
                esimCheckoutPorting = obj3;
            }
            r142 = r152;
        } else {
            obj2 = objOfEpochMilli;
            obj3 = esimCheckoutPorting;
            r142 = th10;
        }
        String simProfileId = dVar.getSimProfileId();
        kfj.c additionalInformation = dVar.getAdditionalInformation();
        if (additionalInformation != null) {
            Intrinsics.checkNotNullParameter(additionalInformation, "<this>");
            bVar = new dej.b(additionalInformation.getTitle(), additionalInformation.getDescription());
        } else {
            bVar = th10;
        }
        String orderFulfillmentMode = dVar.getOrderFulfillmentMode();
        Object dVar2 = orderFulfillmentMode != null ? orderFulfillmentMode.equals("FLEXIBLE_START") ? c.a.f113503a : new dej.d(orderFulfillmentMode) : th10;
        p3 dataUsageDescription = dVar.getDataUsageDescription();
        if (dataUsageDescription != null) {
            e0 content = dataUsageDescription.getContent();
            String text = content.getText();
            List<r> descriptors = content.getDescriptors();
            obj4 = bVar;
            ArrayList arrayList4 = new ArrayList();
            for (r rVar : descriptors) {
                Object obj6 = dVar2;
                String text2 = rVar.getText();
                p3 p3Var = dataUsageDescription;
                if (rVar.getAction() != null) {
                    f0[] f0VarArrValues = f0.values();
                    esimDataPlanOfferInfo2 = esimDataPlanOfferInfoA;
                    if (f0VarArrValues.length > 0) {
                        f0 f0Var = f0VarArrValues[i];
                        throw th10;
                    }
                } else {
                    esimDataPlanOfferInfo2 = esimDataPlanOfferInfoA;
                }
                String url2 = rVar.getUrl();
                Object descriptor = url2 != null ? new EsimHyperText.Descriptor(text2, new EsimDescriptorValue.Link(url2)) : th10;
                if (descriptor != null) {
                    arrayList4.add(descriptor);
                }
                dataUsageDescription = p3Var;
                dVar2 = obj6;
                esimDataPlanOfferInfoA = esimDataPlanOfferInfo2;
            }
            obj5 = dVar2;
            p3 p3Var2 = dataUsageDescription;
            esimDataPlanOfferInfo = esimDataPlanOfferInfoA;
            List<String> parameters = content.getParameters();
            if (parameters != null) {
                arrayList = new ArrayList();
                for (String str2 : parameters) {
                    g0[] g0VarArrValues = g0.values();
                    if (g0VarArrValues.length > 0) {
                        g0 g0Var = g0VarArrValues[i];
                        throw th10;
                    }
                }
            } else {
                arrayList = th10;
            }
            if (arrayList == 0) {
                arrayList = zhm.f0.f322471a;
            }
            EsimHyperText esimHyperText = new EsimHyperText(text, arrayList4, arrayList);
            String icon = p3Var2.getIcon();
            String severity = p3Var2.getSeverity();
            m2[] m2VarArrValues = m2.values();
            int length3 = m2VarArrValues.length;
            int i5 = i;
            while (true) {
                if (i5 >= length3) {
                    r4 = th10;
                    break;
                }
                m2 m2Var = m2VarArrValues[i5];
                m2[] m2VarArr = m2VarArrValues;
                int i6 = length3;
                if (a0.z(m2Var.name(), severity, true)) {
                    r4 = m2Var;
                    break;
                }
                i5++;
                m2VarArrValues = m2VarArr;
                length3 = i6;
            }
            if (r4 == 0) {
                r4 = m2.UNKNOWN;
            }
            l2Var = new l2(esimHyperText, icon, r4);
        } else {
            obj4 = bVar;
            obj5 = dVar2;
            esimDataPlanOfferInfo = esimDataPlanOfferInfoA;
            l2Var = th10;
        }
        return new dej.a(str, esimDataPlanOfferInfo, hVar, phoneNumberId, phoneNumber, esimTermsH, esimAutoRenewalTermsF, v3Var, esimPriceBreakdown, obj3, A, obj2, r142, simProfileId, obj4, obj5, l2Var);
    }
}
