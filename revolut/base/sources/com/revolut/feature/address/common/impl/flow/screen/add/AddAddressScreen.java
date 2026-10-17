package com.revolut.feature.address.common.impl.flow.screen.add;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.common.impl.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import gi1.c;
import gi1.d;
import gi1.i;
import gi1.l;
import gi1.n;
import in0.g;
import java.util.List;
import kji.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import qh1.b;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgi1/l;", "Ldli/a;", "Lgi1/n;", "Lno/m;", "Lno/k;", "Lin0/g;", "Lkji/f;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddAddressScreen extends ViewController<l> implements dli.a, m, k, g, f {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(AddAddressScreen.class, "binding", "getBinding()Lcom/revolut/feature/address/common/impl/databinding/ScreenAddAddressBinding;", 0))};
    public final AddAddressScreenContract$InputData K;
    public final int L;
    public final AnalyticsProduct M;
    public AnalyticsContext N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final InputTextDelegate R;
    public final SearchButtonDelegate S;
    public final RowDelegate T;
    public final Object U;

    public AddAddressScreen(AddAddressScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_add_address;
        this.M = inputData.f60987p;
        this.N = inputData.f60988q;
        this.O = s.t(this, c.f);
        this.P = w.y0(new gi1.a(this, 0));
        this.Q = w.y0(new gi1.a(this, 1));
        this.R = new InputTextDelegate(null);
        this.S = new SearchButtonDelegate();
        this.T = new RowDelegate(null, null, 7);
        this.U = w.y0(new gi1.a(this, 2));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f297358b.setEnabled(uiState.f144042b);
        d3().f297359c.setMenuItems(uiState.f144043c);
        d3().f297358b.setLargeButtonText(uiState.d);
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (yh1.a) this.P.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getN() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        AddAddressScreenContract$InputData addAddressScreenContract$InputData = this.K;
        b bVar = addAddressScreenContract$InputData.f60984l;
        Clause clause = addAddressScreenContract$InputData.e;
        Clause clause2 = addAddressScreenContract$InputData.d;
        Clause clause3 = addAddressScreenContract$InputData.f60980c;
        this.z = bVar != b.NONE;
        NavBarWithToolbar navBarWithToolbar = d3().f297359c;
        int i = gi1.b.f144024a[addAddressScreenContract$InputData.f60984l.ordinal()];
        if (i == 1) {
            numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_back);
        } else if (i == 2) {
            numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_cross);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = null;
        }
        navBarWithToolbar.setNavigationButtonIcon(numValueOf);
        NavBarWithToolbar navBarWithToolbar2 = d3().f297359c;
        navBarWithToolbar2.setTitleAutoSize(false);
        navBarWithToolbar2.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar2.setToolbarTitle(clause3);
        navBarWithToolbar2.setTitle(clause3, null);
        navBarWithToolbar2.setDescriptionText(clause2);
        navBarWithToolbar2.setDescriptionVisible(clause2 != null);
        navBarWithToolbar2.setSecondDescriptionText(clause);
        navBarWithToolbar2.setSecondDescriptionVisible(clause != null);
        d3().f297358b.setLoadingButtonTag("ADD_ADDRESS_SUBMIT_BUTTON_TAG");
        d3().f297358b.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        d3().d.setTag(R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, vkm.q.J(rd0.e.b(d3().f297358b.c()), rd0.e.b(d3().f297358b.d())), new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f297359c.f59410q), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f297359c.o.f57403b), null, new d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f297359c.p0()), null, new gaa.g(this, continuation, 27), 3);
        InputTextDelegate inputTextDelegate = this.R;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.f52575g.f121375b), null, new gi1.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new gi1.f(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.i.f121375b), new gi1.g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f53283c.f121375b), new gi1.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.f53218h), null, new i(this, null), 3);
    }

    public final wh1.a d3() {
        ViewBinding value = this.O.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wh1.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final gi1.m d() {
        return (gi1.m) this.Q.getValue();
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

    @Override // in0.g
    public final boolean p0() {
        return this.K.f60989r;
    }
}
