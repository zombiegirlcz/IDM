package b4c;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f12272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f12273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f12274c;
    public final List d;

    public o(Clause title, List menuItems, List filters, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f12272a = title;
        this.f12273b = menuItems;
        this.f12274c = filters;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f12272a, oVar.f12272a) && Intrinsics.f(this.f12273b, oVar.f12273b) && Intrinsics.f(this.f12274c, oVar.f12274c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f12272a.hashCode() * 31, 31, this.f12273b), 31, this.f12274c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(Clause clause, List list) {
        f0 f0Var = f0.f322471a;
        this(clause, f0Var, f0Var, list);
    }
}
