package com.revolut.feature.subscriptions.impl.edit_subscription_end_date;

import a07.b;
import a0l.k;
import a2g.a;
import aae.c;
import aae.d;
import aae.h;
import android.view.View;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import i9e.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/edit_subscription_end_date/EditSubscriptionEndDateController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laae/d;", "Laae/c;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EditSubscriptionEndDateController extends BaseBottomSheetRecyclerController<d, c> {
    public static final /* synthetic */ int V = 0;
    public final DatePickerDelegate Q;
    public final ListSubheaderDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public EditSubscriptionEndDateController(EditSubscriptionEndDateControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        DatePickerDelegate datePickerDelegate = new DatePickerDelegate();
        this.Q = datePickerDelegate;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.R = listSubheaderDelegate;
        this.S = v.k(new RowDelegate(null, null, 7), datePickerDelegate, listSubheaderDelegate);
        this.T = w.y0(new b(this, inputData, 18));
        this.U = w.y0(new a(this, 9));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, i3(), new aae.a(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52707c), new aae.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52176c.f121375b), new k(this, continuation, 22), 3);
        ViewController.P2(this, e3(), new aae.a(this, continuation, 1), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] */
    public final h R2() {
        return (h) this.U.getValue();
    }
}
