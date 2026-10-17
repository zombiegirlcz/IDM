package k3k;

import aw0.j8;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f180747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j8 f180748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f180749c;
    public final f2k.h d;

    public c0(List items, j8 navBarConfig, v vVar, f2k.h hVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        this.f180747a = items;
        this.f180748b = navBarConfig;
        this.f180749c = vVar;
        this.d = hVar;
    }

    @Override // jki.n
    public final List c() {
        return this.f180747a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f180747a, c0Var.f180747a) && Intrinsics.f(this.f180748b, c0Var.f180748b) && Intrinsics.f(this.f180749c, c0Var.f180749c) && Intrinsics.f(this.d, c0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f180748b.hashCode() + (this.f180747a.hashCode() * 31)) * 31;
        v vVar = this.f180749c;
        int iHashCode2 = (iHashCode + (vVar == null ? 0 : vVar.hashCode())) * 31;
        f2k.h hVar = this.d;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }
}
