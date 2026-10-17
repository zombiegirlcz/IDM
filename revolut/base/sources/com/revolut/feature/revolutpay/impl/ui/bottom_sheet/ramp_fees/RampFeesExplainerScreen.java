package com.revolut.feature.revolutpay.impl.ui.bottom_sheet.ramp_fees;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.feature.revolutpay.impl.ui.bottom_sheet.ramp_fees.RampFeesExplainerScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import k8c.a;
import k8c.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p12.o;
import p7c.p;
import pki.b;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/bottom_sheet/ramp_fees/RampFeesExplainerScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lk8c/a;", "<init>", "()V", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RampFeesExplainerScreen extends BaseBottomSheetRecyclerController<q, a> {
    public static final /* synthetic */ int V = 0;
    public final LargeActionButtonDelegate Q;
    public final PlainTextDelegate R;
    public final Object S;
    public final Object T;
    public final List U;

    public RampFeesExplainerScreen() {
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.Q = largeActionButtonDelegate;
        PlainTextDelegate plainTextDelegate = new PlainTextDelegate();
        this.R = plainTextDelegate;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: k8c.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RampFeesExplainerScreen f182107b;

            {
                this.f182107b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RampFeesExplainerScreen rampFeesExplainerScreen = this.f182107b;
                switch (i2) {
                    case 0:
                        int i3 = RampFeesExplainerScreen.V;
                        qji.b bVarU2 = rampFeesExplainerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.impl.ui.bottom_sheet.ramp_fees.di.RampFeesExplainerScreenInjector");
                        p pVar = new p();
                        pVar.f233658a = e4m.b.b(new o(4));
                        return pVar;
                    default:
                        int i5 = RampFeesExplainerScreen.V;
                        return (b) ((p) rampFeesExplainerScreen.S.getValue()).f233658a.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: k8c.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RampFeesExplainerScreen f182107b;

            {
                this.f182107b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RampFeesExplainerScreen rampFeesExplainerScreen = this.f182107b;
                switch (i22) {
                    case 0:
                        int i3 = RampFeesExplainerScreen.V;
                        qji.b bVarU2 = rampFeesExplainerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.impl.ui.bottom_sheet.ramp_fees.di.RampFeesExplainerScreenInjector");
                        p pVar = new p();
                        pVar.f233658a = e4m.b.b(new o(4));
                        return pVar;
                    default:
                        int i5 = RampFeesExplainerScreen.V;
                        return (b) ((p) rampFeesExplainerScreen.S.getValue()).f233658a.get();
                }
            }
        });
        this.U = v.k(plainTextDelegate, largeActionButtonDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b k3() {
        return (k8c.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.Q.d.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.d.f121375b), new jv.o(this, null, 23), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (k8c.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
