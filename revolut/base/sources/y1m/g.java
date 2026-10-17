package y1m;

import a3m.m;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f310442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f310443c;
    public final String d;
    public final a3m.e e;

    public g(String version, m mVar, String photo, String front, a3m.e signatureVerifyingParams) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(front, "front");
        Intrinsics.checkNotNullParameter(signatureVerifyingParams, "signatureVerifyingParams");
        this.f310441a = version;
        this.f310442b = mVar;
        this.f310443c = photo;
        this.d = front;
        this.e = signatureVerifyingParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f310441a, gVar.f310441a) && Intrinsics.f(this.f310442b, gVar.f310442b) && Intrinsics.f(this.f310443c, gVar.f310443c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f310441a.hashCode() * 31;
        m mVar = this.f310442b;
        return this.e.hashCode() + w0.a(this.d, w0.a(this.f310443c, (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31));
    }

    public final String toString() {
        return "ICChipReaderJapanSubmitDocumentRequestSpecialPermanentResidentCertificate(version=" + this.f310441a + ", address=" + this.f310442b + ", photo=" + this.f310443c + ", front=" + this.d + ", signatureVerifyingParams=" + this.e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
