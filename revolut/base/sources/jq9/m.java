package jq9;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f5j.a f177508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f177509c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(f5j.a beneficiary, b paymentItem, int i, int i2) {
        super(0);
        i = (i2 & 4) != 0 ? 0 : i;
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f177508b = beneficiary;
        this.f177509c = paymentItem;
        this.d = i;
    }

    @Override // jq9.k
    public final String a() {
        return n61.j.d(this.f177508b);
    }

    @Override // jq9.k
    public final b c() {
        return this.f177509c;
    }

    @Override // jq9.k
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f177508b.equals(mVar.f177508b) && Intrinsics.f(this.f177509c, mVar.f177509c) && this.d == mVar.d;
    }

    @Override // jq9.k
    public final boolean f(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        f5j.a aVar = this.f177508b;
        return d0.J(n61.j.d(aVar), query, true) || d0.J(n61.j.c(aVar), query, true);
    }

    public final int hashCode() {
        return Long.hashCode(0L) + j6.a.b(this.d, (this.f177509c.hashCode() + (this.f177508b.hashCode() * 31)) * 31, 31);
    }
}
