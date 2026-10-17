package av1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9877b;

    public f(String legalName, String identification) {
        Intrinsics.checkNotNullParameter(legalName, "legalName");
        Intrinsics.checkNotNullParameter(identification, "identification");
        this.f9876a = legalName;
        this.f9877b = identification;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f9876a, fVar.f9876a) && Intrinsics.f(this.f9877b, fVar.f9877b);
    }

    public final int hashCode() {
        return this.f9877b.hashCode() + (this.f9876a.hashCode() * 31);
    }
}
