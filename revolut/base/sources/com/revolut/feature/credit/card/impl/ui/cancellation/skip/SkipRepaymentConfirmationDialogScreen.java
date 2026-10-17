package com.revolut.feature.credit.card.impl.ui.cancellation.skip;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.card.impl.ui.cancellation.checkout.a;
import com.revolut.feature.credit.card.impl.ui.cancellation.skip.SkipRepaymentConfirmationDialogScreen;
import com.revolut.feature.credit.card.impl.ui.cancellation.skip.SkipRepaymentConfirmationDialogScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import iq4.b;
import iq4.c;
import iq4.d;
import java.util.List;
import jm4.a3;
import jm4.p3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/cancellation/skip/SkipRepaymentConfirmationDialogScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/checkout/a;", "Liq4/d;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SkipRepaymentConfirmationDialogScreen extends BaseBottomSheetRecyclerController<a, d> {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(SkipRepaymentConfirmationDialogScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final SkipRepaymentConfirmationDialogScreenContract$InputData Q;
    public final h R;
    public final List S;
    public final Object T;
    public final Object U;

    public SkipRepaymentConfirmationDialogScreen(SkipRepaymentConfirmationDialogScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = s.t(this, b.f);
        final int i = 0;
        final int i2 = 1;
        this.S = v.k(new RowDelegate(null, null, 7), new CellDetailsDelegate());
        this.T = w.y0(new Function0(this) { // from class: iq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SkipRepaymentConfirmationDialogScreen f167797b;

            {
                this.f167797b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                SkipRepaymentConfirmationDialogScreen skipRepaymentConfirmationDialogScreen = this.f167797b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = SkipRepaymentConfirmationDialogScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(skipRepaymentConfirmationDialogScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        SkipRepaymentConfirmationDialogScreenContract$InputData skipRepaymentConfirmationDialogScreenContract$InputData = skipRepaymentConfirmationDialogScreen.Q;
                        skipRepaymentConfirmationDialogScreenContract$InputData.getClass();
                        return new p3(a3Var, skipRepaymentConfirmationDialogScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr2 = SkipRepaymentConfirmationDialogScreen.V;
                        return (e) ((p3) skipRepaymentConfirmationDialogScreen.T.getValue()).f176253b.get();
                }
            }
        });
        this.U = w.y0(new Function0(this) { // from class: iq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SkipRepaymentConfirmationDialogScreen f167797b;

            {
                this.f167797b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                SkipRepaymentConfirmationDialogScreen skipRepaymentConfirmationDialogScreen = this.f167797b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = SkipRepaymentConfirmationDialogScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(skipRepaymentConfirmationDialogScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        SkipRepaymentConfirmationDialogScreenContract$InputData skipRepaymentConfirmationDialogScreenContract$InputData = skipRepaymentConfirmationDialogScreen.Q;
                        skipRepaymentConfirmationDialogScreenContract$InputData.getClass();
                        return new p3(a3Var, skipRepaymentConfirmationDialogScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr2 = SkipRepaymentConfirmationDialogScreen.V;
                        return (e) ((p3) skipRepaymentConfirmationDialogScreen.T.getValue()).f176253b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p3) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (iq4.e) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = V;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.R;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((jii.e) value).f174513b.f), new c(this, null, 0), 3);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((jii.e) value2).f174513b.f58955g), new c(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (iq4.e) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.S;
    }
}
