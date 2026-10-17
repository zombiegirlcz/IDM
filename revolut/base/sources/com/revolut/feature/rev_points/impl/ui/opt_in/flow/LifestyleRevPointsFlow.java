package com.revolut.feature.rev_points.impl.ui.opt_in.flow;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.impl.ui.opt_in.flow.LifestyleRevPointsFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import hub.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/opt_in/flow/LifestyleRevPointsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhub/b;", "Lyki/f;", "Lno/m;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LifestyleRevPointsFlow extends ViewController<b> implements f, m {
    public final LifestyleRevPointsOptInController$InputData K;
    public final AnalyticsProduct.Retail L;
    public final Object M;
    public final Object N;
    public final int O;
    public final Object P;

    public LifestyleRevPointsFlow(LifestyleRevPointsOptInController$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.RevPoints;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: pzb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LifestyleRevPointsFlow f240934b;

            {
                this.f240934b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((zxb.a) this.f240934b.P.getValue()).f326098b.get();
                    case 1:
                        LifestyleRevPointsFlow lifestyleRevPointsFlow = this.f240934b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, lifestyleRevPointsFlow, (b) lifestyleRevPointsFlow.M.getValue());
                    default:
                        LifestyleRevPointsFlow lifestyleRevPointsFlow2 = this.f240934b;
                        phm.a aVar = (phm.a) e.j(lifestyleRevPointsFlow2.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        LifestyleRevPointsOptInController$InputData lifestyleRevPointsOptInController$InputData = lifestyleRevPointsFlow2.K;
                        lifestyleRevPointsOptInController$InputData.getClass();
                        return new zxb.a(eVar, lifestyleRevPointsOptInController$InputData);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: pzb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LifestyleRevPointsFlow f240934b;

            {
                this.f240934b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((zxb.a) this.f240934b.P.getValue()).f326098b.get();
                    case 1:
                        LifestyleRevPointsFlow lifestyleRevPointsFlow = this.f240934b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, lifestyleRevPointsFlow, (b) lifestyleRevPointsFlow.M.getValue());
                    default:
                        LifestyleRevPointsFlow lifestyleRevPointsFlow2 = this.f240934b;
                        phm.a aVar = (phm.a) e.j(lifestyleRevPointsFlow2.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        LifestyleRevPointsOptInController$InputData lifestyleRevPointsOptInController$InputData = lifestyleRevPointsFlow2.K;
                        lifestyleRevPointsOptInController$InputData.getClass();
                        return new zxb.a(eVar, lifestyleRevPointsOptInController$InputData);
                }
            }
        });
        this.O = R$layout.screen_transparent;
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: pzb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LifestyleRevPointsFlow f240934b;

            {
                this.f240934b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (b) ((zxb.a) this.f240934b.P.getValue()).f326098b.get();
                    case 1:
                        LifestyleRevPointsFlow lifestyleRevPointsFlow = this.f240934b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, lifestyleRevPointsFlow, (b) lifestyleRevPointsFlow.M.getValue());
                    default:
                        LifestyleRevPointsFlow lifestyleRevPointsFlow2 = this.f240934b;
                        phm.a aVar = (phm.a) e.j(lifestyleRevPointsFlow2.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        LifestyleRevPointsOptInController$InputData lifestyleRevPointsOptInController$InputData = lifestyleRevPointsFlow2.K;
                        lifestyleRevPointsOptInController$InputData.getClass();
                        return new zxb.a(eVar, lifestyleRevPointsOptInController$InputData);
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (zxb.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (zxb.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (pzb.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
