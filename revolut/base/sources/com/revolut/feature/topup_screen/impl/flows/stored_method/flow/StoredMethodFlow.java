package com.revolut.feature.topup_screen.impl.flows.stored_method.flow;

import aii.q;
import com.revolut.feature.topup_screen.impl.flows.stored_method.flow.StoredMethodFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qve.k;
import qve.z;
import sxe.c;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/stored_method/flow/StoredMethodFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoredMethodFlow extends ViewController<q> implements f {
    public final c K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public StoredMethodFlow(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: sxe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoredMethodFlow f266460b;

            {
                this.f266460b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        StoredMethodFlow storedMethodFlow = this.f266460b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, storedMethodFlow, (b) storedMethodFlow.O.getValue());
                    case 1:
                        StoredMethodFlow storedMethodFlow2 = this.f266460b;
                        phm.a aVar = (phm.a) ue0.e.j(storedMethodFlow2.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).X;
                        c cVar = storedMethodFlow2.K;
                        cVar.getClass();
                        return new qve.q(kVar, cVar);
                    default:
                        return (b) ((qve.q) this.f266460b.N.getValue()).f249649b.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: sxe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoredMethodFlow f266460b;

            {
                this.f266460b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        StoredMethodFlow storedMethodFlow = this.f266460b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, storedMethodFlow, (b) storedMethodFlow.O.getValue());
                    case 1:
                        StoredMethodFlow storedMethodFlow2 = this.f266460b;
                        phm.a aVar = (phm.a) ue0.e.j(storedMethodFlow2.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).X;
                        c cVar = storedMethodFlow2.K;
                        cVar.getClass();
                        return new qve.q(kVar, cVar);
                    default:
                        return (b) ((qve.q) this.f266460b.N.getValue()).f249649b.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: sxe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoredMethodFlow f266460b;

            {
                this.f266460b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        StoredMethodFlow storedMethodFlow = this.f266460b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, storedMethodFlow, (b) storedMethodFlow.O.getValue());
                    case 1:
                        StoredMethodFlow storedMethodFlow2 = this.f266460b;
                        phm.a aVar = (phm.a) ue0.e.j(storedMethodFlow2.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).X;
                        c cVar = storedMethodFlow2.K;
                        cVar.getClass();
                        return new qve.q(kVar, cVar);
                    default:
                        return (b) ((qve.q) this.f266460b.N.getValue()).f249649b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (qve.q) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (qve.q) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (sxe.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
