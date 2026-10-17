package com.revolut.retail.feature.pod_nominees.impl.edit;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.pod_nominees.impl.R$id;
import com.revolut.retail.feature.pod_nominees.impl.R$layout;
import com.revolut.retail.feature.pod_nominees.impl.edit.PodNomineeEditScreen;
import com.revolut.retail.feature.pod_nominees.impl.edit.PodNomineeEditScreenContract$InputData;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m84.e;
import mek.i;
import mek.j;
import mek.k;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pod_nominees/impl/edit/PodNomineeEditScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/pod_nominees/impl/edit/a;", "Ldli/a;", "Lmek/k;", "feature_pod_nominees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PodNomineeEditScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PodNomineeEditScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/pod_nominees/impl/databinding/ScreenPodEditBinding;", 0))};
    public final PodNomineeEditScreenContract$InputData K;
    public final InputTextDelegate L;
    public final RowDelegate M;
    public final boolean N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final int R;
    public final Object S;

    public PodNomineeEditScreen(PodNomineeEditScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new InputTextDelegate(new e(this, 13));
        this.M = new RowDelegate(null, null, 7);
        this.N = true;
        this.O = s.t(this, mek.b.f);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: mek.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PodNomineeEditScreen f204698b;

            {
                this.f204698b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PodNomineeEditScreen podNomineeEditScreen = this.f204698b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PodNomineeEditScreen.T;
                        PodNomineeEditScreen podNomineeEditScreen2 = this.f204698b;
                        return dli.f.a(podNomineeEditScreen2, podNomineeEditScreen2.R2(), zhm.v.k(podNomineeEditScreen2.M, podNomineeEditScreen2.L), R$id.screenPodEdit_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PodNomineeEditScreen.T;
                        qji.b bVarU2 = podNomineeEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pod_nominees.impl.edit.di.PodNomineeEditScreenInjector");
                        kek.d dVar = (kek.d) bVarU2;
                        kek.c cVar = dVar.f183128b;
                        kek.d dVar2 = dVar.f183129c;
                        PodNomineeEditScreenContract$InputData podNomineeEditScreenContract$InputData = podNomineeEditScreen.K;
                        podNomineeEditScreenContract$InputData.getClass();
                        return new kek.b(cVar, dVar2, podNomineeEditScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PodNomineeEditScreen.T;
                        return (j) ((kek.b) podNomineeEditScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: mek.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PodNomineeEditScreen f204698b;

            {
                this.f204698b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PodNomineeEditScreen podNomineeEditScreen = this.f204698b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PodNomineeEditScreen.T;
                        PodNomineeEditScreen podNomineeEditScreen2 = this.f204698b;
                        return dli.f.a(podNomineeEditScreen2, podNomineeEditScreen2.R2(), zhm.v.k(podNomineeEditScreen2.M, podNomineeEditScreen2.L), R$id.screenPodEdit_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PodNomineeEditScreen.T;
                        qji.b bVarU2 = podNomineeEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pod_nominees.impl.edit.di.PodNomineeEditScreenInjector");
                        kek.d dVar = (kek.d) bVarU2;
                        kek.c cVar = dVar.f183128b;
                        kek.d dVar2 = dVar.f183129c;
                        PodNomineeEditScreenContract$InputData podNomineeEditScreenContract$InputData = podNomineeEditScreen.K;
                        podNomineeEditScreenContract$InputData.getClass();
                        return new kek.b(cVar, dVar2, podNomineeEditScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PodNomineeEditScreen.T;
                        return (j) ((kek.b) podNomineeEditScreen.Q.getValue()).d.get();
                }
            }
        });
        this.R = R$layout.screen_pod_edit;
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: mek.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PodNomineeEditScreen f204698b;

            {
                this.f204698b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PodNomineeEditScreen podNomineeEditScreen = this.f204698b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PodNomineeEditScreen.T;
                        PodNomineeEditScreen podNomineeEditScreen2 = this.f204698b;
                        return dli.f.a(podNomineeEditScreen2, podNomineeEditScreen2.R2(), zhm.v.k(podNomineeEditScreen2.M, podNomineeEditScreen2.L), R$id.screenPodEdit_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PodNomineeEditScreen.T;
                        qji.b bVarU2 = podNomineeEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pod_nominees.impl.edit.di.PodNomineeEditScreenInjector");
                        kek.d dVar = (kek.d) bVarU2;
                        kek.c cVar = dVar.f183128b;
                        kek.d dVar2 = dVar.f183129c;
                        PodNomineeEditScreenContract$InputData podNomineeEditScreenContract$InputData = podNomineeEditScreen.K;
                        podNomineeEditScreenContract$InputData.getClass();
                        return new kek.b(cVar, dVar2, podNomineeEditScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PodNomineeEditScreen.T;
                        return (j) ((kek.b) podNomineeEditScreen.Q.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f143313c;
        i iVar = uiState.f204710b;
        TextLocalisedClause textLocalisedClause = iVar.f204707a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(iVar.f204708b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        d3().f143312b.setEnabled(uiState.f204711c.f204699a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (kek.b) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f143313c;
        if (this.K.f102590b) {
            navBarWithToolbar.setMenuItems(u.c(new TextNavBarMenuItem("NOT_NOW_MENU_ID", new TextLocalisedClause(R$string.common_action_notnow, null, null, 14), null, null, 12)));
        } else {
            navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        }
        CollapsingActionButton collapsingActionButton = d3().f143312b;
        collapsingActionButton.setLargeButtonText(new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_add_cta_title, null, null, 14));
        collapsingActionButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f143313c.f59410q), new mek.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f143313c.o.f57403b), new m75.i(this, continuation, 20), 3);
        ViewController.P2(this, rd0.e.b(this.L.e.f121375b), new mek.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53225r), new mek.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f143312b.d()), new mek.c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f143312b.c()), new mek.c(this, continuation, 2), 3);
    }

    public final gek.a d3() {
        ViewBinding value = this.O.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (gek.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
