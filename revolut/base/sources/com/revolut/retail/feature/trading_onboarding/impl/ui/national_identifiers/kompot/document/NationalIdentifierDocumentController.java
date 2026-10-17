package com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.document;

import a09.b;
import a0l.c;
import a0l.f;
import a0l.g;
import a0l.j;
import a0l.k;
import a0l.l;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.document.NationalIdentifierDocumentContract$InputData;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.document.NationalIdentifierDocumentController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kyk.v;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/national_identifiers/kompot/document/NationalIdentifierDocumentController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "La0l/f;", "Ldli/a;", "La0l/h;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NationalIdentifierDocumentController extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(NationalIdentifierDocumentController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinVerticalButtonsBinding;", 0))};
    public final NationalIdentifierDocumentContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;
    public final InputTextDelegate S;

    public NationalIdentifierDocumentController(NationalIdentifierDocumentContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: a0l.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NationalIdentifierDocumentController f439b;

            {
                this.f439b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                NationalIdentifierDocumentController nationalIdentifierDocumentController = this.f439b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = NationalIdentifierDocumentController.T;
                        return (a) ((kyk.h) nationalIdentifierDocumentController.M.getValue()).f190945b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = NationalIdentifierDocumentController.T;
                        qji.b bVarU2 = nationalIdentifierDocumentController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.document.di.NationalIdentifierDocumentControllerComponent.Injector");
                        kyk.i iVar = (kyk.i) bVarU2;
                        v vVar = iVar.f190946a;
                        kyk.i iVar2 = iVar.f190947b;
                        NationalIdentifierDocumentContract$InputData nationalIdentifierDocumentContract$InputData = nationalIdentifierDocumentController.K;
                        nationalIdentifierDocumentContract$InputData.getClass();
                        return new kyk.h(vVar, iVar2, nationalIdentifierDocumentContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = NationalIdentifierDocumentController.T;
                        NationalIdentifierDocumentController nationalIdentifierDocumentController2 = this.f439b;
                        return dli.f.a(nationalIdentifierDocumentController2, nationalIdentifierDocumentController2.d(), u.c(nationalIdentifierDocumentController2.S), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = NationalIdentifierDocumentController.T;
                        ViewBinding value = nationalIdentifierDocumentController.P.getValue(nationalIdentifierDocumentController, NationalIdentifierDocumentController.T[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((jii.w) value).f174570b;
                    default:
                        KProperty[] kPropertyArr5 = NationalIdentifierDocumentController.T;
                        ViewBinding value2 = nationalIdentifierDocumentController.P.getValue(nationalIdentifierDocumentController, NationalIdentifierDocumentController.T[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((jii.w) value2).d;
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: a0l.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NationalIdentifierDocumentController f439b;

            {
                this.f439b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                NationalIdentifierDocumentController nationalIdentifierDocumentController = this.f439b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NationalIdentifierDocumentController.T;
                        return (a) ((kyk.h) nationalIdentifierDocumentController.M.getValue()).f190945b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = NationalIdentifierDocumentController.T;
                        qji.b bVarU2 = nationalIdentifierDocumentController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.document.di.NationalIdentifierDocumentControllerComponent.Injector");
                        kyk.i iVar = (kyk.i) bVarU2;
                        v vVar = iVar.f190946a;
                        kyk.i iVar2 = iVar.f190947b;
                        NationalIdentifierDocumentContract$InputData nationalIdentifierDocumentContract$InputData = nationalIdentifierDocumentController.K;
                        nationalIdentifierDocumentContract$InputData.getClass();
                        return new kyk.h(vVar, iVar2, nationalIdentifierDocumentContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = NationalIdentifierDocumentController.T;
                        NationalIdentifierDocumentController nationalIdentifierDocumentController2 = this.f439b;
                        return dli.f.a(nationalIdentifierDocumentController2, nationalIdentifierDocumentController2.d(), u.c(nationalIdentifierDocumentController2.S), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = NationalIdentifierDocumentController.T;
                        ViewBinding value = nationalIdentifierDocumentController.P.getValue(nationalIdentifierDocumentController, NationalIdentifierDocumentController.T[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((jii.w) value).f174570b;
                    default:
                        KProperty[] kPropertyArr5 = NationalIdentifierDocumentController.T;
                        ViewBinding value2 = nationalIdentifierDocumentController.P.getValue(nationalIdentifierDocumentController, NationalIdentifierDocumentController.T[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((jii.w) value2).d;
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar_twin_vertical_buttons;
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: a0l.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NationalIdentifierDocumentController f439b;

            {
                this.f439b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                NationalIdentifierDocumentController nationalIdentifierDocumentController = this.f439b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NationalIdentifierDocumentController.T;
                        return (a) ((kyk.h) nationalIdentifierDocumentController.M.getValue()).f190945b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = NationalIdentifierDocumentController.T;
                        qji.b bVarU2 = nationalIdentifierDocumentController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.document.di.NationalIdentifierDocumentControllerComponent.Injector");
                        kyk.i iVar = (kyk.i) bVarU2;
                        v vVar = iVar.f190946a;
                        kyk.i iVar2 = iVar.f190947b;
                        NationalIdentifierDocumentContract$InputData nationalIdentifierDocumentContract$InputData = nationalIdentifierDocumentController.K;
                        nationalIdentifierDocumentContract$InputData.getClass();
                        return new kyk.h(vVar, iVar2, nationalIdentifierDocumentContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = NationalIdentifierDocumentController.T;
                        NationalIdentifierDocumentController nationalIdentifierDocumentController2 = this.f439b;
                        return dli.f.a(nationalIdentifierDocumentController2, nationalIdentifierDocumentController2.d(), u.c(nationalIdentifierDocumentController2.S), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = NationalIdentifierDocumentController.T;
                        ViewBinding value = nationalIdentifierDocumentController.P.getValue(nationalIdentifierDocumentController, NationalIdentifierDocumentController.T[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((jii.w) value).f174570b;
                    default:
                        KProperty[] kPropertyArr5 = NationalIdentifierDocumentController.T;
                        ViewBinding value2 = nationalIdentifierDocumentController.P.getValue(nationalIdentifierDocumentController, NationalIdentifierDocumentController.T[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((jii.w) value2).d;
                }
            }
        });
        this.P = s.t(this, j.f);
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: a0l.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NationalIdentifierDocumentController f439b;

            {
                this.f439b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                NationalIdentifierDocumentController nationalIdentifierDocumentController = this.f439b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NationalIdentifierDocumentController.T;
                        return (a) ((kyk.h) nationalIdentifierDocumentController.M.getValue()).f190945b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = NationalIdentifierDocumentController.T;
                        qji.b bVarU2 = nationalIdentifierDocumentController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.document.di.NationalIdentifierDocumentControllerComponent.Injector");
                        kyk.i iVar = (kyk.i) bVarU2;
                        v vVar = iVar.f190946a;
                        kyk.i iVar2 = iVar.f190947b;
                        NationalIdentifierDocumentContract$InputData nationalIdentifierDocumentContract$InputData = nationalIdentifierDocumentController.K;
                        nationalIdentifierDocumentContract$InputData.getClass();
                        return new kyk.h(vVar, iVar2, nationalIdentifierDocumentContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = NationalIdentifierDocumentController.T;
                        NationalIdentifierDocumentController nationalIdentifierDocumentController2 = this.f439b;
                        return dli.f.a(nationalIdentifierDocumentController2, nationalIdentifierDocumentController2.d(), u.c(nationalIdentifierDocumentController2.S), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = NationalIdentifierDocumentController.T;
                        ViewBinding value = nationalIdentifierDocumentController.P.getValue(nationalIdentifierDocumentController, NationalIdentifierDocumentController.T[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((jii.w) value).f174570b;
                    default:
                        KProperty[] kPropertyArr5 = NationalIdentifierDocumentController.T;
                        ViewBinding value2 = nationalIdentifierDocumentController.P.getValue(nationalIdentifierDocumentController, NationalIdentifierDocumentController.T[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((jii.w) value2).d;
                }
            }
        });
        final int i6 = 4;
        this.R = w.y0(new Function0(this) { // from class: a0l.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NationalIdentifierDocumentController f439b;

            {
                this.f439b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                NationalIdentifierDocumentController nationalIdentifierDocumentController = this.f439b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NationalIdentifierDocumentController.T;
                        return (a) ((kyk.h) nationalIdentifierDocumentController.M.getValue()).f190945b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = NationalIdentifierDocumentController.T;
                        qji.b bVarU2 = nationalIdentifierDocumentController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.document.di.NationalIdentifierDocumentControllerComponent.Injector");
                        kyk.i iVar = (kyk.i) bVarU2;
                        v vVar = iVar.f190946a;
                        kyk.i iVar2 = iVar.f190947b;
                        NationalIdentifierDocumentContract$InputData nationalIdentifierDocumentContract$InputData = nationalIdentifierDocumentController.K;
                        nationalIdentifierDocumentContract$InputData.getClass();
                        return new kyk.h(vVar, iVar2, nationalIdentifierDocumentContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = NationalIdentifierDocumentController.T;
                        NationalIdentifierDocumentController nationalIdentifierDocumentController2 = this.f439b;
                        return dli.f.a(nationalIdentifierDocumentController2, nationalIdentifierDocumentController2.d(), u.c(nationalIdentifierDocumentController2.S), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = NationalIdentifierDocumentController.T;
                        ViewBinding value = nationalIdentifierDocumentController.P.getValue(nationalIdentifierDocumentController, NationalIdentifierDocumentController.T[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((jii.w) value).f174570b;
                    default:
                        KProperty[] kPropertyArr5 = NationalIdentifierDocumentController.T;
                        ViewBinding value2 = nationalIdentifierDocumentController.P.getValue(nationalIdentifierDocumentController, NationalIdentifierDocumentController.T[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((jii.w) value2).d;
                }
            }
        });
        this.S = new InputTextDelegate(new b(this, 3));
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        a0l.h uiState = (a0l.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        TwinVerticalButton twinVerticalButton = (TwinVerticalButton) this.R.getValue();
        c cVar = uiState.f437c;
        twinVerticalButton.setMainButtonText(cVar.f428a);
        twinVerticalButton.setMainButtonEnabled(cVar.f429b);
        twinVerticalButton.setMainButtonLoadingTag("CONTINUE_BUTTON_LOADING_TAG");
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.Q.getValue();
        g gVar = uiState.f436b;
        TextClause textClause = gVar.f432a;
        navBarWithToolbar.setTitle(textClause, null);
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setSecondDescriptionText(gVar.f433b);
        navBarWithToolbar.setMenuItems(gVar.f434c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (kyk.h) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((TwinVerticalButton) this.R.getValue()).setSecondaryButtonVisible(false);
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.Q.getValue();
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.Q.getValue();
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.o.f57403b), new k(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new l(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((TwinVerticalButton) this.R.getValue()).o0()), new l(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final a0l.a d() {
        return (a0l.a) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
