package com.revolut.feature.apm.core.ui.impl.ui.pending_payments.consent.wrapper;

import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmConsentNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.consent.wrapper.ApmConsentWrapperFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$OutputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l32.g;
import p12.u;
import p12.v;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/pending_payments/consent/wrapper/ApmConsentWrapperFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentContract$OutputData;", "Lyki/f;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmConsentWrapperFlow extends ViewController<PendingPaymentContract$OutputData> implements f {
    public final ApmConsentNavigation$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public ApmConsentWrapperFlow(ApmConsentNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: l32.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmConsentWrapperFlow f191844b;

            {
                this.f191844b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ApmConsentWrapperFlow apmConsentWrapperFlow = this.f191844b;
                        phm.a aVar = (phm.a) ue0.e.j(apmConsentWrapperFlow.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).K;
                        ApmConsentNavigation$InputData apmConsentNavigation$InputData = apmConsentWrapperFlow.K;
                        apmConsentNavigation$InputData.getClass();
                        return new u(vVar, apmConsentNavigation$InputData);
                    case 1:
                        return (g) ((u) this.f191844b.L.getValue()).f231773c.get();
                    default:
                        ApmConsentWrapperFlow apmConsentWrapperFlow2 = this.f191844b;
                        return czi.c.d(0, 6, null, apmConsentWrapperFlow2, (g) apmConsentWrapperFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: l32.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmConsentWrapperFlow f191844b;

            {
                this.f191844b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ApmConsentWrapperFlow apmConsentWrapperFlow = this.f191844b;
                        phm.a aVar = (phm.a) ue0.e.j(apmConsentWrapperFlow.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).K;
                        ApmConsentNavigation$InputData apmConsentNavigation$InputData = apmConsentWrapperFlow.K;
                        apmConsentNavigation$InputData.getClass();
                        return new u(vVar, apmConsentNavigation$InputData);
                    case 1:
                        return (g) ((u) this.f191844b.L.getValue()).f231773c.get();
                    default:
                        ApmConsentWrapperFlow apmConsentWrapperFlow2 = this.f191844b;
                        return czi.c.d(0, 6, null, apmConsentWrapperFlow2, (g) apmConsentWrapperFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: l32.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmConsentWrapperFlow f191844b;

            {
                this.f191844b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ApmConsentWrapperFlow apmConsentWrapperFlow = this.f191844b;
                        phm.a aVar = (phm.a) ue0.e.j(apmConsentWrapperFlow.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).K;
                        ApmConsentNavigation$InputData apmConsentNavigation$InputData = apmConsentWrapperFlow.K;
                        apmConsentNavigation$InputData.getClass();
                        return new u(vVar, apmConsentNavigation$InputData);
                    case 1:
                        return (g) ((u) this.f191844b.L.getValue()).f231773c.get();
                    default:
                        ApmConsentWrapperFlow apmConsentWrapperFlow2 = this.f191844b;
                        return czi.c.d(0, 6, null, apmConsentWrapperFlow2, (g) apmConsentWrapperFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (u) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
