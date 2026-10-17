package b1b;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.retail.advanced_charts.impl.R$string;
import ip0.qd0;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(List list, Set set, TextLocalisedClause textLocalisedClause, boolean z) {
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        aim.e eVarB = u.b();
        if (z) {
            eVarB.add(new ListSubheaderDelegate.Model("INDICATORS_HEADER_LIST_ID", (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        }
        List<d1b.c> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (d1b.c cVar : list2) {
            String strQ = j6.a.q("CHART_INDICATOR_ITEM_", cVar.name());
            String displayName = cVar.getDisplayName();
            if (displayName == null) {
                displayName = cVar.getValue();
            }
            arrayList.add(new SelectableDelegate.Model("CHART_INDICATOR_SELECTABLE_ITEM", new RowDelegate.Model(strQ, null, new TextClause(displayName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906), set.contains(cVar) ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, cVar, null, false, 32504));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        return u.a(eVarB);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        List listA;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f11766c;
        Set set = domainState.f11764a;
        List list2 = domainState.f11765b;
        if (list.isEmpty() && list2.isEmpty()) {
            listA = u.c(new FullScreenStateDelegate.Model("SEARCH_EMPTY_ITEM_ID", new TextLocalisedClause(R$string.trading_advanced_chart_search_empty_state_title, null, null, 14), new TextLocalisedClause(R$string.trading_advanced_chart_search_empty_state_description, u.c(new TextClause(domainState.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d086", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32672));
            yp0.b.k(listA, 0, 0, 0, 0, 31);
        } else {
            aim.e eVarB = u.b();
            eVarB.addAll(a(list2, set, new TextLocalisedClause(R$string.trading_advanced_chart_indicator_popular, null, null, 14), true));
            eVarB.addAll(a(domainState.f11766c, set, new TextLocalisedClause(R$string.trading_advanced_chart_indicator_other, null, null, 14), !list2.isEmpty()));
            listA = u.a(eVarB);
        }
        return new g(listA);
    }
}
