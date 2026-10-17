package com.revolut.feature.instruments.trend.collections.impl.ui.launcher;

import aii.q;
import com.revolut.feature.instruments.trend.collections.impl.ui.launcher.InstrumentsTrendCollectionsLauncherFlow;
import com.revolut.feature.instruments.trend.collections.impl.ui.launcher.InstrumentsTrendCollectionsLauncherFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import th7.c;
import th7.d;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/instruments/trend/collections/impl/ui/launcher/InstrumentsTrendCollectionsLauncherFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_instruments_trend_collections_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstrumentsTrendCollectionsLauncherFlow extends ViewController<q> implements f {
    public final InstrumentsTrendCollectionsLauncherFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public InstrumentsTrendCollectionsLauncherFlow(InstrumentsTrendCollectionsLauncherFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: li7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentsTrendCollectionsLauncherFlow f195426b;

            {
                this.f195426b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        InstrumentsTrendCollectionsLauncherFlow instrumentsTrendCollectionsLauncherFlow = this.f195426b;
                        phm.a aVar = (phm.a) e.j(instrumentsTrendCollectionsLauncherFlow.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        th7.b bVar = ((th7.b) ((d) aVar2.b())).f271318l;
                        InstrumentsTrendCollectionsLauncherFlowContract$InputData instrumentsTrendCollectionsLauncherFlowContract$InputData = instrumentsTrendCollectionsLauncherFlow.K;
                        instrumentsTrendCollectionsLauncherFlowContract$InputData.getClass();
                        return new c(bVar, instrumentsTrendCollectionsLauncherFlowContract$InputData);
                    case 1:
                        return (b) ((c) this.f195426b.M.getValue()).f271322b.get();
                    default:
                        InstrumentsTrendCollectionsLauncherFlow instrumentsTrendCollectionsLauncherFlow2 = this.f195426b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, instrumentsTrendCollectionsLauncherFlow2, (b) instrumentsTrendCollectionsLauncherFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: li7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentsTrendCollectionsLauncherFlow f195426b;

            {
                this.f195426b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        InstrumentsTrendCollectionsLauncherFlow instrumentsTrendCollectionsLauncherFlow = this.f195426b;
                        phm.a aVar = (phm.a) e.j(instrumentsTrendCollectionsLauncherFlow.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        th7.b bVar = ((th7.b) ((d) aVar2.b())).f271318l;
                        InstrumentsTrendCollectionsLauncherFlowContract$InputData instrumentsTrendCollectionsLauncherFlowContract$InputData = instrumentsTrendCollectionsLauncherFlow.K;
                        instrumentsTrendCollectionsLauncherFlowContract$InputData.getClass();
                        return new c(bVar, instrumentsTrendCollectionsLauncherFlowContract$InputData);
                    case 1:
                        return (b) ((c) this.f195426b.M.getValue()).f271322b.get();
                    default:
                        InstrumentsTrendCollectionsLauncherFlow instrumentsTrendCollectionsLauncherFlow2 = this.f195426b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, instrumentsTrendCollectionsLauncherFlow2, (b) instrumentsTrendCollectionsLauncherFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: li7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentsTrendCollectionsLauncherFlow f195426b;

            {
                this.f195426b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        InstrumentsTrendCollectionsLauncherFlow instrumentsTrendCollectionsLauncherFlow = this.f195426b;
                        phm.a aVar = (phm.a) e.j(instrumentsTrendCollectionsLauncherFlow.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        th7.b bVar = ((th7.b) ((d) aVar2.b())).f271318l;
                        InstrumentsTrendCollectionsLauncherFlowContract$InputData instrumentsTrendCollectionsLauncherFlowContract$InputData = instrumentsTrendCollectionsLauncherFlow.K;
                        instrumentsTrendCollectionsLauncherFlowContract$InputData.getClass();
                        return new c(bVar, instrumentsTrendCollectionsLauncherFlowContract$InputData);
                    case 1:
                        return (b) ((c) this.f195426b.M.getValue()).f271322b.get();
                    default:
                        InstrumentsTrendCollectionsLauncherFlow instrumentsTrendCollectionsLauncherFlow2 = this.f195426b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, instrumentsTrendCollectionsLauncherFlow2, (b) instrumentsTrendCollectionsLauncherFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (li7.b) this.N.getValue();
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
