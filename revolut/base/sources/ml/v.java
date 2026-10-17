package ml;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.utils.CountryCode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class v extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentType f206549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountryCode f206550b;

    public v(DocumentType documentType, CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f206549a = documentType;
        this.f206550b = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f206549a == vVar.f206549a && this.f206550b == vVar.f206550b;
    }

    public final int hashCode() {
        return this.f206550b.hashCode() + (this.f206549a.hashCode() * 31);
    }

    public final String toString() {
        return "DocumentSelectionFragmentResult(documentType=" + this.f206549a + ", countryCode=" + this.f206550b + ")";
    }
}
