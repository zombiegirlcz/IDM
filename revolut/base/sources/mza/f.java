package mza;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f210736b;

    public f(String str, String str2) {
        this.f210735a = str;
        this.f210736b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f210735a, fVar.f210735a) && Intrinsics.f(this.f210736b, fVar.f210736b);
    }

    public final int hashCode() {
        String str = this.f210735a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f210736b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
