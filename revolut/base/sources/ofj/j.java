package ofj;

import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanCoverageCode;
import com.revolut.retail.feature.esim.api.model.EsimIcon;
import com.revolut.retail.feature.esim.api.model.EsimInfoBottomSheetData;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanSummaryItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kfj.f0;
import kfj.m0;
import kfj.w0;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class j {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.retail.feature.esim.api.model.EsimMobilePlanSummaryItem a(kfj.w0 r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kfj.m0 r0 = r8.getDetails()
            r1 = 0
            if (r0 == 0) goto L17
            kfj.e0 r2 = r0.getTerms()
            if (r2 == 0) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L17
            goto L27
        L17:
            kfj.m0 r0 = r8.getDetails()
            if (r0 == 0) goto L26
            kfj.e0 r2 = r8.getTerms()
            kfj.m0 r0 = kfj.m0.a(r0, r2)
            goto L27
        L26:
            r0 = r1
        L27:
            com.revolut.retail.feature.esim.api.model.EsimMobilePlanSummaryItem r2 = new com.revolut.retail.feature.esim.api.model.EsimMobilePlanSummaryItem
            java.lang.String r3 = r8.getKey()
            java.lang.String r4 = r8.getValue()
            if (r0 == 0) goto L39
            com.revolut.retail.feature.esim.api.model.EsimInfoBottomSheetData r0 = ofj.i.a(r0)
            r5 = r0
            goto L3a
        L39:
            r5 = r1
        L3a:
            kfj.f0$a r0 = kfj.f0.INSTANCE
            java.lang.String r6 = r8.getIconUrl()
            java.lang.String r7 = r8.getIcon()
            com.revolut.retail.feature.esim.api.model.EsimIcon r6 = ofj.g.a(r0, r6, r7)
            java.lang.String r0 = r8.getCoverageType()
            if (r0 == 0) goto L6a
            java.lang.String r0 = r8.getCoverageCode()
            if (r0 == 0) goto L6a
            java.util.List r0 = r8.getCoverageCountries()
            if (r0 == 0) goto L6a
            java.lang.String r0 = r8.getCoverageType()
            java.lang.String r7 = r8.getCoverageCode()
            java.util.List r8 = r8.getCoverageCountries()
            com.revolut.retail.feature.esim.api.model.EsimCoverage r1 = ofj.b.b(r0, r7, r1, r8)
        L6a:
            r7 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ofj.j.a(kfj.w0):com.revolut.retail.feature.esim.api.model.EsimMobilePlanSummaryItem");
    }

    public static final w0 b(EsimMobilePlanSummaryItem esimMobilePlanSummaryItem) {
        List f100208a;
        EsimDataPlanCoverageCode f100209b;
        Intrinsics.checkNotNullParameter(esimMobilePlanSummaryItem, "<this>");
        EsimIcon esimIcon = esimMobilePlanSummaryItem.d;
        EsimCoverage esimCoverage = esimMobilePlanSummaryItem.e;
        ArrayList arrayList = null;
        f0 f0VarC = esimIcon != null ? g.c(esimIcon) : null;
        String str = esimMobilePlanSummaryItem.f100313a;
        String str2 = esimMobilePlanSummaryItem.f100314b;
        EsimInfoBottomSheetData esimInfoBottomSheetData = esimMobilePlanSummaryItem.f100315c;
        m0 m0VarB = esimInfoBottomSheetData != null ? i.b(esimInfoBottomSheetData) : null;
        String url2 = f0VarC != null ? f0VarC.getUrl() : null;
        String id10 = f0VarC != null ? f0VarC.getId() : null;
        String strA = esimCoverage != null ? b.a(esimCoverage) : null;
        String str3 = (esimCoverage == null || (f100209b = esimCoverage.getF100209b()) == null) ? null : f100209b.f100235a;
        if (esimCoverage != null && (f100208a = esimCoverage.getF100208a()) != null) {
            List list = f100208a;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(((wi0.b) it8.next()).f297794a);
            }
        }
        return new w0(str, str2, m0VarB, url2, id10, strA, str3, arrayList);
    }
}
