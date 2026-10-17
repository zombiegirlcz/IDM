package jx1;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f179047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f179048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompositeClause f179049c;

    public i(Clause navBarTitle, CompositeClause navBarSubtitle, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarSubtitle, "navBarSubtitle");
        this.f179047a = items;
        this.f179048b = navBarTitle;
        this.f179049c = navBarSubtitle;
    }

    @Override // cli.p
    public final List c() {
        return this.f179047a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f179047a.equals(iVar.f179047a) && this.f179048b.equals(iVar.f179048b) && this.f179049c.equals(iVar.f179049c);
    }

    public final int hashCode() {
        return this.f179049c.hashCode() + p.a.a(this.f179047a.hashCode() * 31, 31, this.f179048b);
    }
}
