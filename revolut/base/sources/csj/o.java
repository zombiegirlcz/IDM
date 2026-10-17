package csj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f108490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f108491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f108492c;
    public final boolean d;
    public final boolean e;

    public o(List items, List headerItems, List menuItems, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerItems, "headerItems");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f108490a = items;
        this.f108491b = headerItems;
        this.f108492c = menuItems;
        this.d = z;
        this.e = z3;
    }

    @Override // jki.n
    public final List c() {
        return this.f108490a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f108490a, oVar.f108490a) && Intrinsics.f(this.f108491b, oVar.f108491b) && Intrinsics.f(this.f108492c, oVar.f108492c) && this.d == oVar.d && this.e == oVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(p.a.d(p.a.d(this.f108490a.hashCode() * 31, 31, this.f108491b), 31, this.f108492c), 31, this.d);
    }
}
