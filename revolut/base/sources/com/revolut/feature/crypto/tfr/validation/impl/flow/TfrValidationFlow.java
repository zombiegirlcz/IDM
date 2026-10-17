package com.revolut.feature.crypto.tfr.validation.impl.flow;

import com.revolut.feature.crypto.tfr.validation.api.navigation.TfrValidationFlowContract$InputData;
import com.revolut.feature.crypto.tfr.validation.impl.flow.TfrValidationFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import km5.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import um5.h;
import xfj.a;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/impl/flow/TfrValidationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkm5/e;", "Lyki/f;", "feature_crypto_tfr_validation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TfrValidationFlow extends ViewController<e> implements f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public TfrValidationFlow(TfrValidationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: xm5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TfrValidationFlow f307089b;

            {
                this.f307089b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TfrValidationFlow tfrValidationFlow = this.f307089b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, tfrValidationFlow, (km5.a) tfrValidationFlow.N.getValue());
                    default:
                        return (km5.a) ((h) this.f307089b.M.getValue()).f281255b.get();
                }
            }
        });
        this.M = w.y0(new a(this, inputData, 5));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: xm5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TfrValidationFlow f307089b;

            {
                this.f307089b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TfrValidationFlow tfrValidationFlow = this.f307089b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, tfrValidationFlow, (km5.a) tfrValidationFlow.N.getValue());
                    default:
                        return (km5.a) ((h) this.f307089b.M.getValue()).f281255b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (h) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (h) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (km5.a) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.L.getValue();
    }
}
