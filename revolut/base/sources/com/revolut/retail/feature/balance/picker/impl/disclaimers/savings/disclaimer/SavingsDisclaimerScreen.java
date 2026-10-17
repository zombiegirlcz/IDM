package com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.disclaimer;

import a09.a;
import a0l.k;
import a2j.b;
import a2j.d;
import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.disclaimer.SavingsDisclaimerScreen;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.disclaimer.SavingsDisclaimerScreenContract$InputData;
import g2j.f;
import g2j.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/impl/disclaimers/savings/disclaimer/SavingsDisclaimerScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "La2j/b;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsDisclaimerScreen extends BaseBottomSheetRecyclerController<q, b> {
    public static final /* synthetic */ int V = 0;
    public final SavingsDisclaimerScreenContract$InputData Q;
    public final Object R;
    public final Object S;
    public final TextDelegate T;
    public final List U;

    public SavingsDisclaimerScreen(SavingsDisclaimerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: a2j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsDisclaimerScreen f882b;

            {
                this.f882b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SavingsDisclaimerScreen savingsDisclaimerScreen = this.f882b;
                switch (i2) {
                    case 0:
                        int i3 = SavingsDisclaimerScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(savingsDisclaimerScreen.m2()).a().get(f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f.class, " is not found"));
                        }
                        f fVar = ((f) aVar2.b()).J;
                        SavingsDisclaimerScreenContract$InputData savingsDisclaimerScreenContract$InputData = savingsDisclaimerScreen.Q;
                        savingsDisclaimerScreenContract$InputData.getClass();
                        return new l(fVar, savingsDisclaimerScreenContract$InputData);
                    default:
                        int i5 = SavingsDisclaimerScreen.V;
                        return (d) ((l) savingsDisclaimerScreen.R.getValue()).f140118b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: a2j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsDisclaimerScreen f882b;

            {
                this.f882b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SavingsDisclaimerScreen savingsDisclaimerScreen = this.f882b;
                switch (i22) {
                    case 0:
                        int i3 = SavingsDisclaimerScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(savingsDisclaimerScreen.m2()).a().get(f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f.class, " is not found"));
                        }
                        f fVar = ((f) aVar2.b()).J;
                        SavingsDisclaimerScreenContract$InputData savingsDisclaimerScreenContract$InputData = savingsDisclaimerScreen.Q;
                        savingsDisclaimerScreenContract$InputData.getClass();
                        return new l(fVar, savingsDisclaimerScreenContract$InputData);
                    default:
                        int i5 = SavingsDisclaimerScreen.V;
                        return (d) ((l) savingsDisclaimerScreen.R.getValue()).f140118b.get();
                }
            }
        });
        TextDelegate textDelegate = new TextDelegate();
        this.T = textDelegate;
        this.U = u.c(textDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(w.a0(this.T.d, new a(17))), new k(this, null, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (d) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getQ() {
        return this.U;
    }
}
