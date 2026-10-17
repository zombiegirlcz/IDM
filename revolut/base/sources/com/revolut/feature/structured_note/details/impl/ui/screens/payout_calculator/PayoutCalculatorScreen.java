package com.revolut.feature.structured_note.details.impl.ui.screens.payout_calculator;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.structured_note.details.impl.R$string;
import com.revolut.feature.structured_note.details.impl.ui.screens.payout_calculator.PayoutCalculatorScreen;
import com.revolut.feature.structured_note.details.impl.ui.screens.payout_calculator.PayoutCalculatorScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import o4e.g;
import o4e.l;
import p5e.b;
import p5e.c;
import p5e.d;
import p5e.f;
import p5e.i;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/structured_note/details/impl/ui/screens/payout_calculator/PayoutCalculatorScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lp5e/f;", "feature_structured_note_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayoutCalculatorScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PayoutCalculatorScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final PayoutCalculatorScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final InputSliderDelegate P;
    public final LargeActionButtonDelegate Q;
    public final Object R;

    public PayoutCalculatorScreen(PayoutCalculatorScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_bottom_sheet_list;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: p5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayoutCalculatorScreen f233101b;

            {
                this.f233101b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PayoutCalculatorScreen payoutCalculatorScreen = this.f233101b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayoutCalculatorScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(payoutCalculatorScreen.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).o;
                        PayoutCalculatorScreenContract$InputData payoutCalculatorScreenContract$InputData = payoutCalculatorScreen.K;
                        payoutCalculatorScreenContract$InputData.getClass();
                        return new o4e.g(lVar, payoutCalculatorScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PayoutCalculatorScreen.S;
                        return (i) ((o4e.g) payoutCalculatorScreen.N.getValue()).f222244b.get();
                    default:
                        KProperty[] kPropertyArr3 = PayoutCalculatorScreen.S;
                        PayoutCalculatorScreen payoutCalculatorScreen2 = this.f233101b;
                        return dli.f.a(payoutCalculatorScreen2, (i) payoutCalculatorScreen2.O.getValue(), v.k(payoutCalculatorScreen2.P, payoutCalculatorScreen2.Q), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: p5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayoutCalculatorScreen f233101b;

            {
                this.f233101b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PayoutCalculatorScreen payoutCalculatorScreen = this.f233101b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayoutCalculatorScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(payoutCalculatorScreen.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).o;
                        PayoutCalculatorScreenContract$InputData payoutCalculatorScreenContract$InputData = payoutCalculatorScreen.K;
                        payoutCalculatorScreenContract$InputData.getClass();
                        return new o4e.g(lVar, payoutCalculatorScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PayoutCalculatorScreen.S;
                        return (i) ((o4e.g) payoutCalculatorScreen.N.getValue()).f222244b.get();
                    default:
                        KProperty[] kPropertyArr3 = PayoutCalculatorScreen.S;
                        PayoutCalculatorScreen payoutCalculatorScreen2 = this.f233101b;
                        return dli.f.a(payoutCalculatorScreen2, (i) payoutCalculatorScreen2.O.getValue(), v.k(payoutCalculatorScreen2.P, payoutCalculatorScreen2.Q), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new InputSliderDelegate();
        this.Q = new LargeActionButtonDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: p5e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayoutCalculatorScreen f233101b;

            {
                this.f233101b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PayoutCalculatorScreen payoutCalculatorScreen = this.f233101b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayoutCalculatorScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(payoutCalculatorScreen.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).o;
                        PayoutCalculatorScreenContract$InputData payoutCalculatorScreenContract$InputData = payoutCalculatorScreen.K;
                        payoutCalculatorScreenContract$InputData.getClass();
                        return new o4e.g(lVar, payoutCalculatorScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PayoutCalculatorScreen.S;
                        return (i) ((o4e.g) payoutCalculatorScreen.N.getValue()).f222244b.get();
                    default:
                        KProperty[] kPropertyArr3 = PayoutCalculatorScreen.S;
                        PayoutCalculatorScreen payoutCalculatorScreen2 = this.f233101b;
                        return dli.f.a(payoutCalculatorScreen2, (i) payoutCalculatorScreen2.O.getValue(), v.k(payoutCalculatorScreen2.P, payoutCalculatorScreen2.Q), R$id.bottomSheetList_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.f) value).f174519b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.trading_structured_notes_payout_calculator_title, null, null, 14), new TextLocalisedClause(R$string.trading_structured_notes_payout_calculator_description_worst_performing, null, null, 14), null, null, false, 28));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.P.f52559c), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d.f121375b), new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
