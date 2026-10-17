package joe;

import ioe.b0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.q implements Function1 {
    public static final k f = new k();

    public k() {
        super(1, a.class, "toDomain", "toDomain(Ljava/util/Map;)Ljava/util/Map;", 1);
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        wi0.b bVarA;
        Map p0 = (Map) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Object obj3 = a.f176928a;
        Intrinsics.checkNotNullParameter(p0, "<this>");
        ArrayList arrayList = new ArrayList(p0.size());
        for (Map.Entry entry : p0.entrySet()) {
            wi0.a aVar = wi0.b.Companion;
            String str = (String) entry.getKey();
            aVar.getClass();
            wi0.b countryCode = wi0.a.a(str);
            b0 b0Var = (b0) entry.getValue();
            Intrinsics.checkNotNullParameter(b0Var, "<this>");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            boolean isCRS = b0Var.getIsCRS();
            boolean issuingTINs = b0Var.getIssuingTINs();
            List documents = b0Var.getDocuments();
            zme.g gVar = null;
            if (documents != null) {
                List<ioe.m> list = documents;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                for (ioe.m mVar : list) {
                    Intrinsics.checkNotNullParameter(mVar, "<this>");
                    String countryCode2 = mVar.getCountryCode();
                    if (countryCode2 != null) {
                        wi0.b.Companion.getClass();
                        bVarA = wi0.a.a(countryCode2);
                    } else {
                        bVarA = null;
                    }
                    zme.b bVar = (zme.b) u1.u(mVar.getRequirementForIndividual(), a.f176928a);
                    String documentName = mVar.getDocumentName();
                    String description = mVar.getDescription();
                    String documentAcronym = mVar.getDocumentAcronym();
                    String documentType = mVar.getDocumentType();
                    String validation = mVar.getValidation();
                    String check = mVar.getCheck();
                    String hint = mVar.getHint();
                    if (hint == null) {
                        hint = "";
                    }
                    arrayList2.add(new zme.g(bVarA, bVar, documentName, description, documentAcronym, documentType, validation, check, hint, mVar.getLocalTINRequired(), mVar.getDisclosureAllTaxResidencies(), mVar.getRequireUsPersonDeclaration(), mVar.getRequiresValidation(), mVar.getReportable()));
                }
                gVar = (zme.g) d0.d0(arrayList2);
            }
            zme.g gVar2 = gVar;
            List requiredTaxForms = b0Var.getRequiredTaxForms();
            if (requiredTaxForms == null) {
                requiredTaxForms = f0.f322471a;
            }
            arrayList.add(new Pair(countryCode, new zme.l(countryCode, isCRS, issuingTINs, gVar2, requiredTaxForms)));
        }
        return r0.t(arrayList);
    }
}
