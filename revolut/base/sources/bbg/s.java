package bbg;

import aw0.n6;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n6 f14297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14298c;

    public s(List list) {
        this(list, null, zhm.f0.f322471a);
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof s)) {
            return null;
        }
        s sVar = (s) oldState;
        return new q(!Intrinsics.f(sVar.f14297b, this.f14297b), !Intrinsics.f(sVar.f14298c, this.f14298c));
    }

    @Override // cli.p
    public final List c() {
        return this.f14296a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f14296a, sVar.f14296a) && Intrinsics.f(this.f14297b, sVar.f14297b) && Intrinsics.f(this.f14298c, sVar.f14298c);
    }

    public final int hashCode() {
        int iHashCode = this.f14296a.hashCode() * 31;
        n6 n6Var = this.f14297b;
        return this.f14298c.hashCode() + ((iHashCode + (n6Var == null ? 0 : n6Var.hashCode())) * 31);
    }

    public s(List items, n6 n6Var, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f14296a = items;
        this.f14297b = n6Var;
        this.f14298c = menuItems;
    }
}
