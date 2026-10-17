package fna;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.profile.impl.ui.documents_redesigned.CurrencySelectionResult;
import com.revolut.feature.tab.accounts.api.R$string;
import efm.r;
import io3.k;
import ip0.qd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jid.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends a8a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f136589a;

    public j(z delistedPocketsInteractor) {
        Intrinsics.checkNotNullParameter(delistedPocketsInteractor, "delistedPocketsInteractor");
        this.f136589a = delistedPocketsInteractor;
    }

    public static ArrayList f(List list, Set set) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            io3.d dVar = ((io3.g) it8.next()).f163163a;
            boolean zContains = set.contains(dVar);
            boolean z = dVar.f == k.ACTIVE || !io3.h.e(dVar).k();
            String str = dVar.f163145a;
            String strQ = j6.a.q("inner_", str);
            CurrencyClause currencyClause = new CurrencyClause(z92.f.l(dVar), null, null, 6);
            CurrencyClause currencyClause2 = new CurrencyClause(z92.f.l(dVar), CurrencyClause.Format.Ticker.f57756a, null, 4);
            arrayList.add(new SelectableDelegate.Model(str, new AccountCellItemDelegate.Model(strQ, false, (Image) new CurrencyImage(dVar.f163147c, (ImageTransformations) null, (TextLocalisedClause) null, 14), (Clause) currencyClause, (com.revolut.core.ui_kit.delegates.c) null, false, dVar.f == k.DELISTED ? new CompositeClause(v.k(currencyClause2, new TextLocalisedClause(R$string.home_currency_account_delisted, null, null, 14)), new DotDividerClause((Integer) null), null, null, 12) : currencyClause2, z ? new RowDelegate.Model.c.b(new MoneyClause(io3.h.e(dVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126) : null, (ProgressStyle) null, (Object) dVar, (Parcelable) null, 128560), zContains ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    @Override // a8a.d
    public final boolean b(String query, qv0.i model) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(model, "model");
        SelectableDelegate.Model model2 = model instanceof SelectableDelegate.Model ? (SelectableDelegate.Model) model : null;
        if (model2 == null) {
            return false;
        }
        koi.j jVar = model2.f53305b;
        AccountCellItemDelegate.Model model3 = jVar instanceof AccountCellItemDelegate.Model ? (AccountCellItemDelegate.Model) jVar : null;
        if (model3 == null) {
            return false;
        }
        return d0.J(model3.d.toString(), query, true) || d0.J(String.valueOf(model3.f51555g), query, true);
    }

    @Override // a8a.d
    public final Clause c(Set preSelectedModelIds, Set ids) {
        Intrinsics.checkNotNullParameter(preSelectedModelIds, "preSelectedModelIds");
        Intrinsics.checkNotNullParameter(ids, "ids");
        int size = ids.size();
        return size > 0 ? new TextLocalisedClause(com.revolut.feature.statements.R$string.statement_switcher_selected_action, u.c(Integer.valueOf(size)), null, 12) : new TextLocalisedClause(com.revolut.feature.statements.R$string.statement_switcher_action, null, null, 14);
    }

    @Override // a8a.d
    public final y7a.w d(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.feature.core.model.domain.wallet.pocket.PocketBalance>");
        List list = (List) obj2;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((io3.g) it8.next()).f163163a);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (ids.contains(((io3.d) obj3).f163145a)) {
                arrayList2.add(obj3);
            }
        }
        return new CurrencySelectionResult(zhm.d0.i1(arrayList2));
    }

    @Override // a8a.d
    public final r e(Object obj2, Set selectedModelIds, List list) {
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.feature.core.model.domain.wallet.pocket.PocketBalance>");
        Set setI = this.f136589a.i();
        List list2 = (List) obj2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            io3.g gVar = (io3.g) obj3;
            k[] elements = {k.ACTIVE, k.DELISTED};
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (!kotlin.collections.d.y0(elements).contains(gVar.f163163a.f) || setI.contains(gVar.f163163a.f163145a)) {
                arrayList2.add(obj3);
            } else {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList3.add(((io3.g) it8.next()).f163163a);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : arrayList3) {
            if (selectedModelIds.contains(((io3.d) obj4).f163145a)) {
                arrayList4.add(obj4);
            }
        }
        Set setI1 = zhm.d0.i1(arrayList4);
        r rVarJust = r.just(zi0.c.P(zhm.d0.E0(f(arrayList2, setI1), f(arrayList, setI1)), false, null, 3));
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }
}
