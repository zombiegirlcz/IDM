package com.revolut.feature.freelancer.impl.ui.ecommerce.manage.preview;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.StoryNavBarContentView;
import com.revolut.feature.freelancer.impl.R$layout;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.preview.FreelancerPluginPreviewScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import us6.m0;
import vc.s;
import xki.e;
import xw6.a;
import yk6.m;
import yw6.b;
import yw6.c;
import yw6.f;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/ecommerce/manage/preview/FreelancerPluginPreviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lyw6/f;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerPluginPreviewScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(FreelancerPluginPreviewScreen.class, "binding", "getBinding()Lcom/revolut/feature/freelancer/impl/databinding/ScreenPluginPreviewBinding;", 0))};
    public final int K;
    public final h L;
    public final FullScreenStateDelegate M;
    public final TextDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public FreelancerPluginPreviewScreen(FreelancerPluginPreviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_plugin_preview;
        this.L = s.t(this, b.f);
        this.M = new FullScreenStateDelegate();
        this.N = new TextDelegate();
        this.O = w.y0(new yff.b(this, inputData, 29));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: yw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPluginPreviewScreen f317335b;

            {
                this.f317335b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerPluginPreviewScreen.R;
                        return (e) ((m0) this.f317335b.O.getValue()).f282626b.get();
                    default:
                        KProperty[] kPropertyArr2 = FreelancerPluginPreviewScreen.R;
                        FreelancerPluginPreviewScreen freelancerPluginPreviewScreen = this.f317335b;
                        return dli.f.a(freelancerPluginPreviewScreen, (e) freelancerPluginPreviewScreen.P.getValue(), v.k(freelancerPluginPreviewScreen.M, new CellDetailsDelegate(), new ListSubheaderDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), new RowDelegate(null, null, 7), freelancerPluginPreviewScreen.N), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: yw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerPluginPreviewScreen f317335b;

            {
                this.f317335b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerPluginPreviewScreen.R;
                        return (e) ((m0) this.f317335b.O.getValue()).f282626b.get();
                    default:
                        KProperty[] kPropertyArr2 = FreelancerPluginPreviewScreen.R;
                        FreelancerPluginPreviewScreen freelancerPluginPreviewScreen = this.f317335b;
                        return dli.f.a(freelancerPluginPreviewScreen, (e) freelancerPluginPreviewScreen.P.getValue(), v.k(freelancerPluginPreviewScreen.M, new CellDetailsDelegate(), new ListSubheaderDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), new RowDelegate(null, null, 7), freelancerPluginPreviewScreen.N), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        StoryNavBarContentView storyNavBarContentView = d3().f257031c;
        xw6.a aVar = uiState.f317339b;
        if (aVar instanceof a.C1718a) {
            storyNavBarContentView.setLoading();
        } else {
            if (!(aVar instanceof xw6.b)) {
                throw new NoWhenBranchMatchedException();
            }
            storyNavBarContentView.setStories(u.c(((xw6.b) aVar).f309333a));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (yw6.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithContainer navBarWithContainer = d3().f257030b;
        navBarWithContainer.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithContainer.M();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f257030b.K()), new yl6.b(this, continuation, 14), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.d), new m(this, continuation, 22), 3);
    }

    public final rs6.e d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rs6.e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
