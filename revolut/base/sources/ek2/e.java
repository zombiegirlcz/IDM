package ek2;

import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f126935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f126936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f126937c;
    public final TextClause d;

    public e(aim.e items, d toolbarModel, TextClause collapsedTitle, TextClause collapsedSubtitle) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarModel, "toolbarModel");
        Intrinsics.checkNotNullParameter(collapsedTitle, "collapsedTitle");
        Intrinsics.checkNotNullParameter(collapsedSubtitle, "collapsedSubtitle");
        this.f126935a = items;
        this.f126936b = toolbarModel;
        this.f126937c = collapsedTitle;
        this.d = collapsedSubtitle;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof e)) {
            return null;
        }
        e eVar = (e) oldState;
        boolean z = true;
        boolean z3 = !eVar.f126936b.equals(this.f126936b);
        boolean z4 = !Intrinsics.f(eVar.f126935a, this.f126935a);
        if (eVar.f126937c.equals(this.f126937c) && eVar.d.equals(this.d)) {
            z = false;
        }
        return new c(z4, z3, z);
    }

    @Override // cli.p
    public final List c() {
        return this.f126935a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f126935a, eVar.f126935a) && this.f126936b.equals(eVar.f126936b) && this.f126937c.equals(eVar.f126937c) && this.d.equals(eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.b((this.f126936b.hashCode() + (this.f126935a.hashCode() * 31)) * 31, 31, this.f126937c);
    }
}
