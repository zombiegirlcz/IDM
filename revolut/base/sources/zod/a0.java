package zod;

import kotlin.jvm.internal.Intrinsics;
import tof.i3;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final he3.j f323974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i3 f323975b;

    public a0(he3.j group, i3 i3Var) {
        Intrinsics.checkNotNullParameter(group, "group");
        this.f323974a = group;
        this.f323975b = i3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f323974a, a0Var.f323974a) && Intrinsics.f(this.f323975b, a0Var.f323975b);
    }

    @Override // zod.c0
    public final dj0.d f() {
        return this.f323974a.f151564b;
    }

    public final int hashCode() {
        int iHashCode = this.f323974a.hashCode() * 31;
        i3 i3Var = this.f323975b;
        return iHashCode + (i3Var == null ? 0 : i3Var.hashCode());
    }
}
