package com.revolut.feature.card_screen.impl.kompot.cards_carousel.renewed_dialog;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.renewed_dialog.RenewedDialogContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.renewed_dialog.RenewedDialogScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import q97.b1;
import r73.a;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/renewed_dialog/RenewedDialogScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lr73/a;", "Lcli/k;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RenewedDialogScreen extends BaseBottomSheetRecyclerController<a, k> {
    public static final /* synthetic */ int V = 0;
    public final RenewedDialogContract$InputData Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public RenewedDialogScreen(RenewedDialogContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: r73.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RenewedDialogScreen f251978b;

            {
                this.f251978b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RenewedDialogScreen renewedDialogScreen = this.f251978b;
                switch (i2) {
                    case 0:
                        int i3 = RenewedDialogScreen.V;
                        qji.b bVarU2 = renewedDialogScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.cards_carousel.renewed_dialog.di.RenewedDialogInjector");
                        o73.f fVar = (o73.f) bVarU2;
                        o73.e eVar = fVar.f222672c;
                        o73.f fVar2 = fVar.d;
                        RenewedDialogContract$InputData renewedDialogContract$InputData = renewedDialogScreen.Q;
                        renewedDialogContract$InputData.getClass();
                        return new o73.k(eVar, fVar2, renewedDialogContract$InputData);
                    case 1:
                        int i5 = RenewedDialogScreen.V;
                        return (e) ((o73.k) renewedDialogScreen.R.getValue()).f222700b.get();
                    default:
                        return u.c((RowDelegate) renewedDialogScreen.T.getValue());
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: r73.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RenewedDialogScreen f251978b;

            {
                this.f251978b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RenewedDialogScreen renewedDialogScreen = this.f251978b;
                switch (i22) {
                    case 0:
                        int i3 = RenewedDialogScreen.V;
                        qji.b bVarU2 = renewedDialogScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.cards_carousel.renewed_dialog.di.RenewedDialogInjector");
                        o73.f fVar = (o73.f) bVarU2;
                        o73.e eVar = fVar.f222672c;
                        o73.f fVar2 = fVar.d;
                        RenewedDialogContract$InputData renewedDialogContract$InputData = renewedDialogScreen.Q;
                        renewedDialogContract$InputData.getClass();
                        return new o73.k(eVar, fVar2, renewedDialogContract$InputData);
                    case 1:
                        int i5 = RenewedDialogScreen.V;
                        return (e) ((o73.k) renewedDialogScreen.R.getValue()).f222700b.get();
                    default:
                        return u.c((RowDelegate) renewedDialogScreen.T.getValue());
                }
            }
        });
        this.T = w.y0(new r4k.a(11));
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: r73.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RenewedDialogScreen f251978b;

            {
                this.f251978b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RenewedDialogScreen renewedDialogScreen = this.f251978b;
                switch (i22) {
                    case 0:
                        int i32 = RenewedDialogScreen.V;
                        qji.b bVarU2 = renewedDialogScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.cards_carousel.renewed_dialog.di.RenewedDialogInjector");
                        o73.f fVar = (o73.f) bVarU2;
                        o73.e eVar = fVar.f222672c;
                        o73.f fVar2 = fVar.d;
                        RenewedDialogContract$InputData renewedDialogContract$InputData = renewedDialogScreen.Q;
                        renewedDialogContract$InputData.getClass();
                        return new o73.k(eVar, fVar2, renewedDialogContract$InputData);
                    case 1:
                        int i5 = RenewedDialogScreen.V;
                        return (e) ((o73.k) renewedDialogScreen.R.getValue()).f222700b.get();
                    default:
                        return u.c((RowDelegate) renewedDialogScreen.T.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o73.k) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (r73.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new b1(e3(), 26), new r5e.e(this, null, 5), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (r73.e) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getT() {
        return (List) this.U.getValue();
    }
}
