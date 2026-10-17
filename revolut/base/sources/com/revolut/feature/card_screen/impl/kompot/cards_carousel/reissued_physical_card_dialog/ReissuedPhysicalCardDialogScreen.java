package com.revolut.feature.card_screen.impl.kompot.cards_carousel.reissued_physical_card_dialog;

import aii.q;
import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.reissued_physical_card_dialog.ReissuedPhysicalCardDialogContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.reissued_physical_card_dialog.ReissuedPhysicalCardDialogScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o73.j;
import ox5.r;
import p0l.a;
import p73.d;
import pki.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/reissued_physical_card_dialog/ReissuedPhysicalCardDialogScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReissuedPhysicalCardDialogScreen extends BaseBottomSheetRecyclerController<q, k> {
    public static final /* synthetic */ int V = 0;
    public final ReissuedPhysicalCardDialogContract$InputData Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public ReissuedPhysicalCardDialogScreen(ReissuedPhysicalCardDialogContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: p73.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReissuedPhysicalCardDialogScreen f233543b;

            {
                this.f233543b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ReissuedPhysicalCardDialogScreen reissuedPhysicalCardDialogScreen = this.f233543b;
                switch (i2) {
                    case 0:
                        int i3 = ReissuedPhysicalCardDialogScreen.V;
                        qji.b bVarU2 = reissuedPhysicalCardDialogScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.cards_carousel.reissued_physical_card_dialog.di.ReissuedPhysicalCardDialogInjector");
                        o73.f fVar = (o73.f) bVarU2;
                        o73.e eVar = fVar.f222672c;
                        o73.f fVar2 = fVar.d;
                        ReissuedPhysicalCardDialogContract$InputData reissuedPhysicalCardDialogContract$InputData = reissuedPhysicalCardDialogScreen.Q;
                        reissuedPhysicalCardDialogContract$InputData.getClass();
                        return new j(eVar, fVar2, reissuedPhysicalCardDialogContract$InputData);
                    case 1:
                        int i5 = ReissuedPhysicalCardDialogScreen.V;
                        return (e) ((j) reissuedPhysicalCardDialogScreen.R.getValue()).f222698b.get();
                    default:
                        return u.c((RowDelegate) reissuedPhysicalCardDialogScreen.T.getValue());
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: p73.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReissuedPhysicalCardDialogScreen f233543b;

            {
                this.f233543b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ReissuedPhysicalCardDialogScreen reissuedPhysicalCardDialogScreen = this.f233543b;
                switch (i22) {
                    case 0:
                        int i3 = ReissuedPhysicalCardDialogScreen.V;
                        qji.b bVarU2 = reissuedPhysicalCardDialogScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.cards_carousel.reissued_physical_card_dialog.di.ReissuedPhysicalCardDialogInjector");
                        o73.f fVar = (o73.f) bVarU2;
                        o73.e eVar = fVar.f222672c;
                        o73.f fVar2 = fVar.d;
                        ReissuedPhysicalCardDialogContract$InputData reissuedPhysicalCardDialogContract$InputData = reissuedPhysicalCardDialogScreen.Q;
                        reissuedPhysicalCardDialogContract$InputData.getClass();
                        return new j(eVar, fVar2, reissuedPhysicalCardDialogContract$InputData);
                    case 1:
                        int i5 = ReissuedPhysicalCardDialogScreen.V;
                        return (e) ((j) reissuedPhysicalCardDialogScreen.R.getValue()).f222698b.get();
                    default:
                        return u.c((RowDelegate) reissuedPhysicalCardDialogScreen.T.getValue());
                }
            }
        });
        this.T = w.y0(new a(21));
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: p73.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReissuedPhysicalCardDialogScreen f233543b;

            {
                this.f233543b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ReissuedPhysicalCardDialogScreen reissuedPhysicalCardDialogScreen = this.f233543b;
                switch (i22) {
                    case 0:
                        int i32 = ReissuedPhysicalCardDialogScreen.V;
                        qji.b bVarU2 = reissuedPhysicalCardDialogScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.card_screen.impl.kompot.cards_carousel.reissued_physical_card_dialog.di.ReissuedPhysicalCardDialogInjector");
                        o73.f fVar = (o73.f) bVarU2;
                        o73.e eVar = fVar.f222672c;
                        o73.f fVar2 = fVar.d;
                        ReissuedPhysicalCardDialogContract$InputData reissuedPhysicalCardDialogContract$InputData = reissuedPhysicalCardDialogScreen.Q;
                        reissuedPhysicalCardDialogContract$InputData.getClass();
                        return new j(eVar, fVar2, reissuedPhysicalCardDialogContract$InputData);
                    case 1:
                        int i5 = ReissuedPhysicalCardDialogScreen.V;
                        return (e) ((j) reissuedPhysicalCardDialogScreen.R.getValue()).f222698b.get();
                    default:
                        return u.c((RowDelegate) reissuedPhysicalCardDialogScreen.T.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (p73.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new d(e3(), 0), new r(this, null, 13), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (p73.e) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getR() {
        return (List) this.U.getValue();
    }
}
