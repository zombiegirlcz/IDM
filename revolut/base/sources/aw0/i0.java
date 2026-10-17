package aw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f10349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f10350c;
    public final boolean d;

    public /* synthetic */ i0(List list, e0 e0Var, h0 h0Var, int i) {
        this(list, e0Var, (i & 4) != 0 ? null : h0Var, false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f10348a, i0Var.f10348a) && this.f10349b == i0Var.f10349b && Intrinsics.f(this.f10350c, i0Var.f10350c) && this.d == i0Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f10349b.hashCode() + (this.f10348a.hashCode() * 31)) * 31;
        h0 h0Var = this.f10350c;
        return Boolean.hashCode(this.d) + ((iHashCode + (h0Var == null ? 0 : h0Var.hashCode())) * 31);
    }

    public i0(List images, e0 size, h0 h0Var, boolean z) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f10348a = images;
        this.f10349b = size;
        this.f10350c = h0Var;
        this.d = z;
    }
}
