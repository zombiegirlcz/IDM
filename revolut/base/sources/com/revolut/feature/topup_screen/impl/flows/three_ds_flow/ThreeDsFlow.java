package com.revolut.feature.topup_screen.impl.flows.three_ds_flow;

import aii.q;
import android.app.Activity;
import com.revolut.feature.topup_screen.impl.flows.three_ds_flow.ThreeDsFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import czi.c;
import dye.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/three_ds_flow/ThreeDsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ThreeDsFlow extends ViewController<q> implements f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public ThreeDsFlow(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: dye.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreeDsFlow f121095b;

            {
                this.f121095b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ThreeDsFlow threeDsFlow = this.f121095b;
                        if (threeDsFlow.N.getValue() == null) {
                            return c.d(R$id.screen_transparent_container, 4, null, threeDsFlow, null);
                        }
                        throw new ClassCastException();
                    case 1:
                        ThreeDsFlow threeDsFlow2 = this.f121095b;
                        Intrinsics.checkNotNullParameter(threeDsFlow2, "<this>");
                        Activity activityM2 = threeDsFlow2.m2();
                        Intrinsics.i(activityM2, "null cannot be cast to non-null type com.revolut.retail.core.ui.activity.BaseDelegatesActivity<*, *>");
                        ((BaseDelegatesActivity) activityM2).L0().getClass();
                        throw new ClassCastException();
                    default:
                        this.f121095b.M.getValue().getClass();
                        throw new ClassCastException();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: dye.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreeDsFlow f121095b;

            {
                this.f121095b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ThreeDsFlow threeDsFlow = this.f121095b;
                        if (threeDsFlow.N.getValue() == null) {
                            return c.d(R$id.screen_transparent_container, 4, null, threeDsFlow, null);
                        }
                        throw new ClassCastException();
                    case 1:
                        ThreeDsFlow threeDsFlow2 = this.f121095b;
                        Intrinsics.checkNotNullParameter(threeDsFlow2, "<this>");
                        Activity activityM2 = threeDsFlow2.m2();
                        Intrinsics.i(activityM2, "null cannot be cast to non-null type com.revolut.retail.core.ui.activity.BaseDelegatesActivity<*, *>");
                        ((BaseDelegatesActivity) activityM2).L0().getClass();
                        throw new ClassCastException();
                    default:
                        this.f121095b.M.getValue().getClass();
                        throw new ClassCastException();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: dye.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreeDsFlow f121095b;

            {
                this.f121095b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ThreeDsFlow threeDsFlow = this.f121095b;
                        if (threeDsFlow.N.getValue() == null) {
                            return c.d(R$id.screen_transparent_container, 4, null, threeDsFlow, null);
                        }
                        throw new ClassCastException();
                    case 1:
                        ThreeDsFlow threeDsFlow2 = this.f121095b;
                        Intrinsics.checkNotNullParameter(threeDsFlow2, "<this>");
                        Activity activityM2 = threeDsFlow2.m2();
                        Intrinsics.i(activityM2, "null cannot be cast to non-null type com.revolut.retail.core.ui.activity.BaseDelegatesActivity<*, *>");
                        ((BaseDelegatesActivity) activityM2).L0().getClass();
                        throw new ClassCastException();
                    default:
                        this.f121095b.M.getValue().getClass();
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
