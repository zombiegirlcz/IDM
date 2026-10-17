package com.revolut.feature.revolutpay.order_tracking.impl.ui.bottom_sheet.delete_tracking;

import android.os.Parcelable;
import android.view.View;
import bbc.f;
import bbc.g;
import bbc.i;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.bottom_sheet.delete_tracking.DeleteTrackingScreen;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.bottom_sheet.delete_tracking.DeleteTrackingScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import uac.b;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/bottom_sheet/delete_tracking/DeleteTrackingScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetController;", "Lbbc/f;", "Lcli/w;", "Lbbc/g;", "Lno/m;", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeleteTrackingScreen extends BaseBottomSheetController<f> implements w, m {
    public static final /* synthetic */ int S = 0;
    public final DeleteTrackingScreenContract$InputData N;
    public final AnalyticsProduct.Retail O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public DeleteTrackingScreen(DeleteTrackingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        k9 k9Var = k9.RevolutPay;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.O = a.h(k9Var, "value", k9Var);
        final int i = 0;
        this.P = te0.w.y0(new Function0(this) { // from class: bbc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeleteTrackingScreen f14245b;

            {
                this.f14245b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DeleteTrackingScreen deleteTrackingScreen = this.f14245b;
                switch (i2) {
                    case 0:
                        int i3 = DeleteTrackingScreen.S;
                        return n14.e.a(deleteTrackingScreen, (i) deleteTrackingScreen.Q.getValue());
                    case 1:
                        int i5 = DeleteTrackingScreen.S;
                        return (i) ((uac.b) deleteTrackingScreen.R.getValue()).f278564b.get();
                    default:
                        int i6 = DeleteTrackingScreen.S;
                        qji.b bVarU2 = deleteTrackingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.order_tracking.impl.ui.bottom_sheet.delete_tracking.di.DeleteTrackingScreenInjector");
                        uac.i iVar = (uac.i) bVarU2;
                        uac.f fVar = iVar.f278584b;
                        uac.i iVar2 = iVar.f278585c;
                        DeleteTrackingScreenContract$InputData deleteTrackingScreenContract$InputData = deleteTrackingScreen.N;
                        deleteTrackingScreenContract$InputData.getClass();
                        return new uac.b(fVar, iVar2, deleteTrackingScreenContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.Q = te0.w.y0(new Function0(this) { // from class: bbc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeleteTrackingScreen f14245b;

            {
                this.f14245b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DeleteTrackingScreen deleteTrackingScreen = this.f14245b;
                switch (i22) {
                    case 0:
                        int i3 = DeleteTrackingScreen.S;
                        return n14.e.a(deleteTrackingScreen, (i) deleteTrackingScreen.Q.getValue());
                    case 1:
                        int i5 = DeleteTrackingScreen.S;
                        return (i) ((uac.b) deleteTrackingScreen.R.getValue()).f278564b.get();
                    default:
                        int i6 = DeleteTrackingScreen.S;
                        qji.b bVarU2 = deleteTrackingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.order_tracking.impl.ui.bottom_sheet.delete_tracking.di.DeleteTrackingScreenInjector");
                        uac.i iVar = (uac.i) bVarU2;
                        uac.f fVar = iVar.f278584b;
                        uac.i iVar2 = iVar.f278585c;
                        DeleteTrackingScreenContract$InputData deleteTrackingScreenContract$InputData = deleteTrackingScreen.N;
                        deleteTrackingScreenContract$InputData.getClass();
                        return new uac.b(fVar, iVar2, deleteTrackingScreenContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.R = te0.w.y0(new Function0(this) { // from class: bbc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeleteTrackingScreen f14245b;

            {
                this.f14245b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DeleteTrackingScreen deleteTrackingScreen = this.f14245b;
                switch (i22) {
                    case 0:
                        int i32 = DeleteTrackingScreen.S;
                        return n14.e.a(deleteTrackingScreen, (i) deleteTrackingScreen.Q.getValue());
                    case 1:
                        int i5 = DeleteTrackingScreen.S;
                        return (i) ((uac.b) deleteTrackingScreen.R.getValue()).f278564b.get();
                    default:
                        int i6 = DeleteTrackingScreen.S;
                        qji.b bVarU2 = deleteTrackingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.order_tracking.impl.ui.bottom_sheet.delete_tracking.di.DeleteTrackingScreenInjector");
                        uac.i iVar = (uac.i) bVarU2;
                        uac.f fVar = iVar.f278584b;
                        uac.i iVar2 = iVar.f278585c;
                        DeleteTrackingScreenContract$InputData deleteTrackingScreenContract$InputData = deleteTrackingScreen.N;
                        deleteTrackingScreenContract$InputData.getClass();
                        return new uac.b(fVar, iVar2, deleteTrackingScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        j3(uiState.f14250a);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, vkm.q.J(e3(), f3()), new b74.e(this, null, 16), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.P.getValue();
    }
}
