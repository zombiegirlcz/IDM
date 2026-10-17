package jq9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm3.a f177514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f177515c;
    public final int d;
    public final long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(zm3.a contact, b paymentItem, int i, long j2) {
        super(0);
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f177514b = contact;
        this.f177515c = paymentItem;
        this.d = i;
        this.e = j2;
    }

    @Override // jq9.k
    public final String a() {
        return hx7.q.v(this.f177514b);
    }

    @Override // jq9.k
    public final b c() {
        return this.f177515c;
    }

    @Override // jq9.k
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f177514b, pVar.f177514b) && Intrinsics.f(this.f177515c, pVar.f177515c) && this.d == pVar.d && this.e == pVar.e;
    }

    public final zm3.a g() {
        return this.f177514b;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + j6.a.b(this.d, (this.f177515c.hashCode() + (this.f177514b.hashCode() * 31)) * 31, 31);
    }
}
