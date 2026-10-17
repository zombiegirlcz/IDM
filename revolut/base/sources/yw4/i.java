package yw4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f317318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f317319b;

    public i(boolean z, h creditCardType) {
        Intrinsics.checkNotNullParameter(creditCardType, "creditCardType");
        this.f317318a = z;
        this.f317319b = creditCardType;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        i other = (i) obj2;
        Intrinsics.checkNotNullParameter(other, "other");
        return k.f317320a.compare(this.f317319b, other.f317319b);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f317318a == iVar.f317318a && this.f317319b == iVar.f317319b;
    }

    public final int hashCode() {
        return this.f317319b.hashCode() + (Boolean.hashCode(this.f317318a) * 31);
    }
}
