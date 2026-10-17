package com.revolut.feature.retail.cfd.impl.flows.withdraw;

import a0l.k;
import a15.d;
import a3b.c;
import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.retail.cfd.impl.flows.withdraw.CfdWithdrawFlow;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m2b.w;
import wii.b;
import xki.e;
import yki.f;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/flows/withdraw/CfdWithdrawFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "Lwii/b;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfdWithdrawFlow extends ViewController<q> implements f, b {
    public final ModalTransitionAnimation.Style K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final LargeActionButtonDelegate O;

    public /* synthetic */ CfdWithdrawFlow(CfdWithdrawFlowContract$InputData cfdWithdrawFlowContract$InputData) {
        this(cfdWithdrawFlowContract$InputData, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (w) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((w) this.M.getValue()).f.get()).d(u.c(this.O));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, new d(rd0.e.b(this.O.d.f121375b), 2), null, new k(this, null, 4), 3);
    }

    @Override // wii.b
    /* JADX INFO: renamed from: d2, reason: from getter */
    public final ModalTransitionAnimation.Style getK() {
        return this.K;
    }

    public CfdWithdrawFlow(CfdWithdrawFlowContract$InputData inputData, ModalTransitionAnimation.Style style) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = style;
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: a3b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdWithdrawFlow f1079b;

            {
                this.f1079b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CfdWithdrawFlow cfdWithdrawFlow = this.f1079b;
                        return czi.c.d(0, 6, null, cfdWithdrawFlow, (c) cfdWithdrawFlow.N.getValue());
                    default:
                        return (c) ((w) this.f1079b.M.getValue()).f201942h.get();
                }
            }
        });
        this.M = te0.w.y0(new a07.b(this, inputData, 4));
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: a3b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdWithdrawFlow f1079b;

            {
                this.f1079b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CfdWithdrawFlow cfdWithdrawFlow = this.f1079b;
                        return czi.c.d(0, 6, null, cfdWithdrawFlow, (c) cfdWithdrawFlow.N.getValue());
                    default:
                        return (c) ((w) this.f1079b.M.getValue()).f201942h.get();
                }
            }
        });
        this.O = new LargeActionButtonDelegate();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
