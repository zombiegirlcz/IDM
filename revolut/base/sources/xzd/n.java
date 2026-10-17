package xzd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f309935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f309936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f309937c;

    public n(List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f309935a = items;
        this.f309936b = z;
        this.f309937c = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f309935a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f309935a, nVar.f309935a) && this.f309936b == nVar.f309936b && this.f309937c == nVar.f309937c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f309937c) + j6.a.c(this.f309935a.hashCode() * 31, 31, this.f309936b);
    }
}
