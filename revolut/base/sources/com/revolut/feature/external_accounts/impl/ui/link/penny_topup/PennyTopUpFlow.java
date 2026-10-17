package com.revolut.feature.external_accounts.impl.ui.link.penny_topup;

import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.PennyTopUpFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import we6.w0;
import xf6.h0;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/penny_topup/PennyTopUpFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwe6/w0;", "Lyki/f;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PennyTopUpFlow extends ViewController<w0> implements f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public PennyTopUpFlow(PennyTopUpFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        this.L = w.y0(new hl6.b(this, inputData, 2));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: hn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PennyTopUpFlow f154069b;

            {
                this.f154069b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((h0) this.f154069b.L.getValue()).e.get();
                    default:
                        PennyTopUpFlow pennyTopUpFlow = this.f154069b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, pennyTopUpFlow, (b) pennyTopUpFlow.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: hn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PennyTopUpFlow f154069b;

            {
                this.f154069b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((h0) this.f154069b.L.getValue()).e.get();
                    default:
                        PennyTopUpFlow pennyTopUpFlow = this.f154069b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, pennyTopUpFlow, (b) pennyTopUpFlow.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (h0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (hn6.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
