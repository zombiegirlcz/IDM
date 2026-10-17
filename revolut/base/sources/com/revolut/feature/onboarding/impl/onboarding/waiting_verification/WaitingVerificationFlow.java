package com.revolut.feature.onboarding.impl.onboarding.waiting_verification;

import com.revolut.feature.onboarding.impl.onboarding.waiting_verification.WaitingVerificationFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ta9.a0;
import te0.w;
import xki.e;
import yki.f;
import ywi.b;
import zb9.c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/waiting_verification/WaitingVerificationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzb9/c;", "Lyki/f;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WaitingVerificationFlow extends ViewController<c> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public WaitingVerificationFlow(WaitingVerificationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new b(this, inputData, 19));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: zb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingVerificationFlow f320845b;

            {
                this.f320845b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((a0) this.f320845b.K.getValue()).f269170b.get();
                    default:
                        WaitingVerificationFlow waitingVerificationFlow = this.f320845b;
                        return czi.c.d(0, 6, null, waitingVerificationFlow, (b) waitingVerificationFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: zb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingVerificationFlow f320845b;

            {
                this.f320845b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((a0) this.f320845b.K.getValue()).f269170b.get();
                    default:
                        WaitingVerificationFlow waitingVerificationFlow = this.f320845b;
                        return czi.c.d(0, 6, null, waitingVerificationFlow, (b) waitingVerificationFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a0) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (a0) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (zb9.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
