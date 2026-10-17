package com.revolut.feature.onboarding.impl.onboarding.country.flow;

import com.revolut.feature.onboarding.impl.onboarding.country.flow.CountryOfResidenceFlow;
import com.revolut.feature.onboarding.impl.onboarding.country.flow.CountryOfResidenceFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ta9.h;
import ta9.m;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/country/flow/CountryOfResidenceFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpa9/c;", "Lyki/f;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CountryOfResidenceFlow extends ViewController<pa9.c> implements f {
    public final CountryOfResidenceFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CountryOfResidenceFlow(CountryOfResidenceFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: pa9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CountryOfResidenceFlow f234451b;

            {
                this.f234451b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CountryOfResidenceFlow countryOfResidenceFlow = this.f234451b;
                        phm.a aVar = (phm.a) ue0.e.j(countryOfResidenceFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).O;
                        CountryOfResidenceFlowContract$InputData countryOfResidenceFlowContract$InputData = countryOfResidenceFlow.K;
                        countryOfResidenceFlowContract$InputData.getClass();
                        return new ta9.h(mVar, countryOfResidenceFlowContract$InputData);
                    case 1:
                        return (b) ((ta9.h) this.f234451b.L.getValue()).d.get();
                    default:
                        CountryOfResidenceFlow countryOfResidenceFlow2 = this.f234451b;
                        return czi.c.d(0, 6, null, countryOfResidenceFlow2, (b) countryOfResidenceFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: pa9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CountryOfResidenceFlow f234451b;

            {
                this.f234451b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CountryOfResidenceFlow countryOfResidenceFlow = this.f234451b;
                        phm.a aVar = (phm.a) ue0.e.j(countryOfResidenceFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).O;
                        CountryOfResidenceFlowContract$InputData countryOfResidenceFlowContract$InputData = countryOfResidenceFlow.K;
                        countryOfResidenceFlowContract$InputData.getClass();
                        return new ta9.h(mVar, countryOfResidenceFlowContract$InputData);
                    case 1:
                        return (b) ((ta9.h) this.f234451b.L.getValue()).d.get();
                    default:
                        CountryOfResidenceFlow countryOfResidenceFlow2 = this.f234451b;
                        return czi.c.d(0, 6, null, countryOfResidenceFlow2, (b) countryOfResidenceFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: pa9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CountryOfResidenceFlow f234451b;

            {
                this.f234451b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CountryOfResidenceFlow countryOfResidenceFlow = this.f234451b;
                        phm.a aVar = (phm.a) ue0.e.j(countryOfResidenceFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).O;
                        CountryOfResidenceFlowContract$InputData countryOfResidenceFlowContract$InputData = countryOfResidenceFlow.K;
                        countryOfResidenceFlowContract$InputData.getClass();
                        return new ta9.h(mVar, countryOfResidenceFlowContract$InputData);
                    case 1:
                        return (b) ((ta9.h) this.f234451b.L.getValue()).d.get();
                    default:
                        CountryOfResidenceFlow countryOfResidenceFlow2 = this.f234451b;
                        return czi.c.d(0, 6, null, countryOfResidenceFlow2, (b) countryOfResidenceFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (h) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (pa9.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
