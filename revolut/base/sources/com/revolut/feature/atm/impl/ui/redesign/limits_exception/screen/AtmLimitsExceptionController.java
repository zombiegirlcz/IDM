package com.revolut.feature.atm.impl.ui.redesign.limits_exception.screen;

import android.view.View;
import com.revolut.feature.atm.impl.ui.redesign.limits_exception.screen.AtmLimitsExceptionController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qg4.d;
import qk2.b;
import qk2.e;
import qk2.g;
import te0.w;
import xf6.t1;
import xj2.h;
import xj2.n;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/atm/impl/ui/redesign/limits_exception/screen/AtmLimitsExceptionController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lqk2/e;", "Lqk2/b;", "<init>", "()V", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AtmLimitsExceptionController extends BaseBottomSheetRecyclerController<e, b> {
    public static final /* synthetic */ int T = 0;
    public final Object Q;
    public final Object R;
    public final f0 S = f0.f322471a;

    public AtmLimitsExceptionController() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: qk2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtmLimitsExceptionController f246950b;

            {
                this.f246950b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AtmLimitsExceptionController atmLimitsExceptionController = this.f246950b;
                switch (i2) {
                    case 0:
                        int i3 = AtmLimitsExceptionController.T;
                        qji.b bVarU2 = atmLimitsExceptionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.atm.impl.ui.redesign.limits_exception.screen.di.AtmLimitsExceptionControllerInjector");
                        n nVar = ((xj2.i) bVarU2).f306465a;
                        xj2.h hVar = new xj2.h();
                        int i5 = 18;
                        hVar.f306463a = e4m.b.b(new t1(nVar, hVar, 1, i5));
                        hVar.f306464b = e4m.b.b(new t1(nVar, hVar, 0, i5));
                        return hVar;
                    default:
                        int i6 = AtmLimitsExceptionController.T;
                        return (g) ((xj2.h) atmLimitsExceptionController.Q.getValue()).f306464b.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: qk2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtmLimitsExceptionController f246950b;

            {
                this.f246950b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AtmLimitsExceptionController atmLimitsExceptionController = this.f246950b;
                switch (i22) {
                    case 0:
                        int i3 = AtmLimitsExceptionController.T;
                        qji.b bVarU2 = atmLimitsExceptionController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.atm.impl.ui.redesign.limits_exception.screen.di.AtmLimitsExceptionControllerInjector");
                        n nVar = ((xj2.i) bVarU2).f306465a;
                        xj2.h hVar = new xj2.h();
                        int i5 = 18;
                        hVar.f306463a = e4m.b.b(new t1(nVar, hVar, 1, i5));
                        hVar.f306464b = e4m.b.b(new t1(nVar, hVar, 0, i5));
                        return hVar;
                    default:
                        int i6 = AtmLimitsExceptionController.T;
                        return (g) ((xj2.h) atmLimitsExceptionController.Q.getValue()).f306464b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (h) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new d(this, null, 7), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (g) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getT() {
        return this.S;
    }
}
