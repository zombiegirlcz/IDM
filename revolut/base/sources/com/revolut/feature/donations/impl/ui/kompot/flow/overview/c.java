package com.revolut.feature.donations.impl.ui.kompot.flow.overview;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.donations.impl.R$string;
import com.revolut.feature.donations.impl.ui.kompot.flow.overview.CharitiesOverviewFlowContract$Page;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import n87.r;
import n8i.q0;
import nb6.d;
import nb6.i;
import nb6.l;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        Pair pair;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        i iVar = new i((List) iii.c.f(domainState.f213991c, new q0(13), new r(14), new mig.a(27)));
        List<CharitiesOverviewFlowContract$Page> list = domainState.f213989a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (CharitiesOverviewFlowContract$Page charitiesOverviewFlowContract$Page : list) {
            if (Intrinsics.f(charitiesOverviewFlowContract$Page, CharitiesOverviewFlowContract$Page.Charities.f72018a)) {
                pair = new Pair(Integer.valueOf(R$string.donations_overview_tab_charities_title), Integer.valueOf(R$drawable.uikit_icn_24_heart));
            } else {
                if (!Intrinsics.f(charitiesOverviewFlowContract$Page, CharitiesOverviewFlowContract$Page.Contributions.f72019a)) {
                    throw new NoWhenBranchMatchedException();
                }
                pair = new Pair(Integer.valueOf(R$string.donations_overview_tab_contribution_title), Integer.valueOf(R$drawable.uikit_icn_24_profile));
            }
            arrayList.add(new FloatingBottomBarView.Item(charitiesOverviewFlowContract$Page.getF94249a(), new TextLocalisedClause(((Number) pair.f186385a).intValue(), null, null, 14), new ResourceImage(((Number) pair.f186386b).intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, 24));
        }
        return new l(iVar, new nb6.j(arrayList), domainState.f213990b);
    }
}
