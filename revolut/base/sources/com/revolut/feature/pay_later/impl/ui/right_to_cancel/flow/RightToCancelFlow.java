package com.revolut.feature.pay_later.impl.ui.right_to_cancel.flow;

import aii.q;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.flow.RightToCancelFlow;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.flow.RightToCancelFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import no.m;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/right_to_cancel/flow/RightToCancelFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "Lno/m;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RightToCancelFlow extends ViewController<q> implements f, m {
    public final RightToCancelFlowContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final Object M;
    public final Object N;
    public final Object O;

    public RightToCancelFlow(RightToCancelFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ok9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RightToCancelFlow f225949b;

            {
                this.f225949b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        RightToCancelFlow rightToCancelFlow = this.f225949b;
                        return czi.c.d(0, 6, null, rightToCancelFlow, (b) rightToCancelFlow.O.getValue());
                    case 1:
                        RightToCancelFlow rightToCancelFlow2 = this.f225949b;
                        oi9.f fVar = s.n(rightToCancelFlow2.m2()).v;
                        RightToCancelFlowContract$InputData rightToCancelFlowContract$InputData = rightToCancelFlow2.K;
                        rightToCancelFlowContract$InputData.getClass();
                        return new oi9.w(fVar, rightToCancelFlowContract$InputData);
                    default:
                        return (b) ((oi9.w) this.f225949b.N.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ok9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RightToCancelFlow f225949b;

            {
                this.f225949b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        RightToCancelFlow rightToCancelFlow = this.f225949b;
                        return czi.c.d(0, 6, null, rightToCancelFlow, (b) rightToCancelFlow.O.getValue());
                    case 1:
                        RightToCancelFlow rightToCancelFlow2 = this.f225949b;
                        oi9.f fVar = s.n(rightToCancelFlow2.m2()).v;
                        RightToCancelFlowContract$InputData rightToCancelFlowContract$InputData = rightToCancelFlow2.K;
                        rightToCancelFlowContract$InputData.getClass();
                        return new oi9.w(fVar, rightToCancelFlowContract$InputData);
                    default:
                        return (b) ((oi9.w) this.f225949b.N.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: ok9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RightToCancelFlow f225949b;

            {
                this.f225949b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        RightToCancelFlow rightToCancelFlow = this.f225949b;
                        return czi.c.d(0, 6, null, rightToCancelFlow, (b) rightToCancelFlow.O.getValue());
                    case 1:
                        RightToCancelFlow rightToCancelFlow2 = this.f225949b;
                        oi9.f fVar = s.n(rightToCancelFlow2.m2()).v;
                        RightToCancelFlowContract$InputData rightToCancelFlowContract$InputData = rightToCancelFlow2.K;
                        rightToCancelFlowContract$InputData.getClass();
                        return new oi9.w(fVar, rightToCancelFlowContract$InputData);
                    default:
                        return (b) ((oi9.w) this.f225949b.N.getValue()).d.get();
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
    public final e R1() {
        return (oi9.w) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (oi9.w) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ok9.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
