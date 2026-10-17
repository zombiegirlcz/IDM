package eu4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f129499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f129500b;

    public a0(z toolbar, List items) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f129499a = toolbar;
        this.f129500b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f129500b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f129499a, a0Var.f129499a) && Intrinsics.f(this.f129500b, a0Var.f129500b);
    }

    public final int hashCode() {
        return this.f129500b.hashCode() + (this.f129499a.hashCode() * 31);
    }
}
