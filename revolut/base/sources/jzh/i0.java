package jzh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f179829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f179830b;

    public i0(aim.e items, t headerState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        this.f179829a = items;
        this.f179830b = headerState;
    }

    @Override // cli.p
    public final List c() {
        return this.f179829a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f179829a, i0Var.f179829a) && Intrinsics.f(this.f179830b, i0Var.f179830b);
    }

    public final int hashCode() {
        return this.f179830b.hashCode() + (this.f179829a.hashCode() * 31);
    }
}
