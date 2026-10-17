package com.revolut.feature.wealth.impl.ui.flows.add_money.composite;

import com.revolut.feature.wealth.impl.ui.flows.add_money.composite.CompositeAddMoneyFlow;
import com.revolut.kompot.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import i1d.b;
import iah.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import uki.c;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/flows/add_money/composite/CompositeAddMoneyFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liah/f;", "Luki/c;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CompositeAddMoneyFlow extends ViewController<f> implements c {
    public final Object K;
    public final Object L;
    public final Object M;

    public CompositeAddMoneyFlow(CompositeAddMoneyFlowContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = w.y0(new b(this, input, 12));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: iah.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompositeAddMoneyFlow f160024b;

            {
                this.f160024b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (c) ((z9h.b) this.f160024b.K.getValue()).f320391g.get();
                    default:
                        CompositeAddMoneyFlow compositeAddMoneyFlow = this.f160024b;
                        return czi.c.a(R$id.container, (c) compositeAddMoneyFlow.L.getValue(), compositeAddMoneyFlow);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: iah.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CompositeAddMoneyFlow f160024b;

            {
                this.f160024b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (c) ((z9h.b) this.f160024b.K.getValue()).f320391g.get();
                    default:
                        CompositeAddMoneyFlow compositeAddMoneyFlow = this.f160024b;
                        return czi.c.a(R$id.container, (c) compositeAddMoneyFlow.L.getValue(), compositeAddMoneyFlow);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z9h.b) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (z9h.b) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (iah.c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.M.getValue();
    }
}
