package vs8;

import aii.e;
import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f291744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DocType f291745c;
    public final wi0.b d;

    public a(DocType documentType, String checkId, String validationCode, wi0.b issuingCountry) {
        Intrinsics.checkNotNullParameter(checkId, "checkId");
        Intrinsics.checkNotNullParameter(validationCode, "validationCode");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(issuingCountry, "issuingCountry");
        this.f291743a = checkId;
        this.f291744b = validationCode;
        this.f291745c = documentType;
        this.d = issuingCountry;
    }

    public final String b() {
        return this.f291743a;
    }

    public final DocType c() {
        return this.f291745c;
    }

    public final wi0.b d() {
        return this.d;
    }

    public final String e() {
        return this.f291744b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f291743a, aVar.f291743a) && Intrinsics.f(this.f291744b, aVar.f291744b) && Intrinsics.f(this.f291745c, aVar.f291745c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.f297794a.hashCode() + p.a.c(p.a.c(this.f291743a.hashCode() * 31, 31, this.f291744b), 31, this.f291745c.f77926a);
    }
}
