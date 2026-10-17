package com.revolut.feature.transport.impl.ui.terms;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenDocumentLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.impl.R$id;
import com.revolut.feature.transport.impl.R$layout;
import com.revolut.feature.transport.impl.ui.terms.TransportTermsScreen;
import com.revolut.feature.transport.impl.ui.terms.TransportTermsScreenContract$InputData;
import com.revolut.feature.transport.models.user.TransportTerms;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.ui_kit_pdf.PdfView;
import dli.a;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import owf.b;
import owf.c;
import owf.d;
import owf.i;
import owf.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/terms/TransportTermsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lowf/i;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransportTermsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TransportTermsScreen.class, "binding", "getBinding()Lcom/revolut/feature/transport/impl/databinding/ScreenTransportTermsBinding;", 0))};
    public final TransportTermsScreenContract$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final int R;
    public final Object S;
    public final Object T;

    public TransportTermsScreen(TransportTermsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, c.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: owf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransportTermsScreen f230438b;

            {
                this.f230438b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransportTermsScreen transportTermsScreen = this.f230438b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransportTermsScreen.U;
                        return transportTermsScreen.d3().f129794c;
                    case 1:
                        KProperty[] kPropertyArr2 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().e;
                    case 2:
                        KProperty[] kPropertyArr3 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().f129793b;
                    case 3:
                        KProperty[] kPropertyArr4 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = TransportTermsScreen.U;
                        TransportTermsScreen transportTermsScreen2 = this.f230438b;
                        return dli.f.a(transportTermsScreen2, (m) transportTermsScreen2.T.getValue(), v.k(new WebViewDelegate(), new LargeActionButtonDelegate(), new FullScreenDocumentLoadingDelegate()), R$id.screenTransportTerms_recyclerView, null, null, null, 56);
                    case 5:
                        KProperty[] kPropertyArr6 = TransportTermsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(transportTermsScreen.m2()).a().get(hvf.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hvf.q.class, " is not found"));
                        }
                        hvf.q qVar = ((hvf.q) aVar2.b()).k;
                        TransportTermsScreenContract$InputData transportTermsScreenContract$InputData = transportTermsScreen.K;
                        transportTermsScreenContract$InputData.getClass();
                        return new hvf.v(qVar, transportTermsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr7 = TransportTermsScreen.U;
                        return (m) ((hvf.v) transportTermsScreen.S.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: owf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransportTermsScreen f230438b;

            {
                this.f230438b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransportTermsScreen transportTermsScreen = this.f230438b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransportTermsScreen.U;
                        return transportTermsScreen.d3().f129794c;
                    case 1:
                        KProperty[] kPropertyArr2 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().e;
                    case 2:
                        KProperty[] kPropertyArr3 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().f129793b;
                    case 3:
                        KProperty[] kPropertyArr4 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = TransportTermsScreen.U;
                        TransportTermsScreen transportTermsScreen2 = this.f230438b;
                        return dli.f.a(transportTermsScreen2, (m) transportTermsScreen2.T.getValue(), v.k(new WebViewDelegate(), new LargeActionButtonDelegate(), new FullScreenDocumentLoadingDelegate()), R$id.screenTransportTerms_recyclerView, null, null, null, 56);
                    case 5:
                        KProperty[] kPropertyArr6 = TransportTermsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(transportTermsScreen.m2()).a().get(hvf.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hvf.q.class, " is not found"));
                        }
                        hvf.q qVar = ((hvf.q) aVar2.b()).k;
                        TransportTermsScreenContract$InputData transportTermsScreenContract$InputData = transportTermsScreen.K;
                        transportTermsScreenContract$InputData.getClass();
                        return new hvf.v(qVar, transportTermsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr7 = TransportTermsScreen.U;
                        return (m) ((hvf.v) transportTermsScreen.S.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: owf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransportTermsScreen f230438b;

            {
                this.f230438b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransportTermsScreen transportTermsScreen = this.f230438b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransportTermsScreen.U;
                        return transportTermsScreen.d3().f129794c;
                    case 1:
                        KProperty[] kPropertyArr2 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().e;
                    case 2:
                        KProperty[] kPropertyArr3 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().f129793b;
                    case 3:
                        KProperty[] kPropertyArr4 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = TransportTermsScreen.U;
                        TransportTermsScreen transportTermsScreen2 = this.f230438b;
                        return dli.f.a(transportTermsScreen2, (m) transportTermsScreen2.T.getValue(), v.k(new WebViewDelegate(), new LargeActionButtonDelegate(), new FullScreenDocumentLoadingDelegate()), R$id.screenTransportTerms_recyclerView, null, null, null, 56);
                    case 5:
                        KProperty[] kPropertyArr6 = TransportTermsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(transportTermsScreen.m2()).a().get(hvf.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hvf.q.class, " is not found"));
                        }
                        hvf.q qVar = ((hvf.q) aVar2.b()).k;
                        TransportTermsScreenContract$InputData transportTermsScreenContract$InputData = transportTermsScreen.K;
                        transportTermsScreenContract$InputData.getClass();
                        return new hvf.v(qVar, transportTermsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr7 = TransportTermsScreen.U;
                        return (m) ((hvf.v) transportTermsScreen.S.getValue()).d.get();
                }
            }
        });
        final int i5 = 3;
        this.P = w.y0(new Function0(this) { // from class: owf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransportTermsScreen f230438b;

            {
                this.f230438b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TransportTermsScreen transportTermsScreen = this.f230438b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransportTermsScreen.U;
                        return transportTermsScreen.d3().f129794c;
                    case 1:
                        KProperty[] kPropertyArr2 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().e;
                    case 2:
                        KProperty[] kPropertyArr3 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().f129793b;
                    case 3:
                        KProperty[] kPropertyArr4 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = TransportTermsScreen.U;
                        TransportTermsScreen transportTermsScreen2 = this.f230438b;
                        return dli.f.a(transportTermsScreen2, (m) transportTermsScreen2.T.getValue(), v.k(new WebViewDelegate(), new LargeActionButtonDelegate(), new FullScreenDocumentLoadingDelegate()), R$id.screenTransportTerms_recyclerView, null, null, null, 56);
                    case 5:
                        KProperty[] kPropertyArr6 = TransportTermsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(transportTermsScreen.m2()).a().get(hvf.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hvf.q.class, " is not found"));
                        }
                        hvf.q qVar = ((hvf.q) aVar2.b()).k;
                        TransportTermsScreenContract$InputData transportTermsScreenContract$InputData = transportTermsScreen.K;
                        transportTermsScreenContract$InputData.getClass();
                        return new hvf.v(qVar, transportTermsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr7 = TransportTermsScreen.U;
                        return (m) ((hvf.v) transportTermsScreen.S.getValue()).d.get();
                }
            }
        });
        final int i6 = 4;
        this.Q = w.y0(new Function0(this) { // from class: owf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransportTermsScreen f230438b;

            {
                this.f230438b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                TransportTermsScreen transportTermsScreen = this.f230438b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransportTermsScreen.U;
                        return transportTermsScreen.d3().f129794c;
                    case 1:
                        KProperty[] kPropertyArr2 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().e;
                    case 2:
                        KProperty[] kPropertyArr3 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().f129793b;
                    case 3:
                        KProperty[] kPropertyArr4 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = TransportTermsScreen.U;
                        TransportTermsScreen transportTermsScreen2 = this.f230438b;
                        return dli.f.a(transportTermsScreen2, (m) transportTermsScreen2.T.getValue(), v.k(new WebViewDelegate(), new LargeActionButtonDelegate(), new FullScreenDocumentLoadingDelegate()), R$id.screenTransportTerms_recyclerView, null, null, null, 56);
                    case 5:
                        KProperty[] kPropertyArr6 = TransportTermsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(transportTermsScreen.m2()).a().get(hvf.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hvf.q.class, " is not found"));
                        }
                        hvf.q qVar = ((hvf.q) aVar2.b()).k;
                        TransportTermsScreenContract$InputData transportTermsScreenContract$InputData = transportTermsScreen.K;
                        transportTermsScreenContract$InputData.getClass();
                        return new hvf.v(qVar, transportTermsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr7 = TransportTermsScreen.U;
                        return (m) ((hvf.v) transportTermsScreen.S.getValue()).d.get();
                }
            }
        });
        this.R = R$layout.screen_transport_terms;
        final int i21 = 5;
        this.S = w.y0(new Function0(this) { // from class: owf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransportTermsScreen f230438b;

            {
                this.f230438b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                TransportTermsScreen transportTermsScreen = this.f230438b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransportTermsScreen.U;
                        return transportTermsScreen.d3().f129794c;
                    case 1:
                        KProperty[] kPropertyArr2 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().e;
                    case 2:
                        KProperty[] kPropertyArr3 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().f129793b;
                    case 3:
                        KProperty[] kPropertyArr4 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = TransportTermsScreen.U;
                        TransportTermsScreen transportTermsScreen2 = this.f230438b;
                        return dli.f.a(transportTermsScreen2, (m) transportTermsScreen2.T.getValue(), v.k(new WebViewDelegate(), new LargeActionButtonDelegate(), new FullScreenDocumentLoadingDelegate()), R$id.screenTransportTerms_recyclerView, null, null, null, 56);
                    case 5:
                        KProperty[] kPropertyArr6 = TransportTermsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(transportTermsScreen.m2()).a().get(hvf.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hvf.q.class, " is not found"));
                        }
                        hvf.q qVar = ((hvf.q) aVar2.b()).k;
                        TransportTermsScreenContract$InputData transportTermsScreenContract$InputData = transportTermsScreen.K;
                        transportTermsScreenContract$InputData.getClass();
                        return new hvf.v(qVar, transportTermsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr7 = TransportTermsScreen.U;
                        return (m) ((hvf.v) transportTermsScreen.S.getValue()).d.get();
                }
            }
        });
        final int i22 = 6;
        this.T = w.y0(new Function0(this) { // from class: owf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransportTermsScreen f230438b;

            {
                this.f230438b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i22;
                TransportTermsScreen transportTermsScreen = this.f230438b;
                switch (i222) {
                    case 0:
                        KProperty[] kPropertyArr = TransportTermsScreen.U;
                        return transportTermsScreen.d3().f129794c;
                    case 1:
                        KProperty[] kPropertyArr2 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().e;
                    case 2:
                        KProperty[] kPropertyArr3 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().f129793b;
                    case 3:
                        KProperty[] kPropertyArr4 = TransportTermsScreen.U;
                        return transportTermsScreen.d3().d;
                    case 4:
                        KProperty[] kPropertyArr5 = TransportTermsScreen.U;
                        TransportTermsScreen transportTermsScreen2 = this.f230438b;
                        return dli.f.a(transportTermsScreen2, (m) transportTermsScreen2.T.getValue(), v.k(new WebViewDelegate(), new LargeActionButtonDelegate(), new FullScreenDocumentLoadingDelegate()), R$id.screenTransportTerms_recyclerView, null, null, null, 56);
                    case 5:
                        KProperty[] kPropertyArr6 = TransportTermsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(transportTermsScreen.m2()).a().get(hvf.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", hvf.q.class, " is not found"));
                        }
                        hvf.q qVar = ((hvf.q) aVar2.b()).k;
                        TransportTermsScreenContract$InputData transportTermsScreenContract$InputData = transportTermsScreen.K;
                        transportTermsScreenContract$InputData.getClass();
                        return new hvf.v(qVar, transportTermsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr7 = TransportTermsScreen.U;
                        return (m) ((hvf.v) transportTermsScreen.S.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        File file = uiState.f230445b;
        ?? r110 = this.N;
        ?? r2 = this.P;
        if (file == null) {
            ((ScreenContentRecyclerView) r110.getValue()).setVisibility(0);
            ((PdfView) r2.getValue()).setVisibility(8);
        } else {
            ((ScreenContentRecyclerView) r110.getValue()).setVisibility(8);
            ((PdfView) r2.getValue()).setVisibility(0);
            ((PdfView) r2.getValue()).a(new b(this, 0)).d(file);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (hvf.v) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (m) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.M.getValue();
        TransportTermsScreenContract$InputData transportTermsScreenContract$InputData = this.K;
        navBarWithToolbar.setToolbarTitle(new TextClause(transportTermsScreenContract$InputData.f92556a.f92741c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        TransportTerms transportTerms = transportTermsScreenContract$InputData.f92556a;
        navBarWithToolbar.setTitle(new TextClause(transportTerms.f92741c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        String str = transportTerms.d;
        if (str != null) {
            navBarWithToolbar.setDescriptionText(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            navBarWithToolbar.setDescriptionVisible(true);
        }
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        LargeActionButton largeActionButton = (LargeActionButton) this.O.getValue();
        largeActionButton.setText(new TextLocalisedClause(R$string.transport_terms_action, null, null, 14));
        largeActionButton.setTag("TransportRegistrationTerms_CTA_TAG");
        ((ScreenContentRecyclerView) this.N.getValue()).setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((NavBarWithToolbar) this.M.getValue()).f59410q), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButton) this.O.getValue()).o), null, new d(this, null, 1), 3);
    }

    public final evf.e d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (evf.e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
