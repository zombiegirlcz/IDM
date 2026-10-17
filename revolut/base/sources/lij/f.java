package lij;

import aw0.m6;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nij.h;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f195535a;

    public f(h planItemBuilder) {
        Intrinsics.checkNotNullParameter(planItemBuilder, "planItemBuilder");
        this.f195535a = planItemBuilder;
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f195532a;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            EsimDataPlan esimDataPlan = (EsimDataPlan) obj2;
            SelectableDelegate.Model modelA = this.f195535a.a(String.valueOf(i), esimDataPlan, Intrinsics.f(esimDataPlan.f100212a, domainState.f195533b), false);
            if (modelA != null) {
                arrayList.add(modelA);
            }
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.e(false, new TextLocalisedClause(R$string.esim_plan_selection_unlimited_data_plans_disclaimer, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, m6.c(n6.Companion, new TextLocalisedClause(R$string.esim_data_plans_actions_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 53), arrayList, new lw0.a(new TextLocalisedClause(R$string.esim_mobile_plans_plan_item_unlimited_gb_title, null, null, 14), new TextLocalisedClause(R$string.esim_plan_selection_select_duration_subtitle, null, null, 14), null, null, false, 28));
    }
}
