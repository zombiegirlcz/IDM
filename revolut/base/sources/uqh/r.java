package uqh;

import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarWithToolbar f282169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListSubheaderDelegate f282170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RowDelegate f282171c;
    public final FullScreenStateDelegate d;
    public final SmallActionButtonDelegate e;
    public final ActionsDelegate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextDelegate f282172g;

    public r(NavBarWithToolbar navBarWithToolbar, ListSubheaderDelegate listSubheaderDelegate, RowDelegate rowDelegate, FullScreenStateDelegate fullScreenStateDelegate, SmallActionButtonDelegate smallActionButtonDelegate, ActionsDelegate actionsDelegate, TextDelegate textDelegate) {
        Intrinsics.checkNotNullParameter(navBarWithToolbar, "navBarWithToolbar");
        Intrinsics.checkNotNullParameter(listSubheaderDelegate, "listSubheaderDelegate");
        Intrinsics.checkNotNullParameter(rowDelegate, "rowDelegate");
        Intrinsics.checkNotNullParameter(fullScreenStateDelegate, "fullScreenStateDelegate");
        Intrinsics.checkNotNullParameter(smallActionButtonDelegate, "smallActionButtonDelegate");
        Intrinsics.checkNotNullParameter(actionsDelegate, "actionsDelegate");
        Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
        this.f282169a = navBarWithToolbar;
        this.f282170b = listSubheaderDelegate;
        this.f282171c = rowDelegate;
        this.d = fullScreenStateDelegate;
        this.e = smallActionButtonDelegate;
        this.f = actionsDelegate;
        this.f282172g = textDelegate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f282169a, rVar.f282169a) && Intrinsics.f(this.f282170b, rVar.f282170b) && Intrinsics.f(this.f282171c, rVar.f282171c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f282172g, rVar.f282172g);
    }

    public final int hashCode() {
        return this.f282172g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f282171c.hashCode() + ((this.f282170b.hashCode() + (this.f282169a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
