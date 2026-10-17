package qb7;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f244129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f244130b;

    public f(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f244129a = items;
        this.f244130b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f244129a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f244129a, fVar.f244129a) && this.f244130b == fVar.f244130b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f244130b) + (this.f244129a.hashCode() * 31);
    }

    public f() {
        this(f0.f322471a, false);
    }
}
