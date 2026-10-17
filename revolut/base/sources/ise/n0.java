package ise;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h93.f0 f168219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yt8.i f168220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f168221c;
    public final String d;
    public final boolean e;

    public n0(h93.f0 card, yt8.i kycStatus, long j2, String str, boolean z) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(kycStatus, "kycStatus");
        this.f168219a = card;
        this.f168220b = kycStatus;
        this.f168221c = j2;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f168219a, n0Var.f168219a) && this.f168220b == n0Var.f168220b && this.f168221c == n0Var.f168221c && Intrinsics.f(this.d, n0Var.d) && this.e == n0Var.e;
    }

    public final int hashCode() {
        int iC = a0.d.c((this.f168220b.hashCode() + (this.f168219a.hashCode() * 31)) * 31, 31, this.f168221c);
        String str = this.d;
        return Boolean.hashCode(this.e) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
