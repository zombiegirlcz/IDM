package com.revolut.feature.revolutpay.impl.ui.bottom_sheet.cashback;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.revolutpay.impl.ui.bottom_sheet.cashback.CashbackExplainerScreen;
import com.revolut.feature.revolutpay.impl.ui.bottom_sheet.cashback.CashbackExplainerScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import i8c.f;
import i8c.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p7c.d;
import p7c.r;
import p7c.x;
import pki.b;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/bottom_sheet/cashback/CashbackExplainerScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Li8c/f;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashbackExplainerScreen extends BaseBottomSheetRecyclerController<q, f> {
    public static final /* synthetic */ int V = 0;
    public final CashbackExplainerScreenContract$InputData Q;
    public final Object R;
    public final Object S;
    public final TextDelegate T;
    public final List U;

    public CashbackExplainerScreen(CashbackExplainerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: i8c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashbackExplainerScreen f159490b;

            {
                this.f159490b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CashbackExplainerScreen cashbackExplainerScreen = this.f159490b;
                switch (i2) {
                    case 0:
                        int i3 = CashbackExplainerScreen.V;
                        qji.b bVarU2 = cashbackExplainerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.impl.ui.bottom_sheet.cashback.di.CashbackExplainerScreenInjector");
                        x xVar = (x) bVarU2;
                        r rVar = xVar.f233742b;
                        x xVar2 = xVar.f233743c;
                        CashbackExplainerScreenContract$InputData cashbackExplainerScreenContract$InputData = cashbackExplainerScreen.Q;
                        cashbackExplainerScreenContract$InputData.getClass();
                        return new p7c.d(rVar, xVar2, cashbackExplainerScreenContract$InputData);
                    default:
                        int i5 = CashbackExplainerScreen.V;
                        return (j) ((p7c.d) cashbackExplainerScreen.R.getValue()).f233594b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: i8c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashbackExplainerScreen f159490b;

            {
                this.f159490b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CashbackExplainerScreen cashbackExplainerScreen = this.f159490b;
                switch (i22) {
                    case 0:
                        int i3 = CashbackExplainerScreen.V;
                        qji.b bVarU2 = cashbackExplainerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.impl.ui.bottom_sheet.cashback.di.CashbackExplainerScreenInjector");
                        x xVar = (x) bVarU2;
                        r rVar = xVar.f233742b;
                        x xVar2 = xVar.f233743c;
                        CashbackExplainerScreenContract$InputData cashbackExplainerScreenContract$InputData = cashbackExplainerScreen.Q;
                        cashbackExplainerScreenContract$InputData.getClass();
                        return new p7c.d(rVar, xVar2, cashbackExplainerScreenContract$InputData);
                    default:
                        int i5 = CashbackExplainerScreen.V;
                        return (j) ((p7c.d) cashbackExplainerScreen.R.getValue()).f233594b.get();
                }
            }
        });
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        TextDelegate textDelegate = new TextDelegate();
        this.T = textDelegate;
        this.U = v.k(cellDetailsDelegate, textDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (j) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, vkm.q.J(new i5b.d(h3(), 12), new i5b.d(e3(), 13), new i5b.d(rd0.e.b(this.T.d), 14)), new i13.d(this, (Continuation) null, 25), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (j) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getQ() {
        return this.U;
    }
}
