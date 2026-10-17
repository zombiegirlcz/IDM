package tuc;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f274580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f274581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f274582c;
    public final yy0.l d;

    public n(aim.e items, List list, Clause title, yy0.l lVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f274580a = items;
        this.f274581b = list;
        this.f274582c = title;
        this.d = lVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f274580a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f274580a, nVar.f274580a) && Intrinsics.f(this.f274581b, nVar.f274581b) && this.f274582c.equals(nVar.f274582c) && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f274580a.hashCode() * 31;
        List list = this.f274581b;
        int iB = p.a.b((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.f274582c);
        yy0.l lVar = this.d;
        return iB + (lVar != null ? lVar.hashCode() : 0);
    }
}
