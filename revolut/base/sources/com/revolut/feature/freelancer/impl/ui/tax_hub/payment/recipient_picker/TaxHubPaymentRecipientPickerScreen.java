package com.revolut.feature.freelancer.impl.ui.tax_hub.payment.recipient_picker;

import android.view.View;
import bt6.n;
import bt6.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.recipient_picker.TaxHubPaymentRecipientPickerScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.recipient_picker.TaxHubPaymentRecipientPickerScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p0l.d;
import p37.c;
import p37.f;
import p37.g;
import pki.b;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/recipient_picker/TaxHubPaymentRecipientPickerScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lp37/f;", "Lp37/c;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxHubPaymentRecipientPickerScreen extends BaseBottomSheetRecyclerController<f, c> {
    public static final /* synthetic */ int V = 0;
    public final TaxHubPaymentRecipientPickerScreenContract$InputData Q;
    public final RowDelegate R;
    public final Object S;
    public final Object T;
    public final List U;

    public TaxHubPaymentRecipientPickerScreen(TaxHubPaymentRecipientPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: p37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubPaymentRecipientPickerScreen f232694b;

            {
                this.f232694b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TaxHubPaymentRecipientPickerScreen taxHubPaymentRecipientPickerScreen = this.f232694b;
                switch (i2) {
                    case 0:
                        int i3 = TaxHubPaymentRecipientPickerScreen.V;
                        qji.b bVarU2 = taxHubPaymentRecipientPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.payment.recipient_picker.di.TaxHubPaymentRecipientPickerScreenInjector");
                        n nVar = (n) bVarU2;
                        bt6.b bVar = nVar.f18367b;
                        n nVar2 = nVar.f18368c;
                        TaxHubPaymentRecipientPickerScreenContract$InputData taxHubPaymentRecipientPickerScreenContract$InputData = taxHubPaymentRecipientPickerScreen.Q;
                        taxHubPaymentRecipientPickerScreenContract$InputData.getClass();
                        return new o(bVar, nVar2, taxHubPaymentRecipientPickerScreenContract$InputData);
                    default:
                        int i5 = TaxHubPaymentRecipientPickerScreen.V;
                        return (g) ((o) taxHubPaymentRecipientPickerScreen.S.getValue()).f18371c.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: p37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubPaymentRecipientPickerScreen f232694b;

            {
                this.f232694b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TaxHubPaymentRecipientPickerScreen taxHubPaymentRecipientPickerScreen = this.f232694b;
                switch (i22) {
                    case 0:
                        int i3 = TaxHubPaymentRecipientPickerScreen.V;
                        qji.b bVarU2 = taxHubPaymentRecipientPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.payment.recipient_picker.di.TaxHubPaymentRecipientPickerScreenInjector");
                        n nVar = (n) bVarU2;
                        bt6.b bVar = nVar.f18367b;
                        n nVar2 = nVar.f18368c;
                        TaxHubPaymentRecipientPickerScreenContract$InputData taxHubPaymentRecipientPickerScreenContract$InputData = taxHubPaymentRecipientPickerScreen.Q;
                        taxHubPaymentRecipientPickerScreenContract$InputData.getClass();
                        return new o(bVar, nVar2, taxHubPaymentRecipientPickerScreenContract$InputData);
                    default:
                        int i5 = TaxHubPaymentRecipientPickerScreen.V;
                        return (g) ((o) taxHubPaymentRecipientPickerScreen.S.getValue()).f18371c.get();
                }
            }
        });
        this.U = v.k(rowDelegate, new RowLoadingDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (g) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new d(this, null, 4), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53218h), new p37.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (g) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
