package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow;

import aii.q;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.ChallengesEditFlow;
import com.revolut.kompot.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import gp8.i;
import gp8.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import uki.c;
import xki.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/edit/flow/ChallengesEditFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Luki/c;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChallengesEditFlow extends ViewController<q> implements c {
    public final np8.b K;
    public final Object L;
    public final Object M;
    public final Object N;

    public ChallengesEditFlow(np8.b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: np8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengesEditFlow f218158b;

            {
                this.f218158b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ChallengesEditFlow challengesEditFlow = this.f218158b;
                        phm.a aVar = (phm.a) ue0.e.j(challengesEditFlow.m2()).a().get(n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f145329j;
                        b bVar = challengesEditFlow.K;
                        bVar.getClass();
                        return new gp8.i(nVar, bVar);
                    case 1:
                        return (a) ((gp8.i) this.f218158b.L.getValue()).d.get();
                    default:
                        ChallengesEditFlow challengesEditFlow2 = this.f218158b;
                        return czi.c.a(R$id.container, (a) challengesEditFlow2.M.getValue(), challengesEditFlow2);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: np8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengesEditFlow f218158b;

            {
                this.f218158b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ChallengesEditFlow challengesEditFlow = this.f218158b;
                        phm.a aVar = (phm.a) ue0.e.j(challengesEditFlow.m2()).a().get(n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f145329j;
                        b bVar = challengesEditFlow.K;
                        bVar.getClass();
                        return new gp8.i(nVar, bVar);
                    case 1:
                        return (a) ((gp8.i) this.f218158b.L.getValue()).d.get();
                    default:
                        ChallengesEditFlow challengesEditFlow2 = this.f218158b;
                        return czi.c.a(R$id.container, (a) challengesEditFlow2.M.getValue(), challengesEditFlow2);
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: np8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChallengesEditFlow f218158b;

            {
                this.f218158b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ChallengesEditFlow challengesEditFlow = this.f218158b;
                        phm.a aVar = (phm.a) ue0.e.j(challengesEditFlow.m2()).a().get(n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f145329j;
                        b bVar = challengesEditFlow.K;
                        bVar.getClass();
                        return new gp8.i(nVar, bVar);
                    case 1:
                        return (a) ((gp8.i) this.f218158b.L.getValue()).d.get();
                    default:
                        ChallengesEditFlow challengesEditFlow2 = this.f218158b;
                        return czi.c.a(R$id.container, (a) challengesEditFlow2.M.getValue(), challengesEditFlow2);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (i) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (np8.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.N.getValue();
    }
}
