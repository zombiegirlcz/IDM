package ml;

import com.onfido.android.sdk.capture.DocumentFormat;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.flow.NfcArguments;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.api.client.data.DocSide;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentType f206536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountryCode f206537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DocSide f206538c;
    public final DocumentFormat d;
    public final NfcArguments e;

    public n(DocumentFormat documentFormat, DocumentType documentType, NfcArguments nfcArguments, CountryCode countryCode, DocSide docSide) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(docSide, "docSide");
        Intrinsics.checkNotNullParameter(nfcArguments, "nfcArguments");
        this.f206536a = documentType;
        this.f206537b = countryCode;
        this.f206538c = docSide;
        this.d = documentFormat;
        this.e = nfcArguments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f206536a == nVar.f206536a && this.f206537b == nVar.f206537b && this.f206538c == nVar.f206538c && this.d == nVar.d && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f206536a.hashCode() * 31;
        CountryCode countryCode = this.f206537b;
        int iHashCode2 = (this.f206538c.hashCode() + ((iHashCode + (countryCode == null ? 0 : countryCode.hashCode())) * 31)) * 31;
        DocumentFormat documentFormat = this.d;
        return this.e.hashCode() + ((iHashCode2 + (documentFormat != null ? documentFormat.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "NavigateToDocumentFlow(documentType=" + this.f206536a + ", countryCode=" + this.f206537b + ", docSide=" + this.f206538c + ", documentFormat=" + this.d + ", nfcArguments=" + this.e + ")";
    }
}
