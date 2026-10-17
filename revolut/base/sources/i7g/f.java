package i7g;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f159295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f159296b;

    public f(a navBarModel, List items) {
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f159295a = navBarModel;
        this.f159296b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f159296b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f159295a, fVar.f159295a) && Intrinsics.f(this.f159296b, fVar.f159296b);
    }

    public final int hashCode() {
        return this.f159296b.hashCode() + (this.f159295a.hashCode() * 31);
    }
}
