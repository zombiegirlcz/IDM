package mkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f206262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f206263b;

    public p(String reference, boolean z) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        this.f206262a = reference;
        this.f206263b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f206262a, pVar.f206262a) && this.f206263b == pVar.f206263b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f206263b) + (this.f206262a.hashCode() * 31);
    }
}
