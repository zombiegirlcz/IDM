package com.revolut.feature.credit.card.impl.ui.credit_card_limit;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.card.impl.ui.credit_card_limit.CreditCardLimitDialogScreen;
import com.revolut.feature.credit.card.impl.ui.credit_card_limit.CreditCardLimitDialogScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jm4.a3;
import jm4.l1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pq4.b;
import pq4.c;
import pq4.d;
import pq4.g;
import pq4.h;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/credit_card_limit/CreditCardLimitDialogScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lpq4/g;", "Lpq4/d;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardLimitDialogScreen extends BaseBottomSheetRecyclerController<g, d> {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CreditCardLimitDialogScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final CreditCardLimitDialogScreenContract$InputData Q;
    public final RowDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public CreditCardLimitDialogScreen(CreditCardLimitDialogScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        s.t(this, b.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        this.S = u.c(rowDelegate);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: pq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardLimitDialogScreen f238683b;

            {
                this.f238683b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardLimitDialogScreen creditCardLimitDialogScreen = this.f238683b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardLimitDialogScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardLimitDialogScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardLimitDialogScreenContract$InputData creditCardLimitDialogScreenContract$InputData = creditCardLimitDialogScreen.Q;
                        creditCardLimitDialogScreenContract$InputData.getClass();
                        return new l1(a3Var, creditCardLimitDialogScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr2 = CreditCardLimitDialogScreen.V;
                        return (h) ((l1) creditCardLimitDialogScreen.T.getValue()).f176183b.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: pq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardLimitDialogScreen f238683b;

            {
                this.f238683b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardLimitDialogScreen creditCardLimitDialogScreen = this.f238683b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardLimitDialogScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardLimitDialogScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardLimitDialogScreenContract$InputData creditCardLimitDialogScreenContract$InputData = creditCardLimitDialogScreen.Q;
                        creditCardLimitDialogScreenContract$InputData.getClass();
                        return new l1(a3Var, creditCardLimitDialogScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr2 = CreditCardLimitDialogScreen.V;
                        return (h) ((l1) creditCardLimitDialogScreen.T.getValue()).f176183b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l1) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (h) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.f53218h), new c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (h) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
