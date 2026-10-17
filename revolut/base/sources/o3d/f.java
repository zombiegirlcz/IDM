package o3d;

import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import ngh.i;
import nz7.g;

/* JADX INFO: loaded from: classes7.dex */
public final class f {
    public final NavBarMenuItem a(Data addedToWatchlist) {
        Intrinsics.checkNotNullParameter("WATCHLIST_TOOLBAR_ICON_ID", "listId");
        Intrinsics.checkNotNullParameter(addedToWatchlist, "addedToWatchlist");
        return (NavBarMenuItem) iii.c.f(addedToWatchlist, new o2g.f(9), new g(24), new i(this, 14));
    }
}
