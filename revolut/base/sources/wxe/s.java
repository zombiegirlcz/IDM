package wxe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f300918c;

    public s(String storedMethodAccountId, String issuerInstitutionId, String issuerInstitutionName) {
        Intrinsics.checkNotNullParameter(storedMethodAccountId, "storedMethodAccountId");
        Intrinsics.checkNotNullParameter(issuerInstitutionId, "issuerInstitutionId");
        Intrinsics.checkNotNullParameter(issuerInstitutionName, "issuerInstitutionName");
        this.f300916a = storedMethodAccountId;
        this.f300917b = issuerInstitutionId;
        this.f300918c = issuerInstitutionName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f300916a, sVar.f300916a) && Intrinsics.f(this.f300917b, sVar.f300917b) && Intrinsics.f(this.f300918c, sVar.f300918c);
    }

    public final int hashCode() {
        return this.f300918c.hashCode() + p.a.c(this.f300916a.hashCode() * 31, 31, this.f300917b);
    }
}
