package com.revolut.feature.onboarding.impl.exchange_global_access.flow;

import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput;
import com.revolut.feature.onboarding.impl.exchange_global_access.flow.ExchangeGlobalAccessFlow;
import com.revolut.feature.onboarding.impl.exchange_global_access.flow.ExchangeGlobalAccessFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s99.b;
import te0.w;
import xki.e;
import yhm.d;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/exchange_global_access/flow/ExchangeGlobalAccessFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/onboarding/api/exchange_global_access/ExchangeGlobalAccessOutput;", "Lyki/f;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class ExchangeGlobalAccessFlow extends ViewController<ExchangeGlobalAccessOutput> implements f {
    public final ExchangeGlobalAccessFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public ExchangeGlobalAccessFlow(ExchangeGlobalAccessFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: t99.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExchangeGlobalAccessFlow f268962b;

            {
                this.f268962b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ExchangeGlobalAccessFlow exchangeGlobalAccessFlow = this.f268962b;
                        phm.a aVar = (phm.a) ue0.e.j(exchangeGlobalAccessFlow.m2()).a().get(l89.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l89.b.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.exchange_global_access.flow.di.ExchangeGlobalAccessFlowInjector");
                        s99.a aVar3 = ((s99.a) objB).f261131h;
                        ExchangeGlobalAccessFlowContract$InputData exchangeGlobalAccessFlowContract$InputData = exchangeGlobalAccessFlow.K;
                        exchangeGlobalAccessFlowContract$InputData.getClass();
                        return new s99.b(aVar3, exchangeGlobalAccessFlowContract$InputData);
                    case 1:
                        return (b) ((s99.b) this.f268962b.M.getValue()).f261134b.get();
                    default:
                        ExchangeGlobalAccessFlow exchangeGlobalAccessFlow2 = this.f268962b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, exchangeGlobalAccessFlow2, (b) exchangeGlobalAccessFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: t99.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExchangeGlobalAccessFlow f268962b;

            {
                this.f268962b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ExchangeGlobalAccessFlow exchangeGlobalAccessFlow = this.f268962b;
                        phm.a aVar = (phm.a) ue0.e.j(exchangeGlobalAccessFlow.m2()).a().get(l89.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l89.b.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.exchange_global_access.flow.di.ExchangeGlobalAccessFlowInjector");
                        s99.a aVar3 = ((s99.a) objB).f261131h;
                        ExchangeGlobalAccessFlowContract$InputData exchangeGlobalAccessFlowContract$InputData = exchangeGlobalAccessFlow.K;
                        exchangeGlobalAccessFlowContract$InputData.getClass();
                        return new s99.b(aVar3, exchangeGlobalAccessFlowContract$InputData);
                    case 1:
                        return (b) ((s99.b) this.f268962b.M.getValue()).f261134b.get();
                    default:
                        ExchangeGlobalAccessFlow exchangeGlobalAccessFlow2 = this.f268962b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, exchangeGlobalAccessFlow2, (b) exchangeGlobalAccessFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: t99.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExchangeGlobalAccessFlow f268962b;

            {
                this.f268962b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ExchangeGlobalAccessFlow exchangeGlobalAccessFlow = this.f268962b;
                        phm.a aVar = (phm.a) ue0.e.j(exchangeGlobalAccessFlow.m2()).a().get(l89.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l89.b.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.exchange_global_access.flow.di.ExchangeGlobalAccessFlowInjector");
                        s99.a aVar3 = ((s99.a) objB).f261131h;
                        ExchangeGlobalAccessFlowContract$InputData exchangeGlobalAccessFlowContract$InputData = exchangeGlobalAccessFlow.K;
                        exchangeGlobalAccessFlowContract$InputData.getClass();
                        return new s99.b(aVar3, exchangeGlobalAccessFlowContract$InputData);
                    case 1:
                        return (b) ((s99.b) this.f268962b.M.getValue()).f261134b.get();
                    default:
                        ExchangeGlobalAccessFlow exchangeGlobalAccessFlow2 = this.f268962b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, exchangeGlobalAccessFlow2, (b) exchangeGlobalAccessFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (t99.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
