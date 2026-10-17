package com.revolut.feature.wealth.account_closure.impl.ui.screens.review_closure_conditions;

import android.view.View;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xfj.a;
import xki.e;
import xug.g;
import xug.h;
import xug.m;
import xug.n;
import xug.o;
import xug.q;
import zhm.u;
import ztg.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/screens/review_closure_conditions/ReviewClosureConditionsBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lxug/m;", "Lxug/g;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReviewClosureConditionsBottomSheetController extends BaseBottomSheetRecyclerController<m, g> {
    public static final /* synthetic */ int U = 0;
    public final InputChecklistDelegate Q;
    public final Object R;
    public final List S;
    public final Object T;

    public ReviewClosureConditionsBottomSheetController(h input) {
        Intrinsics.checkNotNullParameter(input, "input");
        InputChecklistDelegate inputChecklistDelegate = new InputChecklistDelegate();
        this.Q = inputChecklistDelegate;
        this.R = w.y0(new xge.h(this, 12));
        this.S = u.c(inputChecklistDelegate);
        this.T = w.y0(new a(this, input, 21));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.Q.f52518c), new n(this, null), 3);
        ViewController.P2(this, e3(), new o(this, null, 0), 3);
        ViewController.P2(this, f3(), new o(this, null, 1), 3);
        ViewController.P2(this, h3(), new xjl.g(this, (Continuation) null, 29), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] */
    public final q R2() {
        return (q) this.R.getValue();
    }
}
