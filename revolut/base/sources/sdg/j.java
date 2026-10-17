package sdg;

import cli.o;
import cli.p;
import cli.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f261883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f261884b;

    public j(ArrayList items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f261883a = items;
        this.f261884b = menuItems;
    }

    @Override // cli.o
    public final q a(o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof j) {
            return new h(!Intrinsics.f(((j) oldState).f261884b, this.f261884b));
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f261883a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f261883a.equals(jVar.f261883a) && Intrinsics.f(this.f261884b, jVar.f261884b);
    }

    public final int hashCode() {
        return this.f261884b.hashCode() + (this.f261883a.hashCode() * 31);
    }
}
