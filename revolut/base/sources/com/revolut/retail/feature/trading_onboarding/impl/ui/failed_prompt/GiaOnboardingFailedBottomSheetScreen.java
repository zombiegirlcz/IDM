package com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt;

import android.view.View;
import bzk.a;
import bzk.d;
import bzk.k;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.GiaOnboardingFailedBottomSheetContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.GiaOnboardingFailedBottomSheetScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kyk.b;
import kyk.v;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/failed_prompt/GiaOnboardingFailedBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lbzk/d;", "Lbzk/a;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GiaOnboardingFailedBottomSheetScreen extends BaseBottomSheetRecyclerController<d, a> {
    public static final /* synthetic */ int U = 0;
    public final GiaOnboardingFailedBottomSheetContract$InputData Q;
    public final Object R;
    public final List S;
    public final Object T;

    public GiaOnboardingFailedBottomSheetScreen(GiaOnboardingFailedBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: bzk.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GiaOnboardingFailedBottomSheetScreen f20054b;

            {
                this.f20054b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GiaOnboardingFailedBottomSheetScreen giaOnboardingFailedBottomSheetScreen = this.f20054b;
                switch (i2) {
                    case 0:
                        int i3 = GiaOnboardingFailedBottomSheetScreen.U;
                        return (k) ((kyk.b) giaOnboardingFailedBottomSheetScreen.T.getValue()).f190930b.get();
                    default:
                        int i5 = GiaOnboardingFailedBottomSheetScreen.U;
                        qji.b bVarU2 = giaOnboardingFailedBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.di.GiaOnboardingFailedBottomSheetComponent.Injector");
                        kyk.c cVar = (kyk.c) bVarU2;
                        v vVar = cVar.f190932b;
                        kyk.c cVar2 = cVar.f190933c;
                        GiaOnboardingFailedBottomSheetContract$InputData giaOnboardingFailedBottomSheetContract$InputData = giaOnboardingFailedBottomSheetScreen.Q;
                        giaOnboardingFailedBottomSheetContract$InputData.getClass();
                        return new kyk.b(vVar, cVar2, giaOnboardingFailedBottomSheetContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.S = zhm.v.k(new RowDelegate(null, null, 7), new CellDetailsStandaloneNoteDelegate(), new ListSubheaderDelegate());
        this.T = w.y0(new Function0(this) { // from class: bzk.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GiaOnboardingFailedBottomSheetScreen f20054b;

            {
                this.f20054b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                GiaOnboardingFailedBottomSheetScreen giaOnboardingFailedBottomSheetScreen = this.f20054b;
                switch (i22) {
                    case 0:
                        int i3 = GiaOnboardingFailedBottomSheetScreen.U;
                        return (k) ((kyk.b) giaOnboardingFailedBottomSheetScreen.T.getValue()).f190930b.get();
                    default:
                        int i5 = GiaOnboardingFailedBottomSheetScreen.U;
                        qji.b bVarU2 = giaOnboardingFailedBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.di.GiaOnboardingFailedBottomSheetComponent.Injector");
                        kyk.c cVar = (kyk.c) bVarU2;
                        v vVar = cVar.f190932b;
                        kyk.c cVar2 = cVar.f190933c;
                        GiaOnboardingFailedBottomSheetContract$InputData giaOnboardingFailedBottomSheetContract$InputData = giaOnboardingFailedBottomSheetScreen.Q;
                        giaOnboardingFailedBottomSheetContract$InputData.getClass();
                        return new kyk.b(vVar, cVar2, giaOnboardingFailedBottomSheetContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new btd.e(this, null, 21), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (k) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getQ() {
        return this.S;
    }
}
