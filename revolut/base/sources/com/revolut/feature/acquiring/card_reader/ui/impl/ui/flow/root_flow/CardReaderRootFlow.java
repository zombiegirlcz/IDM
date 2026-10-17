package com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.root_flow;

import aii.q;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.root_flow.CardReaderRootFlow;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.root_flow.CardReaderRootFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xb1.n;
import xb1.p;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/ui/impl/ui/flow/root_flow/CardReaderRootFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_acquiring_card_reader_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardReaderRootFlow extends ViewController<q> implements f {
    public final CardReaderRootFlowContract$InputData K;
    public final boolean L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CardReaderRootFlow(CardReaderRootFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: cc1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderRootFlow f22916b;

            {
                this.f22916b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                p pVarG;
                b60.a aVar;
                switch (i) {
                    case 0:
                        CardReaderRootFlow cardReaderRootFlow = this.f22916b;
                        try {
                            phm.a aVar2 = (phm.a) ue0.e.j(cardReaderRootFlow.m2()).a().get(qb1.a.class);
                            aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                        } catch (Exception unused) {
                            pVarG = xb1.b.Companion.g();
                        }
                        if (aVar == null) {
                            throw new IllegalStateException("Api " + qb1.a.class + " is not found");
                        }
                        pVarG = (p) aVar.b();
                        p pVar = pVarG.f303958g;
                        CardReaderRootFlowContract$InputData cardReaderRootFlowContract$InputData = cardReaderRootFlow.K;
                        cardReaderRootFlowContract$InputData.getClass();
                        return new n(pVar, cardReaderRootFlow, cardReaderRootFlowContract$InputData);
                    case 1:
                        return (b) ((n) this.f22916b.M.getValue()).f.get();
                    default:
                        CardReaderRootFlow cardReaderRootFlow2 = this.f22916b;
                        return czi.c.d(0, 6, null, cardReaderRootFlow2, (b) cardReaderRootFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: cc1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderRootFlow f22916b;

            {
                this.f22916b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                p pVarG;
                b60.a aVar;
                switch (i2) {
                    case 0:
                        CardReaderRootFlow cardReaderRootFlow = this.f22916b;
                        try {
                            phm.a aVar2 = (phm.a) ue0.e.j(cardReaderRootFlow.m2()).a().get(qb1.a.class);
                            aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                        } catch (Exception unused) {
                            pVarG = xb1.b.Companion.g();
                        }
                        if (aVar == null) {
                            throw new IllegalStateException("Api " + qb1.a.class + " is not found");
                        }
                        pVarG = (p) aVar.b();
                        p pVar = pVarG.f303958g;
                        CardReaderRootFlowContract$InputData cardReaderRootFlowContract$InputData = cardReaderRootFlow.K;
                        cardReaderRootFlowContract$InputData.getClass();
                        return new n(pVar, cardReaderRootFlow, cardReaderRootFlowContract$InputData);
                    case 1:
                        return (b) ((n) this.f22916b.M.getValue()).f.get();
                    default:
                        CardReaderRootFlow cardReaderRootFlow2 = this.f22916b;
                        return czi.c.d(0, 6, null, cardReaderRootFlow2, (b) cardReaderRootFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: cc1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderRootFlow f22916b;

            {
                this.f22916b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                p pVarG;
                b60.a aVar;
                switch (i3) {
                    case 0:
                        CardReaderRootFlow cardReaderRootFlow = this.f22916b;
                        try {
                            phm.a aVar2 = (phm.a) ue0.e.j(cardReaderRootFlow.m2()).a().get(qb1.a.class);
                            aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                        } catch (Exception unused) {
                            pVarG = xb1.b.Companion.g();
                        }
                        if (aVar == null) {
                            throw new IllegalStateException("Api " + qb1.a.class + " is not found");
                        }
                        pVarG = (p) aVar.b();
                        p pVar = pVarG.f303958g;
                        CardReaderRootFlowContract$InputData cardReaderRootFlowContract$InputData = cardReaderRootFlow.K;
                        cardReaderRootFlowContract$InputData.getClass();
                        return new n(pVar, cardReaderRootFlow, cardReaderRootFlowContract$InputData);
                    case 1:
                        return (b) ((n) this.f22916b.M.getValue()).f.get();
                    default:
                        CardReaderRootFlow cardReaderRootFlow2 = this.f22916b;
                        return czi.c.d(0, 6, null, cardReaderRootFlow2, (b) cardReaderRootFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (n) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (cc1.b) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
