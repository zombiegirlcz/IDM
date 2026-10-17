package esa;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f128921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f128922b;

    public g(aim.e items, e eVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f128921a = items;
        this.f128922b = eVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f128921a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f128921a, gVar.f128921a) && Intrinsics.f(this.f128922b, gVar.f128922b);
    }

    public final int hashCode() {
        int iHashCode = this.f128921a.hashCode() * 31;
        e eVar = this.f128922b;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }
}
