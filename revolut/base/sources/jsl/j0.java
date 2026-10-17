package jsl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f178216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f178217b;

    public j0(i0 toolbar, List items) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f178216a = toolbar;
        this.f178217b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f178217b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f178216a, j0Var.f178216a) && Intrinsics.f(this.f178217b, j0Var.f178217b);
    }

    public final int hashCode() {
        return this.f178217b.hashCode() + (this.f178216a.hashCode() * 31);
    }
}
