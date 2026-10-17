package bh9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15276c;

    public g(List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f15274a = items;
        this.f15275b = z;
        this.f15276c = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f15274a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f15274a, gVar.f15274a) && this.f15275b == gVar.f15275b && this.f15276c == gVar.f15276c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15276c) + j6.a.c(this.f15274a.hashCode() * 31, 31, this.f15275b);
    }
}
