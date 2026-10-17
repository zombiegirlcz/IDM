package in1;

import aw0.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f162597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j8 f162598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f162599c;
    public final Clause d;

    public k(List items, j8 navBarModel, f fVar, CompositeClause compositeClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        this.f162597a = items;
        this.f162598b = navBarModel;
        this.f162599c = fVar;
        this.d = compositeClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f162597a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f162597a, kVar.f162597a) && Intrinsics.f(this.f162598b, kVar.f162598b) && Intrinsics.f(this.f162599c, kVar.f162599c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f162598b.hashCode() + (this.f162597a.hashCode() * 31)) * 31;
        f fVar = this.f162599c;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Clause clause = this.d;
        return iHashCode2 + (clause != null ? clause.hashCode() : 0);
    }
}
