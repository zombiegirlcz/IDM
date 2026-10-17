package com.revolut.feature.insurance_embedded.impl.ui.screen.document.text;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_embedded.impl.ui.screen.document.text.SimpleTextDocumentScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import gu7.v1;
import gv7.b;
import gv7.d;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lu7.s;
import te0.w;
import tx0.j0;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/screen/document/text/SimpleTextDocumentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lgv7/d;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SimpleTextDocumentScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SimpleTextDocumentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final SimpleTextDocumentScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public SimpleTextDocumentScreen(SimpleTextDocumentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = w.y0(new v1(27));
        this.N = w.y0(new v1(28));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: gv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SimpleTextDocumentScreen f147071b;

            {
                this.f147071b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SimpleTextDocumentScreen simpleTextDocumentScreen = this.f147071b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SimpleTextDocumentScreen.S;
                        SimpleTextDocumentScreen simpleTextDocumentScreen2 = this.f147071b;
                        return dli.f.a(simpleTextDocumentScreen2, (e) simpleTextDocumentScreen2.R.getValue(), v.k((FullScreenStateDelegate) simpleTextDocumentScreen2.M.getValue(), (NotificationCentreItemDelegate) simpleTextDocumentScreen2.N.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SimpleTextDocumentScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(simpleTextDocumentScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (lu7.h0) ((hv7.a) ((hv7.b) aVar2.b()).s().mo3808a(simpleTextDocumentScreen)).c0(simpleTextDocumentScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = SimpleTextDocumentScreen.S;
                        lu7.h0 h0Var = (lu7.h0) simpleTextDocumentScreen.Q.getValue();
                        switch (h0Var.f200106a) {
                            case 0:
                                return (e) h0Var.d.get();
                            case 1:
                                return (e) h0Var.d.get();
                            case 2:
                                return (e) h0Var.d.get();
                            default:
                                return (e) h0Var.d.get();
                        }
                }
            }
        });
        this.P = vc.s.t(this, b.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: gv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SimpleTextDocumentScreen f147071b;

            {
                this.f147071b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SimpleTextDocumentScreen simpleTextDocumentScreen = this.f147071b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SimpleTextDocumentScreen.S;
                        SimpleTextDocumentScreen simpleTextDocumentScreen2 = this.f147071b;
                        return dli.f.a(simpleTextDocumentScreen2, (e) simpleTextDocumentScreen2.R.getValue(), v.k((FullScreenStateDelegate) simpleTextDocumentScreen2.M.getValue(), (NotificationCentreItemDelegate) simpleTextDocumentScreen2.N.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SimpleTextDocumentScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(simpleTextDocumentScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (lu7.h0) ((hv7.a) ((hv7.b) aVar2.b()).s().mo3808a(simpleTextDocumentScreen)).c0(simpleTextDocumentScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = SimpleTextDocumentScreen.S;
                        lu7.h0 h0Var = (lu7.h0) simpleTextDocumentScreen.Q.getValue();
                        switch (h0Var.f200106a) {
                            case 0:
                                return (e) h0Var.d.get();
                            case 1:
                                return (e) h0Var.d.get();
                            case 2:
                                return (e) h0Var.d.get();
                            default:
                                return (e) h0Var.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: gv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SimpleTextDocumentScreen f147071b;

            {
                this.f147071b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SimpleTextDocumentScreen simpleTextDocumentScreen = this.f147071b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SimpleTextDocumentScreen.S;
                        SimpleTextDocumentScreen simpleTextDocumentScreen2 = this.f147071b;
                        return dli.f.a(simpleTextDocumentScreen2, (e) simpleTextDocumentScreen2.R.getValue(), v.k((FullScreenStateDelegate) simpleTextDocumentScreen2.M.getValue(), (NotificationCentreItemDelegate) simpleTextDocumentScreen2.N.getValue(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SimpleTextDocumentScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(simpleTextDocumentScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (lu7.h0) ((hv7.a) ((hv7.b) aVar2.b()).s().mo3808a(simpleTextDocumentScreen)).c0(simpleTextDocumentScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = SimpleTextDocumentScreen.S;
                        lu7.h0 h0Var = (lu7.h0) simpleTextDocumentScreen.Q.getValue();
                        switch (h0Var.f200106a) {
                            case 0:
                                return (e) h0Var.d.get();
                            case 1:
                                return (e) h0Var.d.get();
                            case 2:
                                return (e) h0Var.d.get();
                            default:
                                return (e) h0Var.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (lu7.h0) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (gv7.e) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        SimpleTextDocumentScreenContract$InputData simpleTextDocumentScreenContract$InputData = this.K;
        navBarWithToolbar.setToolbarTitle(simpleTextDocumentScreenContract$InputData.f76097a);
        navBarWithToolbar.setTitle(simpleTextDocumentScreenContract$InputData.f76097a, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new gqh.o(this, null, 5), 3);
    }

    public final u d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
