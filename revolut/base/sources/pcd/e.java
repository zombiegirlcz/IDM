package pcd;

import kotlin.jvm.internal.Intrinsics;
import pcd.j;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f234855b;

    public e() {
        this(0);
    }

    @Override // pcd.i
    public final j a() {
        return this.f234855b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f234855b, ((e) obj2).f234855b);
    }

    public final int hashCode() {
        return this.f234855b.hashCode();
    }

    public /* synthetic */ e(int i) {
        this(j.d.f234867a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j ownerFilter) {
        super(zhm.v.k(l0.MONEY_MARKET_FUND_SAVINGS, l0.SAVINGS, l0.SAVINGS_FIXED_TERM));
        Intrinsics.checkNotNullParameter(ownerFilter, "ownerFilter");
        this.f234855b = ownerFilter;
    }
}
