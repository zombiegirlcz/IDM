package o83;

import cli.p;
import cli.q;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f222918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f222919b;

    public h(aim.e items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f222918a = items;
        this.f222919b = menuItems;
    }

    @Override // cli.o
    public final q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof h) {
            return new i(!Intrinsics.f(((h) oldState).f222919b, this.f222919b));
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f222918a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f222918a, hVar.f222918a) && Intrinsics.f(this.f222919b, hVar.f222919b);
    }

    public final int hashCode() {
        return this.f222919b.hashCode() + (this.f222918a.hashCode() * 31);
    }
}
