package qba;

import aw0.j8;
import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f244162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j8 f244163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f244164c;

    public k(List items, j8 navBarModel, g gVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        this.f244162a = items;
        this.f244163b = navBarModel;
        this.f244164c = gVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f244162a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f244162a, kVar.f244162a) && Intrinsics.f(this.f244163b, kVar.f244163b) && Intrinsics.f(this.f244164c, kVar.f244164c);
    }

    public final int hashCode() {
        int iHashCode = (this.f244163b.hashCode() + (this.f244162a.hashCode() * 31)) * 31;
        g gVar = this.f244164c;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }
}
