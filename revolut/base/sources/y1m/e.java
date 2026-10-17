package y1m;

import a3m.m;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f310437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f310438c;
    public final String d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f310439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a3m.e f310440h;

    public e(String version, m mVar, String comprehensivePermission, String individualPermission, boolean z, String photo, String front, a3m.e signatureVerifyingParams) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(comprehensivePermission, "comprehensivePermission");
        Intrinsics.checkNotNullParameter(individualPermission, "individualPermission");
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(front, "front");
        Intrinsics.checkNotNullParameter(signatureVerifyingParams, "signatureVerifyingParams");
        this.f310436a = version;
        this.f310437b = mVar;
        this.f310438c = comprehensivePermission;
        this.d = individualPermission;
        this.e = z;
        this.f = photo;
        this.f310439g = front;
        this.f310440h = signatureVerifyingParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f310436a, eVar.f310436a) && Intrinsics.f(this.f310437b, eVar.f310437b) && Intrinsics.f(this.f310438c, eVar.f310438c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f310439g, eVar.f310439g) && Intrinsics.f(this.f310440h, eVar.f310440h);
    }

    public final int hashCode() {
        int iHashCode = this.f310436a.hashCode() * 31;
        m mVar = this.f310437b;
        return this.f310440h.hashCode() + w0.a(this.f310439g, w0.a(this.f, j6.a.c(p.a.c(p.a.c((iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31, 31, this.f310438c), 31, this.d), 31, this.e)));
    }

    public final String toString() {
        return "ICChipReaderJapanSubmitDocumentRequestResidenceCard(version=" + this.f310436a + ", address=" + this.f310437b + ", comprehensivePermission=" + this.f310438c + ", individualPermission=" + this.d + ", updateStatus=" + this.e + ", photo=" + this.f + ", front=" + this.f310439g + ", signatureVerifyingParams=" + this.f310440h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
