package czc;

import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.EvidenceDocument;
import com.revolut.feature.selfserve.sot.api.models.EvidenceDocumentDetails;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EvidenceDocument f110193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DocumentType f110194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f110195c;

    public e(EvidenceDocument evidenceDocument) {
        String str;
        Intrinsics.checkNotNullParameter(evidenceDocument, "evidenceDocument");
        this.f110193a = evidenceDocument;
        DocumentType documentType = evidenceDocument.f85866b;
        EvidenceDocumentDetails evidenceDocumentDetails = evidenceDocument.d;
        DocumentType documentTypeA = DocumentType.a(documentType, (evidenceDocumentDetails == null || (str = evidenceDocumentDetails.f85869a) == null) ? null : m70.a.l(str));
        this.f110194b = documentTypeA;
        String str2 = documentTypeA.d;
        this.f110195c = str2 == null ? documentTypeA.f85860b : str2;
    }

    @Override // czc.g
    public final DocumentType a() {
        return this.f110194b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f110193a, ((e) obj2).f110193a);
    }

    @Override // czc.g
    public final String getTitle() {
        return this.f110195c;
    }

    public final int hashCode() {
        return this.f110193a.hashCode();
    }
}
