package com.revolut.feature.credit.loan.impl.ui.rev10.interestratebreakdown;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b75.b;
import b75.f;
import b75.i;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.credit.loan.impl.ui.rev10.interestratebreakdown.LoanInterestRateBreakdownController;
import com.revolut.feature.credit.loan.impl.ui.rev10.interestratebreakdown.LoanInterestRateBreakdownControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import u45.t;
import vc.s;
import vkm.d;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/interestratebreakdown/LoanInterestRateBreakdownController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lb75/i;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanInterestRateBreakdownController extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(LoanInterestRateBreakdownController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final LoanInterestRateBreakdownControllerContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public LoanInterestRateBreakdownController(LoanInterestRateBreakdownControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = s.t(this, b.f);
        this.N = w.y0(new aw1.a(24));
        this.O = w.y0(new aw1.a(25));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: b75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanInterestRateBreakdownController f12908b;

            {
                this.f12908b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LoanInterestRateBreakdownController loanInterestRateBreakdownController = this.f12908b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LoanInterestRateBreakdownController.S;
                        int i3 = R$id.navBarBottomSheet_RecyclerView;
                        LoanInterestRateBreakdownController loanInterestRateBreakdownController2 = this.f12908b;
                        return tki.g.a(loanInterestRateBreakdownController2, (h) loanInterestRateBreakdownController2.R.getValue(), v.k((LargeActionButtonDelegate) loanInterestRateBreakdownController2.N.getValue(), (CellDetailsDelegate) loanInterestRateBreakdownController2.O.getValue(), new TextDelegate()), i3, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanInterestRateBreakdownController.S;
                        u45.h hVar = czi.c.o(loanInterestRateBreakdownController.m2()).B;
                        LoanInterestRateBreakdownControllerContract$InputData loanInterestRateBreakdownControllerContract$InputData = loanInterestRateBreakdownController.K;
                        loanInterestRateBreakdownControllerContract$InputData.getClass();
                        return new t(hVar, loanInterestRateBreakdownControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = LoanInterestRateBreakdownController.S;
                        return (h) ((t) loanInterestRateBreakdownController.Q.getValue()).f277220c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: b75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanInterestRateBreakdownController f12908b;

            {
                this.f12908b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LoanInterestRateBreakdownController loanInterestRateBreakdownController = this.f12908b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanInterestRateBreakdownController.S;
                        int i3 = R$id.navBarBottomSheet_RecyclerView;
                        LoanInterestRateBreakdownController loanInterestRateBreakdownController2 = this.f12908b;
                        return tki.g.a(loanInterestRateBreakdownController2, (h) loanInterestRateBreakdownController2.R.getValue(), v.k((LargeActionButtonDelegate) loanInterestRateBreakdownController2.N.getValue(), (CellDetailsDelegate) loanInterestRateBreakdownController2.O.getValue(), new TextDelegate()), i3, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanInterestRateBreakdownController.S;
                        u45.h hVar = czi.c.o(loanInterestRateBreakdownController.m2()).B;
                        LoanInterestRateBreakdownControllerContract$InputData loanInterestRateBreakdownControllerContract$InputData = loanInterestRateBreakdownController.K;
                        loanInterestRateBreakdownControllerContract$InputData.getClass();
                        return new t(hVar, loanInterestRateBreakdownControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = LoanInterestRateBreakdownController.S;
                        return (h) ((t) loanInterestRateBreakdownController.Q.getValue()).f277220c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: b75.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanInterestRateBreakdownController f12908b;

            {
                this.f12908b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LoanInterestRateBreakdownController loanInterestRateBreakdownController = this.f12908b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanInterestRateBreakdownController.S;
                        int i32 = R$id.navBarBottomSheet_RecyclerView;
                        LoanInterestRateBreakdownController loanInterestRateBreakdownController2 = this.f12908b;
                        return tki.g.a(loanInterestRateBreakdownController2, (h) loanInterestRateBreakdownController2.R.getValue(), v.k((LargeActionButtonDelegate) loanInterestRateBreakdownController2.N.getValue(), (CellDetailsDelegate) loanInterestRateBreakdownController2.O.getValue(), new TextDelegate()), i32, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanInterestRateBreakdownController.S;
                        u45.h hVar = czi.c.o(loanInterestRateBreakdownController.m2()).B;
                        LoanInterestRateBreakdownControllerContract$InputData loanInterestRateBreakdownControllerContract$InputData = loanInterestRateBreakdownController.K;
                        loanInterestRateBreakdownControllerContract$InputData.getClass();
                        return new t(hVar, loanInterestRateBreakdownControllerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = LoanInterestRateBreakdownController.S;
                        return (h) ((t) loanInterestRateBreakdownController.Q.getValue()).f277220c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(uiState.f12918a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (b75.h) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d dVarB = rd0.e.b(((LargeActionButtonDelegate) this.N.getValue()).d.f121375b);
        yx4.a aVar = yx4.b.Companion;
        com.revolut.kompot.navigable.a.g2(this, new b75.d(dVarB, aVar, 0), null, new f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new b75.d(rd0.e.b(((CellDetailsDelegate) this.O.getValue()).d), aVar, 1), null, new f(this, null, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.P.getValue();
    }
}
