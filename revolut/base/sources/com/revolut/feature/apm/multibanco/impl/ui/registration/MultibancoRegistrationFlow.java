package com.revolut.feature.apm.multibanco.impl.ui.registration;

import com.revolut.feature.apm.multibanco.impl.ui.registration.MultibancoRegistrationFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import i72.v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nsh.e;
import o82.f;
import qji.b;
import te0.w;
import yki.c;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/registration/MultibancoRegistrationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lo82/f;", "Lyki/f;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MultibancoRegistrationFlow extends ViewController<f> implements yki.f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public MultibancoRegistrationFlow(MultibancoRegistrationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        this.L = w.y0(new e(this, inputData, 25));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: o82.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultibancoRegistrationFlow f222904b;

            {
                this.f222904b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((v) this.f222904b.L.getValue()).f159171b.get();
                    default:
                        MultibancoRegistrationFlow multibancoRegistrationFlow = this.f222904b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, multibancoRegistrationFlow, (b) multibancoRegistrationFlow.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: o82.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultibancoRegistrationFlow f222904b;

            {
                this.f222904b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((v) this.f222904b.L.getValue()).f159171b.get();
                    default:
                        MultibancoRegistrationFlow multibancoRegistrationFlow = this.f222904b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, multibancoRegistrationFlow, (b) multibancoRegistrationFlow.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (v) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (v) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (o82.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
