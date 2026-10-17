package com.revolut.feature.junior_settings.impl.ui_kompot.payments_settings_explanatory;

import android.view.View;
import cli.k;
import com.revolut.feature.junior_settings.impl.ui_kompot.payments_settings_explanatory.JuniorPaymentsSettingsExplanatoryController;
import com.revolut.feature.junior_settings.impl.ui_kompot.payments_settings_explanatory.JuniorPaymentsSettingsExplanatoryControllerContract$Input;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import mn8.j;
import mn8.m;
import mn8.o;
import po8.e;
import po8.h;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/payments_settings_explanatory/JuniorPaymentsSettingsExplanatoryController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lpo8/e;", "Lcli/k;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorPaymentsSettingsExplanatoryController extends BaseBottomSheetRecyclerController<e, k> {
    public static final /* synthetic */ int U = 0;
    public final JuniorPaymentsSettingsExplanatoryControllerContract$Input Q;
    public final List R;
    public final Object S;
    public final Object T;

    public JuniorPaymentsSettingsExplanatoryController(JuniorPaymentsSettingsExplanatoryControllerContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.Q = input;
        this.R = b.v(null, null, 7);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: po8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPaymentsSettingsExplanatoryController f237899b;

            {
                this.f237899b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorPaymentsSettingsExplanatoryController juniorPaymentsSettingsExplanatoryController = this.f237899b;
                switch (i2) {
                    case 0:
                        int i3 = JuniorPaymentsSettingsExplanatoryController.U;
                        qji.b bVarU2 = juniorPaymentsSettingsExplanatoryController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_settings.impl.ui_kompot.payments_settings_explanatory.di.JuniorPaymentsSettingsExplanatoryControllerInjector");
                        m mVar = (m) bVarU2;
                        o oVar = mVar.f207457b;
                        m mVar2 = mVar.f207458c;
                        JuniorPaymentsSettingsExplanatoryControllerContract$Input juniorPaymentsSettingsExplanatoryControllerContract$Input = juniorPaymentsSettingsExplanatoryController.Q;
                        juniorPaymentsSettingsExplanatoryControllerContract$Input.getClass();
                        return new mn8.j(oVar, mVar2, juniorPaymentsSettingsExplanatoryControllerContract$Input);
                    default:
                        int i5 = JuniorPaymentsSettingsExplanatoryController.U;
                        return (h) ((mn8.j) juniorPaymentsSettingsExplanatoryController.S.getValue()).f207441b.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: po8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPaymentsSettingsExplanatoryController f237899b;

            {
                this.f237899b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorPaymentsSettingsExplanatoryController juniorPaymentsSettingsExplanatoryController = this.f237899b;
                switch (i22) {
                    case 0:
                        int i3 = JuniorPaymentsSettingsExplanatoryController.U;
                        qji.b bVarU2 = juniorPaymentsSettingsExplanatoryController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_settings.impl.ui_kompot.payments_settings_explanatory.di.JuniorPaymentsSettingsExplanatoryControllerInjector");
                        m mVar = (m) bVarU2;
                        o oVar = mVar.f207457b;
                        m mVar2 = mVar.f207458c;
                        JuniorPaymentsSettingsExplanatoryControllerContract$Input juniorPaymentsSettingsExplanatoryControllerContract$Input = juniorPaymentsSettingsExplanatoryController.Q;
                        juniorPaymentsSettingsExplanatoryControllerContract$Input.getClass();
                        return new mn8.j(oVar, mVar2, juniorPaymentsSettingsExplanatoryControllerContract$Input);
                    default:
                        int i5 = JuniorPaymentsSettingsExplanatoryController.U;
                        return (h) ((mn8.j) juniorPaymentsSettingsExplanatoryController.S.getValue()).f207441b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (h) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new po8.b(this, null, 0), 3);
        ViewController.P2(this, f3(), new po8.b(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (h) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
