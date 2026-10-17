package com.revolut.feature.rewards.impl.ui.perkaccess;

import aii.q;
import com.revolut.feature.rewards.impl.ui.perkaccess.PerkAccessFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import uic.b;
import uic.d;
import whc.m;
import whc.s;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/perkaccess/PerkAccessFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PerkAccessFlow extends ViewController<q> implements f {
    public final b K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public PerkAccessFlow(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: uic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerkAccessFlow f280369b;

            {
                this.f280369b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (d) ((m) this.f280369b.O.getValue()).f297545b.get();
                    case 1:
                        PerkAccessFlow perkAccessFlow = this.f280369b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, perkAccessFlow, (d) perkAccessFlow.M.getValue());
                    default:
                        PerkAccessFlow perkAccessFlow2 = this.f280369b;
                        phm.a aVar = (phm.a) ue0.e.j(perkAccessFlow2.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).f297580t;
                        b bVar = perkAccessFlow2.K;
                        bVar.getClass();
                        return new m(sVar, bVar);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: uic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerkAccessFlow f280369b;

            {
                this.f280369b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (d) ((m) this.f280369b.O.getValue()).f297545b.get();
                    case 1:
                        PerkAccessFlow perkAccessFlow = this.f280369b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, perkAccessFlow, (d) perkAccessFlow.M.getValue());
                    default:
                        PerkAccessFlow perkAccessFlow2 = this.f280369b;
                        phm.a aVar = (phm.a) ue0.e.j(perkAccessFlow2.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).f297580t;
                        b bVar = perkAccessFlow2.K;
                        bVar.getClass();
                        return new m(sVar, bVar);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: uic.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PerkAccessFlow f280369b;

            {
                this.f280369b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (d) ((m) this.f280369b.O.getValue()).f297545b.get();
                    case 1:
                        PerkAccessFlow perkAccessFlow = this.f280369b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, perkAccessFlow, (d) perkAccessFlow.M.getValue());
                    default:
                        PerkAccessFlow perkAccessFlow2 = this.f280369b;
                        phm.a aVar = (phm.a) ue0.e.j(perkAccessFlow2.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).f297580t;
                        b bVar = perkAccessFlow2.K;
                        bVar.getClass();
                        return new m(sVar, bVar);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (m) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
