package com.revolut.feature.pix.impl.flow.alias_deletion;

import a0.d;
import aii.q;
import com.revolut.feature.pix.impl.flow.alias_deletion.AliasDeletionContract$InputData;
import com.revolut.feature.pix.impl.flow.alias_deletion.AliasDeletionFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p8a.d0;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/alias_deletion/AliasDeletionFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AliasDeletionFlow extends ViewController<q> implements f {
    public final AliasDeletionContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public AliasDeletionFlow(AliasDeletionContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: v8a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AliasDeletionFlow f286731b;

            {
                this.f286731b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AliasDeletionFlow aliasDeletionFlow = this.f286731b;
                        phm.a aVar = (phm.a) e.j(aliasDeletionFlow.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", d0.class, " is not found"));
                        }
                        d0 d0Var = ((d0) aVar2.b()).C;
                        AliasDeletionContract$InputData aliasDeletionContract$InputData = aliasDeletionFlow.K;
                        aliasDeletionContract$InputData.getClass();
                        return new p8a.d(d0Var, aliasDeletionContract$InputData);
                    case 1:
                        return (a) ((p8a.d) this.f286731b.M.getValue()).d.get();
                    default:
                        int i2 = R$id.screen_transparent_container;
                        AliasDeletionFlow aliasDeletionFlow2 = this.f286731b;
                        return c.d(i2, 4, null, aliasDeletionFlow2, (a) aliasDeletionFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: v8a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AliasDeletionFlow f286731b;

            {
                this.f286731b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AliasDeletionFlow aliasDeletionFlow = this.f286731b;
                        phm.a aVar = (phm.a) e.j(aliasDeletionFlow.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", d0.class, " is not found"));
                        }
                        d0 d0Var = ((d0) aVar2.b()).C;
                        AliasDeletionContract$InputData aliasDeletionContract$InputData = aliasDeletionFlow.K;
                        aliasDeletionContract$InputData.getClass();
                        return new p8a.d(d0Var, aliasDeletionContract$InputData);
                    case 1:
                        return (a) ((p8a.d) this.f286731b.M.getValue()).d.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        AliasDeletionFlow aliasDeletionFlow2 = this.f286731b;
                        return c.d(i22, 4, null, aliasDeletionFlow2, (a) aliasDeletionFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: v8a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AliasDeletionFlow f286731b;

            {
                this.f286731b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        AliasDeletionFlow aliasDeletionFlow = this.f286731b;
                        phm.a aVar = (phm.a) e.j(aliasDeletionFlow.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", d0.class, " is not found"));
                        }
                        d0 d0Var = ((d0) aVar2.b()).C;
                        AliasDeletionContract$InputData aliasDeletionContract$InputData = aliasDeletionFlow.K;
                        aliasDeletionContract$InputData.getClass();
                        return new p8a.d(d0Var, aliasDeletionContract$InputData);
                    case 1:
                        return (a) ((p8a.d) this.f286731b.M.getValue()).d.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        AliasDeletionFlow aliasDeletionFlow2 = this.f286731b;
                        return c.d(i22, 4, null, aliasDeletionFlow2, (a) aliasDeletionFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p8a.d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (p8a.d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (v8a.a) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
