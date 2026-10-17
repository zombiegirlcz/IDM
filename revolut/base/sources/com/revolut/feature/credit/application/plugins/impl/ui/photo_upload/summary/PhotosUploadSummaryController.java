package com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.summary;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ay4.f;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.BackgroundSelectionButtonDelegate;
import com.revolut.core.ui_kit.delegates.BackgroundSelectionDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.summary.PhotosUploadSummaryController;
import com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.summary.PhotosUploadSummaryControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import dw3.b5;
import dw3.c1;
import dw3.c5;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kx4.f0;
import lg4.b;
import lg4.p;
import lg4.r;
import te0.w;
import vc.s;
import vkm.d;
import xki.e;
import yhm.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/photo_upload/summary/PhotosUploadSummaryController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Llg4/p;", "Ldli/a;", "Llg4/r;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PhotosUploadSummaryController extends PluginScreenController<p> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PhotosUploadSummaryController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final PhotosUploadSummaryControllerContract$InputData L;
    public final int M;
    public final h N;
    public final Lazy O;
    public final Lazy P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public PhotosUploadSummaryController(PhotosUploadSummaryControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = s.t(this, b.f);
        this.O = j.b(new l92.h(27));
        this.P = j.b(new l92.h(28));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: lg4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhotosUploadSummaryController f195044b;

            {
                this.f195044b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PhotosUploadSummaryController photosUploadSummaryController = this.f195044b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PhotosUploadSummaryController.T;
                        qji.b bVarU2 = photosUploadSummaryController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.summary.di.PhotosUploadSummaryControllerInjector");
                        b5 b5Var = (b5) bVarU2;
                        c1 c1Var = b5Var.f118362c;
                        b5 b5Var2 = b5Var.d;
                        PhotosUploadSummaryControllerContract$InputData photosUploadSummaryControllerContract$InputData = photosUploadSummaryController.L;
                        photosUploadSummaryControllerContract$InputData.getClass();
                        return new c5(c1Var, b5Var2, photosUploadSummaryController, photosUploadSummaryControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PhotosUploadSummaryController.T;
                        return (j) ((c5) photosUploadSummaryController.Q.getValue()).f118512h.get();
                    default:
                        KProperty[] kPropertyArr3 = PhotosUploadSummaryController.T;
                        PhotosUploadSummaryController photosUploadSummaryController2 = this.f195044b;
                        return dli.f.a(photosUploadSummaryController2, (j) photosUploadSummaryController2.R.getValue(), u.c(new GridBoxDelegate(v.k((BackgroundSelectionDelegate) photosUploadSummaryController2.O.getValue(), (BackgroundSelectionButtonDelegate) photosUploadSummaryController2.P.getValue()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14)), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: lg4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhotosUploadSummaryController f195044b;

            {
                this.f195044b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PhotosUploadSummaryController photosUploadSummaryController = this.f195044b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PhotosUploadSummaryController.T;
                        qji.b bVarU2 = photosUploadSummaryController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.summary.di.PhotosUploadSummaryControllerInjector");
                        b5 b5Var = (b5) bVarU2;
                        c1 c1Var = b5Var.f118362c;
                        b5 b5Var2 = b5Var.d;
                        PhotosUploadSummaryControllerContract$InputData photosUploadSummaryControllerContract$InputData = photosUploadSummaryController.L;
                        photosUploadSummaryControllerContract$InputData.getClass();
                        return new c5(c1Var, b5Var2, photosUploadSummaryController, photosUploadSummaryControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PhotosUploadSummaryController.T;
                        return (j) ((c5) photosUploadSummaryController.Q.getValue()).f118512h.get();
                    default:
                        KProperty[] kPropertyArr3 = PhotosUploadSummaryController.T;
                        PhotosUploadSummaryController photosUploadSummaryController2 = this.f195044b;
                        return dli.f.a(photosUploadSummaryController2, (j) photosUploadSummaryController2.R.getValue(), u.c(new GridBoxDelegate(v.k((BackgroundSelectionDelegate) photosUploadSummaryController2.O.getValue(), (BackgroundSelectionButtonDelegate) photosUploadSummaryController2.P.getValue()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14)), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: lg4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhotosUploadSummaryController f195044b;

            {
                this.f195044b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PhotosUploadSummaryController photosUploadSummaryController = this.f195044b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PhotosUploadSummaryController.T;
                        qji.b bVarU2 = photosUploadSummaryController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.summary.di.PhotosUploadSummaryControllerInjector");
                        b5 b5Var = (b5) bVarU2;
                        c1 c1Var = b5Var.f118362c;
                        b5 b5Var2 = b5Var.d;
                        PhotosUploadSummaryControllerContract$InputData photosUploadSummaryControllerContract$InputData = photosUploadSummaryController.L;
                        photosUploadSummaryControllerContract$InputData.getClass();
                        return new c5(c1Var, b5Var2, photosUploadSummaryController, photosUploadSummaryControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PhotosUploadSummaryController.T;
                        return (j) ((c5) photosUploadSummaryController.Q.getValue()).f118512h.get();
                    default:
                        KProperty[] kPropertyArr3 = PhotosUploadSummaryController.T;
                        PhotosUploadSummaryController photosUploadSummaryController2 = this.f195044b;
                        return dli.f.a(photosUploadSummaryController2, (j) photosUploadSummaryController2.R.getValue(), u.c(new GridBoxDelegate(v.k((BackgroundSelectionDelegate) photosUploadSummaryController2.O.getValue(), (BackgroundSelectionButtonDelegate) photosUploadSummaryController2.P.getValue()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14)), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f195060a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setDescriptionText(uiState.f195061b);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        d3().f174564b.setText(uiState.f195062c);
        d3().f174564b.setEnabled(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c5) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (lg4.j) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        f0 f0Var = new f0(rd0.e.b(d3().f174564b.o), 16);
        d dVarB = rd0.e.b(d3().f174565c.p0());
        Lazy lazy = this.O;
        ViewController.P2(this, new f(vkm.q.J(f0Var, dVarB, new f0(rd0.e.b(((BackgroundSelectionDelegate) lazy.getValue()).f51692c), 18), new f0(rd0.e.b(((BackgroundSelectionDelegate) lazy.getValue()).d), 19), rd0.e.b(((BackgroundSelectionButtonDelegate) this.P.getValue()).f51691c), new f0(rd0.e.b(d3().f174565c.f59410q), 17)), yx4.b.Companion, 15), new le8.d(this, (Continuation) null, 2), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
