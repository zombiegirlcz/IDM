package com.revolut.feature.apm.iris.impl.ui.registration;

import com.revolut.feature.apm.iris.impl.ui.registration.IrisRegistrationFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kpl.b;
import l62.f;
import te0.w;
import xki.e;
import yki.c;
import z52.p;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/iris/impl/ui/registration/IrisRegistrationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ll62/f;", "Lyki/f;", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IrisRegistrationFlow extends ViewController<f> implements yki.f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public IrisRegistrationFlow(IrisRegistrationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        this.L = w.y0(new b(this, inputData, 14));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: l62.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IrisRegistrationFlow f192345b;

            {
                this.f192345b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((p) this.f192345b.L.getValue()).d.get();
                    default:
                        IrisRegistrationFlow irisRegistrationFlow = this.f192345b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, irisRegistrationFlow, (b) irisRegistrationFlow.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: l62.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IrisRegistrationFlow f192345b;

            {
                this.f192345b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((p) this.f192345b.L.getValue()).d.get();
                    default:
                        IrisRegistrationFlow irisRegistrationFlow = this.f192345b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, irisRegistrationFlow, (b) irisRegistrationFlow.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (p) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (l62.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
