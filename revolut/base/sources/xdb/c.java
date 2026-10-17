package xdb;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f304385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f304386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f304387c;

    public c(int i, dj0.d policyFeePerGuest, dj0.d totalAmount) {
        Intrinsics.checkNotNullParameter(policyFeePerGuest, "policyFeePerGuest");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        this.f304385a = i;
        this.f304386b = policyFeePerGuest;
        this.f304387c = totalAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f304385a == cVar.f304385a && Intrinsics.f(this.f304386b, cVar.f304386b) && Intrinsics.f(this.f304387c, cVar.f304387c);
    }

    public final int hashCode() {
        return this.f304387c.hashCode() + v7.c(Integer.hashCode(this.f304385a) * 31, 31, this.f304386b);
    }
}
