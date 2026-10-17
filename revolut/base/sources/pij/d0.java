package pij;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f236536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f236537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f236538c;
    public final aw0.i d;
    public final boolean e;

    public d0(List items, List menuItems, TextLocalisedClause titleClause, aw0.i iVar, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        this.f236536a = items;
        this.f236537b = menuItems;
        this.f236538c = titleClause;
        this.d = iVar;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f236536a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f236536a, d0Var.f236536a) && Intrinsics.f(this.f236537b, d0Var.f236537b) && this.f236538c.equals(d0Var.f236538c) && Intrinsics.f(this.d, d0Var.d) && this.e == d0Var.e;
    }

    public final int hashCode() {
        int iA = t61.a.a(p.a.d(this.f236536a.hashCode() * 31, 31, this.f236537b), 31, this.f236538c);
        aw0.i iVar = this.d;
        return Boolean.hashCode(this.e) + ((iA + (iVar == null ? 0 : iVar.hashCode())) * 31);
    }
}
