package com.revolut.feature.transport.impl.ui.hub.tickets;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.QrCodePlainDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.transport.impl.R$id;
import com.revolut.feature.transport.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import fb6.j;
import fv6.n;
import fwf.a;
import fwf.c;
import fwf.d;
import fwf.i;
import java.util.List;
import jki.h;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/hub/tickets/TransportHubTicketsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lfwf/i;", "Lcom/revolut/feature/transport/impl/ui/hub/tickets/TransportHubTicketsScreenContract$InputData;", "Laii/q;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransportHubTicketsScreen extends BaseRecyclerViewScreen<i, TransportHubTicketsScreenContract$InputData, q> {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(TransportHubTicketsScreen.class, "binding", "getBinding()Lcom/revolut/feature/transport/impl/databinding/ScreenTransportHubTicketsBinding;", 0))};
    public final int U;
    public final int V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f92538a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f92539b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f92540d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final List f92541e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportHubTicketsScreen(TransportHubTicketsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_transport_hub_tickets;
        this.V = R$id.transportHubTickets_recyclerView;
        s.t(this, a.f);
        this.W = w.y0(new j(this, inputData, 28));
        Lazy lazyY0 = w.y0(new ft3.h0(22));
        this.X = lazyY0;
        Lazy lazyY02 = w.y0(new ft3.h0(23));
        this.Y = lazyY02;
        Lazy lazyY03 = w.y0(new ft3.h0(18));
        this.Z = lazyY03;
        Lazy lazyY04 = w.y0(new ft3.h0(19));
        this.f92538a0 = lazyY04;
        Lazy lazyY05 = w.y0(new ft3.h0(20));
        this.f92539b0 = lazyY05;
        Lazy lazyY06 = w.y0(new ft3.h0(21));
        this.c0 = lazyY06;
        this.f92540d0 = w.y0(new fp3.a(this, 9));
        this.f92541e0 = v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), (RowDelegate) lazyY0.getValue(), (QRCodeDelegate) lazyY03.getValue(), (QrCodePlainDelegate) lazyY02.getValue(), (FullScreenStateDelegate) lazyY04.getValue(), (LargeActionButtonDelegate) lazyY05.getValue(), (CellDetailsChevronDelegate) lazyY06.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (hvf.s) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (fwf.h) this.f92540d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        r rVarMerge = r.merge(w.a0(((FullScreenStateDelegate) this.f92538a0.getValue()).f52371h.f121375b, new n(23)), w.a0(((LargeActionButtonDelegate) this.f92539b0.getValue()).d.f121375b, new n(24)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarMerge), null, new c(this, continuation, 0), 3);
        ?? r87 = this.X;
        r rVarMerge2 = r.merge(w.a0(((RowDelegate) r87.getValue()).f53218h, new n(25)), w.a0(((QRCodeDelegate) this.Z.getValue()).u(), new n(26)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge2, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarMerge2), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(((RowDelegate) r87.getValue()).f53220l, new n(27))), null, new d(this, null), 3);
        r rVarFilter = ((CellDetailsChevronDelegate) this.c0.getValue()).f51821c.filter(new fs5.d(25, new n(28)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter), null, new fwf.b(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF92541e0() {
        return this.f92541e0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }
}
