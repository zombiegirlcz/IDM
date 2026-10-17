package com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation;

import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmPaymentAuthorisationNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.ApmPendingPaymentFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import f12.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p12.b0;
import p12.v;
import qji.b;
import te0.w;
import ue0.e;
import z22.c;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/pending_payments/authorisation/ApmPendingPaymentFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lf12/f;", "Lyki/f;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmPendingPaymentFlow extends ViewController<f> implements yki.f {
    public final ApmPaymentAuthorisationNavigation$InputData K;
    public final f12.a L;
    public final Object M;
    public final Object N;
    public final Object O;

    public ApmPendingPaymentFlow(ApmPaymentAuthorisationNavigation$InputData inputData, f12.a extension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.K = inputData;
        this.L = extension;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: z22.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmPendingPaymentFlow f318946b;

            {
                this.f318946b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ApmPendingPaymentFlow apmPendingPaymentFlow = this.f318946b;
                        phm.a aVar = (phm.a) e.j(apmPendingPaymentFlow.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).K;
                        ApmPaymentAuthorisationNavigation$InputData apmPaymentAuthorisationNavigation$InputData = apmPendingPaymentFlow.K;
                        apmPaymentAuthorisationNavigation$InputData.getClass();
                        f12.a aVar3 = apmPendingPaymentFlow.L;
                        aVar3.getClass();
                        return new b0(vVar, apmPaymentAuthorisationNavigation$InputData, aVar3);
                    case 1:
                        return (c) ((b0) this.f318946b.M.getValue()).f231625g.get();
                    default:
                        ApmPendingPaymentFlow apmPendingPaymentFlow2 = this.f318946b;
                        return czi.c.d(0, 6, null, apmPendingPaymentFlow2, (c) apmPendingPaymentFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: z22.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmPendingPaymentFlow f318946b;

            {
                this.f318946b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ApmPendingPaymentFlow apmPendingPaymentFlow = this.f318946b;
                        phm.a aVar = (phm.a) e.j(apmPendingPaymentFlow.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).K;
                        ApmPaymentAuthorisationNavigation$InputData apmPaymentAuthorisationNavigation$InputData = apmPendingPaymentFlow.K;
                        apmPaymentAuthorisationNavigation$InputData.getClass();
                        f12.a aVar3 = apmPendingPaymentFlow.L;
                        aVar3.getClass();
                        return new b0(vVar, apmPaymentAuthorisationNavigation$InputData, aVar3);
                    case 1:
                        return (c) ((b0) this.f318946b.M.getValue()).f231625g.get();
                    default:
                        ApmPendingPaymentFlow apmPendingPaymentFlow2 = this.f318946b;
                        return czi.c.d(0, 6, null, apmPendingPaymentFlow2, (c) apmPendingPaymentFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: z22.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmPendingPaymentFlow f318946b;

            {
                this.f318946b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ApmPendingPaymentFlow apmPendingPaymentFlow = this.f318946b;
                        phm.a aVar = (phm.a) e.j(apmPendingPaymentFlow.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).K;
                        ApmPaymentAuthorisationNavigation$InputData apmPaymentAuthorisationNavigation$InputData = apmPendingPaymentFlow.K;
                        apmPaymentAuthorisationNavigation$InputData.getClass();
                        f12.a aVar3 = apmPendingPaymentFlow.L;
                        aVar3.getClass();
                        return new b0(vVar, apmPaymentAuthorisationNavigation$InputData, aVar3);
                    case 1:
                        return (c) ((b0) this.f318946b.M.getValue()).f231625g.get();
                    default:
                        ApmPendingPaymentFlow apmPendingPaymentFlow2 = this.f318946b;
                        return czi.c.d(0, 6, null, apmPendingPaymentFlow2, (c) apmPendingPaymentFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (b0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
