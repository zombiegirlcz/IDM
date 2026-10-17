package jq9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ba6.l f177512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f177513c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ba6.l charity, b paymentItem, int i, int i2) {
        super(0);
        i = (i2 & 4) != 0 ? 0 : i;
        Intrinsics.checkNotNullParameter(charity, "charity");
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        this.f177512b = charity;
        this.f177513c = paymentItem;
        this.d = i;
    }

    @Override // jq9.k
    public final String a() {
        return this.f177512b.f13939b;
    }

    @Override // jq9.k
    public final b c() {
        return this.f177513c;
    }

    @Override // jq9.k
    public final boolean d() {
        return false;
    }

    @Override // jq9.k
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f177512b.equals(oVar.f177512b) && Intrinsics.f(this.f177513c, oVar.f177513c) && this.d == oVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + j6.a.b(this.d, (this.f177513c.hashCode() + (this.f177512b.hashCode() * 31)) * 31, 31);
    }
}
