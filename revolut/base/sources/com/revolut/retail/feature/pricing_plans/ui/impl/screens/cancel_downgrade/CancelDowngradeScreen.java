package com.revolut.retail.feature.pricing_plans.ui.impl.screens.cancel_downgrade;

import android.view.View;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.cancel_downgrade.CancelDowngradeScreen;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.a;
import prk.k0;
import qgk.b;
import qgk.i0;
import sjk.c;
import sjk.f;
import vkm.d;
import xki.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/cancel_downgrade/CancelDowngradeScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetController;", "Lsjk/c;", "Lcli/w;", "Lsjk/f;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CancelDowngradeScreen extends BaseBottomSheetController<c> implements w {
    public static final /* synthetic */ int Q = 0;
    public final Object N;
    public final Object O;
    public final Object P;

    public CancelDowngradeScreen() {
        final int i = 0;
        this.N = te0.w.y0(new Function0(this) { // from class: sjk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancelDowngradeScreen f263735b;

            {
                this.f263735b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CancelDowngradeScreen cancelDowngradeScreen = this.f263735b;
                switch (i2) {
                    case 0:
                        int i3 = CancelDowngradeScreen.Q;
                        return n14.e.a(cancelDowngradeScreen, (e) cancelDowngradeScreen.O.getValue());
                    case 1:
                        int i5 = CancelDowngradeScreen.Q;
                        return (e) ((qgk.b) cancelDowngradeScreen.P.getValue()).f245886b.get();
                    default:
                        int i6 = CancelDowngradeScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(cancelDowngradeScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        qgk.b bVar = new qgk.b();
                        int i21 = 22;
                        bVar.f245885a = e4m.b.b(new k0(i0Var, bVar, 1, i21));
                        bVar.f245886b = e4m.b.b(new k0(i0Var, bVar, 0, i21));
                        return bVar;
                }
            }
        });
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: sjk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancelDowngradeScreen f263735b;

            {
                this.f263735b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CancelDowngradeScreen cancelDowngradeScreen = this.f263735b;
                switch (i22) {
                    case 0:
                        int i3 = CancelDowngradeScreen.Q;
                        return n14.e.a(cancelDowngradeScreen, (e) cancelDowngradeScreen.O.getValue());
                    case 1:
                        int i5 = CancelDowngradeScreen.Q;
                        return (e) ((qgk.b) cancelDowngradeScreen.P.getValue()).f245886b.get();
                    default:
                        int i6 = CancelDowngradeScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(cancelDowngradeScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        qgk.b bVar = new qgk.b();
                        int i21 = 22;
                        bVar.f245885a = e4m.b.b(new k0(i0Var, bVar, 1, i21));
                        bVar.f245886b = e4m.b.b(new k0(i0Var, bVar, 0, i21));
                        return bVar;
                }
            }
        });
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: sjk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancelDowngradeScreen f263735b;

            {
                this.f263735b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CancelDowngradeScreen cancelDowngradeScreen = this.f263735b;
                switch (i22) {
                    case 0:
                        int i32 = CancelDowngradeScreen.Q;
                        return n14.e.a(cancelDowngradeScreen, (e) cancelDowngradeScreen.O.getValue());
                    case 1:
                        int i5 = CancelDowngradeScreen.Q;
                        return (e) ((qgk.b) cancelDowngradeScreen.P.getValue()).f245886b.get();
                    default:
                        int i6 = CancelDowngradeScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(cancelDowngradeScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        qgk.b bVar = new qgk.b();
                        int i21 = 22;
                        bVar.f245885a = e4m.b.b(new k0(i0Var, bVar, 1, i21));
                        bVar.f245886b = e4m.b.b(new k0(i0Var, bVar, 0, i21));
                        return bVar;
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        j3(uiState.f263739a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (sjk.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d dVarE3 = e3();
        ?? r102 = this.O;
        ViewController.P2(this, dVarE3, new ryj.f(2, (sjk.e) r102.getValue(), sjk.e.class, "onPrimaryButtonClick", "onPrimaryButtonClick(Lcom/revolut/core/ui_kit/models/LargeActionButtonModel;)V", 4, 7), 3);
        ViewController.P2(this, f3(), new ryj.f(2, (sjk.e) r102.getValue(), sjk.e.class, "onSecondaryButtonClick", "onSecondaryButtonClick(Lcom/revolut/core/ui_kit/models/LargeActionButtonModel;)V", 4, 8), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final a k() {
        return (a0) this.N.getValue();
    }
}
