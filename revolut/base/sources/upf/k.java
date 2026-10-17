package upf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f282025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f282026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f282027c;
    public final j d;
    public final String e;

    public k(jo3.a recipientAmount, String senderCurrency, String str, j recipient, String str2) {
        Intrinsics.checkNotNullParameter(recipientAmount, "recipientAmount");
        Intrinsics.checkNotNullParameter(senderCurrency, "senderCurrency");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f282025a = recipientAmount;
        this.f282026b = senderCurrency;
        this.f282027c = str;
        this.d = recipient;
        this.e = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f282025a, kVar.f282025a) && Intrinsics.f(this.f282026b, kVar.f282026b) && Intrinsics.f(this.f282027c, kVar.f282027c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f282025a.hashCode() * 31, 31, this.f282026b);
        String str = this.f282027c;
        int iHashCode = (this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
