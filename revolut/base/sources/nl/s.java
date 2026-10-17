package nl;

import com.onfido.android.sdk.capture.DocumentFormat;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.flow.NfcArguments;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.api.client.data.DocSide;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class s extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentType f216946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DocSide f216947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountryCode f216948c;
    public final DocumentFormat d;
    public final NfcArguments e;

    public s(DocumentFormat documentFormat, DocumentType documentType, NfcArguments nfcArguments, CountryCode countryCode, DocSide docSide) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(docSide, "docSide");
        Intrinsics.checkNotNullParameter(nfcArguments, "nfcArguments");
        this.f216946a = documentType;
        this.f216947b = docSide;
        this.f216948c = countryCode;
        this.d = documentFormat;
        this.e = nfcArguments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f216946a == sVar.f216946a && this.f216947b == sVar.f216947b && this.f216948c == sVar.f216948c && this.d == sVar.d && Intrinsics.f(this.e, sVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f216947b.hashCode() + (this.f216946a.hashCode() * 31)) * 31;
        CountryCode countryCode = this.f216948c;
        int iHashCode2 = (iHashCode + (countryCode == null ? 0 : countryCode.hashCode())) * 31;
        DocumentFormat documentFormat = this.d;
        return this.e.hashCode() + ((iHashCode2 + (documentFormat != null ? documentFormat.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OpenDocumentCaptureActivity(documentType=" + this.f216946a + ", docSide=" + this.f216947b + ", countrySelection=" + this.f216948c + ", documentFormat=" + this.d + ", nfcArguments=" + this.e + ")";
    }
}
