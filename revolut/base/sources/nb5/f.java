package nb5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f213983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f213984b;

    public f(g accountNumberFormat, String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumberFormat, "accountNumberFormat");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.f213983a = accountNumberFormat;
        this.f213984b = accountNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f213983a == fVar.f213983a && Intrinsics.f(this.f213984b, fVar.f213984b);
    }

    public final int hashCode() {
        return p.a.c(this.f213983a.hashCode() * 31, 31, this.f213984b);
    }
}
