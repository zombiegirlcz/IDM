package com.revolut.feature.apm.qvik.impl.ui.app_selector;

import aii.q;
import com.revolut.feature.apm.qvik.api.navigation.QvikAppSelectorNavigation$InputData;
import com.revolut.feature.apm.qvik.impl.ui.app_selector.QvikAppSelectorFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import hc2.d;
import hc2.m;
import hc2.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nc2.c;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/qvik/impl/ui/app_selector/QvikAppSelectorFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_apm_qvik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QvikAppSelectorFlow extends ViewController<q> implements f {
    public final QvikAppSelectorNavigation$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public QvikAppSelectorFlow(QvikAppSelectorNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: nc2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QvikAppSelectorFlow f214146b;

            {
                this.f214146b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        QvikAppSelectorFlow qvikAppSelectorFlow = this.f214146b;
                        phm.a aVar = (phm.a) e.j(qvikAppSelectorFlow.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        m mVar = ((m) ((d) aVar2.b())).f150806m;
                        QvikAppSelectorNavigation$InputData qvikAppSelectorNavigation$InputData = qvikAppSelectorFlow.K;
                        qvikAppSelectorNavigation$InputData.getClass();
                        return new n(mVar, qvikAppSelectorNavigation$InputData);
                    case 1:
                        return (c) ((n) this.f214146b.L.getValue()).f150815c.get();
                    default:
                        QvikAppSelectorFlow qvikAppSelectorFlow2 = this.f214146b;
                        return czi.c.d(0, 6, null, qvikAppSelectorFlow2, (c) qvikAppSelectorFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: nc2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QvikAppSelectorFlow f214146b;

            {
                this.f214146b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        QvikAppSelectorFlow qvikAppSelectorFlow = this.f214146b;
                        phm.a aVar = (phm.a) e.j(qvikAppSelectorFlow.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        m mVar = ((m) ((d) aVar2.b())).f150806m;
                        QvikAppSelectorNavigation$InputData qvikAppSelectorNavigation$InputData = qvikAppSelectorFlow.K;
                        qvikAppSelectorNavigation$InputData.getClass();
                        return new n(mVar, qvikAppSelectorNavigation$InputData);
                    case 1:
                        return (c) ((n) this.f214146b.L.getValue()).f150815c.get();
                    default:
                        QvikAppSelectorFlow qvikAppSelectorFlow2 = this.f214146b;
                        return czi.c.d(0, 6, null, qvikAppSelectorFlow2, (c) qvikAppSelectorFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: nc2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QvikAppSelectorFlow f214146b;

            {
                this.f214146b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        QvikAppSelectorFlow qvikAppSelectorFlow = this.f214146b;
                        phm.a aVar = (phm.a) e.j(qvikAppSelectorFlow.m2()).a().get(d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d.class, " is not found"));
                        }
                        m mVar = ((m) ((d) aVar2.b())).f150806m;
                        QvikAppSelectorNavigation$InputData qvikAppSelectorNavigation$InputData = qvikAppSelectorFlow.K;
                        qvikAppSelectorNavigation$InputData.getClass();
                        return new n(mVar, qvikAppSelectorNavigation$InputData);
                    case 1:
                        return (c) ((n) this.f214146b.L.getValue()).f150815c.get();
                    default:
                        QvikAppSelectorFlow qvikAppSelectorFlow2 = this.f214146b;
                        return czi.c.d(0, 6, null, qvikAppSelectorFlow2, (c) qvikAppSelectorFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (n) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (n) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
