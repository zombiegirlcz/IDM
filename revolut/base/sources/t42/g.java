package t42;

import aw0.j8;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f267851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j8 f267852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v42.a f267853c;

    public g(List items, j8 navBarModel, v42.a footerModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(footerModel, "footerModel");
        this.f267851a = items;
        this.f267852b = navBarModel;
        this.f267853c = footerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f267851a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f267851a, gVar.f267851a) && Intrinsics.f(this.f267852b, gVar.f267852b) && Intrinsics.f(this.f267853c, gVar.f267853c);
    }

    public final int hashCode() {
        return this.f267853c.hashCode() + ((this.f267852b.hashCode() + (this.f267851a.hashCode() * 31)) * 31);
    }
}
