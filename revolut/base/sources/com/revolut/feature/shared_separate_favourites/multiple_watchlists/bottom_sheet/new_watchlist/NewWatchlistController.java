package com.revolut.feature.shared_separate_favourites.multiple_watchlists.bottom_sheet.new_watchlist;

import android.view.View;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.bottom_sheet.new_watchlist.NewWatchlistController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import qgd.c;
import qgd.d;
import qgd.e;
import qgd.f;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/multiple_watchlists/bottom_sheet/new_watchlist/NewWatchlistController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lqgd/e;", "Lqgd/c;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewWatchlistController extends BaseBottomSheetRecyclerController<e, c> {
    public static final /* synthetic */ int V = 0;
    public final d Q;
    public final Object R;
    public final Object S;
    public final InputTextDelegate T;
    public final List U;

    public NewWatchlistController(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: qgd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewWatchlistController f245777b;

            {
                this.f245777b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                NewWatchlistController newWatchlistController = this.f245777b;
                switch (i2) {
                    case 0:
                        int i3 = NewWatchlistController.V;
                        phm.a aVar = (phm.a) ue0.e.j(newWatchlistController.m2()).a().get(vgd.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vgd.b.class, " is not found"));
                        }
                        vgd.b bVar = ((vgd.b) aVar2.b()).e;
                        d dVar = newWatchlistController.Q;
                        dVar.getClass();
                        return new vgd.d(bVar, dVar);
                    default:
                        int i5 = NewWatchlistController.V;
                        return (f) ((vgd.d) newWatchlistController.R.getValue()).f288848b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: qgd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewWatchlistController f245777b;

            {
                this.f245777b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                NewWatchlistController newWatchlistController = this.f245777b;
                switch (i22) {
                    case 0:
                        int i3 = NewWatchlistController.V;
                        phm.a aVar = (phm.a) ue0.e.j(newWatchlistController.m2()).a().get(vgd.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vgd.b.class, " is not found"));
                        }
                        vgd.b bVar = ((vgd.b) aVar2.b()).e;
                        d dVar = newWatchlistController.Q;
                        dVar.getClass();
                        return new vgd.d(bVar, dVar);
                    default:
                        int i5 = NewWatchlistController.V;
                        return (f) ((vgd.d) newWatchlistController.R.getValue()).f288848b.get();
                }
            }
        });
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.T = inputTextDelegate;
        this.U = u.c(inputTextDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (vgd.d) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (f) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        r rVarDebounce = this.T.e.f121375b.debounce(200L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        ViewController.P2(this, rd0.e.b(rVarDebounce), new qgd.b(this, null), 3);
        ViewController.P2(this, e3(), new qg4.d(this, null, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
