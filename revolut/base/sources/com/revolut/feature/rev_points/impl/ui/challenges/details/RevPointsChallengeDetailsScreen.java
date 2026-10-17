package com.revolut.feature.rev_points.impl.ui.challenges.details;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.feature.rev_points.impl.ui.challenges.details.RevPointsChallengeDetailsScreen;
import com.revolut.feature.rev_points.impl.ui.challenges.details.RevPointsChallengeDetailsScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import dcf.v0;
import dob.c;
import dzb.b;
import dzb.e;
import dzb.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zhm.v;
import zxb.g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/challenges/details/RevPointsChallengeDetailsScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Ldzb/e;", "Ldzb/b;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsChallengeDetailsScreen extends BaseBottomSheetRecyclerController<e, b> {
    public static final /* synthetic */ int U = 0;
    public final RevPointsChallengeDetailsScreenContract$InputData Q;
    public final Object R;
    public final Object S;
    public final List T;

    public RevPointsChallengeDetailsScreen(RevPointsChallengeDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: dzb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsChallengeDetailsScreen f121299b;

            {
                this.f121299b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsChallengeDetailsScreen revPointsChallengeDetailsScreen = this.f121299b;
                switch (i2) {
                    case 0:
                        int i3 = RevPointsChallengeDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsChallengeDetailsScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        RevPointsChallengeDetailsScreenContract$InputData revPointsChallengeDetailsScreenContract$InputData = revPointsChallengeDetailsScreen.Q;
                        revPointsChallengeDetailsScreenContract$InputData.getClass();
                        return new zxb.g(eVar, revPointsChallengeDetailsScreenContract$InputData);
                    default:
                        int i5 = RevPointsChallengeDetailsScreen.U;
                        return (i) ((zxb.g) revPointsChallengeDetailsScreen.R.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: dzb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsChallengeDetailsScreen f121299b;

            {
                this.f121299b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsChallengeDetailsScreen revPointsChallengeDetailsScreen = this.f121299b;
                switch (i22) {
                    case 0:
                        int i3 = RevPointsChallengeDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsChallengeDetailsScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        RevPointsChallengeDetailsScreenContract$InputData revPointsChallengeDetailsScreenContract$InputData = revPointsChallengeDetailsScreen.Q;
                        revPointsChallengeDetailsScreenContract$InputData.getClass();
                        return new zxb.g(eVar, revPointsChallengeDetailsScreenContract$InputData);
                    default:
                        int i5 = RevPointsChallengeDetailsScreen.U;
                        return (i) ((zxb.g) revPointsChallengeDetailsScreen.R.getValue()).d.get();
                }
            }
        });
        this.T = v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (i) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new v0(this, null, 26), 3);
        ViewController.P2(this, h3(), new c(this, null, 26), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (i) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
