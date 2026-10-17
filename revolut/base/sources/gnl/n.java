package gnl;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f145041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f145042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f145043c;
    public final List d;
    public final Integer e;

    public n(Clause title, Clause clause, aim.e menuItems, aim.e items, Integer num) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f145041a = title;
        this.f145042b = clause;
        this.f145043c = menuItems;
        this.d = items;
        this.e = num;
    }

    @Override // jki.n
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f145041a, nVar.f145041a) && Intrinsics.f(this.f145042b, nVar.f145042b) && Intrinsics.f(this.f145043c, nVar.f145043c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f145041a.hashCode() * 31;
        Clause clause = this.f145042b;
        int iD = p.a.d(p.a.d((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f145043c), 31, this.d);
        Integer num = this.e;
        return iD + (num != null ? num.hashCode() : 0);
    }
}
