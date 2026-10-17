package wl8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f298450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f298451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f298452c;

    public j(List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f298450a = items;
        this.f298451b = z;
        this.f298452c = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f298450a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f298450a, jVar.f298450a) && this.f298451b == jVar.f298451b && this.f298452c == jVar.f298452c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f298452c) + j6.a.c(this.f298450a.hashCode() * 31, 31, this.f298451b);
    }
}
