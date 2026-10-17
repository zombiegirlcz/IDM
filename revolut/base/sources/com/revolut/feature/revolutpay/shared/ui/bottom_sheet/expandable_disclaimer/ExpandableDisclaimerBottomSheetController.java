package com.revolut.feature.revolutpay.shared.ui.bottom_sheet.expandable_disclaimer;

import android.os.Bundle;
import android.view.View;
import aw0.n6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment.ExpandableDisclaimerConfiguration;
import com.revolut.feature.revolutpay.shared.R$string;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import kae.d;
import kdc.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import os2.g;
import pki.b;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/shared/ui/bottom_sheet/expandable_disclaimer/ExpandableDisclaimerBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetController;", "", "kdc/a", "a", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExpandableDisclaimerBottomSheetController extends BaseBottomSheetController<Object> {
    public final kdc.a N;
    public final c O;
    public final xki.a P;
    public final a Q;

    public static final class a implements pki.a {
        @Override // pki.a
        public final void J1(g token) {
            Intrinsics.checkNotNullParameter(token, "token");
        }

        @Override // yji.r
        public final void e(Bundle state) {
            Intrinsics.checkNotNullParameter(state, "state");
        }

        @Override // pki.a
        public final void e0(g token) {
            Intrinsics.checkNotNullParameter(token, "token");
        }

        @Override // yji.r
        public final void g(Bundle outState) {
            Intrinsics.checkNotNullParameter(outState, "outState");
        }
    }

    public ExpandableDisclaimerBottomSheetController(kdc.a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = new c();
        this.P = xki.a.f306815a;
        this.Q = new a();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return this.P;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return this.O;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        ExpandableDisclaimerConfiguration expandableDisclaimerConfiguration = this.N.f182866a;
        j3(new cii.a(new lw0.a(expandableDisclaimerConfiguration.f84340a, expandableDisclaimerConfiguration.f84341b, null, null, false, 28), new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.revolut_pay_common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55)));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new k22.c(this, null, 19), 3);
        ViewController.P2(this, h3(), new d(this, null, 5), 3);
    }

    @Override // oki.f
    public final pki.a k() {
        return this.Q;
    }
}
