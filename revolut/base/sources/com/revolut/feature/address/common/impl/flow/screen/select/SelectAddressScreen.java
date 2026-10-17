package com.revolut.feature.address.common.impl.flow.screen.select;

import android.text.InputFilter;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import au0.j4;
import aw0.o9;
import cli.o;
import cli.q;
import com.bumptech.glide.d;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.common.api.navigation.SelectAddressControllerDescriptor$InputData;
import com.revolut.feature.address.common.impl.flow.screen.select.SelectAddressScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kji.f;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nfj.j2;
import ni1.c;
import no.k;
import no.m;
import pki.b;
import sh1.l;
import te0.w;
import th1.h;
import vc.s;
import xki.e;
import yh1.i;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/screen/select/SelectAddressScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lth1/h;", "Ldli/a;", "Lni1/h;", "Lkji/f;", "Lno/m;", "Lno/k;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectAddressScreen extends ViewController<h> implements a, f, m, k {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(SelectAddressScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final SelectAddressControllerDescriptor$InputData K;
    public final int L;
    public final AnalyticsProduct M;
    public AnalyticsContext N;
    public final ao.h O;
    public final boolean P;
    public final Lazy Q;
    public final Object R;
    public final RowDelegate S;
    public final PlaceholderRowDelegate T;
    public final Object U;

    public SelectAddressScreen(SelectAddressControllerDescriptor$InputData inputData, l strings) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(strings, "strings");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = inputData.f60962c;
        this.N = inputData.d;
        this.O = s.t(this, c.f);
        this.P = true;
        this.Q = j.b(new ni1.a(this, strings, 0));
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: ni1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectAddressScreen f215621b;

            {
                this.f215621b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = SelectAddressScreen.V;
                        return (i) ((yh1.i) this.f215621b.Q.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr2 = SelectAddressScreen.V;
                        SelectAddressScreen selectAddressScreen = this.f215621b;
                        return dli.f.a(selectAddressScreen, (i) selectAddressScreen.R.getValue(), v.k(selectAddressScreen.S, selectAddressScreen.T, new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.S = new RowDelegate(null, null, 7);
        this.T = new PlaceholderRowDelegate();
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: ni1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectAddressScreen f215621b;

            {
                this.f215621b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SelectAddressScreen.V;
                        return (i) ((yh1.i) this.f215621b.Q.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr2 = SelectAddressScreen.V;
                        SelectAddressScreen selectAddressScreen = this.f215621b;
                        return dli.f.a(selectAddressScreen, (i) selectAddressScreen.R.getValue(), v.k(selectAddressScreen.S, selectAddressScreen.T, new FullScreenStateDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        ni1.h uiState = (ni1.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHint(uiState.f215629b);
        navBarWithToolbar.E0();
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.N = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getM() {
        return this.M;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.Q.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (ni1.i) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: T2 */
    public final Boolean getG() {
        return Boolean.valueOf(this.P);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        InputFilter.AllCaps allCaps = new InputFilter.AllCaps();
        yi1.h hVar = yi1.h.f314219a;
        SelectAddressControllerDescriptor$InputData selectAddressControllerDescriptor$InputData = this.K;
        if (!d.q(d.c(selectAddressControllerDescriptor$InputData.f60960a))) {
            hVar = null;
        }
        InputFilter[] elements = {allCaps, hVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List<? extends InputFilter> listL = kotlin.collections.d.L(elements);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setSearchInputFilters(listL);
        navBarWithToolbar.setSearchInput(new TextClause(selectAddressControllerDescriptor$InputData.f60961b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        navBarWithToolbar.j0(false);
        navBarWithToolbar.K0(j4.NO_ANIMATION);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new j2(this, null, 5), 3);
        SearchView searchView = navBarWithToolbar.f59409p;
        ihm.f fVar = searchView.f57337m;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.y(fVar, 300L)), null, new ni1.d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(searchView.f57336l), null, new naf.j(navBarWithToolbar, this, null, 20), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f53218h), null, new ni1.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.d), null, new ni1.d(this, null, 1), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.O.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
