package hpg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pcd.b f154529c;

    public f(String partnerName, String partnerContactCode, pcd.b accountType) {
        Intrinsics.checkNotNullParameter(partnerName, "partnerName");
        Intrinsics.checkNotNullParameter(partnerContactCode, "partnerContactCode");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f154527a = partnerName;
        this.f154528b = partnerContactCode;
        this.f154529c = accountType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f154527a, fVar.f154527a) && Intrinsics.f(this.f154528b, fVar.f154528b) && this.f154529c == fVar.f154529c;
    }

    public final int hashCode() {
        return this.f154529c.hashCode() + p.a.c(this.f154527a.hashCode() * 31, 31, this.f154528b);
    }
}
