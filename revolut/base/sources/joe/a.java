package joe;

import com.revolut.feature.tax_residency.impl.v2.models.ExemptionReason;
import ioe.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f176928a = r0.k(new Pair("DISCLOSURE_OPTIONAL", zme.b.DISCLOSURE_OPTIONAL), new Pair("DISCLOSURE_MANDATORY", zme.b.DISCLOSURE_MANDATORY), new Pair("MANDATORY", zme.b.MANDATORY));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f176929b = r0.k(new Pair("FATCA", zme.a.FATCA), new Pair("CRS", zme.a.CRS));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f176930c = r0.k(new Pair("OTHER", zme.j.OTHER), new Pair("NOT_US_PERSON", zme.j.NOT_US_PERSON), new Pair("TEACHER", zme.j.TEACHER), new Pair("EXCHANGE_STUDENT", zme.j.EXCHANGE_STUDENT), new Pair("STUDENT", zme.j.STUDENT), new Pair("DIPLOMAT", zme.j.DIPLOMAT), new Pair("DIPLOMAT_FAMILY", zme.j.DIPLOMAT_FAMILY), new Pair("TEMPORARY_RESIDENT", zme.j.TEMPORARY_RESIDENT), new Pair("ANOTHER_TAX_RESIDENCY", zme.j.ANOTHER_TAX_RESIDENCY), new Pair("CAN_NOT_PROVIDE_NOW", zme.j.CAN_NOT_PROVIDE_NOW));
    public static final Object d = r0.k(new Pair("STUDENT", ExemptionReason.STUDENT), new Pair("TEACHER", ExemptionReason.TEACHER), new Pair("TEMPORARY_RESIDENT", ExemptionReason.TEMPORARY_RESIDENT), new Pair("US_STUDENT", ExemptionReason.US_STUDENT), new Pair("US_TEACHER", ExemptionReason.US_TEACHER), new Pair("DIPLOMAT", ExemptionReason.DIPLOMAT), new Pair("TIN_PENDING", ExemptionReason.TIN_PENDING), new Pair("LOW_INCOME", ExemptionReason.LOW_INCOME), new Pair("NO_LONGER_TAX_RESIDENT", ExemptionReason.NO_LONGER_TAX_RESIDENT));
    public static final Object e = r0.k(new Pair("PASSED", zme.e.PASSED), new Pair("PENDING", zme.e.PENDING), new Pair("FAILED", zme.e.FAILED));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public static final ArrayList a(v vVar) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        List suggestedResidencies = vVar.getSuggestedResidencies();
        if (suggestedResidencies != null) {
            List list = suggestedResidencies;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(b((ioe.n) it8.next(), f0.f322471a));
            }
        } else {
            arrayList = f0.f322471a;
        }
        List taxResidencies = vVar.getTaxResidencies();
        ArrayList arrayList2 = new ArrayList(w.t(taxResidencies, 10));
        Iterator it9 = taxResidencies.iterator();
        while (it9.hasNext()) {
            arrayList2.add(b((ioe.n) it9.next(), arrayList));
        }
        return arrayList2;
    }

    public static final zme.f b(ioe.n nVar, List suggestions) {
        String documentType;
        Object next;
        Object next2;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        wi0.a aVar = wi0.b.Companion;
        String countryCode = nVar.getCountryCode();
        aVar.getClass();
        wi0.b bVarA = wi0.a.a(countryCode);
        String countryCode2 = nVar.getCountryCode();
        Intrinsics.checkNotNullParameter(suggestions, "<this>");
        Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
        List list = suggestions;
        Iterator it8 = list.iterator();
        while (true) {
            documentType = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((zme.f) next).f323482a.f297794a, countryCode2)) {
                break;
            }
        }
        zme.f fVar = (zme.f) next;
        String strL = (fVar == null || (str2 = fVar.f323483b) == null) ? null : m70.a.l(str2);
        String countryCode3 = nVar.getCountryCode();
        Intrinsics.checkNotNullParameter(suggestions, "<this>");
        Intrinsics.checkNotNullParameter(countryCode3, "countryCode");
        Iterator it9 = list.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (Intrinsics.f(((zme.f) next2).f323482a.f297794a, countryCode3)) {
                break;
            }
        }
        zme.f fVar2 = (zme.f) next2;
        if (fVar2 != null && (str = fVar2.f323484c) != null) {
            documentType = m70.a.l(str);
        }
        if (strL == null) {
            strL = nVar.getDocumentNumber();
        }
        String str3 = strL;
        if (documentType == null) {
            documentType = nVar.getDocumentType();
        }
        String str4 = documentType;
        Boolean deletable = nVar.getDeletable();
        return new zme.f(bVarA, str3, str4, deletable != null ? deletable.booleanValue() : true, null, null, 48);
    }
}
