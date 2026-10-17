package d2g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeRangeClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f110810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f110811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f110812c;
    public final aw0.k d;
    public final List e;

    public l(List pages, TextClause title, TimeRangeClause timeRangeClause, aw0.k actionStatusLabelData, List menuItems) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actionStatusLabelData, "actionStatusLabelData");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f110810a = pages;
        this.f110811b = title;
        this.f110812c = timeRangeClause;
        this.d = actionStatusLabelData;
        this.e = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f110810a, lVar.f110810a) && this.f110811b.equals(lVar.f110811b) && Intrinsics.f(this.f110812c, lVar.f110812c) && this.d.equals(lVar.d) && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        int iB = v7.b(this.f110810a.hashCode() * 31, 31, this.f110811b);
        Clause clause = this.f110812c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iB + (clause == null ? 0 : clause.hashCode())) * 31)) * 31);
    }
}
