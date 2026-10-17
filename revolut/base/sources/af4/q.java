package af4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hx4.d f3872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f3873c;

    public q(List items, hx4.d navBarWithToolbarModel, aw0.e eVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarWithToolbarModel, "navBarWithToolbarModel");
        this.f3871a = items;
        this.f3872b = navBarWithToolbarModel;
        this.f3873c = eVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f3871a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f3871a, qVar.f3871a) && Intrinsics.f(this.f3872b, qVar.f3872b) && Intrinsics.f(this.f3873c, qVar.f3873c);
    }

    public final int hashCode() {
        int iHashCode = (this.f3872b.hashCode() + (this.f3871a.hashCode() * 31)) * 31;
        aw0.i iVar = this.f3873c;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
