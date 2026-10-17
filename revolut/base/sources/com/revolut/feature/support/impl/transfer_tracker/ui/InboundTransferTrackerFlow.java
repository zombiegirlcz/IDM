package com.revolut.feature.support.impl.transfer_tracker.ui;

import aii.q;
import com.revolut.feature.support.impl.transfer_tracker.ui.InboundTransferTrackerFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import qji.b;
import rde.h;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/support/impl/transfer_tracker/ui/InboundTransferTrackerFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "<init>", "()V", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InboundTransferTrackerFlow extends ViewController<q> implements f {
    public final int K = R$layout.screen_transparent;
    public final Object L;
    public final Object M;
    public final Object N;

    public InboundTransferTrackerFlow() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: wde.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InboundTransferTrackerFlow f296552b;

            {
                this.f296552b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f296552b.m2()).a().get(tce.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new rde.f(((h) aVar2.b()).k);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", tce.a.class, " is not found"));
                    case 1:
                        return (e) ((rde.f) this.f296552b.L.getValue()).f253428c.get();
                    default:
                        InboundTransferTrackerFlow inboundTransferTrackerFlow = this.f296552b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, inboundTransferTrackerFlow, (e) inboundTransferTrackerFlow.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: wde.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InboundTransferTrackerFlow f296552b;

            {
                this.f296552b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f296552b.m2()).a().get(tce.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new rde.f(((h) aVar2.b()).k);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", tce.a.class, " is not found"));
                    case 1:
                        return (e) ((rde.f) this.f296552b.L.getValue()).f253428c.get();
                    default:
                        InboundTransferTrackerFlow inboundTransferTrackerFlow = this.f296552b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, inboundTransferTrackerFlow, (e) inboundTransferTrackerFlow.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: wde.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InboundTransferTrackerFlow f296552b;

            {
                this.f296552b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f296552b.m2()).a().get(tce.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new rde.f(((h) aVar2.b()).k);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", tce.a.class, " is not found"));
                    case 1:
                        return (e) ((rde.f) this.f296552b.L.getValue()).f253428c.get();
                    default:
                        InboundTransferTrackerFlow inboundTransferTrackerFlow = this.f296552b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, inboundTransferTrackerFlow, (e) inboundTransferTrackerFlow.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (rde.f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (rde.f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (wde.e) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
