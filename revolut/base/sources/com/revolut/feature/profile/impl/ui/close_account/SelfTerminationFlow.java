package com.revolut.feature.profile.impl.ui.close_account;

import aii.q;
import com.revolut.feature.profile.impl.ui.close_account.SelfTerminationFlow;
import com.revolut.feature.profile.impl.ui.close_account.SelfTerminationFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import fma.c0;
import fma.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/close_account/SelfTerminationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelfTerminationFlow extends ViewController<q> implements f {
    public final SelfTerminationFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public SelfTerminationFlow(SelfTerminationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: mma.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelfTerminationFlow f207182b;

            {
                this.f207182b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SelfTerminationFlow selfTerminationFlow = this.f207182b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, selfTerminationFlow, (b) selfTerminationFlow.N.getValue());
                    case 1:
                        return (b) ((f0) this.f207182b.O.getValue()).f136096b.get();
                    default:
                        SelfTerminationFlow selfTerminationFlow2 = this.f207182b;
                        phm.a aVar = (phm.a) e.j(selfTerminationFlow2.m2()).a().get(pla.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", pla.b.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).G0;
                        SelfTerminationFlowContract$InputData selfTerminationFlowContract$InputData = selfTerminationFlow2.K;
                        selfTerminationFlowContract$InputData.getClass();
                        return new f0(c0Var, selfTerminationFlowContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: mma.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelfTerminationFlow f207182b;

            {
                this.f207182b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SelfTerminationFlow selfTerminationFlow = this.f207182b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, selfTerminationFlow, (b) selfTerminationFlow.N.getValue());
                    case 1:
                        return (b) ((f0) this.f207182b.O.getValue()).f136096b.get();
                    default:
                        SelfTerminationFlow selfTerminationFlow2 = this.f207182b;
                        phm.a aVar = (phm.a) e.j(selfTerminationFlow2.m2()).a().get(pla.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", pla.b.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).G0;
                        SelfTerminationFlowContract$InputData selfTerminationFlowContract$InputData = selfTerminationFlow2.K;
                        selfTerminationFlowContract$InputData.getClass();
                        return new f0(c0Var, selfTerminationFlowContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: mma.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelfTerminationFlow f207182b;

            {
                this.f207182b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        SelfTerminationFlow selfTerminationFlow = this.f207182b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, selfTerminationFlow, (b) selfTerminationFlow.N.getValue());
                    case 1:
                        return (b) ((f0) this.f207182b.O.getValue()).f136096b.get();
                    default:
                        SelfTerminationFlow selfTerminationFlow2 = this.f207182b;
                        phm.a aVar = (phm.a) e.j(selfTerminationFlow2.m2()).a().get(pla.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", pla.b.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).G0;
                        SelfTerminationFlowContract$InputData selfTerminationFlowContract$InputData = selfTerminationFlow2.K;
                        selfTerminationFlowContract$InputData.getClass();
                        return new f0(c0Var, selfTerminationFlowContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (f0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (mma.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
