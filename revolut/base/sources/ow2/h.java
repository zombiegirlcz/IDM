package ow2;

import cli.o;
import cli.p;
import cli.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f230283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f230284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f230285c;

    public h(TextLocalisedClause navBarTitle, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        this.f230283a = items;
        this.f230284b = z;
        this.f230285c = navBarTitle;
    }

    @Override // cli.o
    public final q a(o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        h hVar = oldState instanceof h ? (h) oldState : null;
        if (hVar == null) {
            return null;
        }
        return new g(this.f230284b != hVar.f230284b, !this.f230285c.equals(hVar.f230285c));
    }

    @Override // cli.p
    public final List c() {
        return this.f230283a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f230283a, hVar.f230283a) && this.f230284b == hVar.f230284b && this.f230285c.equals(hVar.f230285c);
    }

    public final int hashCode() {
        return this.f230285c.hashCode() + j6.a.c(this.f230283a.hashCode() * 31, 31, this.f230284b);
    }
}
