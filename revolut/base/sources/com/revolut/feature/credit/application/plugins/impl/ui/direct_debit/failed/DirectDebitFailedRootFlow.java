package com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.failed;

import a0.d;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.failed.DirectDebitFailedContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.failed.DirectDebitFailedRootFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import dw3.c1;
import dw3.g2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.c;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/direct_debit/failed/DirectDebitFailedRootFlow;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "Lyki/f;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DirectDebitFailedRootFlow extends PluginFlowControllerV2 {
    public final DirectDebitFailedContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public DirectDebitFailedRootFlow(DirectDebitFailedContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: s94.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDebitFailedRootFlow f261113b;

            {
                this.f261113b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        DirectDebitFailedRootFlow directDebitFailedRootFlow = this.f261113b;
                        phm.a aVar = (phm.a) e.j(directDebitFailedRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        DirectDebitFailedContract$InputData directDebitFailedContract$InputData = directDebitFailedRootFlow.L;
                        directDebitFailedContract$InputData.getClass();
                        return new g2(c1Var, new iq3.a(), directDebitFailedRootFlow, directDebitFailedContract$InputData);
                    case 1:
                        return (b) ((g2) this.f261113b.N.getValue()).u.get();
                    default:
                        DirectDebitFailedRootFlow directDebitFailedRootFlow2 = this.f261113b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, directDebitFailedRootFlow2, (b) directDebitFailedRootFlow2.O.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: s94.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDebitFailedRootFlow f261113b;

            {
                this.f261113b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        DirectDebitFailedRootFlow directDebitFailedRootFlow = this.f261113b;
                        phm.a aVar = (phm.a) e.j(directDebitFailedRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        DirectDebitFailedContract$InputData directDebitFailedContract$InputData = directDebitFailedRootFlow.L;
                        directDebitFailedContract$InputData.getClass();
                        return new g2(c1Var, new iq3.a(), directDebitFailedRootFlow, directDebitFailedContract$InputData);
                    case 1:
                        return (b) ((g2) this.f261113b.N.getValue()).u.get();
                    default:
                        DirectDebitFailedRootFlow directDebitFailedRootFlow2 = this.f261113b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, directDebitFailedRootFlow2, (b) directDebitFailedRootFlow2.O.getValue());
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: s94.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDebitFailedRootFlow f261113b;

            {
                this.f261113b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        DirectDebitFailedRootFlow directDebitFailedRootFlow = this.f261113b;
                        phm.a aVar = (phm.a) e.j(directDebitFailedRootFlow.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        DirectDebitFailedContract$InputData directDebitFailedContract$InputData = directDebitFailedRootFlow.L;
                        directDebitFailedContract$InputData.getClass();
                        return new g2(c1Var, new iq3.a(), directDebitFailedRootFlow, directDebitFailedContract$InputData);
                    case 1:
                        return (b) ((g2) this.f261113b.N.getValue()).u.get();
                    default:
                        DirectDebitFailedRootFlow directDebitFailedRootFlow2 = this.f261113b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, directDebitFailedRootFlow2, (b) directDebitFailedRootFlow2.O.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g2) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (g2) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (s94.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF103912o0() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final c k() {
        return (c) this.P.getValue();
    }
}
