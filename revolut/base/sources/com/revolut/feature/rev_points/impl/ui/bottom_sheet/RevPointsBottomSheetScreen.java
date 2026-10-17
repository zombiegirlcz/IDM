package com.revolut.feature.rev_points.impl.ui.bottom_sheet;

import aii.q;
import android.view.View;
import cii.a;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.impl.ui.bottom_sheet.RevPointsBottomSheetScreen;
import com.revolut.feature.rev_points.impl.ui.bottom_sheet.RevPointsBottomSheetScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import zhm.v;
import zxb.f;
import zyb.b;
import zyb.c;
import zyb.d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/bottom_sheet/RevPointsBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lzyb/d;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsBottomSheetScreen extends BaseBottomSheetRecyclerController<q, d> {
    public static final /* synthetic */ int V = 0;
    public final RevPointsBottomSheetScreenContract$InputData Q;
    public final RowDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public RevPointsBottomSheetScreen(RevPointsBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        final int i = 0;
        final int i2 = 1;
        this.S = v.k(rowDelegate, new RowLoadingDelegate());
        this.T = w.y0(new Function0(this) { // from class: zyb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsBottomSheetScreen f326399b;

            {
                this.f326399b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                RevPointsBottomSheetScreen revPointsBottomSheetScreen = this.f326399b;
                switch (i3) {
                    case 0:
                        int i5 = RevPointsBottomSheetScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsBottomSheetScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        RevPointsBottomSheetScreenContract$InputData revPointsBottomSheetScreenContract$InputData = revPointsBottomSheetScreen.Q;
                        revPointsBottomSheetScreenContract$InputData.getClass();
                        return new zxb.f(eVar, revPointsBottomSheetScreenContract$InputData);
                    default:
                        int i6 = RevPointsBottomSheetScreen.V;
                        return (e) ((zxb.f) revPointsBottomSheetScreen.T.getValue()).f326143c.get();
                }
            }
        });
        this.U = w.y0(new Function0(this) { // from class: zyb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsBottomSheetScreen f326399b;

            {
                this.f326399b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                RevPointsBottomSheetScreen revPointsBottomSheetScreen = this.f326399b;
                switch (i3) {
                    case 0:
                        int i5 = RevPointsBottomSheetScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsBottomSheetScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        RevPointsBottomSheetScreenContract$InputData revPointsBottomSheetScreenContract$InputData = revPointsBottomSheetScreen.Q;
                        revPointsBottomSheetScreenContract$InputData.getClass();
                        return new zxb.f(eVar, revPointsBottomSheetScreenContract$InputData);
                    default:
                        int i6 = RevPointsBottomSheetScreen.V;
                        return (e) ((zxb.f) revPointsBottomSheetScreen.T.getValue()).f326143c.get();
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

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        j3(new a(new lw0.a(new TextLocalisedClause(R$string.rev_points_bottom_sheet_title, null, null, 14), null, null, null, false, 30), null));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, e3(), new b(this, continuation, 0), 3);
        ViewController.P2(this, f3(), new b(this, continuation, 1), 3);
        ViewController.P2(this, d3(), new b(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53220l), new c(this, null), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zyb.e R2() {
        return (zyb.e) this.U.getValue();
    }
}
