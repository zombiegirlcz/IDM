package com.revolut.feature.card_management.impl.cardlimit.flow;

import a0.d;
import aii.q;
import com.revolut.feature.card_management.impl.cardlimit.flow.CardLimitFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lz2.b;
import mz2.c;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_management/impl/cardlimit/flow/CardLimitFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardLimitFlow extends ViewController<q> implements f {
    public final c K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CardLimitFlow(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: mz2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardLimitFlow f210573b;

            {
                this.f210573b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CardLimitFlow cardLimitFlow = this.f210573b;
                        phm.a aVar = (phm.a) e.j(cardLimitFlow.m2()).a().get(lz2.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", lz2.a.class, " is not found"));
                        }
                        lz2.a aVar3 = ((lz2.a) aVar2.b()).e;
                        c cVar = cardLimitFlow.K;
                        cVar.getClass();
                        return new lz2.b(aVar3, cVar);
                    case 1:
                        return (b) ((lz2.b) this.f210573b.L.getValue()).d.get();
                    default:
                        CardLimitFlow cardLimitFlow2 = this.f210573b;
                        return czi.c.d(0, 6, null, cardLimitFlow2, (b) cardLimitFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: mz2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardLimitFlow f210573b;

            {
                this.f210573b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CardLimitFlow cardLimitFlow = this.f210573b;
                        phm.a aVar = (phm.a) e.j(cardLimitFlow.m2()).a().get(lz2.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", lz2.a.class, " is not found"));
                        }
                        lz2.a aVar3 = ((lz2.a) aVar2.b()).e;
                        c cVar = cardLimitFlow.K;
                        cVar.getClass();
                        return new lz2.b(aVar3, cVar);
                    case 1:
                        return (b) ((lz2.b) this.f210573b.L.getValue()).d.get();
                    default:
                        CardLimitFlow cardLimitFlow2 = this.f210573b;
                        return czi.c.d(0, 6, null, cardLimitFlow2, (b) cardLimitFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: mz2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardLimitFlow f210573b;

            {
                this.f210573b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CardLimitFlow cardLimitFlow = this.f210573b;
                        phm.a aVar = (phm.a) e.j(cardLimitFlow.m2()).a().get(lz2.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", lz2.a.class, " is not found"));
                        }
                        lz2.a aVar3 = ((lz2.a) aVar2.b()).e;
                        c cVar = cardLimitFlow.K;
                        cVar.getClass();
                        return new lz2.b(aVar3, cVar);
                    case 1:
                        return (b) ((lz2.b) this.f210573b.L.getValue()).d.get();
                    default:
                        CardLimitFlow cardLimitFlow2 = this.f210573b;
                        return czi.c.d(0, 6, null, cardLimitFlow2, (b) cardLimitFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (mz2.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
