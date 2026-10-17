package pcd;

import kotlin.jvm.internal.Intrinsics;
import pcd.j;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f234856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f234857c;

    public /* synthetic */ f(l0 l0Var) {
        this(l0Var, j.d.f234867a);
    }

    @Override // pcd.i
    public final j a() {
        return this.f234857c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f234856b == fVar.f234856b && Intrinsics.f(this.f234857c, fVar.f234857c);
    }

    public final int hashCode() {
        return this.f234857c.hashCode() + (this.f234856b.hashCode() * 31);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l0 type, j ownerFilter) {
        super(zhm.u.c(type));
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(ownerFilter, "ownerFilter");
        this.f234856b = type;
        this.f234857c = ownerFilter;
    }
}
