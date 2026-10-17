package com.revolut.feature.transport.impl.ui.hub.transit_section;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import hvf.k;
import java.util.List;
import jii.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lpl.c;
import ltf.b;
import lwf.a;
import lwf.d;
import lwf.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/hub/transit_section/TransitSectionScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Llwf/e;", "Lcom/revolut/feature/transport/impl/ui/hub/transit_section/TransitSectionScreenContract$InputData;", "Laii/q;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransitSectionScreen extends BaseRecyclerViewScreen<e, TransitSectionScreenContract$InputData, q> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f92548d0 = {o0.f186429a.j(new h0(TransitSectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f92549a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f92550b0;
    public final List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitSectionScreen(TransitSectionScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = R$id.recyclerView;
        this.W = s.t(this, a.f);
        this.X = w.y0(new b(this, inputData, 7));
        this.Y = w.y0(new ljd.e(this, 19));
        Lazy lazyY0 = w.y0(new lv4.b(19));
        this.Z = lazyY0;
        Lazy lazyY02 = w.y0(new lv4.b(20));
        this.f92549a0 = lazyY02;
        Lazy lazyY03 = w.y0(new lv4.b(21));
        this.f92550b0 = lazyY03;
        this.c0 = v.k((FullScreenStateDelegate) lazyY03.getValue(), (SmallStockCardDelegate) lazyY0.getValue(), (SmallCardLoadingDelegate) lazyY02.getValue(), new ScrollerDelegate(v.k((SmallStockCardDelegate) lazyY0.getValue(), (SmallCardLoadingDelegate) lazyY02.getValue()), false));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (k) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (d) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.W.getValue(this, f92548d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new c(this, continuation, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((SmallStockCardDelegate) this.Z.getValue()).f53378c, new lv9.c(8))), null, new lph.h(this, continuation, 10), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.f92550b0.getValue()).f52371h.f121375b), null, new lwf.b(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.W.getValue(this, f92548d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        TransitSectionScreenContract$InputData transitSectionScreenContract$InputData = (TransitSectionScreenContract$InputData) this.G;
        navBarWithToolbar.setTitle(transitSectionScreenContract$InputData.f92552b, null);
        navBarWithToolbar.setToolbarTitle(transitSectionScreenContract$InputData.f92552b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }
}
