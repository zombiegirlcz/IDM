package com.revolut.feature.freelancer.impl.ui.dialog.date_picker;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.feature.freelancer.impl.ui.dialog.date_picker.FreelancerDatePickerScreen;
import com.revolut.feature.freelancer.impl.ui.dialog.date_picker.FreelancerDatePickerScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kw6.b;
import kw6.c;
import te0.w;
import us6.q;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/dialog/date_picker/FreelancerDatePickerScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lkw6/b;", "Lcli/k;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerDatePickerScreen extends BaseBottomSheetRecyclerController<b, k> {
    public static final /* synthetic */ int V = 0;
    public final FreelancerDatePickerScreenContract$InputData Q;
    public final DatePickerDelegate R;
    public final Object S;
    public final Object T;
    public final List U;

    public FreelancerDatePickerScreen(FreelancerDatePickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        DatePickerDelegate datePickerDelegate = new DatePickerDelegate();
        this.R = datePickerDelegate;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: kw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerDatePickerScreen f190294b;

            {
                this.f190294b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerDatePickerScreen freelancerDatePickerScreen = this.f190294b;
                switch (i2) {
                    case 0:
                        int i3 = FreelancerDatePickerScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerDatePickerScreen.m2()).a().get(q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
                        }
                        q qVar = ((q) aVar2.b()).Q;
                        FreelancerDatePickerScreenContract$InputData freelancerDatePickerScreenContract$InputData = freelancerDatePickerScreen.Q;
                        freelancerDatePickerScreenContract$InputData.getClass();
                        return new us6.w(qVar, freelancerDatePickerScreenContract$InputData);
                    default:
                        int i5 = FreelancerDatePickerScreen.V;
                        return (c) ((us6.w) freelancerDatePickerScreen.S.getValue()).f282783b.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: kw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerDatePickerScreen f190294b;

            {
                this.f190294b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerDatePickerScreen freelancerDatePickerScreen = this.f190294b;
                switch (i22) {
                    case 0:
                        int i3 = FreelancerDatePickerScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerDatePickerScreen.m2()).a().get(q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
                        }
                        q qVar = ((q) aVar2.b()).Q;
                        FreelancerDatePickerScreenContract$InputData freelancerDatePickerScreenContract$InputData = freelancerDatePickerScreen.Q;
                        freelancerDatePickerScreenContract$InputData.getClass();
                        return new us6.w(qVar, freelancerDatePickerScreenContract$InputData);
                    default:
                        int i5 = FreelancerDatePickerScreen.V;
                        return (c) ((us6.w) freelancerDatePickerScreen.S.getValue()).f282783b.get();
                }
            }
        });
        this.U = u.c(datePickerDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (us6.w) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.f52176c.f121375b), new jl6.b(2, (c) this.T.getValue(), c.class, "onDateSelected", "onDateSelected(Lcom/revolut/core/ui_kit/delegates/DatePickerDelegate$ClickData;)V", 4, 14), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.U;
    }
}
