package com.revolut.feature.terminated_users.impl.ui.flow;

import a0.d;
import aii.q;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.terminated_users.impl.ui.flow.TerminatedAccountFlow;
import com.revolut.feature.terminated_users.impl.ui.flow.TerminatedAccountFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import ere.b;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/terminated_users/impl/ui/flow/TerminatedAccountFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "Lno/m;", "feature_terminated_users_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TerminatedAccountFlow extends ViewController<q> implements f, m {
    public final TerminatedAccountFlowContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final Object M;
    public final Object N;
    public final Object O;

    public TerminatedAccountFlow(TerminatedAccountFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.Onboarding;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: fre.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TerminatedAccountFlow f137475b;

            {
                this.f137475b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TerminatedAccountFlow terminatedAccountFlow = this.f137475b;
                        return czi.c.d(0, 6, null, terminatedAccountFlow, (b) terminatedAccountFlow.O.getValue());
                    case 1:
                        TerminatedAccountFlow terminatedAccountFlow2 = this.f137475b;
                        phm.a aVar = (phm.a) e.j(terminatedAccountFlow2.m2()).a().get(bre.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", bre.a.class, " is not found"));
                        }
                        ere.c cVar = ((ere.c) aVar2.b()).f128652c;
                        TerminatedAccountFlowContract$InputData terminatedAccountFlowContract$InputData = terminatedAccountFlow2.K;
                        terminatedAccountFlowContract$InputData.getClass();
                        return new ere.b(cVar, terminatedAccountFlowContract$InputData);
                    default:
                        return (b) ((ere.b) this.f137475b.N.getValue()).f128649b.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: fre.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TerminatedAccountFlow f137475b;

            {
                this.f137475b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TerminatedAccountFlow terminatedAccountFlow = this.f137475b;
                        return czi.c.d(0, 6, null, terminatedAccountFlow, (b) terminatedAccountFlow.O.getValue());
                    case 1:
                        TerminatedAccountFlow terminatedAccountFlow2 = this.f137475b;
                        phm.a aVar = (phm.a) e.j(terminatedAccountFlow2.m2()).a().get(bre.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", bre.a.class, " is not found"));
                        }
                        ere.c cVar = ((ere.c) aVar2.b()).f128652c;
                        TerminatedAccountFlowContract$InputData terminatedAccountFlowContract$InputData = terminatedAccountFlow2.K;
                        terminatedAccountFlowContract$InputData.getClass();
                        return new ere.b(cVar, terminatedAccountFlowContract$InputData);
                    default:
                        return (b) ((ere.b) this.f137475b.N.getValue()).f128649b.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: fre.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TerminatedAccountFlow f137475b;

            {
                this.f137475b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TerminatedAccountFlow terminatedAccountFlow = this.f137475b;
                        return czi.c.d(0, 6, null, terminatedAccountFlow, (b) terminatedAccountFlow.O.getValue());
                    case 1:
                        TerminatedAccountFlow terminatedAccountFlow2 = this.f137475b;
                        phm.a aVar = (phm.a) e.j(terminatedAccountFlow2.m2()).a().get(bre.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", bre.a.class, " is not found"));
                        }
                        ere.c cVar = ((ere.c) aVar2.b()).f128652c;
                        TerminatedAccountFlowContract$InputData terminatedAccountFlowContract$InputData = terminatedAccountFlow2.K;
                        terminatedAccountFlowContract$InputData.getClass();
                        return new ere.b(cVar, terminatedAccountFlowContract$InputData);
                    default:
                        return (b) ((ere.b) this.f137475b.N.getValue()).f128649b.get();
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getT() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (fre.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
