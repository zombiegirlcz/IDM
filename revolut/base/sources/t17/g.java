package t17;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.freelancer.impl.R$string;
import ip0.qd0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.b f267200a;

    public g(t70.b currenciesLocalization, p selectableFilterHeaderProvider) {
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        Intrinsics.checkNotNullParameter(selectableFilterHeaderProvider, "selectableFilterHeaderProvider");
        this.f267200a = currenciesLocalization;
    }

    public final ListSubheaderDelegate.Model a(int i, int i2, String headerId) {
        Intrinsics.checkNotNullParameter(headerId, "headerId");
        ListSubheaderDelegate.Model modelA = p.a(i, i2, R$string.freelancer_sales_filters_currencies_header_title_selected, R$string.freelancer_sales_filters_currencies_header_title, headerId);
        int i3 = R$attr.uikit_dp16;
        int i5 = R$attr.uikit_dp0;
        yp0.b.p(modelA, i3, i5, i5, i5);
        return modelA;
    }

    public final ArrayList b(boolean z, Set selectedCurrencies, Set allCurrencies, String seeAllItemId) {
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        Intrinsics.checkNotNullParameter(allCurrencies, "allCurrencies");
        Intrinsics.checkNotNullParameter(seeAllItemId, "seeAllItemId");
        Iterable<xi0.b> iterableV0 = z ? allCurrencies : d0.V0(allCurrencies, 3);
        ArrayList arrayList = new ArrayList(w.t(iterableV0, 10));
        for (xi0.b bVar : iterableV0) {
            String str = bVar.f306286a;
            String str2 = bVar.f306286a;
            String strQ = j6.a.q("SELECTABLE_ITEM_", str);
            String strQ2 = j6.a.q("CURRENCY_ITEM_", str2);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(str2, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62);
            String strA = this.f267200a.a(bVar);
            if (strA == null) {
                strA = "";
            }
            arrayList.add(new SelectableDelegate.Model(strQ, new RowDelegate.Model(strQ2, image40, new TextClause(strA, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(bVar.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, RowDelegate.Model.b.c.f53268a, null, null, null, null, null, bVar, null, 0, 0, 0, 0, 532660184), selectedCurrencies.contains(bVar) ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760));
        }
        ArrayList arrayListF1 = d0.f1(arrayList);
        if (!z && allCurrencies.size() > 3) {
            arrayListF1.add(new RowDelegate.Model(seeAllItemId, null, new TextLocalisedClause(R$string.freelancer_sales_filters_currencies_action_see_all, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906));
        }
        yp0.b.k(arrayListF1, 0, 0, 0, 0, 31);
        return arrayListF1;
    }
}
