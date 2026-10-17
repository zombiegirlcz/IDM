package ft6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceCustomerDetails;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceItemPayload;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceNumberData;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceRecurringPeriod;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceStatusDetails;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSupplierDetails;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceTax;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceTaxRate;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceUpdate;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceUpdateItem;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerRecurringSchedule;
import com.revolut.feature.freelancer.common.models.invoices.InvoiceMethodsDetails;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplateOverride;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.a0;
import ks6.b0;
import ks6.c0;
import ks6.e0;
import ks6.g0;
import ks6.n0;
import ks6.x;
import ks6.y;
import ks6.z;
import le.u1;
import org.joda.time.DateTime;
import r9d.b;
import r9d.c;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static final LinkedHashMap a(sr6.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("type", kVar.f265130a ? "recurring" : null);
        linkedHashMap.put("limit", null);
        linkedHashMap.put("from", null);
        linkedHashMap.put("to", null);
        sr6.j jVar = kVar.f265131b;
        linkedHashMap.put("filters", jVar != null ? jVar.name() : null);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((String) entry.getValue()) != null) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap2;
    }

    public static final Map b() {
        return r0.k(new Pair("BANK_TRANSFER", sr6.i.BANK_TRANSFER), new Pair("CARD", sr6.i.CARD), new Pair("PAY_WITH_REVOLUT", sr6.i.PAY_WITH_REVOLUT), new Pair("OPEN_BANKING", sr6.i.OPEN_BANKING), new Pair("CLICK_TO_PAY", sr6.i.CLICK_TO_PAY), new Pair("UNKNOWN", sr6.i.UNKNOWN));
    }

    public static final Map c() {
        return r0.k(new Pair("DRAFT", sr6.n.DRAFT), new Pair("SENT", sr6.n.SENT), new Pair("PROCESSING", sr6.n.PROCESSING), new Pair("PAID", sr6.n.PAID), new Pair("CANCELLED", sr6.n.CANCELLED), new Pair("ACTIVE", sr6.n.ACTIVE), new Pair("COMPLETED", sr6.n.COMPLETED), new Pair("EXPIRED", sr6.n.EXPIRED));
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice d(ks6.x r42) {
        /*
            Method dump skipped, instruction units count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ft6.h.d(ks6.x):com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice");
    }

    public static final FreelancerInvoice e(qt6.b bVar) {
        String str;
        FreelancerInvoiceCustomerDetails freelancerInvoiceCustomerDetails;
        FreelancerInvoiceSupplierDetails freelancerInvoiceSupplierDetails;
        FreelancerInvoiceCustomerDetails freelancerInvoiceCustomerDetails2;
        String str2;
        String str3;
        String str4;
        FreelancerInvoiceStatusDetails freelancerInvoiceStatusDetails;
        String str5;
        FreelancerRecurringSchedule freelancerRecurringSchedule;
        InvoiceTemplateOverride invoiceTemplateOverride;
        u9d.b bVarA;
        r9d.c cVar;
        ArrayList arrayList;
        FreelancerInvoiceRecurringPeriod freelancerInvoiceRecurringPeriodO;
        sr6.h hVar;
        FreelancerInvoiceItemPayload freelancerInvoiceItemPayload;
        sr6.m mVar;
        FreelancerInvoiceStatusDetails freelancerInvoiceStatusDetails2;
        sr6.i iVar;
        DateTime dateTime;
        DateTime dateTime2;
        String str6 = "<this>";
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String strI = bVar.getId();
        String strL = bVar.getNumber();
        String strM = bVar.getNumberFormatted();
        String strN = bVar.getNumberPrefix();
        Long lQ = bVar.getSaleDate();
        DateTime dateTime3 = lQ != null ? new DateTime(lQ.longValue()) : null;
        Long lJ = bVar.getIssueDate();
        DateTime dateTime4 = lJ != null ? new DateTime(lJ.longValue()) : null;
        Long lF = bVar.getDueDate();
        DateTime dateTime5 = lF != null ? new DateTime(lF.longValue()) : null;
        sr6.n nVar = (sr6.n) u1.u(bVar.getStatus(), c());
        DateTime dateTime6 = dateTime4;
        xi0.b bVar2 = new xi0.b(6, bVar.getCurrency(), null);
        dj0.d dVarO = mo3.a.o(bVar.getTotal());
        dj0.d dVarO2 = mo3.a.o(bVar.getSubtotal());
        dj0.d dVarO3 = mo3.a.o(bVar.getTotalTax());
        String strD = bVar.getCustomerId();
        qt6.a aVarC = bVar.getCustomerDetails();
        if (aVarC != null) {
            Intrinsics.checkNotNullParameter(aVarC, "<this>");
            str = strI;
            freelancerInvoiceCustomerDetails = new FreelancerInvoiceCustomerDetails(aVarC.getName(), aVarC.getEmail());
        } else {
            str = strI;
            freelancerInvoiceCustomerDetails = null;
        }
        qt6.j jVarU = bVar.getSupplierDetails();
        if (jVarU != null) {
            Intrinsics.checkNotNullParameter(jVarU, "<this>");
            freelancerInvoiceSupplierDetails = new FreelancerInvoiceSupplierDetails(jVarU.getVatNumber());
        } else {
            freelancerInvoiceSupplierDetails = null;
        }
        qt6.i iVarS = bVar.getStatusDetails();
        if (iVarS != null) {
            Intrinsics.checkNotNullParameter(iVarS, "<this>");
            freelancerInvoiceCustomerDetails2 = freelancerInvoiceCustomerDetails;
            DateTime dateTime7 = new DateTime(iVarS.getCreatedDate());
            str2 = strL;
            DateTime dateTime8 = new DateTime(iVarS.getUpdatedDate());
            Long paidDate = iVarS.getPaidDate();
            if (paidDate != null) {
                str3 = strM;
                dateTime = new DateTime(paidDate.longValue());
            } else {
                str3 = strM;
                dateTime = null;
            }
            Long sentDate = iVarS.getSentDate();
            if (sentDate != null) {
                str4 = strN;
                dateTime2 = new DateTime(sentDate.longValue());
            } else {
                str4 = strN;
                dateTime2 = null;
            }
            freelancerInvoiceStatusDetails = new FreelancerInvoiceStatusDetails(dateTime7, dateTime8, dateTime, dateTime2);
        } else {
            freelancerInvoiceCustomerDetails2 = freelancerInvoiceCustomerDetails;
            str2 = strL;
            str3 = strM;
            str4 = strN;
            freelancerInvoiceStatusDetails = null;
        }
        List listG = bVar.getEnabledPaymentMethods();
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = listG.iterator();
        while (it8.hasNext()) {
            String str7 = (String) it8.next();
            sr6.i[] iVarArrValues = sr6.i.values();
            int length = iVarArrValues.length;
            Iterator it9 = it8;
            int i = 0;
            while (true) {
                if (i >= length) {
                    freelancerInvoiceStatusDetails2 = freelancerInvoiceStatusDetails;
                    iVar = null;
                    break;
                }
                sr6.i iVar2 = iVarArrValues[i];
                int i2 = i;
                freelancerInvoiceStatusDetails2 = freelancerInvoiceStatusDetails;
                if (a0.z(iVar2.name(), str7, true)) {
                    iVar = iVar2;
                    break;
                }
                i = i2 + 1;
                freelancerInvoiceStatusDetails = freelancerInvoiceStatusDetails2;
            }
            if (iVar != null) {
                arrayList2.add(iVar);
            }
            it8 = it9;
            freelancerInvoiceStatusDetails = freelancerInvoiceStatusDetails2;
        }
        FreelancerInvoiceStatusDetails freelancerInvoiceStatusDetails3 = freelancerInvoiceStatusDetails;
        List listH = bVar.getEnabledReminders();
        if (listH == null) {
            listH = f0.f322471a;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it10 = listH.iterator();
        while (it10.hasNext()) {
            String scheduleOption = ((qt6.e) it10.next()).getScheduleOption();
            sr6.m[] mVarArrValues = sr6.m.values();
            int length2 = mVarArrValues.length;
            Iterator it11 = it10;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    mVar = null;
                    break;
                }
                sr6.m mVar2 = mVarArrValues[i3];
                int i5 = i3;
                sr6.m[] mVarArr = mVarArrValues;
                if (a0.z(mVar2.name(), scheduleOption, true)) {
                    mVar = mVar2;
                    break;
                }
                i3 = i5 + 1;
                mVarArrValues = mVarArr;
            }
            if (mVar != null) {
                arrayList3.add(mVar);
            }
            it10 = it11;
        }
        List listV = bVar.getTaxes();
        ArrayList arrayList4 = new ArrayList(zhm.w.t(listV, 10));
        for (Iterator it12 = listV.iterator(); it12.hasNext(); it12 = it12) {
            qt6.k kVar = (qt6.k) it12.next();
            Intrinsics.checkNotNullParameter(kVar, "<this>");
            arrayList4.add(new FreelancerInvoiceTax(h(kVar.getRate()), mo3.a.o(kVar.getAmount())));
        }
        List listK = bVar.getItems();
        ArrayList arrayList5 = new ArrayList();
        Iterator it13 = listK.iterator();
        while (it13.hasNext()) {
            qt6.c cVar2 = (qt6.c) it13.next();
            Intrinsics.checkNotNullParameter(cVar2, "<this>");
            String strA = cVar2.getId();
            String strB = cVar2.getName();
            Iterator it14 = it13;
            String strG = cVar2.getUnitName();
            ArrayList arrayList6 = arrayList3;
            sr6.h[] hVarArrValues = sr6.h.values();
            ArrayList arrayList7 = arrayList4;
            int length3 = hVarArrValues.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length3) {
                    hVar = null;
                    break;
                }
                hVar = hVarArrValues[i6];
                int i21 = i6;
                int i22 = length3;
                if (a0.z(hVar.name(), strG, true)) {
                    break;
                }
                i6 = i21 + 1;
                length3 = i22;
            }
            if (hVar == null) {
                freelancerInvoiceItemPayload = null;
            } else {
                double dI = cVar2.getUnitQuantity();
                dj0.d dVarO4 = mo3.a.o(cVar2.getUnitPrice());
                dj0.d dVarO5 = mo3.a.o(cVar2.getTotal());
                dj0.d dVarO6 = mo3.a.o(cVar2.getSubtotal());
                dj0.d dVarO7 = mo3.a.o(cVar2.getTotalTax());
                List listD = cVar2.getTaxes();
                ArrayList arrayList8 = new ArrayList(zhm.w.t(listD, 10));
                for (Iterator it15 = listD.iterator(); it15.hasNext(); it15 = it15) {
                    qt6.k kVar2 = (qt6.k) it15.next();
                    Intrinsics.checkNotNullParameter(kVar2, "<this>");
                    arrayList8.add(new FreelancerInvoiceTax(h(kVar2.getRate()), mo3.a.o(kVar2.getAmount())));
                }
                freelancerInvoiceItemPayload = new FreelancerInvoiceItemPayload(strA, strB, hVar, dI, dVarO4, dVarO5, dVarO6, dVarO7, arrayList8);
            }
            if (freelancerInvoiceItemPayload != null) {
                arrayList5.add(freelancerInvoiceItemPayload);
            }
            it13 = it14;
            arrayList3 = arrayList6;
            arrayList4 = arrayList7;
        }
        ArrayList arrayList9 = arrayList3;
        ArrayList arrayList10 = arrayList4;
        String strA2 = bVar.getAdditionalNote();
        String strE = bVar.getCustomerMessage();
        String strO = bVar.getRecurringInvoiceId();
        qt6.q qVarP = bVar.getRecurringSchedule();
        if (qVarP != null) {
            Intrinsics.checkNotNullParameter(qVarP, "<this>");
            long startDate = qVarP.getStartDate();
            ZoneId zoneId = g0m.a.f139502a;
            LocalDate localDateH = oc.c.H(startDate, zoneId);
            Long endDate = qVarP.getEndDate();
            LocalDate localDateH2 = endDate != null ? oc.c.H(endDate.longValue(), zoneId) : null;
            String period = qVarP.getPeriod();
            if (period == null || (freelancerInvoiceRecurringPeriodO = o(period)) == null) {
                freelancerRecurringSchedule = null;
            } else {
                Integer remainingCount = qVarP.getRemainingCount();
                Integer invoicesSent = qVarP.getInvoicesSent();
                int dueDateOffset = qVarP.getDueDateOffset();
                int saleDateOffset = qVarP.getSaleDateOffset();
                Long nextScheduledFor = qVarP.getNextScheduledFor();
                LocalDate localDateH3 = nextScheduledFor != null ? oc.c.H(nextScheduledFor.longValue(), zoneId) : null;
                Long calculatedEndDate = qVarP.getCalculatedEndDate();
                freelancerRecurringSchedule = new FreelancerRecurringSchedule(localDateH, freelancerInvoiceRecurringPeriodO, localDateH2, remainingCount, invoicesSent, dueDateOffset, saleDateOffset, localDateH3, calculatedEndDate != null ? oc.c.H(calculatedEndDate.longValue(), zoneId) : null);
            }
            str5 = strA2;
        } else {
            str5 = strA2;
            freelancerRecurringSchedule = null;
        }
        String strW = bVar.getTemplateId();
        r9d.c cVarX = bVar.getTemplateOverride();
        if (cVarX != null) {
            Intrinsics.checkNotNullParameter(cVarX, "<this>");
            String locale = cVarX.getLocale();
            if (locale != null) {
                u9d.b.Companion.getClass();
                bVarA = u9d.a.a(locale);
            } else {
                bVarA = null;
            }
            String invoiceTitle = cVarX.getInvoiceTitle();
            List customFields = cVarX.getCustomFields();
            if (customFields != null) {
                List list = customFields;
                cVar = cVarX;
                ArrayList arrayList11 = new ArrayList(zhm.w.t(list, 10));
                for (Iterator it16 = list.iterator(); it16.hasNext(); it16 = it16) {
                    b.C1393b c1393b = (b.C1393b) it16.next();
                    Intrinsics.checkNotNullParameter(c1393b, str6);
                    arrayList11.add(new InvoiceTemplate.CustomField(c1393b.getName(), c1393b.getValue()));
                    str6 = str6;
                }
                arrayList = arrayList11;
            } else {
                cVar = cVarX;
                arrayList = null;
            }
            c.b header = cVar.getHeader();
            InvoiceTemplateOverride.Value valueA = header != null ? s9d.b.a(header) : null;
            c.b footer = cVar.getFooter();
            invoiceTemplateOverride = new InvoiceTemplateOverride(bVarA, invoiceTitle, arrayList, valueA, footer != null ? s9d.b.a(footer) : null);
        } else {
            invoiceTemplateOverride = null;
        }
        return new FreelancerInvoice(str, str2, str3, str4, dateTime3, dateTime6, dateTime5, nVar, bVar2, dVarO, dVarO2, dVarO3, strD, arrayList2, arrayList9, freelancerInvoiceCustomerDetails2, freelancerInvoiceSupplierDetails, freelancerInvoiceStatusDetails3, arrayList10, arrayList5, str5, strE, strO, freelancerRecurringSchedule, strW, invoiceTemplateOverride);
    }

    public static final FreelancerInvoiceSettings f(qt6.f fVar) {
        sr6.a aVar;
        sr6.a aVar2;
        sr6.b bVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        xi0.b bVarA;
        sr6.i iVar;
        sr6.m mVar;
        InvoiceMethodsDetails invoiceMethodsDetails;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        List<qt6.d> paymentMethodsDetails = fVar.getPaymentMethodsDetails();
        ArrayList arrayList3 = new ArrayList();
        for (qt6.d dVar : paymentMethodsDetails) {
            sr6.i iVar2 = (sr6.i) u1.v(dVar.getPaymentMethod(), b());
            if (iVar2 != null) {
                String status = dVar.getStatus();
                Pair pair = new Pair("ACTIVE", sr6.o.ACTIVE);
                Pair pair2 = new Pair("PENDING", sr6.o.PENDING);
                Pair pair3 = new Pair("AVAILABLE", sr6.o.AVAILABLE);
                sr6.o oVar = sr6.o.UNAVAILABLE;
                sr6.o oVar2 = (sr6.o) u1.v(status, r0.k(pair, pair2, pair3, new Pair("UNAVAILABLE", oVar)));
                if (oVar2 != null) {
                    oVar = oVar2;
                }
                invoiceMethodsDetails = new InvoiceMethodsDetails(iVar2, oVar);
            } else {
                invoiceMethodsDetails = null;
            }
            if (invoiceMethodsDetails != null) {
                arrayList3.add(invoiceMethodsDetails);
            }
        }
        String defaultIssueDate = fVar.getDefaultIssueDate();
        if (defaultIssueDate != null) {
            sr6.a[] aVarArrValues = sr6.a.values();
            int length = aVarArrValues.length;
            for (int i = 0; i < length; i++) {
                aVar = aVarArrValues[i];
                if (a0.z(aVar.name(), defaultIssueDate, true)) {
                    break;
                }
            }
            aVar = null;
        } else {
            aVar = null;
        }
        String defaultSaleDate = fVar.getDefaultSaleDate();
        if (defaultSaleDate != null) {
            sr6.a[] aVarArrValues2 = sr6.a.values();
            int length2 = aVarArrValues2.length;
            for (int i2 = 0; i2 < length2; i2++) {
                aVar2 = aVarArrValues2[i2];
                if (a0.z(aVar2.name(), defaultSaleDate, true)) {
                    break;
                }
            }
            aVar2 = null;
        } else {
            aVar2 = null;
        }
        String defaultDueDate = fVar.getDefaultDueDate();
        if (defaultDueDate != null) {
            sr6.b[] bVarArrValues = sr6.b.values();
            int length3 = bVarArrValues.length;
            for (int i3 = 0; i3 < length3; i3++) {
                bVar = bVarArrValues[i3];
                if (a0.z(bVar.name(), defaultDueDate, true)) {
                    break;
                }
            }
            bVar = null;
        } else {
            bVar = null;
        }
        String defaultAdditionalNote = fVar.getDefaultAdditionalNote();
        List defaultReminders = fVar.getDefaultReminders();
        if (defaultReminders != null) {
            arrayList = new ArrayList();
            Iterator it8 = defaultReminders.iterator();
            while (it8.hasNext()) {
                String scheduleOption = ((qt6.g) it8.next()).getScheduleOption();
                if (scheduleOption != null) {
                    sr6.m[] mVarArrValues = sr6.m.values();
                    int length4 = mVarArrValues.length;
                    for (int i5 = 0; i5 < length4; i5++) {
                        mVar = mVarArrValues[i5];
                        if (a0.z(mVar.name(), scheduleOption, true)) {
                            break;
                        }
                    }
                    mVar = null;
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    arrayList.add(mVar);
                }
            }
        } else {
            arrayList = null;
        }
        List defaultPaymentMethods = fVar.getDefaultPaymentMethods();
        if (defaultPaymentMethods != null) {
            List<String> list = defaultPaymentMethods;
            ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
            for (String str : list) {
                sr6.i[] iVarArrValues = sr6.i.values();
                int length5 = iVarArrValues.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length5) {
                        iVar = null;
                        break;
                    }
                    iVar = iVarArrValues[i6];
                    if (a0.z(iVar.name(), str, true)) {
                        break;
                    }
                    i6++;
                }
                if (iVar == null) {
                    iVar = sr6.i.UNKNOWN;
                }
                arrayList4.add(iVar);
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        sr6.a aVar3 = aVar;
        String defaultInvoicePrefix = fVar.getDefaultInvoicePrefix();
        sr6.a aVar4 = aVar2;
        Integer defaultInvoiceNumber = fVar.getDefaultInvoiceNumber();
        sr6.b bVar2 = bVar;
        Boolean logoEnabled = fVar.getLogoEnabled();
        String defaultRecurringPeriod = fVar.getDefaultRecurringPeriod();
        FreelancerInvoiceRecurringPeriod freelancerInvoiceRecurringPeriodO = defaultRecurringPeriod != null ? o(defaultRecurringPeriod) : null;
        Integer defaultRecurringLimit = fVar.getDefaultRecurringLimit();
        String defaultCustomerMessage = fVar.getDefaultCustomerMessage();
        String defaultCurrency = fVar.getDefaultCurrency();
        if (defaultCurrency != null) {
            xi0.b.Companion.getClass();
            bVarA = xi0.a.a(defaultCurrency);
        } else {
            bVarA = null;
        }
        return new FreelancerInvoiceSettings(arrayList3, aVar3, aVar4, bVar2, defaultAdditionalNote, arrayList, arrayList2, defaultInvoicePrefix, defaultInvoiceNumber, logoEnabled, freelancerInvoiceRecurringPeriodO, defaultRecurringLimit, defaultCustomerMessage, bVarA);
    }

    public static final FreelancerInvoiceTax g(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        c0 rate = b0Var.getRate();
        Intrinsics.checkNotNullParameter(rate, "<this>");
        return new FreelancerInvoiceTax(new FreelancerInvoiceTaxRate(rate.getPercentage(), rate.getId(), rate.getName()), hx7.a.v(b0Var.getAmount()));
    }

    public static final FreelancerInvoiceTaxRate h(qt6.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return new FreelancerInvoiceTaxRate(lVar.getPercentage(), lVar.getId(), lVar.getName());
    }

    public static final InvoiceTemplateOverride.Value i(g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        String action = g0Var.getAction();
        u9d.c cVar = null;
        if (action != null) {
            u9d.c[] cVarArrValues = u9d.c.values();
            int length = cVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                u9d.c cVar2 = cVarArrValues[i];
                if (a0.z(cVar2.name(), action, true)) {
                    cVar = cVar2;
                    break;
                }
                i++;
            }
        }
        return new InvoiceTemplateOverride.Value(cVar, g0Var.getValue());
    }

    public static final qt6.n j(FreelancerInvoiceUpdate freelancerInvoiceUpdate) {
        qt6.p pVar;
        String str;
        qt6.q qVar;
        String str2;
        r9d.c cVar;
        String str3;
        ArrayList arrayList;
        c.b bVar;
        c.b bVar2;
        Intrinsics.checkNotNullParameter(freelancerInvoiceUpdate, "<this>");
        DateTime dateTime = freelancerInvoiceUpdate.f73423a;
        Long lValueOf = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
        DateTime dateTime2 = freelancerInvoiceUpdate.f73425c;
        Long lValueOf2 = dateTime2 != null ? Long.valueOf(dateTime2.getMillis()) : null;
        DateTime dateTime3 = freelancerInvoiceUpdate.f73424b;
        Long lValueOf3 = dateTime3 != null ? Long.valueOf(dateTime3.getMillis()) : null;
        String str4 = freelancerInvoiceUpdate.d.f306286a;
        String str5 = freelancerInvoiceUpdate.e;
        FreelancerInvoiceSupplierDetails freelancerInvoiceSupplierDetails = freelancerInvoiceUpdate.f;
        if (freelancerInvoiceSupplierDetails != null) {
            Intrinsics.checkNotNullParameter(freelancerInvoiceSupplierDetails, "<this>");
            pVar = new qt6.p(freelancerInvoiceSupplierDetails.f73415a);
        } else {
            pVar = new qt6.p(null);
        }
        qt6.p pVar2 = pVar;
        List list = freelancerInvoiceUpdate.f73426g;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList2.add(u1.g((sr6.i) it8.next(), b()));
        }
        List list2 = freelancerInvoiceUpdate.f73427h;
        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            arrayList3.add(new qt6.e(((sr6.m) it9.next()).name()));
        }
        ArrayList arrayList4 = freelancerInvoiceUpdate.i;
        ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
        Iterator it10 = arrayList4.iterator();
        while (it10.hasNext()) {
            arrayList5.add(k((FreelancerInvoiceUpdateItem) it10.next()));
        }
        String str6 = freelancerInvoiceUpdate.f73428j;
        FreelancerInvoiceNumberData freelancerInvoiceNumberData = freelancerInvoiceUpdate.k;
        String str7 = freelancerInvoiceNumberData != null ? freelancerInvoiceNumberData.f73398a : null;
        String str8 = freelancerInvoiceNumberData != null ? freelancerInvoiceNumberData.f73399b : null;
        String str9 = freelancerInvoiceUpdate.f73429l;
        String str10 = freelancerInvoiceUpdate.f73430m;
        FreelancerRecurringSchedule freelancerRecurringSchedule = freelancerInvoiceUpdate.o;
        if (freelancerRecurringSchedule != null) {
            Intrinsics.checkNotNullParameter(freelancerRecurringSchedule, "<this>");
            str = str8;
            long jN = oc.c.N(freelancerRecurringSchedule.f73435a);
            LocalDate localDate = freelancerRecurringSchedule.f73437c;
            Long lValueOf4 = localDate != null ? Long.valueOf(oc.c.N(localDate)) : null;
            String strL = l(freelancerRecurringSchedule.f73436b);
            Integer num = freelancerRecurringSchedule.d;
            Integer num2 = freelancerRecurringSchedule.e;
            int i = freelancerRecurringSchedule.f;
            int i2 = freelancerRecurringSchedule.f73438g;
            LocalDate localDate2 = freelancerRecurringSchedule.f73439h;
            Long lValueOf5 = localDate2 != null ? Long.valueOf(oc.c.N(localDate2)) : null;
            LocalDate localDate3 = freelancerRecurringSchedule.i;
            qVar = new qt6.q(jN, lValueOf4, strL, num, num2, i, i2, lValueOf5, localDate3 != null ? Long.valueOf(oc.c.N(localDate3)) : null);
        } else {
            str = str8;
            qVar = null;
        }
        InvoiceTemplateOverride invoiceTemplateOverride = freelancerInvoiceUpdate.f73431n;
        if (invoiceTemplateOverride != null) {
            Intrinsics.checkNotNullParameter(invoiceTemplateOverride, "<this>");
            u9d.b bVar3 = invoiceTemplateOverride.f86410a;
            String code = bVar3 != null ? bVar3.getCode() : null;
            String str11 = invoiceTemplateOverride.f86411b;
            List list3 = invoiceTemplateOverride.f86412c;
            if (list3 != null) {
                List list4 = list3;
                str3 = str11;
                str2 = str10;
                ArrayList arrayList6 = new ArrayList(zhm.w.t(list4, 10));
                Iterator it11 = list4.iterator();
                while (it11.hasNext()) {
                    arrayList6.add(s9d.a.a((InvoiceTemplate.CustomField) it11.next()));
                }
                arrayList = arrayList6;
            } else {
                str3 = str11;
                str2 = str10;
                arrayList = null;
            }
            InvoiceTemplateOverride.Value value = invoiceTemplateOverride.d;
            if (value != null) {
                Intrinsics.checkNotNullParameter(value, "<this>");
                u9d.c cVar2 = value.f86413a;
                bVar = cVar2 != null ? new c.b(cVar2.name(), value.f86414b) : null;
            } else {
                bVar = null;
            }
            InvoiceTemplateOverride.Value value2 = invoiceTemplateOverride.e;
            if (value2 != null) {
                Intrinsics.checkNotNullParameter(value2, "<this>");
                u9d.c cVar3 = value2.f86413a;
                bVar2 = cVar3 != null ? new c.b(cVar3.name(), value2.f86414b) : null;
            } else {
                bVar2 = null;
            }
            cVar = new r9d.c(code, str3, arrayList, bVar, bVar2);
        } else {
            str2 = str10;
            cVar = null;
        }
        return new qt6.n(str, str7, lValueOf3, lValueOf, lValueOf2, str4, str5, str9, arrayList5, str6, arrayList2, arrayList3, qVar, pVar2, str2, cVar);
    }

    public static final qt6.o k(FreelancerInvoiceUpdateItem freelancerInvoiceUpdateItem) {
        Intrinsics.checkNotNullParameter(freelancerInvoiceUpdateItem, "<this>");
        return new qt6.o(freelancerInvoiceUpdateItem.f73432a, freelancerInvoiceUpdateItem.f73433b, freelancerInvoiceUpdateItem.f73434c, mo3.a.p(freelancerInvoiceUpdateItem.d), freelancerInvoiceUpdateItem.e);
    }

    public static final String l(FreelancerInvoiceRecurringPeriod freelancerInvoiceRecurringPeriod) {
        String str;
        int i = g.f137946a[freelancerInvoiceRecurringPeriod.f73401a.ordinal()];
        if (i == 1) {
            str = "Y";
        } else if (i == 2) {
            str = "M";
        } else if (i == 3) {
            str = "W";
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "D";
        }
        return j6.a.l(freelancerInvoiceRecurringPeriod.f73402b, "P", str);
    }

    public static final x m(FreelancerInvoice freelancerInvoice, String str) {
        String str2;
        String str3;
        ks6.w wVar;
        ks6.a0 a0Var;
        ks6.w wVar2;
        z zVar;
        String str4;
        n0 n0Var;
        String str5;
        String str6;
        ArrayList arrayList;
        String str7;
        ks6.f0 f0Var;
        ArrayList arrayList2;
        g0 g0Var;
        g0 g0Var2;
        Intrinsics.checkNotNullParameter(freelancerInvoice, "<this>");
        String str8 = freelancerInvoice.f73374a;
        String str9 = freelancerInvoice.f73375b;
        String str10 = freelancerInvoice.f73376c;
        String str11 = freelancerInvoice.d;
        DateTime dateTime = freelancerInvoice.e;
        Long lValueOf = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
        DateTime dateTime2 = freelancerInvoice.f;
        Long lValueOf2 = dateTime2 != null ? Long.valueOf(dateTime2.getMillis()) : null;
        DateTime dateTime3 = freelancerInvoice.f73377g;
        Long lValueOf3 = dateTime3 != null ? Long.valueOf(dateTime3.getMillis()) : null;
        String strG = u1.g(freelancerInvoice.f73378h, c());
        String str12 = freelancerInvoice.i.f306286a;
        jo3.b bVarA = hx7.a.A(freelancerInvoice.f73379j);
        jo3.b bVarA2 = hx7.a.A(freelancerInvoice.k);
        jo3.b bVarA3 = hx7.a.A(freelancerInvoice.f73380l);
        String str13 = freelancerInvoice.f73381m;
        FreelancerInvoiceCustomerDetails freelancerInvoiceCustomerDetails = freelancerInvoice.f73383p;
        if (freelancerInvoiceCustomerDetails != null) {
            Intrinsics.checkNotNullParameter(freelancerInvoiceCustomerDetails, "<this>");
            str2 = str13;
            str3 = str8;
            wVar = new ks6.w(freelancerInvoiceCustomerDetails.f73391a, freelancerInvoiceCustomerDetails.f73392b);
        } else {
            str2 = str13;
            str3 = str8;
            wVar = null;
        }
        FreelancerInvoiceSupplierDetails freelancerInvoiceSupplierDetails = freelancerInvoice.f73384q;
        if (freelancerInvoiceSupplierDetails != null) {
            Intrinsics.checkNotNullParameter(freelancerInvoiceSupplierDetails, "<this>");
            a0Var = new ks6.a0(freelancerInvoiceSupplierDetails.f73415a);
        } else {
            a0Var = null;
        }
        FreelancerInvoiceStatusDetails freelancerInvoiceStatusDetails = freelancerInvoice.f73385r;
        if (freelancerInvoiceStatusDetails != null) {
            Intrinsics.checkNotNullParameter(freelancerInvoiceStatusDetails, "<this>");
            wVar2 = wVar;
            long millis = freelancerInvoiceStatusDetails.f73412a.getMillis();
            long millis2 = freelancerInvoiceStatusDetails.f73413b.getMillis();
            DateTime dateTime4 = freelancerInvoiceStatusDetails.f73414c;
            Long lValueOf4 = dateTime4 != null ? Long.valueOf(dateTime4.getMillis()) : null;
            DateTime dateTime5 = freelancerInvoiceStatusDetails.d;
            zVar = new z(millis, millis2, lValueOf4, dateTime5 != null ? Long.valueOf(dateTime5.getMillis()) : null);
        } else {
            wVar2 = wVar;
            zVar = null;
        }
        List list = freelancerInvoice.f73382n;
        ks6.a0 a0Var2 = a0Var;
        ArrayList arrayList3 = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList3.add(u1.g((sr6.i) it8.next(), b()));
        }
        List list2 = freelancerInvoice.o;
        ArrayList arrayList4 = new ArrayList(zhm.w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            arrayList4.add(((sr6.m) it9.next()).name());
        }
        ArrayList arrayList5 = freelancerInvoice.f73386s;
        ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
        Iterator it10 = arrayList5.iterator();
        while (it10.hasNext()) {
            arrayList6.add(n((FreelancerInvoiceTax) it10.next()));
        }
        List list3 = freelancerInvoice.f73387t;
        ArrayList arrayList7 = new ArrayList(zhm.w.t(list3, 10));
        Iterator it11 = list3.iterator();
        while (it11.hasNext()) {
            FreelancerInvoiceItemPayload freelancerInvoiceItemPayload = (FreelancerInvoiceItemPayload) it11.next();
            Intrinsics.checkNotNullParameter(freelancerInvoiceItemPayload, "<this>");
            String str14 = freelancerInvoiceItemPayload.f73393a;
            Iterator it12 = it11;
            String str15 = freelancerInvoiceItemPayload.f73394b;
            String strName = freelancerInvoiceItemPayload.f73395c.name();
            String str16 = str10;
            double d = freelancerInvoiceItemPayload.d;
            jo3.b bVarA4 = hx7.a.A(freelancerInvoiceItemPayload.e);
            jo3.b bVarA5 = hx7.a.A(freelancerInvoiceItemPayload.f);
            jo3.b bVarA6 = hx7.a.A(freelancerInvoiceItemPayload.f73396g);
            jo3.b bVarA7 = hx7.a.A(freelancerInvoiceItemPayload.f73397h);
            List list4 = freelancerInvoiceItemPayload.i;
            ArrayList arrayList8 = new ArrayList(zhm.w.t(list4, 10));
            Iterator it13 = list4.iterator();
            while (it13.hasNext()) {
                arrayList8.add(n((FreelancerInvoiceTax) it13.next()));
            }
            arrayList7.add(new y(str14, str15, strName, d, bVarA4, bVarA6, bVarA5, bVarA7, arrayList8));
            it11 = it12;
            str10 = str16;
        }
        String str17 = str10;
        String str18 = freelancerInvoice.u;
        String str19 = freelancerInvoice.v;
        String str20 = freelancerInvoice.f73388w;
        FreelancerRecurringSchedule freelancerRecurringSchedule = freelancerInvoice.f73389x;
        if (freelancerRecurringSchedule != null) {
            Intrinsics.checkNotNullParameter(freelancerRecurringSchedule, "<this>");
            str4 = str18;
            long jN = oc.c.N(freelancerRecurringSchedule.f73435a);
            LocalDate localDate = freelancerRecurringSchedule.f73437c;
            Long lValueOf5 = localDate != null ? Long.valueOf(oc.c.N(localDate)) : null;
            String strL = l(freelancerRecurringSchedule.f73436b);
            Integer num = freelancerRecurringSchedule.d;
            Integer num2 = freelancerRecurringSchedule.e;
            int i = freelancerRecurringSchedule.f;
            int i2 = freelancerRecurringSchedule.f73438g;
            LocalDate localDate2 = freelancerRecurringSchedule.f73439h;
            Long lValueOf6 = localDate2 != null ? Long.valueOf(oc.c.N(localDate2)) : null;
            LocalDate localDate3 = freelancerRecurringSchedule.i;
            n0Var = new n0(jN, lValueOf5, strL, num, num2, i, i2, lValueOf6, localDate3 != null ? Long.valueOf(oc.c.N(localDate3)) : null);
        } else {
            str4 = str18;
            n0Var = null;
        }
        String str21 = freelancerInvoice.f73390y;
        InvoiceTemplateOverride invoiceTemplateOverride = freelancerInvoice.z;
        if (invoiceTemplateOverride != null) {
            Intrinsics.checkNotNullParameter(invoiceTemplateOverride, "<this>");
            u9d.b bVar = invoiceTemplateOverride.f86410a;
            String code = bVar != null ? bVar.getCode() : null;
            String str22 = invoiceTemplateOverride.f86411b;
            str5 = str21;
            List list5 = invoiceTemplateOverride.f86412c;
            if (list5 != null) {
                List list6 = list5;
                str6 = str19;
                arrayList = arrayList7;
                ArrayList arrayList9 = new ArrayList(zhm.w.t(list6, 10));
                Iterator it14 = list6.iterator();
                while (it14.hasNext()) {
                    InvoiceTemplate.CustomField customField = (InvoiceTemplate.CustomField) it14.next();
                    arrayList9.add(new e0(customField.f86403a, customField.f86404b));
                    it14 = it14;
                    str20 = str20;
                }
                arrayList2 = arrayList9;
            } else {
                str6 = str19;
                arrayList = arrayList7;
                arrayList2 = null;
            }
            str7 = str20;
            InvoiceTemplateOverride.Value value = invoiceTemplateOverride.d;
            if (value != null) {
                Intrinsics.checkNotNullParameter(value, "<this>");
                u9d.c cVar = value.f86413a;
                g0Var = new g0(cVar != null ? cVar.name() : null, value.f86414b);
            } else {
                g0Var = null;
            }
            InvoiceTemplateOverride.Value value2 = invoiceTemplateOverride.e;
            if (value2 != null) {
                Intrinsics.checkNotNullParameter(value2, "<this>");
                u9d.c cVar2 = value2.f86413a;
                g0Var2 = new g0(cVar2 != null ? cVar2.name() : null, value2.f86414b);
            } else {
                g0Var2 = null;
            }
            f0Var = new ks6.f0(code, str22, arrayList2, g0Var, g0Var2);
        } else {
            str5 = str21;
            str6 = str19;
            arrayList = arrayList7;
            str7 = str20;
            f0Var = null;
        }
        return new x(str3, str, str9, str17, str11, lValueOf, lValueOf2, lValueOf3, str12, strG, bVarA, bVarA2, bVarA3, str2, wVar2, a0Var2, zVar, arrayList3, arrayList4, arrayList6, arrayList, str4, str6, str7, n0Var, str5, f0Var);
    }

    public static final b0 n(FreelancerInvoiceTax freelancerInvoiceTax) {
        Intrinsics.checkNotNullParameter(freelancerInvoiceTax, "<this>");
        FreelancerInvoiceTaxRate freelancerInvoiceTaxRate = freelancerInvoiceTax.f73416a;
        Intrinsics.checkNotNullParameter(freelancerInvoiceTaxRate, "<this>");
        return new b0(new c0(freelancerInvoiceTaxRate.f73420c, freelancerInvoiceTaxRate.f73418a, freelancerInvoiceTaxRate.f73419b), hx7.a.A(freelancerInvoiceTax.f73417b));
    }

    public static final FreelancerInvoiceRecurringPeriod o(String str) {
        kotlin.text.n nVar;
        MatchGroup matchGroupI;
        String str2;
        MatchGroup matchGroupI2;
        String str3;
        Integer numM;
        sr6.l lVar;
        kotlin.text.o oVarE = new Regex("^P(?<count>[0-9]+)(?<unit>Y|M|W|D)$").e(str);
        if (oVarE == null || (matchGroupI = uc0.b.i((nVar = oVarE.f187921c), "count")) == null || (str2 = matchGroupI.f187889a) == null || (matchGroupI2 = uc0.b.i(nVar, "unit")) == null || (str3 = matchGroupI2.f187889a) == null || (numM = kotlin.text.z.m(str2)) == null) {
            return null;
        }
        int iIntValue = numM.intValue();
        int iHashCode = str3.hashCode();
        if (iHashCode != 68) {
            if (iHashCode != 77) {
                if (iHashCode != 87) {
                    if (iHashCode != 89 || !str3.equals("Y")) {
                        return null;
                    }
                    lVar = sr6.l.YEAR;
                } else {
                    if (!str3.equals("W")) {
                        return null;
                    }
                    lVar = sr6.l.WEEK;
                }
            } else {
                if (!str3.equals("M")) {
                    return null;
                }
                lVar = sr6.l.MONTH;
            }
        } else {
            if (!str3.equals("D")) {
                return null;
            }
            lVar = sr6.l.DAY;
        }
        return new FreelancerInvoiceRecurringPeriod(lVar, iIntValue);
    }
}
