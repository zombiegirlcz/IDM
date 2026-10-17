package com.revolut.feature.retail.savings.impl.challenge.presentation.tracking;

import aii.q;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ChallengeMediumDelegate;
import com.revolut.core.ui_kit.delegates.ChallengeMediumLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.feature.retail.savings.impl.challenge.presentation.tracking.SavingsChallengeTrackerContract$InputData;
import com.revolut.feature.retail.savings.impl.challenge.presentation.tracking.SavingsChallengeTrackerController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import exe.k;
import hkb.a;
import hkb.c;
import hkb.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import vjb.f;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/challenge/presentation/tracking/SavingsChallengeTrackerController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lhkb/a;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsChallengeTrackerController extends BaseBottomSheetRecyclerController<q, a> {
    public static final /* synthetic */ int V = 0;
    public final SavingsChallengeTrackerContract$InputData Q;
    public final FullScreenStateDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public SavingsChallengeTrackerController(SavingsChallengeTrackerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        ChallengeMediumDelegate challengeMediumDelegate = new ChallengeMediumDelegate();
        ChallengeMediumLoadingDelegate challengeMediumLoadingDelegate = new ChallengeMediumLoadingDelegate();
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.R = fullScreenStateDelegate;
        final int i = 0;
        final int i2 = 1;
        this.S = v.k(fullScreenStateDelegate, new GridBoxDelegate(v.k(challengeMediumDelegate, challengeMediumLoadingDelegate), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14));
        this.T = w.y0(new Function0(this) { // from class: hkb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsChallengeTrackerController f152910b;

            {
                this.f152910b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                SavingsChallengeTrackerController savingsChallengeTrackerController = this.f152910b;
                switch (i3) {
                    case 0:
                        int i5 = SavingsChallengeTrackerController.V;
                        phm.a aVar = (phm.a) ue0.e.j(savingsChallengeTrackerController.m2()).a().get(vjb.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vjb.g.class, " is not found"));
                        }
                        vjb.g gVar = ((vjb.g) aVar2.b()).f;
                        SavingsChallengeTrackerContract$InputData savingsChallengeTrackerContract$InputData = savingsChallengeTrackerController.Q;
                        savingsChallengeTrackerContract$InputData.getClass();
                        return new vjb.f(gVar, savingsChallengeTrackerContract$InputData);
                    default:
                        int i6 = SavingsChallengeTrackerController.V;
                        return (d) ((vjb.f) savingsChallengeTrackerController.T.getValue()).f289692b.get();
                }
            }
        });
        this.U = w.y0(new Function0(this) { // from class: hkb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsChallengeTrackerController f152910b;

            {
                this.f152910b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                SavingsChallengeTrackerController savingsChallengeTrackerController = this.f152910b;
                switch (i3) {
                    case 0:
                        int i5 = SavingsChallengeTrackerController.V;
                        phm.a aVar = (phm.a) ue0.e.j(savingsChallengeTrackerController.m2()).a().get(vjb.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vjb.g.class, " is not found"));
                        }
                        vjb.g gVar = ((vjb.g) aVar2.b()).f;
                        SavingsChallengeTrackerContract$InputData savingsChallengeTrackerContract$InputData = savingsChallengeTrackerController.Q;
                        savingsChallengeTrackerContract$InputData.getClass();
                        return new vjb.f(gVar, savingsChallengeTrackerContract$InputData);
                    default:
                        int i6 = SavingsChallengeTrackerController.V;
                        return (d) ((vjb.f) savingsChallengeTrackerController.T.getValue()).f289692b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (d) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, h3(), new k(2, (d) this.U.getValue(), d.class, "onDescriptionLinkClick", "onDescriptionLinkClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 29), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (d) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
