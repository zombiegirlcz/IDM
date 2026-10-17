package cg9;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f23872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyClause f23873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompositeClause f23874c;
    public final List d;
    public final List e;

    public g(TextClause title, MoneyClause moneyClause, CompositeClause compositeClause, List actions, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f23872a = title;
        this.f23873b = moneyClause;
        this.f23874c = compositeClause;
        this.d = actions;
        this.e = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f23872a.equals(gVar.f23872a) && this.f23873b.equals(gVar.f23873b) && this.f23874c.equals(gVar.f23874c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(h30.l.c(this.f23874c, v7.a(this.f23872a.hashCode() * 31, 31, this.f23873b), 31), 31, this.d);
    }
}
