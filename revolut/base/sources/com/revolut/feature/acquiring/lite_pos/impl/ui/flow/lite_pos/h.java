package com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.LitePosFlowContract$Step;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements n {
    @Override // cli.n
    public final o c(j jVar) {
        FixedTabs.Item item;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<LitePosFlowContract$Step> list = domainState.f60733a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (LitePosFlowContract$Step litePosFlowContract$Step : list) {
            if (Intrinsics.f(litePosFlowContract$Step, LitePosFlowContract$Step.Amount.f60731a)) {
                item = new FixedTabs.Item(litePosFlowContract$Step.getF70838b(), new TextLocalisedClause(R$string.product_catalogue_flow_new_sale_custom_item_new_sale_title, null, null, 14), (AnalyticsContext) null, 12);
            } else {
                if (!Intrinsics.f(litePosFlowContract$Step, LitePosFlowContract$Step.Catalogue.f60732a)) {
                    throw new NoWhenBranchMatchedException();
                }
                item = new FixedTabs.Item(litePosFlowContract$Step.getF70838b(), new TextLocalisedClause(R$string.product_catalogue_flow_catalogue_catalogue_title, null, null, 14), (AnalyticsContext) null, 12);
            }
            arrayList.add(item);
        }
        return new xd1.h(arrayList, domainState.f60734b, domainState.f60733a.size() > 1, domainState.f60735c, domainState.d);
    }
}
