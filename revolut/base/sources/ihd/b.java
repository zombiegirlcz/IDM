package ihd;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.DraggableDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.k5;
import com.revolut.core.ui_kit.delegates.l5;
import com.revolut.core.ui_kit.delegates.n5;
import com.revolut.core.ui_kit.delegates.p5;
import com.revolut.core.ui_kit.delegates.q5;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import ieg.y;
import ieg.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements p {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ifd.h f161370a;

    public b(ifd.h watchlistMapper) {
        Intrinsics.checkNotNullParameter(watchlistMapper, "watchlistMapper");
        this.f161370a = watchlistMapper;
    }

    public static ListSubheaderDelegate.Model b() {
        return new ListSubheaderDelegate.Model("LIST_ID_ADD_FROM", (Image) null, (Clause) new TextLocalisedClause(R$string.shared_watchlist_widget_customisation_add_from, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp32, 0, 0, 0, 61434);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        o domainState = (o) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f161384a;
        List list = domainState.f161385b;
        List list2 = data != null ? (List) data.getContent() : null;
        if (list2 == null) {
            list2 = f0.f322471a;
        }
        boolean zIsEmpty = list2.isEmpty();
        boolean z = !zIsEmpty;
        List list3 = list == null ? f0.f322471a : list;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (!list3.contains(((WatchlistItem) obj2).getId())) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        List listC = !zIsEmpty ? zhm.u.c(PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "LIST_ID_ACTION_ADD", new TextLocalisedClause(R$string.shared_watchlist_widget_customisation_add_new, null, null, 14), null, 60)) : f0.f322471a;
        boolean z3 = domainState.e || size > 10;
        int i = domainState.f161386c;
        if (list == null) {
            list = f0.f322471a;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.shared_watchlist_widget_customisation_confirm, zhm.v.k(String.valueOf(list.size()), String.valueOf(i)), null, 12);
        Data data2 = domainState.f161384a;
        List list4 = data2 != null ? (List) iii.c.f(data2, new igh.k(8), new y(17), new z(this, domainState, 3)) : null;
        if (list4 == null) {
            list4 = f0.f322471a;
        }
        return new u(list4, textLocalisedClause, z, z3, listC);
    }

    public final DraggableDelegate.Model c(WatchlistItem watchlistItem, boolean z, boolean z3) {
        q5 p5Var;
        String id10 = watchlistItem.getId();
        RowDelegate.Model modelE = ((n3d.d) this.f161370a).e(watchlistItem.f86898a.d, watchlistItem, watchlistItem.getId());
        if (z3) {
            p5Var = new k5(z);
        } else {
            p5Var = new p5(z ? new n5() : l5.f54422a);
        }
        return new DraggableDelegate.Model(id10, modelE, z ? new ResourceImage(R$drawable.uikit_icn_24_minus_circle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246) : new ResourceImage(R$drawable.uikit_icn_24_plus_circle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), p5Var, false, null, 1008);
    }
}
