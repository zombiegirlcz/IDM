package com.revolut.feature.topup_screen.impl.flow.external_card_details;

import com.revolut.feature.topup_screen.impl.flow.external_card_details.ExternalCardDetailsFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import ewe.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flow/external_card_details/ExternalCardDetailsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lewe/g;", "Lyki/f;", "Lin0/g;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExternalCardDetailsFlow extends ViewController<g> implements f, in0.g {
    public final Object K;
    public final Object L;
    public final Object M;

    public ExternalCardDetailsFlow(ExternalCardDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: ewe.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalCardDetailsFlow f130169b;

            {
                this.f130169b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ExternalCardDetailsFlow externalCardDetailsFlow = this.f130169b;
                        return czi.c.d(0, 6, null, externalCardDetailsFlow, (f) externalCardDetailsFlow.M.getValue());
                    default:
                        return (f) ((qve.e) this.f130169b.L.getValue()).e.get();
                }
            }
        });
        this.L = w.y0(new eq8.b(this, inputData, 15));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ewe.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExternalCardDetailsFlow f130169b;

            {
                this.f130169b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ExternalCardDetailsFlow externalCardDetailsFlow = this.f130169b;
                        return czi.c.d(0, 6, null, externalCardDetailsFlow, (f) externalCardDetailsFlow.M.getValue());
                    default:
                        return (f) ((qve.e) this.f130169b.L.getValue()).e.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (qve.e) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (qve.e) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ewe.f) this.M.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.K.getValue();
    }
}
