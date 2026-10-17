package fb7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f133468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f133469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f133470c;
    public final boolean d;
    public final Clause e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f133471g;

    public d0(List items, TextLocalisedClause navBarTitle, List menuItems, boolean z, TextLocalisedClause textLocalisedClause, boolean z3, TextLocalisedClause textLocalisedClause2) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f133468a = items;
        this.f133469b = navBarTitle;
        this.f133470c = menuItems;
        this.d = z;
        this.e = textLocalisedClause;
        this.f = z3;
        this.f133471g = textLocalisedClause2;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof d0)) {
            return null;
        }
        if (this.d != ((d0) oldState).d) {
            return c0.f133466a;
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f133468a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f133468a, d0Var.f133468a) && this.f133469b.equals(d0Var.f133469b) && Intrinsics.f(this.f133470c, d0Var.f133470c) && this.d == d0Var.d && Intrinsics.f(this.e, d0Var.e) && this.f == d0Var.f && Intrinsics.f(this.f133471g, d0Var.f133471g);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.d(t61.a.a(this.f133468a.hashCode() * 31, 31, this.f133469b), 31, this.f133470c), 31, this.d);
        Clause clause = this.e;
        int iC2 = j6.a.c((iC + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f);
        Clause clause2 = this.f133471g;
        return iC2 + (clause2 != null ? clause2.hashCode() : 0);
    }
}
