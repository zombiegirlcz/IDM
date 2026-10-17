package com.revolut.feature.credit.application.plugins.impl.ui.status_dialog;

import a0.d;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.status_dialog.StatusDialogFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.status_dialog.StatusDialogRootFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import czi.c;
import dw3.c1;
import dw3.x6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import xi4.a;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/status_dialog/StatusDialogRootFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StatusDialogRootFlow extends PluginFlowControllerV2 {
    public final StatusDialogFlowContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public StatusDialogRootFlow(StatusDialogFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: xi4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StatusDialogRootFlow f306308b;

            {
                this.f306308b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        StatusDialogRootFlow statusDialogRootFlow = this.f306308b;
                        phm.a aVar = (phm.a) e.j(statusDialogRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        StatusDialogFlowContract$InputData statusDialogFlowContract$InputData = statusDialogRootFlow.L;
                        statusDialogFlowContract$InputData.getClass();
                        return new x6(c1Var, new iq3.a(), statusDialogRootFlow, statusDialogFlowContract$InputData);
                    case 1:
                        return (a) ((x6) this.f306308b.N.getValue()).u.get();
                    default:
                        StatusDialogRootFlow statusDialogRootFlow2 = this.f306308b;
                        return c.d(R$id.screen_transparent_container, 4, null, statusDialogRootFlow2, (a) statusDialogRootFlow2.O.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: xi4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StatusDialogRootFlow f306308b;

            {
                this.f306308b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        StatusDialogRootFlow statusDialogRootFlow = this.f306308b;
                        phm.a aVar = (phm.a) e.j(statusDialogRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        StatusDialogFlowContract$InputData statusDialogFlowContract$InputData = statusDialogRootFlow.L;
                        statusDialogFlowContract$InputData.getClass();
                        return new x6(c1Var, new iq3.a(), statusDialogRootFlow, statusDialogFlowContract$InputData);
                    case 1:
                        return (a) ((x6) this.f306308b.N.getValue()).u.get();
                    default:
                        StatusDialogRootFlow statusDialogRootFlow2 = this.f306308b;
                        return c.d(R$id.screen_transparent_container, 4, null, statusDialogRootFlow2, (a) statusDialogRootFlow2.O.getValue());
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: xi4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StatusDialogRootFlow f306308b;

            {
                this.f306308b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        StatusDialogRootFlow statusDialogRootFlow = this.f306308b;
                        phm.a aVar = (phm.a) e.j(statusDialogRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        StatusDialogFlowContract$InputData statusDialogFlowContract$InputData = statusDialogRootFlow.L;
                        statusDialogFlowContract$InputData.getClass();
                        return new x6(c1Var, new iq3.a(), statusDialogRootFlow, statusDialogFlowContract$InputData);
                    case 1:
                        return (a) ((x6) this.f306308b.N.getValue()).u.get();
                    default:
                        StatusDialogRootFlow statusDialogRootFlow2 = this.f306308b;
                        return c.d(R$id.screen_transparent_container, 4, null, statusDialogRootFlow2, (a) statusDialogRootFlow2.O.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x6) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (x6) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (a) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final yki.c k() {
        return (yki.c) this.P.getValue();
    }
}
