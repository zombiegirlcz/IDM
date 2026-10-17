package jq9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentGroup f177520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f177521c;
    public final int d;
    public final long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(PaymentGroup group, b paymentItem, int i, long j2) {
        super(0);
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f177520b = group;
        this.f177521c = paymentItem;
        this.d = i;
        this.e = j2;
    }

    @Override // jq9.k
    public final String a() {
        return this.f177520b.f79286b;
    }

    @Override // jq9.k
    public final b c() {
        return this.f177521c;
    }

    @Override // jq9.k
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f177520b, sVar.f177520b) && Intrinsics.f(this.f177521c, sVar.f177521c) && this.d == sVar.d && this.e == sVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + j6.a.b(this.d, (this.f177521c.hashCode() + (this.f177520b.hashCode() * 31)) * 31, 31);
    }
}
