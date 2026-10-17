package com.revolut.feature.incentive_reward.impl.ui.lottery.draw.flow;

import a0.d;
import aii.q;
import cf7.g;
import cf7.l;
import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.flow.LotteryDrawFlow;
import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.flow.LotteryDrawFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/incentive_reward/impl/ui/lottery/draw/flow/LotteryDrawFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_incentive_reward_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LotteryDrawFlow extends ViewController<q> implements f {
    public final LotteryDrawFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public LotteryDrawFlow(LotteryDrawFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: pg7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LotteryDrawFlow f235814b;

            {
                this.f235814b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        LotteryDrawFlow lotteryDrawFlow = this.f235814b;
                        phm.a aVar = (phm.a) e.j(lotteryDrawFlow.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", l.class, " is not found"));
                        }
                        cf7.b bVar = ((cf7.b) ((l) aVar2.b())).f23583r;
                        LotteryDrawFlowContract$InputData lotteryDrawFlowContract$InputData = lotteryDrawFlow.K;
                        lotteryDrawFlowContract$InputData.getClass();
                        return new g(bVar, lotteryDrawFlowContract$InputData);
                    case 1:
                        return (b) ((g) this.f235814b.L.getValue()).d.get();
                    default:
                        LotteryDrawFlow lotteryDrawFlow2 = this.f235814b;
                        return c.d(0, 6, null, lotteryDrawFlow2, (b) lotteryDrawFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: pg7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LotteryDrawFlow f235814b;

            {
                this.f235814b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        LotteryDrawFlow lotteryDrawFlow = this.f235814b;
                        phm.a aVar = (phm.a) e.j(lotteryDrawFlow.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", l.class, " is not found"));
                        }
                        cf7.b bVar = ((cf7.b) ((l) aVar2.b())).f23583r;
                        LotteryDrawFlowContract$InputData lotteryDrawFlowContract$InputData = lotteryDrawFlow.K;
                        lotteryDrawFlowContract$InputData.getClass();
                        return new g(bVar, lotteryDrawFlowContract$InputData);
                    case 1:
                        return (b) ((g) this.f235814b.L.getValue()).d.get();
                    default:
                        LotteryDrawFlow lotteryDrawFlow2 = this.f235814b;
                        return c.d(0, 6, null, lotteryDrawFlow2, (b) lotteryDrawFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: pg7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LotteryDrawFlow f235814b;

            {
                this.f235814b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        LotteryDrawFlow lotteryDrawFlow = this.f235814b;
                        phm.a aVar = (phm.a) e.j(lotteryDrawFlow.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", l.class, " is not found"));
                        }
                        cf7.b bVar = ((cf7.b) ((l) aVar2.b())).f23583r;
                        LotteryDrawFlowContract$InputData lotteryDrawFlowContract$InputData = lotteryDrawFlow.K;
                        lotteryDrawFlowContract$InputData.getClass();
                        return new g(bVar, lotteryDrawFlowContract$InputData);
                    case 1:
                        return (b) ((g) this.f235814b.L.getValue()).d.get();
                    default:
                        LotteryDrawFlow lotteryDrawFlow2 = this.f235814b;
                        return c.d(0, 6, null, lotteryDrawFlow2, (b) lotteryDrawFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (g) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (pg7.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
