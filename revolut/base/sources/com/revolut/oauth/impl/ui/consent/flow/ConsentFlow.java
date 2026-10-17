package com.revolut.oauth.impl.ui.consent.flow;

import a0.d;
import aii.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.oauth.api.consent.ConsentFlowDestination;
import com.revolut.oauth.impl.ui.consent.flow.ConsentFlow;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/oauth/impl/ui/consent/flow/ConsentFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "Lno/m;", "revolut_oauth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsentFlow extends ViewController<q> implements f, m {
    public final ConsentFlowDestination.InputData K;
    public final AnalyticsProduct.Shared L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public ConsentFlow(ConsentFlowDestination.InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = dni.a.f116348a;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ani.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentFlow f7804b;

            {
                this.f7804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ConsentFlow consentFlow = this.f7804b;
                        return c.d(R$id.screen_transparent_container, 4, null, consentFlow, (b) consentFlow.P.getValue());
                    case 1:
                        ConsentFlow consentFlow2 = this.f7804b;
                        phm.a aVar = (phm.a) e.j(consentFlow2.m2()).a().get(xmi.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", xmi.e.class, " is not found"));
                        }
                        xmi.e eVar = ((xmi.e) aVar2.b()).e;
                        ConsentFlowDestination.InputData inputData2 = consentFlow2.K;
                        inputData2.getClass();
                        return new xmi.b(eVar, inputData2);
                    default:
                        return (b) ((xmi.b) ((bni.a) this.f7804b.O.getValue())).d.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ani.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentFlow f7804b;

            {
                this.f7804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ConsentFlow consentFlow = this.f7804b;
                        return c.d(R$id.screen_transparent_container, 4, null, consentFlow, (b) consentFlow.P.getValue());
                    case 1:
                        ConsentFlow consentFlow2 = this.f7804b;
                        phm.a aVar = (phm.a) e.j(consentFlow2.m2()).a().get(xmi.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", xmi.e.class, " is not found"));
                        }
                        xmi.e eVar = ((xmi.e) aVar2.b()).e;
                        ConsentFlowDestination.InputData inputData2 = consentFlow2.K;
                        inputData2.getClass();
                        return new xmi.b(eVar, inputData2);
                    default:
                        return (b) ((xmi.b) ((bni.a) this.f7804b.O.getValue())).d.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: ani.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentFlow f7804b;

            {
                this.f7804b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ConsentFlow consentFlow = this.f7804b;
                        return c.d(R$id.screen_transparent_container, 4, null, consentFlow, (b) consentFlow.P.getValue());
                    case 1:
                        ConsentFlow consentFlow2 = this.f7804b;
                        phm.a aVar = (phm.a) e.j(consentFlow2.m2()).a().get(xmi.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", xmi.e.class, " is not found"));
                        }
                        xmi.e eVar = ((xmi.e) aVar2.b()).e;
                        ConsentFlowDestination.InputData inputData2 = consentFlow2.K;
                        inputData2.getClass();
                        return new xmi.b(eVar, inputData2);
                    default:
                        return (b) ((xmi.b) ((bni.a) this.f7804b.O.getValue())).d.get();
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (bni.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (bni.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (ani.b) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
