package cgc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23923b;

    public n(String str, String str2) {
        this.f23922a = str;
        this.f23923b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f23922a, nVar.f23922a) && Intrinsics.f(this.f23923b, nVar.f23923b);
    }

    public final int hashCode() {
        String str = this.f23922a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f23923b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
