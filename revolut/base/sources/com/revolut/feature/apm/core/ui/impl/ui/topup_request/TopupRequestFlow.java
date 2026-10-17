package com.revolut.feature.apm.core.ui.impl.ui.topup_request;

import a0.d;
import aii.q;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTopupRequestNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.topup_request.TopupRequestFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p12.t0;
import p12.v;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/topup_request/TopupRequestFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TopupRequestFlow extends ViewController<q> implements f {
    public final ApmTopupRequestNavigation$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public TopupRequestFlow(ApmTopupRequestNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: k42.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopupRequestFlow f180831b;

            {
                this.f180831b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TopupRequestFlow topupRequestFlow = this.f180831b;
                        phm.a aVar = (phm.a) e.j(topupRequestFlow.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).K;
                        ApmTopupRequestNavigation$InputData apmTopupRequestNavigation$InputData = topupRequestFlow.K;
                        apmTopupRequestNavigation$InputData.getClass();
                        return new t0(vVar, apmTopupRequestNavigation$InputData);
                    case 1:
                        return (b) ((t0) this.f180831b.L.getValue()).d.get();
                    default:
                        TopupRequestFlow topupRequestFlow2 = this.f180831b;
                        return c.d(0, 6, null, topupRequestFlow2, (b) topupRequestFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: k42.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopupRequestFlow f180831b;

            {
                this.f180831b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TopupRequestFlow topupRequestFlow = this.f180831b;
                        phm.a aVar = (phm.a) e.j(topupRequestFlow.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).K;
                        ApmTopupRequestNavigation$InputData apmTopupRequestNavigation$InputData = topupRequestFlow.K;
                        apmTopupRequestNavigation$InputData.getClass();
                        return new t0(vVar, apmTopupRequestNavigation$InputData);
                    case 1:
                        return (b) ((t0) this.f180831b.L.getValue()).d.get();
                    default:
                        TopupRequestFlow topupRequestFlow2 = this.f180831b;
                        return c.d(0, 6, null, topupRequestFlow2, (b) topupRequestFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: k42.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TopupRequestFlow f180831b;

            {
                this.f180831b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TopupRequestFlow topupRequestFlow = this.f180831b;
                        phm.a aVar = (phm.a) e.j(topupRequestFlow.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).K;
                        ApmTopupRequestNavigation$InputData apmTopupRequestNavigation$InputData = topupRequestFlow.K;
                        apmTopupRequestNavigation$InputData.getClass();
                        return new t0(vVar, apmTopupRequestNavigation$InputData);
                    case 1:
                        return (b) ((t0) this.f180831b.L.getValue()).d.get();
                    default:
                        TopupRequestFlow topupRequestFlow2 = this.f180831b;
                        return c.d(0, 6, null, topupRequestFlow2, (b) topupRequestFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (t0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (t0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k42.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
