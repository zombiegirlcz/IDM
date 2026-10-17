package com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.selector;

import android.view.View;
import c2j.b;
import c2j.c;
import c2j.d;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.selector.SavingsSelectorScreen;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.selector.SavingsSelectorScreenContract$InputData;
import g2j.f;
import g2j.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/impl/disclaimers/savings/selector/SavingsSelectorScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lc2j/c;", "Lc2j/b;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsSelectorScreen extends BaseBottomSheetRecyclerController<c, b> {
    public static final /* synthetic */ int V = 0;
    public final SavingsSelectorScreenContract$InputData Q;
    public final Object R;
    public final Object S;
    public final RowDelegate T;
    public final List U;

    public SavingsSelectorScreen(SavingsSelectorScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: c2j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsSelectorScreen f20817b;

            {
                this.f20817b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SavingsSelectorScreen savingsSelectorScreen = this.f20817b;
                switch (i2) {
                    case 0:
                        int i3 = SavingsSelectorScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(savingsSelectorScreen.m2()).a().get(f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f.class, " is not found"));
                        }
                        f fVar = ((f) aVar2.b()).J;
                        SavingsSelectorScreenContract$InputData savingsSelectorScreenContract$InputData = savingsSelectorScreen.Q;
                        savingsSelectorScreenContract$InputData.getClass();
                        return new n(fVar, savingsSelectorScreenContract$InputData);
                    default:
                        int i5 = SavingsSelectorScreen.V;
                        return (d) ((n) savingsSelectorScreen.R.getValue()).f140122b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: c2j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsSelectorScreen f20817b;

            {
                this.f20817b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SavingsSelectorScreen savingsSelectorScreen = this.f20817b;
                switch (i22) {
                    case 0:
                        int i3 = SavingsSelectorScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(savingsSelectorScreen.m2()).a().get(f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f.class, " is not found"));
                        }
                        f fVar = ((f) aVar2.b()).J;
                        SavingsSelectorScreenContract$InputData savingsSelectorScreenContract$InputData = savingsSelectorScreen.Q;
                        savingsSelectorScreenContract$InputData.getClass();
                        return new n(fVar, savingsSelectorScreenContract$InputData);
                    default:
                        int i5 = SavingsSelectorScreen.V;
                        return (d) ((n) savingsSelectorScreen.R.getValue()).f140122b.get();
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.T = rowDelegate;
        this.U = u.c(rowDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.R.getValue();
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
        ViewController.P2(this, rd0.e.b(w.a0(this.T.f53218h, new c2d.n(24))), new c1i.f(this, (Continuation) null, 3), 3);
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
