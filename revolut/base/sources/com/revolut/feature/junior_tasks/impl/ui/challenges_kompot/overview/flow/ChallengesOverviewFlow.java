package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow;

import aii.q;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.ChallengesOverviewContract$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.ChallengesOverviewFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import gp8.k;
import gp8.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/flow/ChallengesOverviewFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChallengesOverviewFlow extends ViewController<q> implements f {
    public final ChallengesOverviewContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public ChallengesOverviewFlow(ChallengesOverviewContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: zp8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengesOverviewFlow f324187b;

            {
                this.f324187b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ChallengesOverviewFlow challengesOverviewFlow = this.f324187b;
                        phm.a aVar = (phm.a) ue0.e.j(challengesOverviewFlow.m2()).a().get(n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f145329j;
                        ChallengesOverviewContract$InputData challengesOverviewContract$InputData = challengesOverviewFlow.K;
                        challengesOverviewContract$InputData.getClass();
                        return new k(nVar, challengesOverviewContract$InputData);
                    case 1:
                        return (a) ((k) this.f324187b.L.getValue()).f145318g.get();
                    default:
                        ChallengesOverviewFlow challengesOverviewFlow2 = this.f324187b;
                        return czi.c.d(0, 6, null, challengesOverviewFlow2, (a) challengesOverviewFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: zp8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengesOverviewFlow f324187b;

            {
                this.f324187b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ChallengesOverviewFlow challengesOverviewFlow = this.f324187b;
                        phm.a aVar = (phm.a) ue0.e.j(challengesOverviewFlow.m2()).a().get(n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f145329j;
                        ChallengesOverviewContract$InputData challengesOverviewContract$InputData = challengesOverviewFlow.K;
                        challengesOverviewContract$InputData.getClass();
                        return new k(nVar, challengesOverviewContract$InputData);
                    case 1:
                        return (a) ((k) this.f324187b.L.getValue()).f145318g.get();
                    default:
                        ChallengesOverviewFlow challengesOverviewFlow2 = this.f324187b;
                        return czi.c.d(0, 6, null, challengesOverviewFlow2, (a) challengesOverviewFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: zp8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengesOverviewFlow f324187b;

            {
                this.f324187b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ChallengesOverviewFlow challengesOverviewFlow = this.f324187b;
                        phm.a aVar = (phm.a) ue0.e.j(challengesOverviewFlow.m2()).a().get(n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f145329j;
                        ChallengesOverviewContract$InputData challengesOverviewContract$InputData = challengesOverviewFlow.K;
                        challengesOverviewContract$InputData.getClass();
                        return new k(nVar, challengesOverviewContract$InputData);
                    case 1:
                        return (a) ((k) this.f324187b.L.getValue()).f145318g.get();
                    default:
                        ChallengesOverviewFlow challengesOverviewFlow2 = this.f324187b;
                        return czi.c.d(0, 6, null, challengesOverviewFlow2, (a) challengesOverviewFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (k) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (zp8.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
