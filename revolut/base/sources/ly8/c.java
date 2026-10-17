package ly8;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f200748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f200749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f200750c;
    public final List d;
    public final String e;
    public final String f;

    public c(wi0.b countryCode, Set kycVerificationSteps, String token, List docPages, String str, String str2) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(kycVerificationSteps, "kycVerificationSteps");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(docPages, "docPages");
        this.f200748a = countryCode;
        this.f200749b = kycVerificationSteps;
        this.f200750c = token;
        this.d = docPages;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f200748a, cVar.f200748a) && Intrinsics.f(this.f200749b, cVar.f200749b) && Intrinsics.f(this.f200750c, cVar.f200750c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(p.a.f(this.f200748a.f297794a.hashCode() * 31, 31, this.f200749b), 31, this.f200750c), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
