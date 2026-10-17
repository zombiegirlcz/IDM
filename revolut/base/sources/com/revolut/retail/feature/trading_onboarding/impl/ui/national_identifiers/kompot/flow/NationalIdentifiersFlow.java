package com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow;

import c0l.c;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.NationalIdentifiersFlow;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kyk.i;
import kyk.v;
import kyk.y;
import no.m;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/national_identifiers/kompot/flow/NationalIdentifiersFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lc0l/c;", "Lyki/f;", "Lno/m;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NationalIdentifiersFlow extends ViewController<c> implements f, m {
    public final AnalyticsProduct K;
    public final Object L;
    public final Object M;
    public final Object N;

    public NationalIdentifiersFlow(AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.K = analyticsProduct;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: c0l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NationalIdentifiersFlow f20294b;

            {
                this.f20294b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((i) this.f20294b.M.getValue()).d.get();
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(this.f20294b.m2()).a().get(y.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new i(((v) ((y) aVar2.b())).A);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", y.class, " is not found"));
                    default:
                        NationalIdentifiersFlow nationalIdentifiersFlow = this.f20294b;
                        return czi.c.d(0, 6, null, nationalIdentifiersFlow, (b) nationalIdentifiersFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: c0l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NationalIdentifiersFlow f20294b;

            {
                this.f20294b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((i) this.f20294b.M.getValue()).d.get();
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(this.f20294b.m2()).a().get(y.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new i(((v) ((y) aVar2.b())).A);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", y.class, " is not found"));
                    default:
                        NationalIdentifiersFlow nationalIdentifiersFlow = this.f20294b;
                        return czi.c.d(0, 6, null, nationalIdentifiersFlow, (b) nationalIdentifiersFlow.L.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: c0l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NationalIdentifiersFlow f20294b;

            {
                this.f20294b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (b) ((i) this.f20294b.M.getValue()).d.get();
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(this.f20294b.m2()).a().get(y.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new i(((v) ((y) aVar2.b())).A);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", y.class, " is not found"));
                    default:
                        NationalIdentifiersFlow nationalIdentifiersFlow = this.f20294b;
                        return czi.c.d(0, 6, null, nationalIdentifiersFlow, (b) nationalIdentifiersFlow.L.getValue());
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (i) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c0l.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
