package com.revolut.feature.direct_deposit.impl.ui_kompot.screen.type_selection;

import a96.g;
import android.view.View;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kob.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l92.h;
import l96.b;
import l96.c;
import l96.d;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/direct_deposit/impl/ui_kompot/screen/type_selection/DirectDepositTypeSelectionSheet;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Ll96/d;", "Ll96/b;", "feature_direct_deposit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DirectDepositTypeSelectionSheet extends BaseBottomSheetRecyclerController<d, b> {
    public static final /* synthetic */ int U = 0;
    public final Object Q;
    public final List R;
    public final Object S;
    public final Object T;

    public DirectDepositTypeSelectionSheet(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Lazy lazyY0 = w.y0(new h(2));
        this.Q = lazyY0;
        this.R = u.c((SingleChoiceDelegate) lazyY0.getValue());
        this.S = w.y0(new kpl.b(this, inputData, 18));
        this.T = w.y0(new a(this, 20));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (l96.e) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((SingleChoiceDelegate) this.Q.getValue()).p()), new l96.a(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (l96.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
