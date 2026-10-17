package com.revolut.feature.shared.consent.prompt.builder.impl.ui.flow;

import a0.d;
import a7d.c;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.shared.consent.prompt.builder.impl.R$id;
import com.revolut.feature.shared.consent.prompt.builder.impl.R$layout;
import com.revolut.feature.shared.consent.prompt.builder.impl.ui.flow.ConsentPromptFlow;
import com.revolut.feature.shared.consent.prompt.builder.impl.ui.flow.ConsentPromptFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.x0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/consent/prompt/builder/impl/ui/flow/ConsentPromptFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lyki/f;", "Lno/m;", "feature_shared_consent_prompt_builder_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsentPromptFlow extends ViewController<Object> implements f, m {
    public final ConsentPromptFlowContract$InputData K;
    public final Object L;
    public final AnalyticsProduct.Shared M;
    public final Object N;
    public final int O;
    public final Object P;

    public ConsentPromptFlow(ConsentPromptFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: b7d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentPromptFlow f12995b;

            {
                this.f12995b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ConsentPromptFlow consentPromptFlow = this.f12995b;
                        return czi.c.d(R$id.flow_container, 4, null, consentPromptFlow, (b) consentPromptFlow.P.getValue());
                    case 1:
                        ConsentPromptFlow consentPromptFlow2 = this.f12995b;
                        phm.a aVar = (phm.a) e.j(consentPromptFlow2.m2()).a().get(u6d.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", u6d.a.class, " is not found"));
                        }
                        a7d.b bVar = ((a7d.b) aVar2.b()).f1840b;
                        ConsentPromptFlowContract$InputData consentPromptFlowContract$InputData = consentPromptFlow2.K;
                        consentPromptFlowContract$InputData.getClass();
                        return new a7d.c(bVar, consentPromptFlowContract$InputData);
                    default:
                        return (b) ((a7d.c) this.f12995b.N.getValue()).d.get();
                }
            }
        });
        this.M = new AnalyticsProduct.Shared(k9.Junior, x0.Business, q6.Profile, w2.RevolutX, od.Terminal);
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: b7d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentPromptFlow f12995b;

            {
                this.f12995b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ConsentPromptFlow consentPromptFlow = this.f12995b;
                        return czi.c.d(R$id.flow_container, 4, null, consentPromptFlow, (b) consentPromptFlow.P.getValue());
                    case 1:
                        ConsentPromptFlow consentPromptFlow2 = this.f12995b;
                        phm.a aVar = (phm.a) e.j(consentPromptFlow2.m2()).a().get(u6d.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", u6d.a.class, " is not found"));
                        }
                        a7d.b bVar = ((a7d.b) aVar2.b()).f1840b;
                        ConsentPromptFlowContract$InputData consentPromptFlowContract$InputData = consentPromptFlow2.K;
                        consentPromptFlowContract$InputData.getClass();
                        return new a7d.c(bVar, consentPromptFlowContract$InputData);
                    default:
                        return (b) ((a7d.c) this.f12995b.N.getValue()).d.get();
                }
            }
        });
        this.O = R$layout.flow_consent_prompt;
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: b7d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentPromptFlow f12995b;

            {
                this.f12995b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ConsentPromptFlow consentPromptFlow = this.f12995b;
                        return czi.c.d(R$id.flow_container, 4, null, consentPromptFlow, (b) consentPromptFlow.P.getValue());
                    case 1:
                        ConsentPromptFlow consentPromptFlow2 = this.f12995b;
                        phm.a aVar = (phm.a) e.j(consentPromptFlow2.m2()).a().get(u6d.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", u6d.a.class, " is not found"));
                        }
                        a7d.b bVar = ((a7d.b) aVar2.b()).f1840b;
                        ConsentPromptFlowContract$InputData consentPromptFlowContract$InputData = consentPromptFlow2.K;
                        consentPromptFlowContract$InputData.getClass();
                        return new a7d.c(bVar, consentPromptFlowContract$InputData);
                    default:
                        return (b) ((a7d.c) this.f12995b.N.getValue()).d.get();
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (b7d.b) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
