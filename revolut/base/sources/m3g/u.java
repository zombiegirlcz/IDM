package m3g;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class u implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f202553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f202554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f202555c;
    public final Clause d;
    public final s e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f202556g;

    public u(List items, Clause primarySearchNameClause, Clause secondarySearchNameClause, Clause datesClause, s widgetState, List menuItems, List filters) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(primarySearchNameClause, "primarySearchNameClause");
        Intrinsics.checkNotNullParameter(secondarySearchNameClause, "secondarySearchNameClause");
        Intrinsics.checkNotNullParameter(datesClause, "datesClause");
        Intrinsics.checkNotNullParameter(widgetState, "widgetState");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f202553a = items;
        this.f202554b = primarySearchNameClause;
        this.f202555c = secondarySearchNameClause;
        this.d = datesClause;
        this.e = widgetState;
        this.f = menuItems;
        this.f202556g = filters;
    }

    @Override // jki.m
    public final jki.o b(jki.m oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof u) {
            return new t(((u) oldState).e != this.e);
        }
        return null;
    }

    @Override // jki.n
    public final List c() {
        return this.f202553a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f202553a, uVar.f202553a) && Intrinsics.f(this.f202554b, uVar.f202554b) && Intrinsics.f(this.f202555c, uVar.f202555c) && Intrinsics.f(this.d, uVar.d) && this.e == uVar.e && Intrinsics.f(this.f, uVar.f) && Intrinsics.f(this.f202556g, uVar.f202556g);
    }

    public final int hashCode() {
        return this.f202556g.hashCode() + p.a.d((this.e.hashCode() + p.a.a(p.a.a(p.a.a(this.f202553a.hashCode() * 31, 31, this.f202554b), 31, this.f202555c), 31, this.d)) * 31, 31, this.f);
    }
}
