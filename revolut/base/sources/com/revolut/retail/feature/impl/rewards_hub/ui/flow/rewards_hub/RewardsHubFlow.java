package com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub;

import aii.q;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.RewardsHubFlow;
import com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.RewardsHubFlowContract$Step;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import rtj.g;
import rtj.h;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/impl/rewards_hub/ui/flow/rewards_hub/RewardsHubFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_rewards_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RewardsHubFlow extends ViewController<q> implements f {
    public final RewardsHubFlowContract$Step K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public RewardsHubFlow(RewardsHubFlowContract$Step initialStep) {
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        this.K = initialStep;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: wtj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardsHubFlow f299997b;

            {
                this.f299997b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        RewardsHubFlow rewardsHubFlow = this.f299997b;
                        phm.a aVar = (phm.a) ue0.e.j(rewardsHubFlow.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).k;
                        RewardsHubFlowContract$Step rewardsHubFlowContract$Step = rewardsHubFlow.K;
                        rewardsHubFlowContract$Step.getClass();
                        return new h(gVar, rewardsHubFlowContract$Step);
                    case 1:
                        h hVar = (h) this.f299997b.M.getValue();
                        return new com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.a(hVar.f257289a, ((s41.a) hVar.f257290b.f257283g).d());
                    default:
                        RewardsHubFlow rewardsHubFlow2 = this.f299997b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, rewardsHubFlow2, (b) rewardsHubFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: wtj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardsHubFlow f299997b;

            {
                this.f299997b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        RewardsHubFlow rewardsHubFlow = this.f299997b;
                        phm.a aVar = (phm.a) ue0.e.j(rewardsHubFlow.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).k;
                        RewardsHubFlowContract$Step rewardsHubFlowContract$Step = rewardsHubFlow.K;
                        rewardsHubFlowContract$Step.getClass();
                        return new h(gVar, rewardsHubFlowContract$Step);
                    case 1:
                        h hVar = (h) this.f299997b.M.getValue();
                        return new com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.a(hVar.f257289a, ((s41.a) hVar.f257290b.f257283g).d());
                    default:
                        RewardsHubFlow rewardsHubFlow2 = this.f299997b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, rewardsHubFlow2, (b) rewardsHubFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: wtj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RewardsHubFlow f299997b;

            {
                this.f299997b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        RewardsHubFlow rewardsHubFlow = this.f299997b;
                        phm.a aVar = (phm.a) ue0.e.j(rewardsHubFlow.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).k;
                        RewardsHubFlowContract$Step rewardsHubFlowContract$Step = rewardsHubFlow.K;
                        rewardsHubFlowContract$Step.getClass();
                        return new h(gVar, rewardsHubFlowContract$Step);
                    case 1:
                        h hVar = (h) this.f299997b.M.getValue();
                        return new com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.a(hVar.f257289a, ((s41.a) hVar.f257290b.f257283g).d());
                    default:
                        RewardsHubFlow rewardsHubFlow2 = this.f299997b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, rewardsHubFlow2, (b) rewardsHubFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (h) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (wtj.b) this.N.getValue();
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
