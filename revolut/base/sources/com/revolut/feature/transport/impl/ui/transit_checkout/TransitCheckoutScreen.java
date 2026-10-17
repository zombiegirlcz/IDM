package com.revolut.feature.transport.impl.ui.transit_checkout;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.InputDualTextDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowQuantityDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TimePickerDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.impl.ui.transit_checkout.TransitCheckoutScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import hvf.j;
import ihm.f;
import java.util.List;
import jki.m;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import q97.b1;
import qu1.d;
import qvf.a;
import qwf.b;
import qwf.g;
import qwf.i;
import qwf.k;
import qwf.l;
import qwf.n;
import qwf.r;
import rd0.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/transit_checkout/TransitCheckoutScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lqwf/r;", "Lcom/revolut/feature/transport/impl/ui/transit_checkout/TransitCheckoutScreenContract$InputData;", "Laii/q;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransitCheckoutScreen extends BaseRecyclerViewScreen<r, TransitCheckoutScreenContract$InputData, q> {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f92560k0 = {o0.f186429a.j(new h0(TransitCheckoutScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f92561a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f92562b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f92563d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f92564e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f92565h0;
    public final AttributeSelectorSmallDelegate i0;
    public final List j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitCheckoutScreen(TransitCheckoutScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.V = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
        this.W = s.t(this, b.f);
        this.X = w.y0(new a(this, inputData, 3));
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: qwf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransitCheckoutScreen f249911b;

            {
                this.f249911b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransitCheckoutScreen transitCheckoutScreen = this.f249911b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransitCheckoutScreen.f92560k0;
                        return (q) ((hvf.j) transitCheckoutScreen.X.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr2 = TransitCheckoutScreen.f92560k0;
                        return new SelectableDelegate((RowDelegate) transitCheckoutScreen.Z.getValue());
                }
            }
        });
        Lazy lazyY0 = w.y0(new d(12));
        this.Z = lazyY0;
        Lazy lazyY02 = w.y0(new d(13));
        this.f92561a0 = lazyY02;
        final int i2 = 1;
        this.f92562b0 = w.y0(new Function0(this) { // from class: qwf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransitCheckoutScreen f249911b;

            {
                this.f249911b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransitCheckoutScreen transitCheckoutScreen = this.f249911b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransitCheckoutScreen.f92560k0;
                        return (q) ((hvf.j) transitCheckoutScreen.X.getValue()).o.get();
                    default:
                        KProperty[] kPropertyArr2 = TransitCheckoutScreen.f92560k0;
                        return new SelectableDelegate((RowDelegate) transitCheckoutScreen.Z.getValue());
                }
            }
        });
        Lazy lazyY03 = w.y0(new d(14));
        this.c0 = lazyY03;
        Lazy lazyY04 = w.y0(new d(15));
        this.f92563d0 = lazyY04;
        Lazy lazyY05 = w.y0(new d(16));
        this.f92564e0 = lazyY05;
        this.f0 = w.y0(new d(17));
        Lazy lazyY06 = w.y0(new d(10));
        this.g0 = lazyY06;
        Lazy lazyY07 = w.y0(new d(11));
        this.f92565h0 = lazyY07;
        AttributeSelectorSmallDelegate attributeSelectorSmallDelegate = new AttributeSelectorSmallDelegate();
        this.i0 = attributeSelectorSmallDelegate;
        this.j0 = v.k((RowDelegate) lazyY0.getValue(), (RowQuantityDelegate) lazyY02.getValue(), (CellDetailsDelegate) lazyY03.getValue(), (InputTextDelegate) lazyY04.getValue(), (InputDualTextDelegate) lazyY05.getValue(), (TimePickerDelegate) lazyY06.getValue(), (DatePickerDelegate) lazyY07.getValue(), new RowLoadingDelegate(), new CellDetailsPriceDelegate(), new TextDelegate(), new PlainTextWarningDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new ScrollerDelegate(v.k(attributeSelectorSmallDelegate, new AttributeSelectorSmallLoadingDelegate()), false));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        r uiState = (r) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        LargeActionButton largeActionButton = g3().f174557b;
        largeActionButton.setEnabled(uiState.f249926b);
        largeActionButton.setText(uiState.f249927c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (j) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().e.f59410q), null, new qwf.j(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174557b.o), null, new qwf.j(this, continuation, 1), 3);
        ?? r87 = this.f92563d0;
        com.revolut.kompot.navigable.a.g2(this, e.b(((InputTextDelegate) r87.getValue()).e.f121375b), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((InputTextDelegate) r87.getValue()).f52575g.f121375b), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((SelectableDelegate) this.f92562b0.getValue()).r()), null, new qwf.m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((RowDelegate) this.Z.getValue()).f53218h), null, new n(this, null), 3);
        ?? r810 = this.f92561a0;
        com.revolut.kompot.navigable.a.g2(this, e.b((f) ((RowQuantityDelegate) r810.getValue()).d.getValue()), null, new qwf.j(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b((f) ((RowQuantityDelegate) r810.getValue()).e.getValue()), null, new qwf.j(this, continuation, 3), 3);
        ?? r811 = this.f92564e0;
        efm.r rVarFilter = ((InputDualTextDelegate) r811.getValue()).f52549c.f52575g.f121375b.filter(new qsa.a(12, new qwd.o(5)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter), null, new qwf.d(this, null), 3);
        efm.r rVarFilter2 = ((InputDualTextDelegate) r811.getValue()).d.f52575g.f121375b.filter(new qsa.a(13, new qwd.o(6)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter2), null, new qwf.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((LargeActionButtonDelegate) this.f0.getValue()).d.f121375b), null, new qwf.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((DatePickerDelegate) this.f92565h0.getValue()).f52176c.f121375b), null, new g(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((TimePickerDelegate) this.g0.getValue()).p()), null, new g(this, continuation, 1), 3);
        ?? r812 = this.c0;
        efm.r rVarFilter3 = ((CellDetailsDelegate) r812.getValue()).f.filter(new qsa.a(14, new qwd.o(7)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter3, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter3), null, new qwf.h(this, null), 3);
        efm.r rVarFilter4 = ((CellDetailsDelegate) r812.getValue()).d.filter(new qsa.a(15, new qwd.o(8)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter4, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter4), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new b1(e.b(this.i0.p()), 19), null, new g(this, continuation, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) ((j) this.X.getValue()).e.get()).d(v.k((SelectableDelegate) this.f92562b0.getValue(), (RowDelegate) this.Z.getValue(), (DatePickerDelegate) this.f92565h0.getValue(), (TimePickerDelegate) this.g0.getValue(), (LargeActionButtonDelegate) this.f0.getValue()));
        NavBarWithToolbar navBarWithToolbar = g3().e;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transport_transit_checkout_title, null, null, 14), null);
        LargeActionButton largeActionButton = g3().f174557b;
        largeActionButton.setEnabled(false);
        largeActionButton.setTag("TransitCheckoutScreen_CTA_TAG");
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(jki.n nVar, o oVar) {
        r uiState = (r) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        LargeActionButton largeActionButton = g3().f174557b;
        largeActionButton.setEnabled(uiState.f249926b);
        largeActionButton.setText(uiState.f249927c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getJ0() {
        return this.j0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final jii.s g3() {
        ViewBinding value = this.W.getValue(this, f92560k0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final qwf.q T2() {
        return (qwf.q) this.Y.getValue();
    }
}
