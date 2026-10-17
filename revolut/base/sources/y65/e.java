package y65;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311158a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof e) {
            return Intrinsics.f(this.f311158a, ((e) obj2).f311158a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f311158a.hashCode();
    }

    public final String toString() {
        return p.a.p("ManageRepaymentsParcel(loanId=", this.f311158a, ")");
    }
}
