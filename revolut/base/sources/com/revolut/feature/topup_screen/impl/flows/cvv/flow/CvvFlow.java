package com.revolut.feature.topup_screen.impl.flows.cvv.flow;

import aii.q;
import android.app.Activity;
import com.revolut.feature.topup_screen.impl.flows.cvv.flow.CvvFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nxe.b;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/cvv/flow/CvvFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CvvFlow extends ViewController<q> implements f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CvvFlow(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: nxe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CvvFlow f220560b;

            {
                this.f220560b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CvvFlow cvvFlow = this.f220560b;
                        if (cvvFlow.N.getValue() == null) {
                            return c.d(R$id.screen_transparent_container, 4, null, cvvFlow, null);
                        }
                        throw new ClassCastException();
                    case 1:
                        CvvFlow cvvFlow2 = this.f220560b;
                        Intrinsics.checkNotNullParameter(cvvFlow2, "<this>");
                        Activity activityM2 = cvvFlow2.m2();
                        Intrinsics.i(activityM2, "null cannot be cast to non-null type com.revolut.retail.core.ui.activity.BaseDelegatesActivity<*, *>");
                        ((BaseDelegatesActivity) activityM2).L0().getClass();
                        throw new ClassCastException();
                    default:
                        this.f220560b.M.getValue().getClass();
                        throw new ClassCastException();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: nxe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CvvFlow f220560b;

            {
                this.f220560b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CvvFlow cvvFlow = this.f220560b;
                        if (cvvFlow.N.getValue() == null) {
                            return c.d(R$id.screen_transparent_container, 4, null, cvvFlow, null);
                        }
                        throw new ClassCastException();
                    case 1:
                        CvvFlow cvvFlow2 = this.f220560b;
                        Intrinsics.checkNotNullParameter(cvvFlow2, "<this>");
                        Activity activityM2 = cvvFlow2.m2();
                        Intrinsics.i(activityM2, "null cannot be cast to non-null type com.revolut.retail.core.ui.activity.BaseDelegatesActivity<*, *>");
                        ((BaseDelegatesActivity) activityM2).L0().getClass();
                        throw new ClassCastException();
                    default:
                        this.f220560b.M.getValue().getClass();
                        throw new ClassCastException();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: nxe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CvvFlow f220560b;

            {
                this.f220560b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CvvFlow cvvFlow = this.f220560b;
                        if (cvvFlow.N.getValue() == null) {
                            return c.d(R$id.screen_transparent_container, 4, null, cvvFlow, null);
                        }
                        throw new ClassCastException();
                    case 1:
                        CvvFlow cvvFlow2 = this.f220560b;
                        Intrinsics.checkNotNullParameter(cvvFlow2, "<this>");
                        Activity activityM2 = cvvFlow2.m2();
                        Intrinsics.i(activityM2, "null cannot be cast to non-null type com.revolut.retail.core.ui.activity.BaseDelegatesActivity<*, *>");
                        ((BaseDelegatesActivity) activityM2).L0().getClass();
                        throw new ClassCastException();
                    default:
                        this.f220560b.M.getValue().getClass();
                        throw new ClassCastException();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        if (this.M.getValue() == null) {
            return null;
        }
        throw new ClassCastException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        if (this.M.getValue() == null) {
            return null;
        }
        throw new ClassCastException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        if (this.N.getValue() == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
