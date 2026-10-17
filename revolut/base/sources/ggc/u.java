package ggc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143670b;

    public u() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f143669a, uVar.f143669a) && Intrinsics.f(this.f143670b, uVar.f143670b);
    }

    public final int hashCode() {
        String str = this.f143669a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f143670b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public u(String str, String str2) {
        this.f143669a = str;
        this.f143670b = str2;
    }
}
