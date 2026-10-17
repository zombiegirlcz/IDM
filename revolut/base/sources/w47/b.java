package w47;

import a0.d;
import aim.e;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import ip0.ep;
import ip0.qd0;
import ip0.xk;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import thf.c;
import tof.i3;
import zhm.a0;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f294517a;

    public b(c transactionCategoryMapper) {
        Intrinsics.checkNotNullParameter(transactionCategoryMapper, "transactionCategoryMapper");
        this.f294517a = transactionCategoryMapper;
    }

    public static e a(b bVar, Set availableCategories, Set selectedCategories, int i, boolean z) {
        c cVar = bVar.f294517a;
        Intrinsics.checkNotNullParameter(availableCategories, "availableCategories");
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        e eVarB = u.b();
        Integer num = null;
        SelectableDelegate.Model modelD = d("LIST_ID_CATEGORY_SECTION_HEADER", new TextLocalisedClause(R$string.freelancer_tax_hub_transaction_export_filter_section_category_title, null, null, 14), selectedCategories.size(), availableCategories.size(), null);
        yp0.b.r(modelD, 0, R$attr.uikit_dp0, 0, 0, 13);
        eVarB.add(modelD);
        e eVarB2 = u.b();
        e eVarB3 = u.b();
        List<i3> listV0 = d0.V0(availableCategories, i);
        ArrayList arrayList = new ArrayList(w.t(listV0, 10));
        for (i3 i3Var : listV0) {
            arrayList.add(new IconDelegate.Model(i3Var.getId(), ((wjf.e) cVar).i(i3Var, num, num), new TextClause(((wjf.e) cVar).k(i3Var), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), selectedCategories.contains(i3Var) ? new WhiteCircleBadge(dw0.a.Checked) : null, null, null, i3Var, null, 712));
            num = null;
        }
        a0.x(arrayList, eVarB3);
        if (z) {
            int iMin = Math.min(availableCategories.size(), i) % 3;
            int i2 = iMin == 0 ? 3 : 3 - iMin;
            ArrayList arrayList2 = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList2.add(new ep(d.n("LIST_ID_CATEGORY_SECTION_GRID_ICON_LOADING_", i3)));
            }
            a0.x(arrayList2, eVarB3);
        }
        eVarB2.add(new xk("LIST_ID_CATEGORY_SECTION_GRID", u.a(eVarB3), 3, null, null, 56));
        if (availableCategories.size() > i) {
            eVarB2.add(new PlainTextDelegate.Model("LIST_ID_CATEGORY_SECTION_SEE_ALL", (Clause) null, (Clause) new TextLocalisedClause(R$string.freelancer_tax_hub_transaction_export_filter_section_category_see_all, null, new Click(26, (Integer) null, (Object) null, "LIST_ID_CATEGORY_SECTION_SEE_ALL", false), 10), (v5) null, (UrlImage) null, true, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65262));
        }
        e eVarA = u.a(eVarB2);
        yp0.b.k(eVarA, R$attr.uikit_dp0, 0, 0, 0, 30);
        a0.x(eVarA, eVarB);
        return u.a(eVarB);
    }

    public static e b(Set availableCurrencies, Set set, Map balances, int i) {
        Set selectedCurrencies = set;
        Intrinsics.checkNotNullParameter(availableCurrencies, "availableCurrencies");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        Intrinsics.checkNotNullParameter(balances, "balances");
        e eVarB = u.b();
        int i2 = 14;
        SelectableDelegate.Model modelD = d("LIST_ID_CURRENCY_SECTION_HEADER", new TextLocalisedClause(R$string.freelancer_tax_hub_transaction_export_filter_section_currency_title, null, null, 14), selectedCurrencies.size(), availableCurrencies.size(), null);
        yp0.b.r(modelD, 0, R$attr.uikit_dp0, 0, 0, 13);
        eVarB.add(modelD);
        e eVarB2 = u.b();
        List<xi0.b> listV0 = d0.V0(availableCurrencies, i);
        ArrayList arrayList = new ArrayList(w.t(listV0, 10));
        for (xi0.b bVar : listV0) {
            String str = bVar.f306286a;
            qd0 qd0Var = selectedCurrencies.contains(bVar) ? qd0.SELECTED : qd0.UNSELECTED;
            String str2 = bVar.f306286a;
            CurrencyImage currencyImage = new CurrencyImage(str2, (ImageTransformations) null, (TextLocalisedClause) null, i2);
            CurrencyClause currencyClause = new CurrencyClause(bVar, null, null, 6);
            CurrencyClause currencyClause2 = new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4);
            dj0.d dVar = (dj0.d) balances.get(bVar);
            arrayList.add(new SelectableDelegate.Model(str, new AccountCellItemDelegate.Model(str2, false, (Image) currencyImage, (Clause) currencyClause, (com.revolut.core.ui_kit.delegates.c) null, false, (Clause) currencyClause2, dVar != null ? new RowDelegate.Model.c.b(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126) : null, (ProgressStyle) null, (Object) null, (Parcelable) null, 130864), qd0Var, null, null, false, null, bVar, null, false, 32504));
            i2 = 14;
            selectedCurrencies = set;
        }
        a0.x(arrayList, eVarB2);
        if (availableCurrencies.size() > i) {
            eVarB2.add(new PlainTextDelegate.Model("LIST_ID_CURRENCY_SECTION_SEE_ALL", (Clause) null, (Clause) new TextLocalisedClause(R$string.freelancer_tax_hub_transaction_export_filter_section_currency_see_all, null, new Click(26, (Integer) null, (Object) null, "LIST_ID_CURRENCY_SECTION_SEE_ALL", false), 10), (v5) null, (UrlImage) null, true, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65262));
        }
        e eVarA = u.a(eVarB2);
        yp0.b.k(eVarA, R$attr.uikit_dp0, 0, 0, 0, 30);
        a0.x(eVarA, eVarB);
        return u.a(eVarB);
    }

    public static FullScreenStateDelegate.Model c(TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("LIST_ID_NO_TRANSACTIONS", title, description, new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, null, 52, 52, 31), (Clause) null, 190)), null, null, false, null, null, false, 0, 0, 32752);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static SelectableDelegate.Model d(String listId, Clause title, int i, int i2, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        qd0 qd0Var = i == i2 ? qd0.SELECTED : i > 0 ? qd0.INDETERMINATE : qd0.UNSELECTED;
        Clause[] clauseArr = new Clause[2];
        clauseArr[0] = title;
        clauseArr[1] = i == i2 ? new TextClause(String.valueOf(i), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(R$string.freelancer_tax_hub_transaction_export_filter_section_counter_template, v.k(Integer.valueOf(i), Integer.valueOf(i2)), null, 12);
        List listK = v.k(clauseArr);
        m70.a.a(t0.f186434a);
        return new SelectableDelegate.Model(listId, new ListSubheaderDelegate.Model(listId, (Image) null, (Clause) yoj.b.m(new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), listK), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), qd0Var, null, null, false, null, localDate == null ? qd0Var : localDate, null, false, 32504);
    }
}
