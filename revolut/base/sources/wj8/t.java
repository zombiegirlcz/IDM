package wj8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f298016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f298017b;

    public t(List items, m navBarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        this.f298016a = items;
        this.f298017b = navBarState;
    }

    @Override // cli.p
    public final List c() {
        return this.f298016a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f298016a, tVar.f298016a) && Intrinsics.f(this.f298017b, tVar.f298017b);
    }

    public final int hashCode() {
        return this.f298017b.hashCode() + (this.f298016a.hashCode() * 31);
    }
}
