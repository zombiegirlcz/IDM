package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a1 extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f150093c;

    public a1(String str, String str2, String str3) {
        this.f150091a = str;
        this.f150092b = str2;
        this.f150093c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return Intrinsics.f(this.f150091a, a1Var.f150091a) && Intrinsics.f(this.f150092b, a1Var.f150092b) && Intrinsics.f(this.f150093c, a1Var.f150093c);
    }

    public final int hashCode() {
        String str = this.f150091a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f150092b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f150093c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
