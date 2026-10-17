package com.revolut.feature.retail.reverywhere.impl.onboarding;

import aii.q;
import com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlow;
import com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dfb.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/reverywhere/impl/onboarding/ReverywhereOnboardingFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_reverywhere_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReverywhereOnboardingFlow extends ViewController<q> implements f {
    public final ReverywhereOnboardingFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public ReverywhereOnboardingFlow(ReverywhereOnboardingFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: hfb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReverywhereOnboardingFlow f151785b;

            {
                this.f151785b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ReverywhereOnboardingFlow reverywhereOnboardingFlow = this.f151785b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, reverywhereOnboardingFlow, (b) reverywhereOnboardingFlow.N.getValue());
                    case 1:
                        ReverywhereOnboardingFlow reverywhereOnboardingFlow2 = this.f151785b;
                        phm.a aVar = (phm.a) ue0.e.j(reverywhereOnboardingFlow2.m2()).a().get(dfb.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dfb.b.class, " is not found"));
                        }
                        dfb.b bVar = ((dfb.b) aVar2.b()).f113839p;
                        ReverywhereOnboardingFlowContract$InputData reverywhereOnboardingFlowContract$InputData = reverywhereOnboardingFlow2.K;
                        reverywhereOnboardingFlowContract$InputData.getClass();
                        return new dfb.c(bVar, reverywhereOnboardingFlowContract$InputData);
                    default:
                        return (b) ((dfb.c) this.f151785b.M.getValue()).f113845b.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: hfb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReverywhereOnboardingFlow f151785b;

            {
                this.f151785b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ReverywhereOnboardingFlow reverywhereOnboardingFlow = this.f151785b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, reverywhereOnboardingFlow, (b) reverywhereOnboardingFlow.N.getValue());
                    case 1:
                        ReverywhereOnboardingFlow reverywhereOnboardingFlow2 = this.f151785b;
                        phm.a aVar = (phm.a) ue0.e.j(reverywhereOnboardingFlow2.m2()).a().get(dfb.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dfb.b.class, " is not found"));
                        }
                        dfb.b bVar = ((dfb.b) aVar2.b()).f113839p;
                        ReverywhereOnboardingFlowContract$InputData reverywhereOnboardingFlowContract$InputData = reverywhereOnboardingFlow2.K;
                        reverywhereOnboardingFlowContract$InputData.getClass();
                        return new dfb.c(bVar, reverywhereOnboardingFlowContract$InputData);
                    default:
                        return (b) ((dfb.c) this.f151785b.M.getValue()).f113845b.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: hfb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReverywhereOnboardingFlow f151785b;

            {
                this.f151785b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ReverywhereOnboardingFlow reverywhereOnboardingFlow = this.f151785b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, reverywhereOnboardingFlow, (b) reverywhereOnboardingFlow.N.getValue());
                    case 1:
                        ReverywhereOnboardingFlow reverywhereOnboardingFlow2 = this.f151785b;
                        phm.a aVar = (phm.a) ue0.e.j(reverywhereOnboardingFlow2.m2()).a().get(dfb.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dfb.b.class, " is not found"));
                        }
                        dfb.b bVar = ((dfb.b) aVar2.b()).f113839p;
                        ReverywhereOnboardingFlowContract$InputData reverywhereOnboardingFlowContract$InputData = reverywhereOnboardingFlow2.K;
                        reverywhereOnboardingFlowContract$InputData.getClass();
                        return new dfb.c(bVar, reverywhereOnboardingFlowContract$InputData);
                    default:
                        return (b) ((dfb.c) this.f151785b.M.getValue()).f113845b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (hfb.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getP() {
        return R$layout.screen_transparent;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
