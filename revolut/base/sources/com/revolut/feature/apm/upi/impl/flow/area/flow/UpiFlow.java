package com.revolut.feature.apm.upi.impl.flow.area.flow;

import a0.d;
import aii.q;
import com.revolut.feature.apm.upi.impl.flow.area.flow.UpiFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import if2.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/flow/area/flow/UpiFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "<init>", "()V", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpiFlow extends ViewController<q> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public UpiFlow() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: of2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiFlow f224682b;

            {
                this.f224682b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f224682b.m2()).a().get(if2.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new h(((if2.f) aVar2.b()).f160865w);
                        }
                        throw new IllegalStateException(d.q("Api ", if2.f.class, " is not found"));
                    case 1:
                        return (b) ((h) this.f224682b.K.getValue()).f160871c.get();
                    default:
                        UpiFlow upiFlow = this.f224682b;
                        return c.d(0, 6, null, upiFlow, (b) upiFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: of2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiFlow f224682b;

            {
                this.f224682b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f224682b.m2()).a().get(if2.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new h(((if2.f) aVar2.b()).f160865w);
                        }
                        throw new IllegalStateException(d.q("Api ", if2.f.class, " is not found"));
                    case 1:
                        return (b) ((h) this.f224682b.K.getValue()).f160871c.get();
                    default:
                        UpiFlow upiFlow = this.f224682b;
                        return c.d(0, 6, null, upiFlow, (b) upiFlow.L.getValue());
                }
            }
        });
        final int i3 = 2;
        this.M = w.y0(new Function0(this) { // from class: of2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiFlow f224682b;

            {
                this.f224682b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        phm.a aVar = (phm.a) e.j(this.f224682b.m2()).a().get(if2.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new h(((if2.f) aVar2.b()).f160865w);
                        }
                        throw new IllegalStateException(d.q("Api ", if2.f.class, " is not found"));
                    case 1:
                        return (b) ((h) this.f224682b.K.getValue()).f160871c.get();
                    default:
                        UpiFlow upiFlow = this.f224682b;
                        return c.d(0, 6, null, upiFlow, (b) upiFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (h) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (h) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (of2.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
