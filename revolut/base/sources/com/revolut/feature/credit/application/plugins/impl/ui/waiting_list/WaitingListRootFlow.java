package com.revolut.feature.credit.application.plugins.impl.ui.waiting_list;

import aii.r;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting_list.WaitingListRootFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.g7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/waiting_list/WaitingListRootFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/r;", "Lyki/f;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WaitingListRootFlow extends ViewController<r> implements f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public WaitingListRootFlow(WaitingListFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        this.L = w.y0(new ni1.a(this, inputData, 4));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: nj4.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingListRootFlow f216364b;

            {
                this.f216364b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (a) ((g7) this.f216364b.L.getValue()).f118828b.get();
                    default:
                        WaitingListRootFlow waitingListRootFlow = this.f216364b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, waitingListRootFlow, (a) waitingListRootFlow.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: nj4.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitingListRootFlow f216364b;

            {
                this.f216364b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (a) ((g7) this.f216364b.L.getValue()).f118828b.get();
                    default:
                        WaitingListRootFlow waitingListRootFlow = this.f216364b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, waitingListRootFlow, (a) waitingListRootFlow.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g7) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (g7) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (nj4.a) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
