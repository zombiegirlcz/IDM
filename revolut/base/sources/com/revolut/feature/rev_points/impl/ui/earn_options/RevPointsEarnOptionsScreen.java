package com.revolut.feature.rev_points.impl.ui.earn_options;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.api.navigation.RevPointsEarnOptionsScreenApi$InputData;
import com.revolut.feature.rev_points.impl.ui.earn_options.RevPointsEarnOptionsScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kzb.c;
import kzb.d;
import kzb.f;
import kzb.g;
import pd.b;
import te0.w;
import xki.e;
import zhm.v;
import zxb.i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/earn_options/RevPointsEarnOptionsScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lkzb/f;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsEarnOptionsScreen extends BaseBottomSheetRecyclerController<q, f> {
    public static final /* synthetic */ int W = 0;
    public final RevPointsEarnOptionsScreenApi$InputData Q;
    public final Object R;
    public final Object S;
    public final FullScreenStateDelegate T;
    public final RowDelegate U;
    public final List V;

    public RevPointsEarnOptionsScreen(RevPointsEarnOptionsScreenApi$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: kzb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsEarnOptionsScreen f191085b;

            {
                this.f191085b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsEarnOptionsScreen revPointsEarnOptionsScreen = this.f191085b;
                switch (i2) {
                    case 0:
                        int i3 = RevPointsEarnOptionsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsEarnOptionsScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        RevPointsEarnOptionsScreenApi$InputData revPointsEarnOptionsScreenApi$InputData = revPointsEarnOptionsScreen.Q;
                        revPointsEarnOptionsScreenApi$InputData.getClass();
                        return new zxb.i(eVar, revPointsEarnOptionsScreenApi$InputData);
                    default:
                        int i5 = RevPointsEarnOptionsScreen.W;
                        return (g) ((zxb.i) revPointsEarnOptionsScreen.R.getValue()).f326164c.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: kzb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsEarnOptionsScreen f191085b;

            {
                this.f191085b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsEarnOptionsScreen revPointsEarnOptionsScreen = this.f191085b;
                switch (i22) {
                    case 0:
                        int i3 = RevPointsEarnOptionsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsEarnOptionsScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        RevPointsEarnOptionsScreenApi$InputData revPointsEarnOptionsScreenApi$InputData = revPointsEarnOptionsScreen.Q;
                        revPointsEarnOptionsScreenApi$InputData.getClass();
                        return new zxb.i(eVar, revPointsEarnOptionsScreenApi$InputData);
                    default:
                        int i5 = RevPointsEarnOptionsScreen.W;
                        return (g) ((zxb.i) revPointsEarnOptionsScreen.R.getValue()).f326164c.get();
                }
            }
        });
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.T = fullScreenStateDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.U = rowDelegate;
        this.V = v.k(fullScreenStateDelegate, new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), rowDelegate, new RowLoadingDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        b.p(view, new TextLocalisedClause(R$string.rev_points_earn_options_bottom_sheet_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(this.T.f52371h.f121375b), new kzb.b(this, null), 3);
        ViewController.P2(this, e3(), new c(this, continuation, 0), 3);
        ViewController.P2(this, f3(), new c(this, continuation, 1), 3);
        ViewController.P2(this, h3(), new c(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.U.f53218h), new d(this, null), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getV() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.S.getValue();
    }
}
