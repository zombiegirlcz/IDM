package com.revolut.retail.feature.pending_payments.impl.ui;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$InputData;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$OutputData;
import com.revolut.retail.feature.pending_payments.impl.ui.PendingPaymentFlow;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import qji.b;
import tak.d;
import te0.w;
import xak.c;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pending_payments/impl/ui/PendingPaymentFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentContract$OutputData;", "Lyki/f;", "Lno/m;", "feature_retail_pending_payments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PendingPaymentFlow extends ViewController<PendingPaymentContract$OutputData> implements f, m {
    public final PendingPaymentContract$InputData K;
    public final d L;
    public final AnalyticsProduct.Retail M;
    public final Object N;
    public final Object O;
    public final Object P;

    public PendingPaymentFlow(PendingPaymentContract$InputData inputData, d extension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.K = inputData;
        this.L = extension;
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.M = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: xak.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingPaymentFlow f303901b;

            {
                this.f303901b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PendingPaymentFlow pendingPaymentFlow = this.f303901b;
                        phm.a aVar = (phm.a) ue0.e.j(pendingPaymentFlow.m2()).a().get(wak.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", wak.f.class, " is not found"));
                        }
                        wak.f fVar = ((wak.f) aVar2.b()).f295969g;
                        PendingPaymentContract$InputData pendingPaymentContract$InputData = pendingPaymentFlow.K;
                        pendingPaymentContract$InputData.getClass();
                        tak.d dVar = pendingPaymentFlow.L;
                        dVar.getClass();
                        return new wak.e(fVar, pendingPaymentContract$InputData, dVar);
                    case 1:
                        return (c) ((wak.e) this.f303901b.N.getValue()).e.get();
                    default:
                        PendingPaymentFlow pendingPaymentFlow2 = this.f303901b;
                        return czi.c.d(0, 6, null, pendingPaymentFlow2, (c) pendingPaymentFlow2.O.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: xak.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingPaymentFlow f303901b;

            {
                this.f303901b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PendingPaymentFlow pendingPaymentFlow = this.f303901b;
                        phm.a aVar = (phm.a) ue0.e.j(pendingPaymentFlow.m2()).a().get(wak.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", wak.f.class, " is not found"));
                        }
                        wak.f fVar = ((wak.f) aVar2.b()).f295969g;
                        PendingPaymentContract$InputData pendingPaymentContract$InputData = pendingPaymentFlow.K;
                        pendingPaymentContract$InputData.getClass();
                        tak.d dVar = pendingPaymentFlow.L;
                        dVar.getClass();
                        return new wak.e(fVar, pendingPaymentContract$InputData, dVar);
                    case 1:
                        return (c) ((wak.e) this.f303901b.N.getValue()).e.get();
                    default:
                        PendingPaymentFlow pendingPaymentFlow2 = this.f303901b;
                        return czi.c.d(0, 6, null, pendingPaymentFlow2, (c) pendingPaymentFlow2.O.getValue());
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: xak.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PendingPaymentFlow f303901b;

            {
                this.f303901b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PendingPaymentFlow pendingPaymentFlow = this.f303901b;
                        phm.a aVar = (phm.a) ue0.e.j(pendingPaymentFlow.m2()).a().get(wak.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", wak.f.class, " is not found"));
                        }
                        wak.f fVar = ((wak.f) aVar2.b()).f295969g;
                        PendingPaymentContract$InputData pendingPaymentContract$InputData = pendingPaymentFlow.K;
                        pendingPaymentContract$InputData.getClass();
                        tak.d dVar = pendingPaymentFlow.L;
                        dVar.getClass();
                        return new wak.e(fVar, pendingPaymentContract$InputData, dVar);
                    case 1:
                        return (c) ((wak.e) this.f303901b.N.getValue()).e.get();
                    default:
                        PendingPaymentFlow pendingPaymentFlow2 = this.f303901b;
                        return czi.c.d(0, 6, null, pendingPaymentFlow2, (c) pendingPaymentFlow2.O.getValue());
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (wak.e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (wak.e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.P.getValue();
    }
}
