package prd;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f238980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f238981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f238982c;
    public final aw0.e d;

    public c(aim.e items, TextLocalisedClause title, List menuItems, aw0.e actionFooterModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f238980a = items;
        this.f238981b = title;
        this.f238982c = menuItems;
        this.d = actionFooterModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f238980a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f238980a, cVar.f238980a) && Intrinsics.f(this.f238981b, cVar.f238981b) && Intrinsics.f(this.f238982c, cVar.f238982c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.a(this.f238980a.hashCode() * 31, 31, this.f238981b), 31, this.f238982c);
    }
}
