package ll4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f196528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f196529c;
    public final String d;

    public q(String withdrawal, String transfer, String str, String purchase) {
        Intrinsics.checkNotNullParameter(withdrawal, "withdrawal");
        Intrinsics.checkNotNullParameter(transfer, "transfer");
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        this.f196527a = withdrawal;
        this.f196528b = transfer;
        this.f196529c = str;
        this.d = purchase;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f196527a, qVar.f196527a) && Intrinsics.f(this.f196528b, qVar.f196528b) && Intrinsics.f(this.f196529c, qVar.f196529c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f196527a.hashCode() * 31, 31, this.f196528b);
        String str = this.f196529c;
        return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
