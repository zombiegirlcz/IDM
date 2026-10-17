package xgd;

import cli.y;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.EditWatchlistsController;
import java.util.ArrayList;
import java.util.List;
import tw0.b0;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EditWatchlistsController f305680a;

    public j(EditWatchlistsController editWatchlistsController) {
        this.f305680a = editWatchlistsController;
    }

    @Override // tw0.b0
    public final void I1() {
        com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a aVar = (com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a) this.f305680a.d();
        aVar.H2(aVar.f86928t, new xd2.n(19));
    }

    @Override // tw0.b0
    public final void m1(int i, int i2) {
        ArrayList arrayListF1;
        com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a aVar = (com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a) this.f305680a.d();
        y yVar = aVar.f86928t;
        List list = ((m) ((j2) yVar.f22677a).getValue()).f305684b;
        if (list != null) {
            arrayListF1 = d0.f1(list);
            if (i < 0 || i >= arrayListF1.size() || i2 < 0 || i2 >= arrayListF1.size()) {
                return;
            } else {
                arrayListF1.add(i2, (String) arrayListF1.remove(i));
            }
        } else {
            arrayListF1 = null;
        }
        aVar.H2(yVar, new x5f.m(arrayListF1, 8));
    }
}
