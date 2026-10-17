package com.revolut.feature.topup_screen.impl.flows.topup_flows.mandate;

import android.view.View;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.mandate.MandateTopupFlow;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.mandate.MandateTopupFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import j60.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import njj.n;
import nyb.h0;
import nyb.m;
import nze.i;
import nze.j;
import nze.k;
import nze.l;
import ove.p;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/topup_flows/mandate/MandateTopupFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnze/l;", "Lyki/f;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MandateTopupFlow extends ViewController<l> implements f {
    public final MandateTopupFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final LargeActionButtonDelegate Q;

    public MandateTopupFlow(MandateTopupFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: nze.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MandateTopupFlow f221033b;

            {
                this.f221033b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MandateTopupFlow mandateTopupFlow = this.f221033b;
                        phm.a aVar = (phm.a) ue0.e.j(mandateTopupFlow.m2()).a().get(ove.t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ove.t.class, " is not found"));
                        }
                        ove.t tVar = ((ove.t) aVar2.b()).H;
                        MandateTopupFlowContract$InputData mandateTopupFlowContract$InputData = mandateTopupFlow.K;
                        mandateTopupFlowContract$InputData.getClass();
                        return new ove.p(tVar, mandateTopupFlow, mandateTopupFlowContract$InputData);
                    case 1:
                        return (k) ((ove.p) this.f221033b.M.getValue()).f230110h.get();
                    case 2:
                        MandateTopupFlow mandateTopupFlow2 = this.f221033b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, mandateTopupFlow2, (k) mandateTopupFlow2.N.getValue());
                    default:
                        return (j60.a) ((ove.p) this.f221033b.M.getValue()).f230109g.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: nze.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MandateTopupFlow f221033b;

            {
                this.f221033b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        MandateTopupFlow mandateTopupFlow = this.f221033b;
                        phm.a aVar = (phm.a) ue0.e.j(mandateTopupFlow.m2()).a().get(ove.t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ove.t.class, " is not found"));
                        }
                        ove.t tVar = ((ove.t) aVar2.b()).H;
                        MandateTopupFlowContract$InputData mandateTopupFlowContract$InputData = mandateTopupFlow.K;
                        mandateTopupFlowContract$InputData.getClass();
                        return new ove.p(tVar, mandateTopupFlow, mandateTopupFlowContract$InputData);
                    case 1:
                        return (k) ((ove.p) this.f221033b.M.getValue()).f230110h.get();
                    case 2:
                        MandateTopupFlow mandateTopupFlow2 = this.f221033b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, mandateTopupFlow2, (k) mandateTopupFlow2.N.getValue());
                    default:
                        return (j60.a) ((ove.p) this.f221033b.M.getValue()).f230109g.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: nze.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MandateTopupFlow f221033b;

            {
                this.f221033b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        MandateTopupFlow mandateTopupFlow = this.f221033b;
                        phm.a aVar = (phm.a) ue0.e.j(mandateTopupFlow.m2()).a().get(ove.t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ove.t.class, " is not found"));
                        }
                        ove.t tVar = ((ove.t) aVar2.b()).H;
                        MandateTopupFlowContract$InputData mandateTopupFlowContract$InputData = mandateTopupFlow.K;
                        mandateTopupFlowContract$InputData.getClass();
                        return new ove.p(tVar, mandateTopupFlow, mandateTopupFlowContract$InputData);
                    case 1:
                        return (k) ((ove.p) this.f221033b.M.getValue()).f230110h.get();
                    case 2:
                        MandateTopupFlow mandateTopupFlow2 = this.f221033b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, mandateTopupFlow2, (k) mandateTopupFlow2.N.getValue());
                    default:
                        return (j60.a) ((ove.p) this.f221033b.M.getValue()).f230109g.get();
                }
            }
        });
        final int i5 = 3;
        this.P = w.y0(new Function0(this) { // from class: nze.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MandateTopupFlow f221033b;

            {
                this.f221033b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        MandateTopupFlow mandateTopupFlow = this.f221033b;
                        phm.a aVar = (phm.a) ue0.e.j(mandateTopupFlow.m2()).a().get(ove.t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ove.t.class, " is not found"));
                        }
                        ove.t tVar = ((ove.t) aVar2.b()).H;
                        MandateTopupFlowContract$InputData mandateTopupFlowContract$InputData = mandateTopupFlow.K;
                        mandateTopupFlowContract$InputData.getClass();
                        return new ove.p(tVar, mandateTopupFlow, mandateTopupFlowContract$InputData);
                    case 1:
                        return (k) ((ove.p) this.f221033b.M.getValue()).f230110h.get();
                    case 2:
                        MandateTopupFlow mandateTopupFlow2 = this.f221033b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, mandateTopupFlow2, (k) mandateTopupFlow2.N.getValue());
                    default:
                        return (j60.a) ((ove.p) this.f221033b.M.getValue()).f230109g.get();
                }
            }
        });
        this.Q = new LargeActionButtonDelegate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (p) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackgroundColor(0);
        ((a) this.P.getValue()).d(u.c(this.Q));
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        LargeActionButtonDelegate largeActionButtonDelegate = this.Q;
        r rVarFilter = largeActionButtonDelegate.d.f121375b.filter(new h0(16, new m(25)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new i(this, null), 3);
        r rVarFilter2 = largeActionButtonDelegate.d.f121375b.filter(new h0(17, new m(26)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter2), new j(this, null), 3);
        ViewController.P2(this, new n(rd0.e.b(((a) this.P.getValue()).E()), 25), new nuh.j(this, null, 6), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
