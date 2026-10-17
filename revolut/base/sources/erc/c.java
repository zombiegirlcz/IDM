package erc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128634b;

    public c(String str, String str2) {
        this.f128633a = str;
        this.f128634b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f128633a, cVar.f128633a) && Intrinsics.f(this.f128634b, cVar.f128634b);
    }

    public final int hashCode() {
        String str = this.f128633a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f128634b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
