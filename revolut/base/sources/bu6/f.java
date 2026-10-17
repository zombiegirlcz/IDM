package bu6;

import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfileSchedule;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubAssessmentStep;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubVatSummary;
import ds6.j;
import ds6.n;
import ds6.o;
import ds6.t;
import ds6.v;
import ds6.y;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ps6.i;
import wt6.e;
import wt6.k;
import wt6.l;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final FreelancerTaxProfile a(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String str = iVar.f239408a;
        j jVarValueOf = j.valueOf(iVar.f239409b);
        ps6.h hVar = iVar.f239410c;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        ds6.a aVarValueOf = ds6.a.valueOf(hVar.f239405a);
        LocalDate localDate = hVar.f239406b;
        String str2 = hVar.f239407c;
        return new FreelancerTaxProfile(str, jVarValueOf, new FreelancerTaxProfileSchedule(aVarValueOf, localDate, str2 != null ? Month.valueOf(str2) : null), iVar.d, ds6.d.valueOf(iVar.e));
    }

    public static final FreelancerTaxProfile b(wt6.g gVar) {
        ds6.d dVar;
        j jVar;
        ds6.a aVar;
        Month month;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        String taxType = gVar.getTaxType();
        j[] jVarArrValues = j.values();
        int length = jVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            dVar = null;
            if (i2 >= length) {
                jVar = null;
                break;
            }
            jVar = jVarArrValues[i2];
            if (a0.z(jVar.name(), taxType, true)) {
                break;
            }
            i2++;
        }
        if (jVar == null) {
            return null;
        }
        String id10 = gVar.getId();
        wt6.i schedulingOptions = gVar.getSchedulingOptions();
        Intrinsics.checkNotNullParameter(schedulingOptions, "<this>");
        String period = schedulingOptions.getPeriod();
        ds6.a[] aVarArrValues = ds6.a.values();
        int length2 = aVarArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i3];
            if (a0.z(aVar.name(), period, true)) {
                break;
            }
            i3++;
        }
        if (aVar == null) {
            aVar = ds6.a.UNKNOWN;
        }
        String nextPaymentDate = schedulingOptions.getNextPaymentDate();
        LocalDate localDate = nextPaymentDate != null ? LocalDate.parse(nextPaymentDate) : null;
        String closingMonth = schedulingOptions.getClosingMonth();
        if (closingMonth != null) {
            Month[] monthArrValues = Month.values();
            int length3 = monthArrValues.length;
            for (int i5 = 0; i5 < length3; i5++) {
                month = monthArrValues[i5];
                if (a0.z(month.name(), closingMonth, true)) {
                    break;
                }
            }
            month = null;
        } else {
            month = null;
        }
        FreelancerTaxProfileSchedule freelancerTaxProfileSchedule = new FreelancerTaxProfileSchedule(aVar, localDate, month);
        boolean notificationsEnabled = gVar.getNotificationsEnabled();
        String state = gVar.getState();
        ds6.d[] dVarArrValues = ds6.d.values();
        int length4 = dVarArrValues.length;
        while (true) {
            if (i >= length4) {
                break;
            }
            ds6.d dVar2 = dVarArrValues[i];
            if (a0.z(dVar2.name(), state, true)) {
                dVar = dVar2;
                break;
            }
            i++;
        }
        if (dVar == null) {
            dVar = ds6.d.ARCHIVED;
        }
        return new FreelancerTaxProfile(id10, jVar, freelancerTaxProfileSchedule, notificationsEnabled, dVar);
    }

    public static final TaxHubCalendarEvent c(ps6.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String str = bVar.f239395a;
        j jVarValueOf = j.valueOf(bVar.f239396b);
        t tVarValueOf = t.valueOf(bVar.f239397c);
        ds6.a aVarValueOf = ds6.a.valueOf(bVar.d);
        LocalDate localDate = bVar.e;
        LocalDate localDate2 = bVar.f;
        LocalDate localDate3 = bVar.f239398g;
        LocalDate localDate4 = bVar.f239399h;
        LocalDate localDate5 = bVar.i;
        List list = bVar.f239400j;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (Iterator it8 = list.iterator(); it8.hasNext(); it8 = it8) {
            ps6.e eVar = (ps6.e) it8.next();
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            arrayList.add(new TaxHubAssessmentStep(eVar.f239402a, o.valueOf(eVar.f239403b), n.valueOf(eVar.f239404c), eVar.d));
        }
        return new TaxHubCalendarEvent(str, jVarValueOf, tVarValueOf, aVarValueOf, localDate, localDate2, localDate3, localDate4, localDate5, d0.P0(arrayList, new e()));
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent d(wt6.b r21) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bu6.f.d(wt6.b):com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent");
    }

    public static final TaxHubVatSummary e(wt6.e eVar) {
        TaxHubVatSummary.TaxRateSummary taxRateSummary;
        ds6.a aVar;
        com.revolut.feature.freelancer.common.models.tax_hub.a aVar2;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        String period = eVar.getPeriod();
        ds6.a[] aVarArrValues = ds6.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            taxRateSummary = null;
            aVar2 = null;
            if (i2 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i2];
            if (a0.z(aVar.name(), period, true)) {
                break;
            }
            i2++;
        }
        if (aVar == null) {
            aVar = ds6.a.UNKNOWN;
        }
        dj0.d dVarO = mo3.a.o(eVar.getSummary().getTotalSales());
        dj0.d dVarO2 = mo3.a.o(eVar.getSummary().getTotalTax());
        e.c taxRate = eVar.getSummary().getTaxRate();
        if (taxRate != null) {
            String type = taxRate.getType();
            com.revolut.feature.freelancer.common.models.tax_hub.a[] aVarArrValues2 = com.revolut.feature.freelancer.common.models.tax_hub.a.values();
            int length2 = aVarArrValues2.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                com.revolut.feature.freelancer.common.models.tax_hub.a aVar3 = aVarArrValues2[i];
                if (a0.z(aVar3.name(), type, true)) {
                    aVar2 = aVar3;
                    break;
                }
                i++;
            }
            if (aVar2 == null) {
                aVar2 = com.revolut.feature.freelancer.common.models.tax_hub.a.UNKNOWN;
            }
            taxRateSummary = new TaxHubVatSummary.TaxRateSummary(aVar2, taxRate.getValue());
        }
        TaxHubVatSummary.Summary summary = new TaxHubVatSummary.Summary(dVarO, taxRateSummary, dVarO2);
        LocalDate localDate = LocalDate.parse(eVar.getNextVatReturnDueDate());
        Intrinsics.checkNotNullExpressionValue(localDate, "let(...)");
        return new TaxHubVatSummary(aVar, summary, localDate);
    }

    public static final ds6.i f(l lVar) {
        ds6.a aVar;
        ds6.g gVar;
        ds6.f fVar;
        ds6.a aVar2;
        ds6.a aVar3;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        String defaultPeriod = lVar.getDefaultPeriod();
        ds6.a[] aVarArrValues = ds6.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i];
            if (a0.z(aVar.name(), defaultPeriod, true)) {
                break;
            }
            i++;
        }
        if (aVar == null) {
            aVar = ds6.a.UNKNOWN;
        }
        List<String> supportedPeriods = lVar.getSupportedPeriods();
        ArrayList arrayList = new ArrayList();
        for (String str : supportedPeriods) {
            ds6.a[] aVarArrValues2 = ds6.a.values();
            int length2 = aVarArrValues2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    aVar3 = null;
                    break;
                }
                aVar3 = aVarArrValues2[i2];
                if (a0.z(aVar3.name(), str, true)) {
                    break;
                }
                i2++;
            }
            if (aVar3 != null) {
                arrayList.add(aVar3);
            }
        }
        List<k> supportedExtraOptions = lVar.getSupportedExtraOptions();
        ArrayList arrayList2 = new ArrayList();
        for (k kVar : supportedExtraOptions) {
            Intrinsics.checkNotNullParameter(kVar, "<this>");
            String type = kVar.getType();
            ds6.g[] gVarArrValues = ds6.g.values();
            int length3 = gVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length3) {
                    gVar = null;
                    break;
                }
                gVar = gVarArrValues[i3];
                if (a0.z(gVar.name(), type, true)) {
                    break;
                }
                i3++;
            }
            if (gVar != null) {
                List<String> supportedPeriods2 = kVar.getSupportedPeriods();
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : supportedPeriods2) {
                    ds6.a[] aVarArrValues3 = ds6.a.values();
                    int length4 = aVarArrValues3.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length4) {
                            aVar2 = null;
                            break;
                        }
                        aVar2 = aVarArrValues3[i5];
                        if (a0.z(aVar2.name(), str2, true)) {
                            break;
                        }
                        i5++;
                    }
                    if (aVar2 != null) {
                        arrayList3.add(aVar2);
                    }
                }
                fVar = new ds6.f(gVar, d0.i1(arrayList3));
            } else {
                fVar = null;
            }
            if (fVar != null) {
                arrayList2.add(fVar);
            }
        }
        return new ds6.i(aVar, arrayList, arrayList2);
    }

    public static final ds6.w g(wt6.c cVar) {
        v vVar;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String type = cVar.getType();
        v[] vVarArrValues = v.values();
        int length = vVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                vVar = null;
                break;
            }
            vVar = vVarArrValues[i];
            if (a0.z(vVar.name(), type, true)) {
                break;
            }
            i++;
        }
        if (vVar == null) {
            return null;
        }
        wt6.d recipient = cVar.getRecipient();
        Intrinsics.checkNotNullParameter(recipient, "<this>");
        return new ds6.w(vVar, new y(recipient.getAccountName(), recipient.getAccountNumber(), recipient.getSortCode()));
    }

    public static final wt6.e h(TaxHubVatSummary taxHubVatSummary) {
        Intrinsics.checkNotNullParameter(taxHubVatSummary, "<this>");
        String strName = taxHubVatSummary.f73489a.name();
        TaxHubVatSummary.Summary summary = taxHubVatSummary.f73490b;
        jo3.a aVarP = mo3.a.p(summary.f73492a);
        jo3.a aVarP2 = mo3.a.p(summary.f73494c);
        TaxHubVatSummary.TaxRateSummary taxRateSummary = summary.f73493b;
        e.b bVar = new e.b(aVarP, taxRateSummary != null ? new e.c(taxRateSummary.f73495a.name(), taxRateSummary.f73496b) : null, aVarP2);
        String string = taxHubVatSummary.f73491c.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new wt6.e(strName, bVar, string);
    }

    public static final wt6.i i(FreelancerTaxProfileSchedule freelancerTaxProfileSchedule) {
        Intrinsics.checkNotNullParameter(freelancerTaxProfileSchedule, "<this>");
        String strName = freelancerTaxProfileSchedule.f73477a.name();
        LocalDate localDate = freelancerTaxProfileSchedule.f73478b;
        String str = localDate != null ? localDate.format(DateTimeFormatter.ISO_LOCAL_DATE) : null;
        Month month = freelancerTaxProfileSchedule.f73479c;
        return new wt6.i(strName, month != null ? month.name() : null, str);
    }

    public static final ps6.b j(TaxHubCalendarEvent taxHubCalendarEvent) {
        Intrinsics.checkNotNullParameter(taxHubCalendarEvent, "<this>");
        String str = taxHubCalendarEvent.f73483a;
        String strName = taxHubCalendarEvent.f73484b.name();
        String strName2 = taxHubCalendarEvent.f73485c.name();
        String strName3 = taxHubCalendarEvent.d.name();
        LocalDate localDate = taxHubCalendarEvent.e;
        LocalDate localDate2 = taxHubCalendarEvent.f;
        LocalDate localDate3 = taxHubCalendarEvent.f73486g;
        LocalDate localDate4 = taxHubCalendarEvent.f73487h;
        LocalDate localDate5 = taxHubCalendarEvent.i;
        List list = taxHubCalendarEvent.f73488j;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (Iterator it8 = list.iterator(); it8.hasNext(); it8 = it8) {
            TaxHubAssessmentStep taxHubAssessmentStep = (TaxHubAssessmentStep) it8.next();
            Intrinsics.checkNotNullParameter(taxHubAssessmentStep, "<this>");
            arrayList.add(new ps6.e(taxHubAssessmentStep.f73480a, taxHubAssessmentStep.f73481b.name(), taxHubAssessmentStep.f73482c.name(), taxHubAssessmentStep.d));
        }
        return new ps6.b(str, strName, strName2, strName3, localDate, localDate2, localDate3, localDate4, localDate5, arrayList);
    }

    public static final i k(FreelancerTaxProfile freelancerTaxProfile) {
        Intrinsics.checkNotNullParameter(freelancerTaxProfile, "<this>");
        String str = freelancerTaxProfile.f73474a;
        String strName = freelancerTaxProfile.f73475b.name();
        FreelancerTaxProfileSchedule freelancerTaxProfileSchedule = freelancerTaxProfile.f73476c;
        Intrinsics.checkNotNullParameter(freelancerTaxProfileSchedule, "<this>");
        String strName2 = freelancerTaxProfileSchedule.f73477a.name();
        LocalDate localDate = freelancerTaxProfileSchedule.f73478b;
        Month month = freelancerTaxProfileSchedule.f73479c;
        return new i(str, strName, new ps6.h(strName2, month != null ? month.name() : null, localDate), freelancerTaxProfile.d, freelancerTaxProfile.e.name());
    }
}
