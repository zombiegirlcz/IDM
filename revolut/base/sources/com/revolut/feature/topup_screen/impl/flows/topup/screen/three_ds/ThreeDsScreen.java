package com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds;

import android.view.LayoutInflater;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.topup_screen.impl.R$id;
import com.revolut.feature.topup_screen.impl.R$layout;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.ThreeDsScreen;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerLinearLayout;
import dcf.v0;
import dze.d;
import dze.g;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ove.y;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup/screen/three_ds/ThreeDsScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lcom/revolut/feature/topup_screen/impl/flows/topup/screen/three_ds/a;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ThreeDsScreen extends SimpleViewController<a> {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(ThreeDsScreen.class, "binding", "getBinding()Lcom/revolut/feature/topup_screen/impl/databinding/ScreenThreeDsBinding;", 0))};
    public final d N;
    public final int O;
    public final h P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public ThreeDsScreen(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = R$layout.screen_three_ds;
        this.P = s.t(this, dze.b.f);
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: dze.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreeDsScreen f121323b;

            {
                this.f121323b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ThreeDsScreen threeDsScreen = this.f121323b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ThreeDsScreen.U;
                        qji.b bVarU2 = threeDsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.di.ThreeDsScreenInjector");
                        }
                        y yVarB = ((eze.b) bVarU2).b();
                        d dVar = threeDsScreen.N;
                        switch (yVarB.f230172a) {
                            case 0:
                                dVar.getClass();
                                yVarB.d = dVar;
                                break;
                            case 1:
                                dVar.getClass();
                                yVarB.d = dVar;
                                break;
                            case 2:
                                dVar.getClass();
                                yVarB.d = dVar;
                                break;
                            default:
                                dVar.getClass();
                                yVarB.d = dVar;
                                break;
                        }
                        return (eze.a) ((y) yVarB.mo3808a(threeDsScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = ThreeDsScreen.U;
                        return ((eze.a) threeDsScreen.Q.getValue()).a();
                    case 2:
                        KProperty[] kPropertyArr3 = ThreeDsScreen.U;
                        return new cye.c(new zjh.j(threeDsScreen));
                    default:
                        KProperty[] kPropertyArr4 = ThreeDsScreen.U;
                        threeDsScreen.getClass();
                        due.a aVar = new due.a(new h(threeDsScreen.m2()));
                        aVar.setId(R$id.web_view);
                        aVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                        return aVar;
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: dze.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreeDsScreen f121323b;

            {
                this.f121323b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ThreeDsScreen threeDsScreen = this.f121323b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ThreeDsScreen.U;
                        qji.b bVarU2 = threeDsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.di.ThreeDsScreenInjector");
                        }
                        y yVarB = ((eze.b) bVarU2).b();
                        d dVar = threeDsScreen.N;
                        switch (yVarB.f230172a) {
                            case 0:
                                dVar.getClass();
                                yVarB.d = dVar;
                                break;
                            case 1:
                                dVar.getClass();
                                yVarB.d = dVar;
                                break;
                            case 2:
                                dVar.getClass();
                                yVarB.d = dVar;
                                break;
                            default:
                                dVar.getClass();
                                yVarB.d = dVar;
                                break;
                        }
                        return (eze.a) ((y) yVarB.mo3808a(threeDsScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = ThreeDsScreen.U;
                        return ((eze.a) threeDsScreen.Q.getValue()).a();
                    case 2:
                        KProperty[] kPropertyArr3 = ThreeDsScreen.U;
                        return new cye.c(new zjh.j(threeDsScreen));
                    default:
                        KProperty[] kPropertyArr4 = ThreeDsScreen.U;
                        threeDsScreen.getClass();
                        due.a aVar = new due.a(new h(threeDsScreen.m2()));
                        aVar.setId(R$id.web_view);
                        aVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                        return aVar;
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: dze.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreeDsScreen f121323b;

            {
                this.f121323b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ThreeDsScreen threeDsScreen = this.f121323b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ThreeDsScreen.U;
                        qji.b bVarU2 = threeDsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.di.ThreeDsScreenInjector");
                        }
                        y yVarB = ((eze.b) bVarU2).b();
                        d dVar = threeDsScreen.N;
                        switch (yVarB.f230172a) {
                            case 0:
                                dVar.getClass();
                                yVarB.d = dVar;
                                break;
                            case 1:
                                dVar.getClass();
                                yVarB.d = dVar;
                                break;
                            case 2:
                                dVar.getClass();
                                yVarB.d = dVar;
                                break;
                            default:
                                dVar.getClass();
                                yVarB.d = dVar;
                                break;
                        }
                        return (eze.a) ((y) yVarB.mo3808a(threeDsScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = ThreeDsScreen.U;
                        return ((eze.a) threeDsScreen.Q.getValue()).a();
                    case 2:
                        KProperty[] kPropertyArr3 = ThreeDsScreen.U;
                        return new cye.c(new zjh.j(threeDsScreen));
                    default:
                        KProperty[] kPropertyArr4 = ThreeDsScreen.U;
                        threeDsScreen.getClass();
                        due.a aVar = new due.a(new h(threeDsScreen.m2()));
                        aVar.setId(R$id.web_view);
                        aVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                        return aVar;
                }
            }
        });
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: dze.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreeDsScreen f121323b;

            {
                this.f121323b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ThreeDsScreen threeDsScreen = this.f121323b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ThreeDsScreen.U;
                        qji.b bVarU2 = threeDsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.di.ThreeDsScreenInjector");
                        }
                        y yVarB = ((eze.b) bVarU2).b();
                        d dVar = threeDsScreen.N;
                        switch (yVarB.f230172a) {
                            case 0:
                                dVar.getClass();
                                yVarB.d = dVar;
                                break;
                            case 1:
                                dVar.getClass();
                                yVarB.d = dVar;
                                break;
                            case 2:
                                dVar.getClass();
                                yVarB.d = dVar;
                                break;
                            default:
                                dVar.getClass();
                                yVarB.d = dVar;
                                break;
                        }
                        return (eze.a) ((y) yVarB.mo3808a(threeDsScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = ThreeDsScreen.U;
                        return ((eze.a) threeDsScreen.Q.getValue()).a();
                    case 2:
                        KProperty[] kPropertyArr3 = ThreeDsScreen.U;
                        return new cye.c(new zjh.j(threeDsScreen));
                    default:
                        KProperty[] kPropertyArr4 = ThreeDsScreen.U;
                        threeDsScreen.getClass();
                        due.a aVar = new due.a(new h(threeDsScreen.m2()));
                        aVar.setId(R$id.web_view);
                        aVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                        return aVar;
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        this.N.getClass();
        ((c) R2()).J2();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (eze.a) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d dVar = this.N;
        dVar.getClass();
        cue.d dVar2 = dVar.f121328b;
        BasicNavBar threeDsNavBar = d3().f200367b;
        Intrinsics.checkNotNullExpressionValue(threeDsNavBar, "threeDsNavBar");
        threeDsNavBar.setVisibility(0);
        String str = null;
        d3().f200367b.setTitle(new TextLocalisedClause(R$string.topup_3ds_header_title, null, null, 14));
        d3().f200367b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        f3().setHorizontalScrollBarEnabled(false);
        WebSettings settings = f3().getSettings();
        settings.setCacheMode(-1);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(f3(), true);
        f3().setWebViewClient((cye.c) this.S.getValue());
        CardTopUpThreeDsUiModel cardTopUpThreeDsUiModel = dVar.f121327a;
        if (cardTopUpThreeDsUiModel != null) {
            str = cardTopUpThreeDsUiModel.f90955b;
        } else if (dVar2 != null) {
            str = dVar2.d;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("None of the required input data was passed to 3ds screen " + cardTopUpThreeDsUiModel + ", " + dVar2);
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        if (str != null) {
            f3().loadUrl(str);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        f3().stopLoading();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f200367b.f59211b), new v0(this, null, 29), 3);
    }

    public final lve.c d3() {
        ViewBinding value = this.P.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (lve.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final due.a f3() {
        return (due.a) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.O;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final View h2(LayoutInflater inflater) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ControllerContainerLinearLayout controllerContainerLinearLayout = (ControllerContainerLinearLayout) super.h2(inflater);
        controllerContainerLinearLayout.addView(f3());
        return controllerContainerLinearLayout;
    }
}
