package com.revolut.feature.raffle.impl.flow;

import aii.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.feature.raffle.impl.flow.RaffleFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import ghk.t;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/raffle/impl/flow/RaffleFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_raffle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RaffleFlow extends ViewController<q> implements f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public RaffleFlow(RaffleFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$style.UiKitTheme_Night;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: gta.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RaffleFlow f146570b;

            {
                this.f146570b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        RaffleFlow raffleFlow = this.f146570b;
                        return c.d(0, 6, null, raffleFlow, (b) raffleFlow.N.getValue());
                    default:
                        return (b) ((fta.c) this.f146570b.M.getValue()).d.get();
                }
            }
        });
        this.M = w.y0(new t(this, inputData, 20));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: gta.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RaffleFlow f146570b;

            {
                this.f146570b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        RaffleFlow raffleFlow = this.f146570b;
                        return c.d(0, 6, null, raffleFlow, (b) raffleFlow.N.getValue());
                    default:
                        return (b) ((fta.c) this.f146570b.M.getValue()).d.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.K);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (fta.c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (fta.c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (gta.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
