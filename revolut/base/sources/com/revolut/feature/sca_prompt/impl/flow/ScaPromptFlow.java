package com.revolut.feature.sca_prompt.impl.flow;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.sca_prompt.impl.flow.ScaPromptFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import gsc.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import te0.w;
import vrc.j;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/sca_prompt/impl/flow/ScaPromptFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvrc/j;", "Lyki/f;", "Lno/m;", "feature_sca_prompt_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScaPromptFlow extends ViewController<j> implements f, m {
    public final isc.f K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;

    public ScaPromptFlow(isc.f inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: isc.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScaPromptFlow f168176b;

            {
                this.f168176b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ScaPromptFlow scaPromptFlow = this.f168176b;
                        phm.a aVar = (phm.a) ue0.e.j(scaPromptFlow.m2()).a().get(gsc.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gsc.c.class, " is not found"));
                        }
                        gsc.c cVar = ((gsc.c) aVar2.b()).f;
                        f fVar = scaPromptFlow.K;
                        fVar.getClass();
                        return new gsc.d(cVar, fVar);
                    case 1:
                        return (e) ((gsc.d) this.f168176b.L.getValue()).d.get();
                    default:
                        ScaPromptFlow scaPromptFlow2 = this.f168176b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, scaPromptFlow2, (e) scaPromptFlow2.N.getValue());
                }
            }
        });
        this.M = R$layout.screen_transparent;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: isc.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScaPromptFlow f168176b;

            {
                this.f168176b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ScaPromptFlow scaPromptFlow = this.f168176b;
                        phm.a aVar = (phm.a) ue0.e.j(scaPromptFlow.m2()).a().get(gsc.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gsc.c.class, " is not found"));
                        }
                        gsc.c cVar = ((gsc.c) aVar2.b()).f;
                        f fVar = scaPromptFlow.K;
                        fVar.getClass();
                        return new gsc.d(cVar, fVar);
                    case 1:
                        return (e) ((gsc.d) this.f168176b.L.getValue()).d.get();
                    default:
                        ScaPromptFlow scaPromptFlow2 = this.f168176b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, scaPromptFlow2, (e) scaPromptFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: isc.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScaPromptFlow f168176b;

            {
                this.f168176b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ScaPromptFlow scaPromptFlow = this.f168176b;
                        phm.a aVar = (phm.a) ue0.e.j(scaPromptFlow.m2()).a().get(gsc.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gsc.c.class, " is not found"));
                        }
                        gsc.c cVar = ((gsc.c) aVar2.b()).f;
                        f fVar = scaPromptFlow.K;
                        fVar.getClass();
                        return new gsc.d(cVar, fVar);
                    case 1:
                        return (e) ((gsc.d) this.f168176b.L.getValue()).d.get();
                    default:
                        ScaPromptFlow scaPromptFlow2 = this.f168176b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, scaPromptFlow2, (e) scaPromptFlow2.N.getValue());
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.K.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (d) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (isc.e) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
