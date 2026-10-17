package com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.screens.bottom_sheet;

import aii.q;
import android.view.View;
import blb.b;
import blb.e;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsBarRatingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PieChartVerticalLegendDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.screens.bottom_sheet.BottomInfoSheetScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import efm.r;
import hlb.f;
import ilb.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.k;
import te0.w;
import v0.a;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/core/info_sheets/presentation/screens/bottom_sheet/BottomInfoSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lhlb/f;", "Lno/k;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BottomInfoSheetScreen extends BaseBottomSheetRecyclerController<q, f> implements k {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ int f83218b0 = 0;
    public final RowDelegate Q;
    public final TextDelegate R;
    public final CellDetailsDelegate S;
    public final CellDetailsBarRatingDelegate T;
    public final PieChartVerticalLegendDelegate U;
    public final ListSubheaderDelegate V;
    public final FullScreenStateDelegate W;
    public final Object X;
    public final Object Y;
    public final List Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public AnalyticsContext f83219a0;

    public BottomInfoSheetScreen(String sheetKey) {
        Intrinsics.checkNotNullParameter(sheetKey, "sheetKey");
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Q = rowDelegate;
        TextDelegate textDelegate = new TextDelegate();
        this.R = textDelegate;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.S = cellDetailsDelegate;
        CellDetailsBarRatingDelegate cellDetailsBarRatingDelegate = new CellDetailsBarRatingDelegate();
        this.T = cellDetailsBarRatingDelegate;
        PieChartVerticalLegendDelegate pieChartVerticalLegendDelegate = new PieChartVerticalLegendDelegate();
        this.U = pieChartVerticalLegendDelegate;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.V = listSubheaderDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.W = fullScreenStateDelegate;
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: ilb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BottomInfoSheetScreen f162214b;

            {
                this.f162214b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BottomInfoSheetScreen bottomInfoSheetScreen = this.f162214b;
                switch (i2) {
                    case 0:
                        int i3 = BottomInfoSheetScreen.f83218b0;
                        qji.b bVarU2 = bottomInfoSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.screens.di.InfoSheetScreenInjector");
                        blb.a aVar = (blb.a) bVarU2;
                        e eVar = aVar.f16492b;
                        blb.a aVar2 = aVar.f16493c;
                        blb.b bVar = new blb.b();
                        bVar.f16494a = e4m.b.b(new afj.d(eVar, aVar2, bVar, 1, 15));
                        bVar.f16495b = e4m.b.b(new afj.d(eVar, aVar2, bVar, 0, 15));
                        bVar.f16496c = e4m.b.b(new afj.d(eVar, aVar2, bVar, 2, 15));
                        bVar.d = e4m.b.b(new afj.d(eVar, aVar2, bVar, 3, 15));
                        return bVar;
                    default:
                        int i5 = BottomInfoSheetScreen.f83218b0;
                        return (d) ((blb.b) bottomInfoSheetScreen.X.getValue()).f16496c.get();
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: ilb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BottomInfoSheetScreen f162214b;

            {
                this.f162214b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BottomInfoSheetScreen bottomInfoSheetScreen = this.f162214b;
                switch (i22) {
                    case 0:
                        int i3 = BottomInfoSheetScreen.f83218b0;
                        qji.b bVarU2 = bottomInfoSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.screens.di.InfoSheetScreenInjector");
                        blb.a aVar = (blb.a) bVarU2;
                        e eVar = aVar.f16492b;
                        blb.a aVar2 = aVar.f16493c;
                        blb.b bVar = new blb.b();
                        bVar.f16494a = e4m.b.b(new afj.d(eVar, aVar2, bVar, 1, 15));
                        bVar.f16495b = e4m.b.b(new afj.d(eVar, aVar2, bVar, 0, 15));
                        bVar.f16496c = e4m.b.b(new afj.d(eVar, aVar2, bVar, 2, 15));
                        bVar.d = e4m.b.b(new afj.d(eVar, aVar2, bVar, 3, 15));
                        return bVar;
                    default:
                        int i5 = BottomInfoSheetScreen.f83218b0;
                        return (d) ((blb.b) bottomInfoSheetScreen.X.getValue()).f16496c.get();
                }
            }
        });
        this.Z = v.k(fullScreenStateDelegate, rowDelegate, textDelegate, new RowLoadingDelegate(), cellDetailsBarRatingDelegate, cellDetailsDelegate, cellDetailsBarRatingDelegate, pieChartVerticalLegendDelegate, listSubheaderDelegate);
        this.f83219a0 = new AnalyticsContext(a.b(sheetKey, AnalyticsContext.INSTANCE));
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.f83219a0 = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.X.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.f83219a0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.Y.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        pd.b.p(view, new TextLocalisedClause(R$string.savings_info_sheet_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(e3(), f3()), null, new ilb.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(h3(), rd0.e.b(this.R.d)), null, new ilb.b(this, null, 1), 3);
        r rVarMergeArray = r.mergeArray(this.Q.f53218h, this.S.f, this.T.f51820c, this.U.f52923c, this.V.f52707c, this.W.f52371h.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMergeArray, "mergeArray(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMergeArray), null, new ilb.b(this, null, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b d() {
        return (d) this.Y.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.Z;
    }
}
