package pzd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.api.models.ConsolidatedStatementProductType;
import ip0.qd0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends a8a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final elb.b f240956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zxd.c f240957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f240958c;

    public c(elb.b savingsFeatureInteractor, zxd.c statementsInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(savingsFeatureInteractor, "savingsFeatureInteractor");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f240956a = savingsFeatureInteractor;
        this.f240957b = statementsInteractor;
        this.f240958c = userInteractor;
    }

    public static SelectableDelegate.Model f(ConsolidatedStatementProductType consolidatedStatementProductType, Set set, Set set2, uib.c cVar, do3.n nVar) {
        TextLocalisedClause textLocalisedClause;
        String str;
        if (!set.contains(consolidatedStatementProductType)) {
            return null;
        }
        boolean zContains = set2.contains(consolidatedStatementProductType.name());
        String strName = consolidatedStatementProductType.name();
        String strR = a0.d.r(consolidatedStatementProductType.name(), "_inner");
        int[] iArr = a.f240952a;
        int i = iArr[consolidatedStatementProductType.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(oc.c.r(cVar), null, null, 14);
        } else if (i == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.common_product_crypto, null, null, 14);
        } else if (i == 3) {
            textLocalisedClause = new TextLocalisedClause(R$string.common_product_commodities, null, null, 14);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            wi0.b.Companion.getClass();
            textLocalisedClause = te0.w.S(nVar, wi0.b.p0) ? new TextLocalisedClause(R$string.common_product_stocks, null, null, 14) : new TextLocalisedClause(R$string.common_product_brokerage_account, null, null, 14);
        }
        int i2 = iArr[consolidatedStatementProductType.ordinal()];
        if (i2 == 1) {
            str = "3d400";
        } else if (i2 == 2) {
            str = "3d128";
        } else if (i2 == 3) {
            str = "3d127";
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "3d240";
        }
        return new SelectableDelegate.Model(strName, new RowDelegate.Model(strR, new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c(str, null, null, null, 30), null, null, false, null, false, 60), textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, consolidatedStatementProductType, null, 0, 0, 0, 0, 532676600), zContains ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760);
    }

    @Override // a8a.d
    public final boolean b(String query, qv0.i model) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(model, "model");
        return true;
    }

    @Override // a8a.d
    public final Clause c(Set preSelectedModelIds, Set ids) {
        Intrinsics.checkNotNullParameter(preSelectedModelIds, "preSelectedModelIds");
        Intrinsics.checkNotNullParameter(ids, "ids");
        int size = ids.size();
        return size > 0 ? new TextLocalisedClause(R$string.statement_switcher_selected_action, zhm.u.c(Integer.valueOf(size)), null, 12) : new TextLocalisedClause(R$string.statement_switcher_action, null, null, 14);
    }

    @Override // a8a.d
    public final y7a.w d(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        ConsolidatedStatementProductType[] consolidatedStatementProductTypeArrValues = ConsolidatedStatementProductType.values();
        ArrayList arrayList = new ArrayList();
        for (ConsolidatedStatementProductType consolidatedStatementProductType : consolidatedStatementProductTypeArrValues) {
            if (ids.contains(consolidatedStatementProductType.name())) {
                arrayList.add(consolidatedStatementProductType);
            }
        }
        return new rzd.a(zhm.d0.i1(arrayList));
    }

    @Override // a8a.d
    public final efm.r e(Object obj2, Set selectedModelIds, List list) {
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        efm.r map = ((ryd.w) this.f240957b).d().x().map(new mic.a0(4, b.f240954a));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return nim.a.w(kli.a.i(map, rd0.e.c(this.f240956a.a(w4l.j.f294644c), p0.f264003c), this.f240958c.k(false)), new imk.e(this, selectedModelIds, 26));
    }
}
