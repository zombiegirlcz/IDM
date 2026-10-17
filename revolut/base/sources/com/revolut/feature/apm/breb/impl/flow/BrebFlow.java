package com.revolut.feature.apm.breb.impl.flow;

import aii.q;
import com.revolut.feature.apm.breb.impl.flow.BrebFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nv1.h;
import ov1.e;
import qji.b;
import te0.w;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/flow/BrebFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrebFlow extends ViewController<q> implements f {
    public final e K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public BrebFlow(e nextStep) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        this.K = nextStep;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ov1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebFlow f229946b;

            {
                this.f229946b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BrebFlow brebFlow = this.f229946b;
                        phm.a aVar = (phm.a) ue0.e.j(brebFlow.m2()).a().get(nv1.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nv1.g.class, " is not found"));
                        }
                        nv1.g gVar = ((nv1.g) aVar2.b()).f219407r;
                        e eVar = brebFlow.K;
                        eVar.getClass();
                        return new h(gVar, eVar);
                    case 1:
                        return (b) ((h) this.f229946b.M.getValue()).d.get();
                    default:
                        int i2 = R$id.screen_transparent_container;
                        BrebFlow brebFlow2 = this.f229946b;
                        return czi.c.d(i2, 4, null, brebFlow2, (b) brebFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ov1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebFlow f229946b;

            {
                this.f229946b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BrebFlow brebFlow = this.f229946b;
                        phm.a aVar = (phm.a) ue0.e.j(brebFlow.m2()).a().get(nv1.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nv1.g.class, " is not found"));
                        }
                        nv1.g gVar = ((nv1.g) aVar2.b()).f219407r;
                        e eVar = brebFlow.K;
                        eVar.getClass();
                        return new h(gVar, eVar);
                    case 1:
                        return (b) ((h) this.f229946b.M.getValue()).d.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        BrebFlow brebFlow2 = this.f229946b;
                        return czi.c.d(i22, 4, null, brebFlow2, (b) brebFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: ov1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebFlow f229946b;

            {
                this.f229946b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        BrebFlow brebFlow = this.f229946b;
                        phm.a aVar = (phm.a) ue0.e.j(brebFlow.m2()).a().get(nv1.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nv1.g.class, " is not found"));
                        }
                        nv1.g gVar = ((nv1.g) aVar2.b()).f219407r;
                        e eVar = brebFlow.K;
                        eVar.getClass();
                        return new h(gVar, eVar);
                    case 1:
                        return (b) ((h) this.f229946b.M.getValue()).d.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        BrebFlow brebFlow2 = this.f229946b;
                        return czi.c.d(i22, 4, null, brebFlow2, (b) brebFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (h) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (h) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ov1.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
