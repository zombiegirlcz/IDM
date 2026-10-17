package ou6;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f229833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f229834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f229835c;
    public final boolean d;

    public m(Clause title, Clause clause, List menuItems, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f229833a = title;
        this.f229834b = clause;
        this.f229835c = menuItems;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f229833a, mVar.f229833a) && Intrinsics.f(this.f229834b, mVar.f229834b) && Intrinsics.f(this.f229835c, mVar.f229835c) && this.d == mVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f229833a.hashCode() * 31;
        Clause clause = this.f229834b;
        return Boolean.hashCode(this.d) + p.a.d((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f229835c);
    }
}
