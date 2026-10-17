package h28;

import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.invest_feed.impl.widgets.analytics.screen.AnalyticsMethodScreenContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsMethodScreenContract$InputData f148740a;

    public i(AnalyticsMethodScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f148740a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        int i2;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        EnumEntries<c> enumEntriesA = c.a();
        ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
        for (c cVar : enumEntriesA) {
            String str = "analyticsMethod-" + cVar + "-list-id";
            int[] iArr = h.f148739a;
            int i3 = iArr[cVar.ordinal()];
            if (i3 == 1) {
                i = R$string.wealth_analytics_mode_value_title;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.wealth_analytics_mode_performance;
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
            int i5 = iArr[cVar.ordinal()];
            if (i5 == 1) {
                i2 = R$drawable.uikit_icn_24_total_value;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$drawable.uikit_icn_24_performance;
            }
            arrayList.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i2, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), textLocalisedClause, null, 0, null, null, null, 0, null, false, null, cVar == this.f148740a.f76456a, null, null, null, null, null, null, cVar, null, 0, 0, 0, 0, 532668408));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new g(arrayList);
    }
}
