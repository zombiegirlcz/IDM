package com.revolut.feature.freelancer.impl.ui.vat_reminder.dialog.accounting_period;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.dialog.accounting_period.FreelancerVatReminderAccountingPeriodPickerScreen;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.dialog.accounting_period.FreelancerVatReminderAccountingPeriodPickerScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import xki.e;
import z47.c;
import z47.d;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/vat_reminder/dialog/accounting_period/FreelancerVatReminderAccountingPeriodPickerScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lz47/c;", "Lcli/k;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerVatReminderAccountingPeriodPickerScreen extends BaseBottomSheetRecyclerController<c, k> {
    public static final /* synthetic */ int V = 0;
    public final FreelancerVatReminderAccountingPeriodPickerScreenContract$InputData Q;
    public final SingleChoiceDelegate R;
    public final Object S;
    public final Object T;
    public final List U;

    public FreelancerVatReminderAccountingPeriodPickerScreen(FreelancerVatReminderAccountingPeriodPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        SingleChoiceDelegate singleChoiceDelegate = new SingleChoiceDelegate();
        this.R = singleChoiceDelegate;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: z47.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerVatReminderAccountingPeriodPickerScreen f319334b;

            {
                this.f319334b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerVatReminderAccountingPeriodPickerScreen freelancerVatReminderAccountingPeriodPickerScreen = this.f319334b;
                switch (i2) {
                    case 0:
                        int i3 = FreelancerVatReminderAccountingPeriodPickerScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerVatReminderAccountingPeriodPickerScreen.m2()).a().get(bt6.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bt6.b.class, " is not found"));
                        }
                        bt6.b bVar = ((bt6.b) aVar2.b()).f18307t;
                        FreelancerVatReminderAccountingPeriodPickerScreenContract$InputData freelancerVatReminderAccountingPeriodPickerScreenContract$InputData = freelancerVatReminderAccountingPeriodPickerScreen.Q;
                        freelancerVatReminderAccountingPeriodPickerScreenContract$InputData.getClass();
                        return new bt6.e(bVar, freelancerVatReminderAccountingPeriodPickerScreenContract$InputData);
                    default:
                        int i5 = FreelancerVatReminderAccountingPeriodPickerScreen.V;
                        return (d) ((bt6.e) freelancerVatReminderAccountingPeriodPickerScreen.S.getValue()).f18327c.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: z47.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerVatReminderAccountingPeriodPickerScreen f319334b;

            {
                this.f319334b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerVatReminderAccountingPeriodPickerScreen freelancerVatReminderAccountingPeriodPickerScreen = this.f319334b;
                switch (i22) {
                    case 0:
                        int i3 = FreelancerVatReminderAccountingPeriodPickerScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerVatReminderAccountingPeriodPickerScreen.m2()).a().get(bt6.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bt6.b.class, " is not found"));
                        }
                        bt6.b bVar = ((bt6.b) aVar2.b()).f18307t;
                        FreelancerVatReminderAccountingPeriodPickerScreenContract$InputData freelancerVatReminderAccountingPeriodPickerScreenContract$InputData = freelancerVatReminderAccountingPeriodPickerScreen.Q;
                        freelancerVatReminderAccountingPeriodPickerScreenContract$InputData.getClass();
                        return new bt6.e(bVar, freelancerVatReminderAccountingPeriodPickerScreenContract$InputData);
                    default:
                        int i5 = FreelancerVatReminderAccountingPeriodPickerScreen.V;
                        return (d) ((bt6.e) freelancerVatReminderAccountingPeriodPickerScreen.S.getValue()).f18327c.get();
                }
            }
        });
        this.U = u.c(singleChoiceDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (bt6.e) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b e3() {
        return (d) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.p()), new z47.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (d) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
