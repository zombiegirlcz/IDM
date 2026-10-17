package jo6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f176883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f176884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f176885c;

    public p(List items, aim.e menuItems, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f176883a = items;
        this.f176884b = menuItems;
        this.f176885c = bVar;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof p) {
            return new o(!Intrinsics.f(((p) oldState).f176885c, this.f176885c));
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f176883a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f176883a, pVar.f176883a) && Intrinsics.f(this.f176884b, pVar.f176884b) && Intrinsics.f(this.f176885c, pVar.f176885c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f176883a.hashCode() * 31, 31, this.f176884b);
        wi0.b bVar = this.f176885c;
        return iD + (bVar == null ? 0 : bVar.f297794a.hashCode());
    }
}
