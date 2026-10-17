package k0e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f180031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f180032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f180033c;

    public j(List items, boolean z, h navBarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        this.f180031a = items;
        this.f180032b = z;
        this.f180033c = navBarState;
    }

    @Override // cli.p
    public final List c() {
        return this.f180031a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f180031a, jVar.f180031a) && this.f180032b == jVar.f180032b && Intrinsics.f(this.f180033c, jVar.f180033c);
    }

    public final int hashCode() {
        return this.f180033c.hashCode() + j6.a.c(this.f180031a.hashCode() * 31, 31, this.f180032b);
    }
}
