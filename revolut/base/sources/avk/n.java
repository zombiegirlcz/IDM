package avk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f10113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompositeClause f10115c;
    public final Clause d;
    public final yy0.j e;
    public final List f;

    public n(TextClause title, Clause clause, CompositeClause description, TextClause textClause, yy0.j endImage, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(endImage, "endImage");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f10113a = title;
        this.f10114b = clause;
        this.f10115c = description;
        this.d = textClause;
        this.e = endImage;
        this.f = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f10113a.equals(nVar.f10113a) && Intrinsics.f(this.f10114b, nVar.f10114b) && this.f10115c.equals(nVar.f10115c) && Intrinsics.f(this.d, nVar.d) && this.e.equals(nVar.e) && this.f.equals(nVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f10113a.hashCode() * 31;
        Clause clause = this.f10114b;
        int iC = h30.l.c(this.f10115c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31);
        Clause clause2 = this.d;
        return this.f.hashCode() + a10.b.c(this.e.f317755a, (iC + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31);
    }
}
