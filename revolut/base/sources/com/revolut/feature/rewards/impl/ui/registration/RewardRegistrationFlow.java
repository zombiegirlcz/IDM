package com.revolut.feature.rewards.impl.ui.registration;

import aii.q;
import com.revolut.feature.rewards.impl.ui.registration.RewardRegistrationFlow;
import com.revolut.feature.rewards.impl.ui.registration.RewardRegistrationFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import vic.c;
import whc.r;
import whc.s;
import yki.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/registration/RewardRegistrationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RewardRegistrationFlow extends ViewController<q> implements f {
    public final RewardRegistrationFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public RewardRegistrationFlow(RewardRegistrationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: vic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardRegistrationFlow f289562b;

            {
                this.f289562b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (c) ((r) this.f289562b.O.getValue()).f297566b.get();
                    case 1:
                        RewardRegistrationFlow rewardRegistrationFlow = this.f289562b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, rewardRegistrationFlow, (c) rewardRegistrationFlow.M.getValue());
                    default:
                        RewardRegistrationFlow rewardRegistrationFlow2 = this.f289562b;
                        phm.a aVar = (phm.a) e.j(rewardRegistrationFlow2.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).f297580t;
                        RewardRegistrationFlowContract$InputData rewardRegistrationFlowContract$InputData = rewardRegistrationFlow2.K;
                        rewardRegistrationFlowContract$InputData.getClass();
                        return new r(sVar, rewardRegistrationFlowContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: vic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardRegistrationFlow f289562b;

            {
                this.f289562b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (c) ((r) this.f289562b.O.getValue()).f297566b.get();
                    case 1:
                        RewardRegistrationFlow rewardRegistrationFlow = this.f289562b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, rewardRegistrationFlow, (c) rewardRegistrationFlow.M.getValue());
                    default:
                        RewardRegistrationFlow rewardRegistrationFlow2 = this.f289562b;
                        phm.a aVar = (phm.a) e.j(rewardRegistrationFlow2.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).f297580t;
                        RewardRegistrationFlowContract$InputData rewardRegistrationFlowContract$InputData = rewardRegistrationFlow2.K;
                        rewardRegistrationFlowContract$InputData.getClass();
                        return new r(sVar, rewardRegistrationFlowContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: vic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardRegistrationFlow f289562b;

            {
                this.f289562b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (c) ((r) this.f289562b.O.getValue()).f297566b.get();
                    case 1:
                        RewardRegistrationFlow rewardRegistrationFlow = this.f289562b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, rewardRegistrationFlow, (c) rewardRegistrationFlow.M.getValue());
                    default:
                        RewardRegistrationFlow rewardRegistrationFlow2 = this.f289562b;
                        phm.a aVar = (phm.a) e.j(rewardRegistrationFlow2.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).f297580t;
                        RewardRegistrationFlowContract$InputData rewardRegistrationFlowContract$InputData = rewardRegistrationFlow2.K;
                        rewardRegistrationFlowContract$InputData.getClass();
                        return new r(sVar, rewardRegistrationFlowContract$InputData);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (r) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
