package e4k;

import aw0.j8;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f122610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j8 f122611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f122612c;
    public final f2k.h d;

    public j0(List items, j8 navBarConfig, s sVar, f2k.h hVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        this.f122610a = items;
        this.f122611b = navBarConfig;
        this.f122612c = sVar;
        this.d = hVar;
    }

    @Override // jki.n
    public final List c() {
        return this.f122610a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f122610a, j0Var.f122610a) && Intrinsics.f(this.f122611b, j0Var.f122611b) && Intrinsics.f(this.f122612c, j0Var.f122612c) && Intrinsics.f(this.d, j0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f122611b.hashCode() + (this.f122610a.hashCode() * 31)) * 31;
        s sVar = this.f122612c;
        int iHashCode2 = (iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        f2k.h hVar = this.d;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }
}
