package com.revolut.feature.foreign_currencies.impl.ui.flow;

import a0.d;
import aii.q;
import com.revolut.feature.foreign_currencies.impl.ui.flow.ForeignCurrenciesFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import nq6.c;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/foreign_currencies/impl/ui/flow/ForeignCurrenciesFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "<init>", "()V", "feature_foreign_currencies_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ForeignCurrenciesFlow extends ViewController<q> implements f {
    public final int K = R$layout.screen_transparent;
    public final Object L;
    public final Object M;
    public final Object N;

    public ForeignCurrenciesFlow() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: rq6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ForeignCurrenciesFlow f256481b;

            {
                this.f256481b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f256481b.m2()).a().get(nq6.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new c(((nq6.a) aVar2.b()).f218367c);
                        }
                        throw new IllegalStateException(d.q("Api ", nq6.a.class, " is not found"));
                    case 1:
                        return (b) ((c) this.f256481b.L.getValue()).f218370b.get();
                    default:
                        int i2 = R$id.screen_transparent_container;
                        ForeignCurrenciesFlow foreignCurrenciesFlow = this.f256481b;
                        return czi.c.d(i2, 4, null, foreignCurrenciesFlow, (b) foreignCurrenciesFlow.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: rq6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ForeignCurrenciesFlow f256481b;

            {
                this.f256481b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f256481b.m2()).a().get(nq6.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new c(((nq6.a) aVar2.b()).f218367c);
                        }
                        throw new IllegalStateException(d.q("Api ", nq6.a.class, " is not found"));
                    case 1:
                        return (b) ((c) this.f256481b.L.getValue()).f218370b.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        ForeignCurrenciesFlow foreignCurrenciesFlow = this.f256481b;
                        return czi.c.d(i22, 4, null, foreignCurrenciesFlow, (b) foreignCurrenciesFlow.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: rq6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ForeignCurrenciesFlow f256481b;

            {
                this.f256481b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f256481b.m2()).a().get(nq6.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new c(((nq6.a) aVar2.b()).f218367c);
                        }
                        throw new IllegalStateException(d.q("Api ", nq6.a.class, " is not found"));
                    case 1:
                        return (b) ((c) this.f256481b.L.getValue()).f218370b.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        ForeignCurrenciesFlow foreignCurrenciesFlow = this.f256481b;
                        return czi.c.d(i22, 4, null, foreignCurrenciesFlow, (b) foreignCurrenciesFlow.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b k3() {
        return (rq6.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
