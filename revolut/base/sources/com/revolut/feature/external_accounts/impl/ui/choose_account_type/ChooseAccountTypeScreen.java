package com.revolut.feature.external_accounts.impl.ui.choose_account_type;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rk6.b;
import rk6.c;
import rk6.d;
import xki.a;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/choose_account_type/ChooseAccountTypeScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lrk6/b;", "Lcli/k;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChooseAccountTypeScreen extends BaseBottomSheetRecyclerController<b, k> {
    public final a Q = a.f306815a;
    public final c R = new c(new d());
    public final RowDelegate S;
    public final List T;

    public ChooseAccountTypeScreen() {
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.S = rowDelegate;
        this.T = u.c(rowDelegate);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return this.Q;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return this.R;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.S.f53218h), new rk6.a(this, null), 3);
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return this.R;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
