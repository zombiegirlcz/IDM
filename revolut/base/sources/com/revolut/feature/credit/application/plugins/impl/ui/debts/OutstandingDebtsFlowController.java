package com.revolut.feature.credit.application.plugins.impl.ui.debts;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.OutstandingDebtsFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.OutstandingDebtsFlowController;
import dw3.c1;
import dw3.s4;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import q2e.i0;
import q43.m;
import q84.d;
import q84.f;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/OutstandingDebtsFlowController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OutstandingDebtsFlowController extends PluginFlowControllerV2 {
    public final OutstandingDebtsFlowContract$InputData L;
    public final Object M;
    public final RowDelegate N;
    public final TwinHorizontalButtonDelegate O;
    public final Object P;
    public final Object Q;

    public OutstandingDebtsFlowController(OutstandingDebtsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: q84.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OutstandingDebtsFlowController f242974b;

            {
                this.f242974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        OutstandingDebtsFlowController outstandingDebtsFlowController = this.f242974b;
                        phm.a aVar = (phm.a) ue0.e.j(outstandingDebtsFlowController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        OutstandingDebtsFlowContract$InputData outstandingDebtsFlowContract$InputData = outstandingDebtsFlowController.L;
                        outstandingDebtsFlowContract$InputData.getClass();
                        return new s4(c1Var, new iq3.a(), outstandingDebtsFlowController, outstandingDebtsFlowContract$InputData);
                    case 1:
                        return (d) ((s4) this.f242974b.M.getValue()).f119764x.get();
                    default:
                        OutstandingDebtsFlowController outstandingDebtsFlowController2 = this.f242974b;
                        return czi.c.d(0, 6, null, outstandingDebtsFlowController2, (d) outstandingDebtsFlowController2.P.getValue());
                }
            }
        });
        this.N = new RowDelegate(null, null, 7);
        this.O = new TwinHorizontalButtonDelegate();
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: q84.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OutstandingDebtsFlowController f242974b;

            {
                this.f242974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        OutstandingDebtsFlowController outstandingDebtsFlowController = this.f242974b;
                        phm.a aVar = (phm.a) ue0.e.j(outstandingDebtsFlowController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        OutstandingDebtsFlowContract$InputData outstandingDebtsFlowContract$InputData = outstandingDebtsFlowController.L;
                        outstandingDebtsFlowContract$InputData.getClass();
                        return new s4(c1Var, new iq3.a(), outstandingDebtsFlowController, outstandingDebtsFlowContract$InputData);
                    case 1:
                        return (d) ((s4) this.f242974b.M.getValue()).f119764x.get();
                    default:
                        OutstandingDebtsFlowController outstandingDebtsFlowController2 = this.f242974b;
                        return czi.c.d(0, 6, null, outstandingDebtsFlowController2, (d) outstandingDebtsFlowController2.P.getValue());
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: q84.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OutstandingDebtsFlowController f242974b;

            {
                this.f242974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        OutstandingDebtsFlowController outstandingDebtsFlowController = this.f242974b;
                        phm.a aVar = (phm.a) ue0.e.j(outstandingDebtsFlowController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        OutstandingDebtsFlowContract$InputData outstandingDebtsFlowContract$InputData = outstandingDebtsFlowController.L;
                        outstandingDebtsFlowContract$InputData.getClass();
                        return new s4(c1Var, new iq3.a(), outstandingDebtsFlowController, outstandingDebtsFlowContract$InputData);
                    case 1:
                        return (d) ((s4) this.f242974b.M.getValue()).f119764x.get();
                    default:
                        OutstandingDebtsFlowController outstandingDebtsFlowController2 = this.f242974b;
                        return czi.c.d(0, 6, null, outstandingDebtsFlowController2, (d) outstandingDebtsFlowController2.P.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (s4) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (s4) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((s4) this.M.getValue()).f119762t.get()).d(v.k(this.N, this.O));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f53218h), null, new f(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new m(this, continuation, 9), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new i0(this, continuation, 18), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final yki.c k() {
        return (yki.c) this.Q.getValue();
    }
}
