package ka4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f182426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hx4.d f182427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f182428c;

    public o(List items, hx4.d navBarWithToolbarModel, aw0.e eVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarWithToolbarModel, "navBarWithToolbarModel");
        this.f182426a = items;
        this.f182427b = navBarWithToolbarModel;
        this.f182428c = eVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f182426a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f182426a, oVar.f182426a) && Intrinsics.f(this.f182427b, oVar.f182427b) && Intrinsics.f(this.f182428c, oVar.f182428c);
    }

    public final int hashCode() {
        int iHashCode = (this.f182427b.hashCode() + (this.f182426a.hashCode() * 31)) * 31;
        aw0.i iVar = this.f182428c;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
