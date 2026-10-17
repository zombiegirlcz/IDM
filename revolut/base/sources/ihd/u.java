package ihd;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f161391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f161392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f161393c;
    public final boolean d;
    public final List e;

    public u(List items, TextLocalisedClause doneButtonClause, boolean z, boolean z3, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(doneButtonClause, "doneButtonClause");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f161391a = items;
        this.f161392b = doneButtonClause;
        this.f161393c = z;
        this.d = z3;
        this.e = menuItems;
    }

    @Override // jki.n
    public final List c() {
        return this.f161391a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f161391a, uVar.f161391a) && this.f161392b.equals(uVar.f161392b) && this.f161393c == uVar.f161393c && this.d == uVar.d && Intrinsics.f(this.e, uVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(j6.a.c(t61.a.a(this.f161391a.hashCode() * 31, 31, this.f161392b), 31, this.f161393c), 31, this.d);
    }
}
