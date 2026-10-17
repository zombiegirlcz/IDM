package odc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f224449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f224450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f224451c;

    public k(dj0.d price, String merchantName, boolean z) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        this.f224449a = price;
        this.f224450b = merchantName;
        this.f224451c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f224449a, kVar.f224449a) && Intrinsics.f(this.f224450b, kVar.f224450b) && this.f224451c == kVar.f224451c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f224451c) + p.a.c(this.f224449a.hashCode() * 31, 31, this.f224450b);
    }
}
