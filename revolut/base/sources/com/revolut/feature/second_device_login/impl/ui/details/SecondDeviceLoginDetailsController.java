package com.revolut.feature.second_device_login.impl.ui.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.second_device_login.impl.R$string;
import com.revolut.feature.second_device_login.impl.ui.details.SecondDeviceLoginDetailsController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import htc.c;
import java.util.List;
import jii.x;
import kl.b0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mtc.b;
import mtc.h;
import mtc.i;
import mtc.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/second_device_login/impl/ui/details/SecondDeviceLoginDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmtc/h;", "Ldli/a;", "Lmtc/i;", "feature_second_device_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SecondDeviceLoginDetailsController extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(SecondDeviceLoginDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final int K;
    public final ao.h L;
    public final Object M;
    public final Object N;
    public final Object O;

    public SecondDeviceLoginDetailsController(SecondDeviceLoginDetailsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_two_buttons;
        this.L = s.t(this, b.f);
        this.M = w.y0(new mhd.b(this, inputData, 16));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: mtc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecondDeviceLoginDetailsController f208804b;

            {
                this.f208804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = SecondDeviceLoginDetailsController.P;
                        htc.c cVar = (htc.c) this.f208804b.M.getValue();
                        htc.b bVar = cVar.f155350b;
                        return new m(new n(new r86.b()), cVar.f155349a, cVar.f155351c.b(), new b0(new r86.b()));
                    default:
                        KProperty[] kPropertyArr2 = SecondDeviceLoginDetailsController.P;
                        int i2 = R$id.screenRecyclerNavbarTwoButtons_recyclerView;
                        SecondDeviceLoginDetailsController secondDeviceLoginDetailsController = this.f208804b;
                        return dli.f.a(secondDeviceLoginDetailsController, (m) secondDeviceLoginDetailsController.N.getValue(), v.k(new FullScreenStateDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsDelegate(), new PlainTextWarningDelegate(), new PlainTextLoadingDelegate()), i2, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: mtc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SecondDeviceLoginDetailsController f208804b;

            {
                this.f208804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SecondDeviceLoginDetailsController.P;
                        htc.c cVar = (htc.c) this.f208804b.M.getValue();
                        htc.b bVar = cVar.f155350b;
                        return new m(new n(new r86.b()), cVar.f155349a, cVar.f155351c.b(), new b0(new r86.b()));
                    default:
                        KProperty[] kPropertyArr2 = SecondDeviceLoginDetailsController.P;
                        int i22 = R$id.screenRecyclerNavbarTwoButtons_recyclerView;
                        SecondDeviceLoginDetailsController secondDeviceLoginDetailsController = this.f208804b;
                        return dli.f.a(secondDeviceLoginDetailsController, (m) secondDeviceLoginDetailsController.N.getValue(), v.k(new FullScreenStateDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsDelegate(), new PlainTextWarningDelegate(), new PlainTextLoadingDelegate()), i22, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = d3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
        boolean z = uiState.f208810b;
        screenRecyclerNavbarTwoButtonsFirstButton.setVisibility(z ? 0 : 8);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (m) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.second_device_login_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.second_device_login_title, null, null, 14));
        LargeActionButton largeActionButton = d3().f174573b;
        largeActionButton.setText(new TextLocalisedClause(R$string.second_device_login_button_no, null, null, 14));
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        LargeActionButton largeActionButton2 = d3().e;
        largeActionButton2.setText(new TextLocalisedClause(R$string.second_device_login_button_cancel, null, null, 14));
        largeActionButton2.o(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174574c.f59410q), null, new mtc.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174573b.o), null, new mtc.c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new mtc.c(this, null, 2), 3);
    }

    public final x d3() {
        ViewBinding value = this.L.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
