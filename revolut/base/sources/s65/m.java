package s65;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f260143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f260144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f260145c;
    public final List d;

    public m(l navbarModel, boolean z, boolean z3, List items) {
        Intrinsics.checkNotNullParameter(navbarModel, "navbarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f260143a = navbarModel;
        this.f260144b = z;
        this.f260145c = z3;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f260143a, mVar.f260143a) && this.f260144b == mVar.f260144b && this.f260145c == mVar.f260145c && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(j6.a.c(this.f260143a.hashCode() * 31, 31, this.f260144b), 31, this.f260145c);
    }
}
