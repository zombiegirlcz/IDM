package wyd;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.navigation.AccountStatementProduct;
import com.revolut.feature.tab.accounts.api.R$string;
import ip0.qd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 extends x7a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f301244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f301245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jid.z f301246c;

    public c0(wsg.n walletInteractor, f01.c uiKitResources, jid.z delistedPocketsInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(delistedPocketsInteractor, "delistedPocketsInteractor");
        this.f301244a = walletInteractor;
        this.f301245b = uiKitResources;
        this.f301246c = delistedPocketsInteractor;
    }

    public static ArrayList i(List list, Set set) {
        RowDelegate.Model.c.b bVar;
        List<io3.d> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (io3.d dVar : list2) {
            boolean zContains = set.contains(dVar.f163147c);
            io3.k kVar = dVar.f;
            io3.k kVar2 = io3.k.ACTIVE;
            boolean z = kVar == kVar2 || !io3.h.e(dVar).k();
            String str = dVar.f163147c;
            String strR = a0.d.r(str, "_inner");
            boolean z3 = z;
            CurrencyClause currencyClause = new CurrencyClause(z92.f.l(dVar), null, null, 6);
            Clause currencyClause2 = new CurrencyClause(z92.f.l(dVar), CurrencyClause.Format.Ticker.f57756a, null, 4);
            if (kVar == io3.k.DELISTED) {
                currencyClause2 = new CompositeClause(zhm.v.k(currencyClause2, new TextLocalisedClause(R$string.home_currency_account_delisted, null, null, 14)), new DotDividerClause((Integer) null), null, null, 12);
            }
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(dVar.f163147c, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 60);
            if (z3) {
                dj0.d dVarE = io3.h.e(dVar);
                MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
                Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
                if (kVar == kVar2) {
                    custom = null;
                }
                bVar = new RowDelegate.Model.c.b(new MoneyClause(dVarE, defaults, custom, null, 8), null, null, false, 126);
            } else {
                bVar = null;
            }
            arrayList.add(new SelectableDelegate.Model(str, new RowDelegate.Model(strR, image40, currencyClause, null, 0, currencyClause2, null, null, 0, bVar, false, null, false, null, null, null, null, null, null, dVar, null, 0, 0, 0, 0, 532675544), zContains ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    @Override // x7a.d
    public final Clause a(Set preSelectedModelIds, Set ids) {
        Intrinsics.checkNotNullParameter(preSelectedModelIds, "preSelectedModelIds");
        Intrinsics.checkNotNullParameter(ids, "ids");
        int size = ids.size();
        return size > 0 ? new TextLocalisedClause(com.revolut.feature.statements.R$string.statement_switcher_selected_action, zhm.u.c(Integer.valueOf(size)), null, 12) : new TextLocalisedClause(com.revolut.feature.statements.R$string.statement_switcher_action, null, null, 14);
    }

    @Override // x7a.d
    public final s7a.c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Set set = ids;
        xi0.a aVar = xi0.b.Companion;
        ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            t61.a.A(aVar, (String) it8.next(), arrayList);
        }
        return new d0(zhm.d0.i1(arrayList));
    }

    @Override // x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        return (List) iii.c.f(data, new wyc.p(2), new wug.k(28), new wx6.k(this, selectedModelIds, 1));
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        io3.l lVar;
        AccountId accountId;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.statements.api.navigation.AccountStatementProduct");
        AccountStatementProduct accountStatementProduct = (AccountStatementProduct) obj2;
        io3.k[] elements = {io3.k.ACTIVE, io3.k.INACTIVE, io3.k.DELISTED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        w4l.k kVar = z ? w4l.i.f294643c : w4l.h.f294642c;
        boolean z3 = accountStatementProduct instanceof AccountStatementProduct.JointCurrent;
        if (z3 || (accountStatementProduct instanceof AccountStatementProduct.Commodities) || (accountStatementProduct instanceof AccountStatementProduct.PersonalCurrent) || (accountStatementProduct instanceof AccountStatementProduct.Teen)) {
            lVar = io3.l.CURRENT;
        } else {
            if (!(accountStatementProduct instanceof AccountStatementProduct.Pro)) {
                if (accountStatementProduct instanceof AccountStatementProduct.Junior) {
                    throw new IllegalArgumentException("Currency selection is not supported for the Junior product");
                }
                throw new NoWhenBranchMatchedException();
            }
            lVar = io3.l.MERCHANT;
        }
        io3.l lVar2 = lVar;
        AccountStatementProduct.JointCurrent jointCurrent = z3 ? (AccountStatementProduct.JointCurrent) accountStatementProduct : null;
        if (jointCurrent == null || (accountId = jointCurrent.f88235a) == null) {
            accountId = AccountId.Personal.f51414a;
        }
        return rd0.e.b(nim.a.w(osg.b.c(this.f301244a, kVar, setY0, lVar2, null, accountId, 8), new wvg.d0(accountStatementProduct, 19)));
    }
}
