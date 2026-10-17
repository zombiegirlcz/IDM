package eq5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f128249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f128250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f128251c;

    public a0(List items, z toolbar, y yVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        this.f128249a = items;
        this.f128250b = toolbar;
        this.f128251c = yVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f128249a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f128249a, a0Var.f128249a) && Intrinsics.f(this.f128250b, a0Var.f128250b) && Intrinsics.f(this.f128251c, a0Var.f128251c);
    }

    public final int hashCode() {
        int iHashCode = (this.f128250b.hashCode() + (this.f128249a.hashCode() * 31)) * 31;
        y yVar = this.f128251c;
        return iHashCode + (yVar == null ? 0 : yVar.hashCode());
    }
}
