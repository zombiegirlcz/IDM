package com.revolut.retail.feature.trading_onboarding.impl.ui.documents;

import aii.q;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.trading_onboarding.impl.ui.documents.TradingOnboardingOpenDocumentFlow;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import wrj.m;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/documents/TradingOnboardingOpenDocumentFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TradingOnboardingOpenDocumentFlow extends ViewController<q> implements f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public TradingOnboardingOpenDocumentFlow(TradingOnboardingOpenDocumentFlowContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = R$layout.screen_transparent;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: wyk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradingOnboardingOpenDocumentFlow f301303b;

            {
                this.f301303b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((kyk.w) this.f301303b.M.getValue()).f191002b.get();
                    default:
                        TradingOnboardingOpenDocumentFlow tradingOnboardingOpenDocumentFlow = this.f301303b;
                        return c.d(R$id.screen_transparent_container, 4, null, tradingOnboardingOpenDocumentFlow, (b) tradingOnboardingOpenDocumentFlow.L.getValue());
                }
            }
        });
        this.M = w.y0(new m(this, input, 8));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: wyk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradingOnboardingOpenDocumentFlow f301303b;

            {
                this.f301303b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((kyk.w) this.f301303b.M.getValue()).f191002b.get();
                    default:
                        TradingOnboardingOpenDocumentFlow tradingOnboardingOpenDocumentFlow = this.f301303b;
                        return c.d(R$id.screen_transparent_container, 4, null, tradingOnboardingOpenDocumentFlow, (b) tradingOnboardingOpenDocumentFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (kyk.w) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (kyk.w) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (wyk.b) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
