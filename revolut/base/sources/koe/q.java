package koe;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f186326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f186327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f186328c;

    public q(List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f186326a = items;
        this.f186327b = z;
        this.f186328c = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f186326a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f186326a, qVar.f186326a) && this.f186327b == qVar.f186327b && this.f186328c == qVar.f186328c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f186328c) + j6.a.c(this.f186326a.hashCode() * 31, 31, this.f186327b);
    }
}
