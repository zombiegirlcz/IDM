package lu6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f200051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f200052b;

    public o(aim.e menuItems, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f200051a = items;
        this.f200052b = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f200051a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f200051a, oVar.f200051a) && Intrinsics.f(this.f200052b, oVar.f200052b);
    }

    public final int hashCode() {
        return this.f200052b.hashCode() + (this.f200051a.hashCode() * 31);
    }
}
