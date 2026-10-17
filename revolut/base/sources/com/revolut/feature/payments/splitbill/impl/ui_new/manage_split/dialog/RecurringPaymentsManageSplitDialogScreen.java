package com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog;

import android.view.View;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog.RecurringPaymentsManageSplitDialogScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import wrj.m;
import x1a.c;
import x1a.d;
import x1a.f;
import x1a.g;
import xki.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/manage_split/dialog/RecurringPaymentsManageSplitDialogScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetController;", "Lx1a/c;", "Lcli/w;", "Lx1a/d;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecurringPaymentsManageSplitDialogScreen extends BaseBottomSheetController<c> implements w {
    public static final /* synthetic */ int Q = 0;
    public final Object N;
    public final Object O;
    public final Object P;

    public RecurringPaymentsManageSplitDialogScreen(RecurringPaymentsManageSplitDialogContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.N = te0.w.y0(new Function0(this) { // from class: x1a.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecurringPaymentsManageSplitDialogScreen f302359b;

            {
                this.f302359b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RecurringPaymentsManageSplitDialogScreen recurringPaymentsManageSplitDialogScreen = this.f302359b;
                switch (i2) {
                    case 0:
                        int i3 = RecurringPaymentsManageSplitDialogScreen.Q;
                        return n14.e.a(recurringPaymentsManageSplitDialogScreen, (g) recurringPaymentsManageSplitDialogScreen.O.getValue());
                    default:
                        int i5 = RecurringPaymentsManageSplitDialogScreen.Q;
                        return (g) ((j1a.b) recurringPaymentsManageSplitDialogScreen.P.getValue()).f170288b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: x1a.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecurringPaymentsManageSplitDialogScreen f302359b;

            {
                this.f302359b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RecurringPaymentsManageSplitDialogScreen recurringPaymentsManageSplitDialogScreen = this.f302359b;
                switch (i22) {
                    case 0:
                        int i3 = RecurringPaymentsManageSplitDialogScreen.Q;
                        return n14.e.a(recurringPaymentsManageSplitDialogScreen, (g) recurringPaymentsManageSplitDialogScreen.O.getValue());
                    default:
                        int i5 = RecurringPaymentsManageSplitDialogScreen.Q;
                        return (g) ((j1a.b) recurringPaymentsManageSplitDialogScreen.P.getValue()).f170288b.get();
                }
            }
        });
        this.P = te0.w.y0(new m(this, inputData, 12));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        j3(uiState.f302357a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j1a.b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new f(this, null, 0), 3);
        ViewController.P2(this, f3(), new f(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.N.getValue();
    }
}
