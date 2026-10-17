package com.revolut.feature.kyc.impl.ondemand;

import android.content.Intent;
import android.view.View;
import com.revolut.feature.kyc.impl.ondemand.OnDemandFeatureInstallFlow;
import com.revolut.feature.kyc.impl.ondemand.OnDemandFeatureInstallFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import tna.p;
import tw8.c;
import tw8.f;
import xki.e;
import zu8.c0;
import zu8.f0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/kyc/impl/ondemand/OnDemandFeatureInstallFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltw8/f;", "Lyki/f;", "Companion", "a", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OnDemandFeatureInstallFlow extends ViewController<f> implements yki.f {
    public final OnDemandFeatureInstallFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public OnDemandFeatureInstallFlow(OnDemandFeatureInstallFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: tw8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnDemandFeatureInstallFlow f274948b;

            {
                this.f274948b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        OnDemandFeatureInstallFlow onDemandFeatureInstallFlow = this.f274948b;
                        phm.a aVar = (phm.a) ue0.e.j(onDemandFeatureInstallFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        OnDemandFeatureInstallFlowContract$InputData onDemandFeatureInstallFlowContract$InputData = onDemandFeatureInstallFlow.K;
                        onDemandFeatureInstallFlowContract$InputData.getClass();
                        return new f0(c0Var, onDemandFeatureInstallFlowContract$InputData);
                    case 1:
                        return (c) ((f0) this.f274948b.L.getValue()).f325273b.get();
                    default:
                        OnDemandFeatureInstallFlow onDemandFeatureInstallFlow2 = this.f274948b;
                        return czi.c.d(0, 6, null, onDemandFeatureInstallFlow2, (c) onDemandFeatureInstallFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: tw8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnDemandFeatureInstallFlow f274948b;

            {
                this.f274948b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        OnDemandFeatureInstallFlow onDemandFeatureInstallFlow = this.f274948b;
                        phm.a aVar = (phm.a) ue0.e.j(onDemandFeatureInstallFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        OnDemandFeatureInstallFlowContract$InputData onDemandFeatureInstallFlowContract$InputData = onDemandFeatureInstallFlow.K;
                        onDemandFeatureInstallFlowContract$InputData.getClass();
                        return new f0(c0Var, onDemandFeatureInstallFlowContract$InputData);
                    case 1:
                        return (c) ((f0) this.f274948b.L.getValue()).f325273b.get();
                    default:
                        OnDemandFeatureInstallFlow onDemandFeatureInstallFlow2 = this.f274948b;
                        return czi.c.d(0, 6, null, onDemandFeatureInstallFlow2, (c) onDemandFeatureInstallFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: tw8.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnDemandFeatureInstallFlow f274948b;

            {
                this.f274948b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        OnDemandFeatureInstallFlow onDemandFeatureInstallFlow = this.f274948b;
                        phm.a aVar = (phm.a) ue0.e.j(onDemandFeatureInstallFlow.m2()).a().get(c0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c0.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).v;
                        OnDemandFeatureInstallFlowContract$InputData onDemandFeatureInstallFlowContract$InputData = onDemandFeatureInstallFlow.K;
                        onDemandFeatureInstallFlowContract$InputData.getClass();
                        return new f0(c0Var, onDemandFeatureInstallFlowContract$InputData);
                    case 1:
                        return (c) ((f0) this.f274948b.L.getValue()).f325273b.get();
                    default:
                        OnDemandFeatureInstallFlow onDemandFeatureInstallFlow2 = this.f274948b;
                        return czi.c.d(0, 6, null, onDemandFeatureInstallFlow2, (c) onDemandFeatureInstallFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (f0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        a aVar = (a) ((c) this.M.getValue());
        aVar.getClass();
        if (i == 60430 && i2 == 0) {
            aVar.I2();
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, ((a) ((c) this.M.getValue())).f77845s, null, new p(this, null, 21), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
