package com.revolut.retail.feature.esim.impl.ui.flows.help;

import a0.d;
import afj.l;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.flows.help.EsimHelpFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.help.EsimHelpFlowContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import wfj.c;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/help/EsimHelpFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwfj/c;", "Lyki/f;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimHelpFlow extends ViewController<c> implements f {
    public final EsimHelpFlowContract$InputData K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;

    public EsimHelpFlow() {
        this(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (l) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (wfj.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    public EsimHelpFlow(EsimHelpFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: wfj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimHelpFlow f297152b;

            {
                this.f297152b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        EsimHelpFlow esimHelpFlow = this.f297152b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, esimHelpFlow, (b) esimHelpFlow.O.getValue());
                    case 1:
                        EsimHelpFlow esimHelpFlow2 = this.f297152b;
                        phm.a aVar = (phm.a) ue0.e.j(esimHelpFlow2.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimHelpFlowContract$InputData esimHelpFlowContract$InputData = esimHelpFlow2.K;
                        esimHelpFlowContract$InputData.getClass();
                        return new l(bVar, esimHelpFlowContract$InputData);
                    default:
                        return (b) ((l) this.f297152b.N.getValue()).d.get();
                }
            }
        });
        this.M = R$layout.screen_transparent;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: wfj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimHelpFlow f297152b;

            {
                this.f297152b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        EsimHelpFlow esimHelpFlow = this.f297152b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, esimHelpFlow, (b) esimHelpFlow.O.getValue());
                    case 1:
                        EsimHelpFlow esimHelpFlow2 = this.f297152b;
                        phm.a aVar = (phm.a) ue0.e.j(esimHelpFlow2.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimHelpFlowContract$InputData esimHelpFlowContract$InputData = esimHelpFlow2.K;
                        esimHelpFlowContract$InputData.getClass();
                        return new l(bVar, esimHelpFlowContract$InputData);
                    default:
                        return (b) ((l) this.f297152b.N.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: wfj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimHelpFlow f297152b;

            {
                this.f297152b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        EsimHelpFlow esimHelpFlow = this.f297152b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, esimHelpFlow, (b) esimHelpFlow.O.getValue());
                    case 1:
                        EsimHelpFlow esimHelpFlow2 = this.f297152b;
                        phm.a aVar = (phm.a) ue0.e.j(esimHelpFlow2.m2()).a().get(afj.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", afj.b.class, " is not found"));
                        }
                        afj.b bVar = ((afj.b) aVar2.b()).D;
                        EsimHelpFlowContract$InputData esimHelpFlowContract$InputData = esimHelpFlow2.K;
                        esimHelpFlowContract$InputData.getClass();
                        return new l(bVar, esimHelpFlowContract$InputData);
                    default:
                        return (b) ((l) this.f297152b.N.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }

    public /* synthetic */ EsimHelpFlow(int i) {
        this(new EsimHelpFlowContract$InputData(null));
    }
}
