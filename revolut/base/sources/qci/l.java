package qci;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.CountriesSelectionScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.transaction_countries.models.TransactionDestination;
import ip0.qd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountriesSelectionScreenContract$InputData f244803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ntf.a f244804b;

    public l(CountriesSelectionScreenContract$InputData inputData, ntf.a countryMapper, a countriesQueryFilter, xci.b frequencyMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(countryMapper, "countryMapper");
        Intrinsics.checkNotNullParameter(countriesQueryFilter, "countriesQueryFilter");
        Intrinsics.checkNotNullParameter(frequencyMapper, "frequencyMapper");
        this.f244803a = inputData;
        this.f244804b = countryMapper;
    }

    public static ListSubheaderDelegate.Model a() {
        return new ListSubheaderDelegate.Model("SUPPORTED_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.transaction_countries_section_header_all, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) "SUPPORTED_HEADER_ID", (Parcelable) null, 0, 0, 0, 0, 64506);
    }

    public final ArrayList b(List list, Set set) {
        Object next;
        List<b> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (b bVar : list2) {
            Iterator it8 = set.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((TransactionDestination) next).f97773a, bVar.f244789a)) {
                    break;
                }
            }
            TransactionDestination transactionDestination = (TransactionDestination) next;
            boolean z = transactionDestination != null;
            wi0.b bVar2 = bVar.f244789a;
            String strR = a0.d.r(bVar2.f297794a, "_ROW");
            TextClause textClause = new TextClause(bVar.f244790b, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122);
            dj0.d dVar = transactionDestination != null ? transactionDestination.f97774b : null;
            yci.a aVar = transactionDestination != null ? transactionDestination.f97775c : null;
            arrayList.add(new SelectableDelegate.Model(bVar2.f297794a, new RowDelegate.Model(strR, new RowDelegate.Model.MainImage.Image40(new CountryImage(bVar2.f297794a, (Integer) null, (ez0.e) null, 14), null, null, false, null, false, 60), textClause, null, 0, (dVar == null || aVar == null) ? null : new TextLocalisedClause(R$string.transaction_countries_cell_subtitle_template, v.k(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), xci.b.a(aVar)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), z ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }
}
