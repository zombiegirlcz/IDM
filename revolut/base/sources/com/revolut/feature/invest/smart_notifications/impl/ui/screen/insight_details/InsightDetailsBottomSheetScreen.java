package com.revolut.feature.invest.smart_notifications.impl.ui.screen.insight_details;

import a0.d;
import aii.q;
import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.insight_details.InsightDetailsBottomSheetContract$InputData;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.insight_details.InsightDetailsBottomSheetScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m18.b;
import te0.w;
import ue0.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/invest/smart_notifications/impl/ui/screen/insight_details/InsightDetailsBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "feature_invest_smart_notifications_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsightDetailsBottomSheetScreen extends BaseBottomSheetRecyclerController<q, k> {
    public static final /* synthetic */ int U = 0;
    public final InsightDetailsBottomSheetContract$InputData Q;
    public final List R;
    public final Object S;
    public final Object T;

    public InsightDetailsBottomSheetScreen(InsightDetailsBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        final int i2 = 1;
        this.R = v.k(new CellDetailsDelegate(), new PlainTextDelegate());
        this.S = w.y0(new Function0(this) { // from class: z18.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsightDetailsBottomSheetScreen f318758b;

            {
                this.f318758b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                InsightDetailsBottomSheetScreen insightDetailsBottomSheetScreen = this.f318758b;
                switch (i3) {
                    case 0:
                        int i5 = InsightDetailsBottomSheetScreen.U;
                        phm.a aVar = (phm.a) e.j(insightDetailsBottomSheetScreen.m2()).a().get(m18.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", m18.e.class, " is not found"));
                        }
                        m18.e eVar = ((m18.e) aVar2.b()).f201271q;
                        InsightDetailsBottomSheetContract$InputData insightDetailsBottomSheetContract$InputData = insightDetailsBottomSheetScreen.Q;
                        insightDetailsBottomSheetContract$InputData.getClass();
                        return new m18.b(eVar, insightDetailsBottomSheetContract$InputData);
                    default:
                        int i6 = InsightDetailsBottomSheetScreen.U;
                        return (b) ((m18.b) insightDetailsBottomSheetScreen.S.getValue()).f201257b.get();
                }
            }
        });
        this.T = w.y0(new Function0(this) { // from class: z18.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsightDetailsBottomSheetScreen f318758b;

            {
                this.f318758b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                InsightDetailsBottomSheetScreen insightDetailsBottomSheetScreen = this.f318758b;
                switch (i3) {
                    case 0:
                        int i5 = InsightDetailsBottomSheetScreen.U;
                        phm.a aVar = (phm.a) e.j(insightDetailsBottomSheetScreen.m2()).a().get(m18.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", m18.e.class, " is not found"));
                        }
                        m18.e eVar = ((m18.e) aVar2.b()).f201271q;
                        InsightDetailsBottomSheetContract$InputData insightDetailsBottomSheetContract$InputData = insightDetailsBottomSheetScreen.Q;
                        insightDetailsBottomSheetContract$InputData.getClass();
                        return new m18.b(eVar, insightDetailsBottomSheetContract$InputData);
                    default:
                        int i6 = InsightDetailsBottomSheetScreen.U;
                        return (b) ((m18.b) insightDetailsBottomSheetScreen.S.getValue()).f201257b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (z18.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new yl6.b(this, null, 25), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (z18.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
