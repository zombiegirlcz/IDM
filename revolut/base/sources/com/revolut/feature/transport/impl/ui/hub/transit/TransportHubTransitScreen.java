package com.revolut.feature.transport.impl.ui.hub.transit;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.feature.transport.impl.R$id;
import com.revolut.feature.transport.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import hvf.t;
import java.util.List;
import jki.h;
import jsl.b;
import jt2.d;
import jwf.a;
import jwf.c;
import jwf.f;
import jwf.g;
import jwf.i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/hub/transit/TransportHubTransitScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ljwf/i;", "Lcom/revolut/feature/transport/impl/ui/hub/transit/TransportHubTransitScreenContract$InputData;", "Ljwf/f;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransportHubTransitScreen extends BaseRecyclerViewScreen<i, TransportHubTransitScreenContract$InputData, f> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f92543e0 = {o0.f186429a.j(new h0(TransportHubTransitScreen.class, "binding", "getBinding()Lcom/revolut/feature/transport/impl/databinding/ScreenTransportHubTransitBinding;", 0))};
    public final int U;
    public final int V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f92544a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f92545b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f92546d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportHubTransitScreen(TransportHubTransitScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_transport_hub_transit;
        this.V = R$id.transportHubTransit_recyclerView;
        s.t(this, a.f);
        this.W = w.y0(new jnf.a(this, inputData, 12));
        this.X = w.y0(new jj2.a(this, 14));
        Lazy lazyY0 = w.y0(new b(18));
        this.Y = lazyY0;
        Lazy lazyY02 = w.y0(new b(19));
        this.Z = lazyY02;
        Lazy lazyY03 = w.y0(new b(20));
        this.f92544a0 = lazyY03;
        Lazy lazyY04 = w.y0(new b(21));
        this.f92545b0 = lazyY04;
        Lazy lazyY05 = w.y0(new b(22));
        this.c0 = lazyY05;
        this.f92546d0 = v.k(new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), (CellDetailsChevronDelegate) lazyY05.getValue(), (ListSubheaderDelegate) lazyY03.getValue(), (FullScreenStateDelegate) lazyY04.getValue(), (SmallStockCardDelegate) lazyY0.getValue(), (SmallCardLoadingDelegate) lazyY02.getValue(), new ScrollerDelegate(v.k((SmallStockCardDelegate) lazyY0.getValue(), (SmallCardLoadingDelegate) lazyY02.getValue()), false));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (t) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (g) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(((ListSubheaderDelegate) this.f92544a0.getValue()).f52707c, new d(22))), null, new jwf.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(((SmallStockCardDelegate) this.Y.getValue()).f53378c, new d(23))), null, new jwf.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(((FullScreenStateDelegate) this.f92545b0.getValue()).f52371h.f121375b, new d(24))), null, new jwf.b(this, continuation, 2), 3);
        r rVarFilter = ((CellDetailsChevronDelegate) this.c0.getValue()).f51821c.filter(new ju0.f(9, new d(21)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter), null, new c(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF92546d0() {
        return this.f92546d0;
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
