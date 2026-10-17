package bk1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16219b;

    public d(String str, String str2) {
        this.f16218a = str;
        this.f16219b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f16218a, dVar.f16218a) && Intrinsics.f(this.f16219b, dVar.f16219b);
    }

    public final int hashCode() {
        String str = this.f16218a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f16219b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
