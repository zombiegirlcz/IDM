package kl7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185318b;

    public f2(String str, String str2) {
        this.f185317a = str;
        this.f185318b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj2;
        return Intrinsics.f(this.f185317a, f2Var.f185317a) && Intrinsics.f(this.f185318b, f2Var.f185318b);
    }

    public final int hashCode() {
        String str = this.f185317a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f185318b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
