package com.revolut.feature.rewards.impl.ui.details.flow;

import aii.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlow;
import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kic.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import te0.w;
import uki.c;
import whc.n;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "", "Lno/m;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PerkDetailsFlow extends ViewController<q> implements c, m {
    public final /* synthetic */ zhc.a K;
    public final PerkDetailsFlowContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public PerkDetailsFlow(PerkDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = zhc.a.f322393a;
        this.L = inputData;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: kic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerkDetailsFlow f184195b;

            {
                this.f184195b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (g) ((whc.n) this.f184195b.P.getValue()).f297555p.get();
                    case 1:
                        PerkDetailsFlow perkDetailsFlow = this.f184195b;
                        return czi.c.a(R$id.screen_transparent_container, (g) perkDetailsFlow.N.getValue(), perkDetailsFlow);
                    default:
                        PerkDetailsFlow perkDetailsFlow2 = this.f184195b;
                        phm.a aVar = (phm.a) ue0.e.j(perkDetailsFlow2.m2()).a().get(whc.s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", whc.s.class, " is not found"));
                        }
                        whc.s sVar = ((whc.s) aVar2.b()).f297580t;
                        PerkDetailsFlowContract$InputData perkDetailsFlowContract$InputData = perkDetailsFlow2.L;
                        perkDetailsFlowContract$InputData.getClass();
                        return new whc.n(sVar, perkDetailsFlow2, perkDetailsFlowContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: kic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerkDetailsFlow f184195b;

            {
                this.f184195b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (g) ((whc.n) this.f184195b.P.getValue()).f297555p.get();
                    case 1:
                        PerkDetailsFlow perkDetailsFlow = this.f184195b;
                        return czi.c.a(R$id.screen_transparent_container, (g) perkDetailsFlow.N.getValue(), perkDetailsFlow);
                    default:
                        PerkDetailsFlow perkDetailsFlow2 = this.f184195b;
                        phm.a aVar = (phm.a) ue0.e.j(perkDetailsFlow2.m2()).a().get(whc.s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", whc.s.class, " is not found"));
                        }
                        whc.s sVar = ((whc.s) aVar2.b()).f297580t;
                        PerkDetailsFlowContract$InputData perkDetailsFlowContract$InputData = perkDetailsFlow2.L;
                        perkDetailsFlowContract$InputData.getClass();
                        return new whc.n(sVar, perkDetailsFlow2, perkDetailsFlowContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: kic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerkDetailsFlow f184195b;

            {
                this.f184195b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (g) ((whc.n) this.f184195b.P.getValue()).f297555p.get();
                    case 1:
                        PerkDetailsFlow perkDetailsFlow = this.f184195b;
                        return czi.c.a(R$id.screen_transparent_container, (g) perkDetailsFlow.N.getValue(), perkDetailsFlow);
                    default:
                        PerkDetailsFlow perkDetailsFlow2 = this.f184195b;
                        phm.a aVar = (phm.a) ue0.e.j(perkDetailsFlow2.m2()).a().get(whc.s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", whc.s.class, " is not found"));
                        }
                        whc.s sVar = ((whc.s) aVar2.b()).f297580t;
                        PerkDetailsFlowContract$InputData perkDetailsFlowContract$InputData = perkDetailsFlow2.L;
                        perkDetailsFlowContract$InputData.getClass();
                        return new whc.n(sVar, perkDetailsFlow2, perkDetailsFlowContract$InputData);
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        this.K.getClass();
        return new AnalyticsProduct.Retail(zhc.a.f322394b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (n) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.O.getValue();
    }
}
