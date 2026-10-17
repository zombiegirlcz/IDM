package y07;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f310160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f310161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f310162c;
    public final List d;

    public j(TextLocalisedClause textLocalisedClause, List items, List menuItems, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f310160a = items;
        this.f310161b = z;
        this.f310162c = textLocalisedClause;
        this.d = menuItems;
    }

    @Override // jki.n
    public final List c() {
        return this.f310160a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f310160a, jVar.f310160a) && this.f310161b == jVar.f310161b && Intrinsics.f(this.f310162c, jVar.f310162c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f310160a.hashCode() * 31, 31, this.f310161b);
        Clause clause = this.f310162c;
        return this.d.hashCode() + ((iC + (clause == null ? 0 : clause.hashCode())) * 31);
    }

    public j(List list) {
        this(null, list, f0.f322471a, false);
    }
}
