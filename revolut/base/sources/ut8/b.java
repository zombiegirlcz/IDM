package ut8;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b%\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\u0004R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0007\u001a\u0004\b\u001c\u0010\tR\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\f\u001a\u0004\b%\u0010\u0004R\"\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0007\u001a\u0004\b(\u0010\t¨\u0006*"}, d2 = {"Lut8/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "elements", "b", "Ljava/lang/String;", "getDocType", "docType", "c", "getSubType", "subType", "d", "getDocumentScope", "documentScope", "e", "getCountry", "country", "f", "getNationality", "nationality", "g", "getConsents", "consents", "h", "getApplicationId", "applicationId", "i", "getWorkflowStepId", "workflowStepId", "j", "getDocumentReference", "documentReference", "k", "getDocumentSequence", "documentSequence", "feature_kyc_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("elements")
    @NotNull
    private final List<String> elements;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentType")
    @NotNull
    private final String docType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentSubType")
    @NotNull
    private final String subType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("documentScope")
    @NotNull
    private final String documentScope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("country")
    @NotNull
    private final String country;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("citizenship")
    @NotNull
    private final String nationality;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("consents")
    @NotNull
    private final List<String> consents;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("applicationId")
    @NotNull
    private final String applicationId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("workflowStepId")
    private final String workflowStepId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentReference")
    private final String documentReference;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("documentSequence")
    private final List<String> documentSequence;

    public b(f0 elements, String docType, String subType, String documentScope, String country, String nationality, ArrayList consents, String applicationId, String str, String str2, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(docType, "docType");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(documentScope, "documentScope");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(consents, "consents");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.elements = elements;
        this.docType = docType;
        this.subType = subType;
        this.documentScope = documentScope;
        this.country = country;
        this.nationality = nationality;
        this.consents = consents;
        this.applicationId = applicationId;
        this.workflowStepId = str;
        this.documentReference = str2;
        this.documentSequence = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.elements, bVar.elements) && Intrinsics.f(this.docType, bVar.docType) && Intrinsics.f(this.subType, bVar.subType) && Intrinsics.f(this.documentScope, bVar.documentScope) && Intrinsics.f(this.country, bVar.country) && Intrinsics.f(this.nationality, bVar.nationality) && Intrinsics.f(this.consents, bVar.consents) && Intrinsics.f(this.applicationId, bVar.applicationId) && Intrinsics.f(this.workflowStepId, bVar.workflowStepId) && Intrinsics.f(this.documentReference, bVar.documentReference) && Intrinsics.f(this.documentSequence, bVar.documentSequence);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.d(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.elements.hashCode() * 31, 31, this.docType), 31, this.subType), 31, this.documentScope), 31, this.country), 31, this.nationality), 31, this.consents), 31, this.applicationId);
        String str = this.workflowStepId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.documentReference;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.documentSequence;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
