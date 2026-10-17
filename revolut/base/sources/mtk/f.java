package mtk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.AddKeyStatsItemFlowContract$Step;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.models.AssetStatsGroup;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import uvk.g;
import uvk.h;
import yki.l;
import zhm.a1;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208908a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.stockdetails.impl.ui.flows.a f208909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AddKeyStatsItemFlowContract$Step f208910c;
    public final /* synthetic */ l d;

    public /* synthetic */ f(com.revolut.retail.feature.stockdetails.impl.ui.flows.a aVar, AddKeyStatsItemFlowContract$Step addKeyStatsItemFlowContract$Step, l lVar) {
        this.f208909b = aVar;
        this.f208910c = addKeyStatsItemFlowContract$Step;
        this.d = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f208908a) {
            case 0:
                h output = (h) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z = output instanceof uvk.f;
                com.revolut.retail.feature.stockdetails.impl.ui.flows.a aVar = this.f208909b;
                if (z) {
                    oki.h.t2(aVar, this.d, new AddKeyStatsItemFlowContract$Step.ViewGroupItems(((uvk.f) output).f283477a, ((AddKeyStatsItemFlowContract$Step.ViewGroupList) this.f208910c).f103821a), true, null, false, 12);
                } else {
                    if (!(output instanceof g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Set set = ((g) output).f283478a;
                    if (set.isEmpty()) {
                        aVar.f103823q.getClass();
                        aVar.X1(new y0("none-selected-error", new z(new TextLocalisedClause(R$string.wealth_details_customize_key_stats_error_none_selected_title, null, null, 14), new TextLocalisedClause(R$string.wealth_details_customize_key_stats_error_none_selected_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4));
                    } else {
                        aVar.C2(new d(set));
                    }
                }
                return Unit.f186387a;
            default:
                wvk.e screenOutput = (wvk.e) obj2;
                Intrinsics.checkNotNullParameter(screenOutput, "screenOutput");
                com.revolut.retail.feature.stockdetails.impl.ui.flows.a aVar2 = this.f208909b;
                qy5.a aVar3 = aVar2.f103822p;
                AddKeyStatsItemFlowContract$Step.ViewGroupItems viewGroupItems = (AddKeyStatsItemFlowContract$Step.ViewGroupItems) this.f208910c;
                Set currentAssetStatsIdList = viewGroupItems.f103820b;
                AssetStatsGroup updatedAssetStatsGroup = viewGroupItems.f103819a;
                Set updatedGroupAssetStatsIdSet = screenOutput.f300544a;
                hel.b bVar = aVar2.o.f208906c;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(currentAssetStatsIdList, "currentAssetStatsIdList");
                Intrinsics.checkNotNullParameter(updatedAssetStatsGroup, "updatedAssetStatsGroup");
                Intrinsics.checkNotNullParameter(updatedGroupAssetStatsIdSet, "updatedGroupAssetStatsIdSet");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : currentAssetStatsIdList) {
                    if (!zvk.b.a((AssetStatsId) obj3, bVar).equals(updatedAssetStatsGroup)) {
                        arrayList.add(obj3);
                    }
                }
                LinkedHashSet linkedHashSetL = a1.l(d0.i1(arrayList), updatedGroupAssetStatsIdSet);
                l lVar = this.d;
                oki.h.r2(lVar);
                oki.h.t2(aVar2, lVar, new AddKeyStatsItemFlowContract$Step.ViewGroupList(linkedHashSetL), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ f(com.revolut.retail.feature.stockdetails.impl.ui.flows.a aVar, l lVar, AddKeyStatsItemFlowContract$Step addKeyStatsItemFlowContract$Step) {
        this.f208909b = aVar;
        this.d = lVar;
        this.f208910c = addKeyStatsItemFlowContract$Step;
    }
}
