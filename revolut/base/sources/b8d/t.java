package b8d;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f13192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13194c;
    public final List d;

    public t(TextClause textClause, boolean z, aim.e items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f13192a = textClause;
        this.f13193b = z;
        this.f13194c = items;
        this.d = menuItems;
    }

    @Override // jki.n
    public final List c() {
        return this.f13194c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f13192a, tVar.f13192a) && this.f13193b == tVar.f13193b && Intrinsics.f(this.f13194c, tVar.f13194c) && Intrinsics.f(this.d, tVar.d);
    }

    public final int hashCode() {
        Clause clause = this.f13192a;
        return this.d.hashCode() + p.a.d(j6.a.c((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f13193b), 31, this.f13194c);
    }
}
