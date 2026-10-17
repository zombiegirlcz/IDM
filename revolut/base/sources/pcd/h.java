package pcd;

import kotlin.jvm.internal.Intrinsics;
import pcd.j;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f234862b;

    public h() {
        this(0);
    }

    @Override // pcd.i
    public final j a() {
        return this.f234862b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f234862b, ((h) obj2).f234862b);
    }

    public final int hashCode() {
        return this.f234862b.hashCode();
    }

    public /* synthetic */ h(int i) {
        this(j.d.f234867a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j ownerFilter) {
        super(zhm.v.k(l0.REGULAR, l0.GROUP, l0.SAVINGS, l0.PRO_REGULAR, l0.PRO_TAX));
        Intrinsics.checkNotNullParameter(ownerFilter, "ownerFilter");
        this.f234862b = ownerFilter;
    }
}
