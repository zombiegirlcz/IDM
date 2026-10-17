package com.revolut.feature.transport.impl.ui.hub;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bbk.z;
import buf.u;
import bwf.d;
import bwf.g;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.impl.R$id;
import com.revolut.feature.transport.impl.R$layout;
import com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow;
import com.revolut.kompot.navigable.flow.scroller.ScrollerFlowStep;
import hvf.r;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qji.b;
import rd0.e;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/hub/TransportHubFlow;", "Lcom/revolut/kompot/navigable/flow/scroller/BaseScrollerFlow;", "Lcom/revolut/feature/transport/impl/ui/hub/TransportHubFlowContract$Tab;", "Lcom/revolut/feature/transport/impl/ui/hub/TransportHubFlowContract$InputData;", "Laii/q;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransportHubFlow extends BaseScrollerFlow<TransportHubFlowContract$Tab, TransportHubFlowContract$InputData, q> {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(TransportHubFlow.class, "binding", "getBinding()Lcom/revolut/feature/transport/impl/databinding/FlowTransportHubBinding;", 0))};
    public final boolean R;
    public final h S;
    public final int T;
    public final int U;
    public final Object V;
    public final Object W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportHubFlow(TransportHubFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.R = true;
        this.S = s.t(this, bwf.a.f);
        this.T = R$layout.flow_transport_hub;
        this.U = R$id.transportHub_recyclerView;
        this.V = w.y0(new u(this, inputData, 5));
        this.W = w.y0(new bvb.a(this, 2));
    }

    @Override // com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow, com.revolut.kompot.navigable.a
    public final void H2() {
        super.H2();
        a aVar = (a) Q2();
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, vkm.q.q(new bwf.q(aVar.f92527r, aVar, 1)), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(Y2().f129785b.f59410q), null, new bwf.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(Y2().f129785b.o.f57403b), null, new bwf.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(Y2().f129786c.m()), null, new d(this, null, 1), 3);
        a aVar2 = (a) Q2();
        com.revolut.kompot.navigable.a.g2(this, vkm.q.q(new z(vkm.q.q(new bwf.q(aVar2.f92527r, aVar2, 1)), 17)), null, new d(this, null, 2), 3);
        a aVar3 = (a) Q2();
        com.revolut.kompot.navigable.a.g2(this, vkm.q.q(new z(vkm.q.q(new bwf.q(aVar3.f92527r, aVar3, 1)), 18)), null, new d(this, null, 3), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow
    public final rji.a O2() {
        return (r) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final b R1() {
        return (r) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow
    /* JADX INFO: renamed from: T2, reason: from getter */
    public final int getU() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow
    public final void U2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = Y2().f129785b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transport_hub_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.transport_hub_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left));
    }

    @Override // com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow
    public final void V2(ScrollerFlowStep scrollerFlowStep) {
        TransportHubFlowContract$Tab tab2 = (TransportHubFlowContract$Tab) scrollerFlowStep;
        Intrinsics.checkNotNullParameter(tab2, "step");
        a aVar = (a) Q2();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(tab2, "tab");
        aVar.s2(tab2.f98432a);
    }

    public final evf.a Y2() {
        ViewBinding value = this.S.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (evf.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow
    /* JADX INFO: renamed from: Z2, reason: merged with bridge method [inline-methods] */
    public final g Q2() {
        return (g) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.T;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.R);
    }
}
