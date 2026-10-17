package amk;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreenContract$TitleConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import wli.x;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends oki.h implements e {
    public final com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f6473p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ajk.b f6474q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f6475r;

    public h(n stateMapper, PlanDocumentsBottomSheetScreenContract$InputData inputData, com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.a titleProvider, x deeplinkHandler, ajk.b outOfAppNavigationProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(titleProvider, "titleProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        this.o = titleProvider;
        this.f6473p = deeplinkHandler;
        this.f6474q = outOfAppNavigationProvider;
        this.f6475r = mra.d.b(this, new d(new Data(null, null, true, 3, null), inputData.f103521b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Flow gVar;
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.a aVar = this.o;
        PlanDocumentsBottomSheetScreenContract$TitleConfig planDocumentsBottomSheetScreenContract$TitleConfig = aVar.f103525a.f103520a;
        if (planDocumentsBottomSheetScreenContract$TitleConfig instanceof PlanDocumentsBottomSheetScreenContract$TitleConfig.Default) {
            gVar = nim.a.v(rd0.e.b(aVar.f103526b.r(((PlanDocumentsBottomSheetScreenContract$TitleConfig.Default) planDocumentsBottomSheetScreenContract$TitleConfig).f103523a)), new amf.i(3));
        } else if (planDocumentsBottomSheetScreenContract$TitleConfig instanceof PlanDocumentsBottomSheetScreenContract$TitleConfig.Custom) {
            gVar = new go.g(new Data(((PlanDocumentsBottomSheetScreenContract$TitleConfig.Custom) planDocumentsBottomSheetScreenContract$TitleConfig).f103522a, null, false, 6, null), 2);
        } else {
            if (!(planDocumentsBottomSheetScreenContract$TitleConfig instanceof PlanDocumentsBottomSheetScreenContract$TitleConfig.NoTitle)) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = new go.g(new Data(null, null, false, 6, null), 2);
        }
        l.a1(this, gVar, null, null, new af4.e(this, null, 25), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f6475r;
    }
}
