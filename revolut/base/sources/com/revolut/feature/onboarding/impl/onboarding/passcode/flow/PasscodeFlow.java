package com.revolut.feature.onboarding.impl.onboarding.passcode.flow;

import com.revolut.feature.onboarding.impl.onboarding.passcode.flow.PasscodeFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kpl.b;
import lb9.e;
import ta9.t;
import te0.w;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/passcode/flow/PasscodeFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llb9/e;", "Lyki/f;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PasscodeFlow extends ViewController<e> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public PasscodeFlow(PasscodeFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: lb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasscodeFlow f193600b;

            {
                this.f193600b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((t) this.f193600b.M.getValue()).d.get();
                    default:
                        PasscodeFlow passcodeFlow = this.f193600b;
                        return czi.c.d(0, 6, null, passcodeFlow, (b) passcodeFlow.K.getValue());
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: lb9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasscodeFlow f193600b;

            {
                this.f193600b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((t) this.f193600b.M.getValue()).d.get();
                    default:
                        PasscodeFlow passcodeFlow = this.f193600b;
                        return czi.c.d(0, 6, null, passcodeFlow, (b) passcodeFlow.K.getValue());
                }
            }
        });
        this.M = w.y0(new b(this, inputData, 25));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (t) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (t) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (lb9.b) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.L.getValue();
    }
}
