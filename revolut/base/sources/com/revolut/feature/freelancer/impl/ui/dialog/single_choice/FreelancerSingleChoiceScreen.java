package com.revolut.feature.freelancer.impl.ui.dialog.single_choice;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreen;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mw6.e;
import mw6.f;
import te0.w;
import us6.a1;
import us6.q;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/dialog/single_choice/FreelancerSingleChoiceScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lmw6/e;", "Lcli/k;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerSingleChoiceScreen extends BaseBottomSheetRecyclerController<e, k> {
    public static final /* synthetic */ int V = 0;
    public final FreelancerSingleChoiceScreenContract$InputData Q;
    public final SingleChoiceDelegate R;
    public final Object S;
    public final Object T;
    public final List U;

    public FreelancerSingleChoiceScreen(FreelancerSingleChoiceScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        SingleChoiceDelegate singleChoiceDelegate = new SingleChoiceDelegate();
        this.R = singleChoiceDelegate;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: mw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerSingleChoiceScreen f209400b;

            {
                this.f209400b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerSingleChoiceScreen freelancerSingleChoiceScreen = this.f209400b;
                switch (i2) {
                    case 0:
                        int i3 = FreelancerSingleChoiceScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerSingleChoiceScreen.m2()).a().get(q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
                        }
                        q qVar = ((q) aVar2.b()).Q;
                        FreelancerSingleChoiceScreenContract$InputData freelancerSingleChoiceScreenContract$InputData = freelancerSingleChoiceScreen.Q;
                        freelancerSingleChoiceScreenContract$InputData.getClass();
                        return new a1(qVar, freelancerSingleChoiceScreenContract$InputData);
                    default:
                        int i5 = FreelancerSingleChoiceScreen.V;
                        return (f) ((a1) freelancerSingleChoiceScreen.S.getValue()).f282446b.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: mw6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerSingleChoiceScreen f209400b;

            {
                this.f209400b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerSingleChoiceScreen freelancerSingleChoiceScreen = this.f209400b;
                switch (i22) {
                    case 0:
                        int i3 = FreelancerSingleChoiceScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerSingleChoiceScreen.m2()).a().get(q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", q.class, " is not found"));
                        }
                        q qVar = ((q) aVar2.b()).Q;
                        FreelancerSingleChoiceScreenContract$InputData freelancerSingleChoiceScreenContract$InputData = freelancerSingleChoiceScreen.Q;
                        freelancerSingleChoiceScreenContract$InputData.getClass();
                        return new a1(qVar, freelancerSingleChoiceScreenContract$InputData);
                    default:
                        int i5 = FreelancerSingleChoiceScreen.V;
                        return (f) ((a1) freelancerSingleChoiceScreen.S.getValue()).f282446b.get();
                }
            }
        });
        this.U = u.c(singleChoiceDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (a1) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, i3(), new mkk.q(this, null, 27), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.p()), null, new mw6.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
