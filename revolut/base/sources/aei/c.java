package aei;

import a0.d;
import aw0.e;
import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_rev_points_pocket_api.R$string;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketThreshold;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import qv0.i;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements n {
    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List thresholds = domainState.f3593a;
        Intrinsics.checkNotNullParameter(thresholds, "thresholds");
        s0 s0Var = new s0(2);
        s0Var.a(new CellDetailsDelegate.Model("REV_POINTS_POCKET_THRESHOLD_SECTION_TITLE_ITEM_ID", new TextLocalisedClause(R$string.rev_points_pocket_benefits_breakdown_min_balance, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new TextLocalisedClause(R$string.rev_points_pocket_benefits_breakdown_yearly_reward, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), 0, null, null, null, null, null, false, 0, 0, 32760));
        List list = thresholds;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            RevPointsPocketThreshold revPointsPocketThreshold = (RevPointsPocketThreshold) obj2;
            arrayList.add(new CellDetailsDelegate.Model(d.n("REV_POINTS_POCKET_THRESHOLD_SECTION_ITEM_ID_", i), new MoneyClause(revPointsPocketThreshold.f97795c, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), o9.NON_SENSITIVE), nub.a.q(revPointsPocketThreshold.f97794b, null, null, null, 7), 0, null, null, null, null, null, false, 0, 0, 32760));
            i = i2;
        }
        s0Var.b(arrayList.toArray(new i[0]));
        ArrayList arrayList2 = s0Var.f186433a;
        List listK = v.k(arrayList2.toArray(new i[arrayList2.size()]));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(new e(false, null, null, new n6(new TextLocalisedClause(R$string.rev_points_pocket_common_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), listK, new lw0.a(new TextLocalisedClause(R$string.rev_points_pocket_benefits_breakdown_title, null, null, 14), new TextLocalisedClause(R$string.rev_points_pocket_benefits_breakdown_subtitle, null, null, 14), null, null, false, 28));
    }
}
