package com.revolut.feature.security_hub.impl.ui.linked_wallet_card_cancel;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.security_hub.impl.ui.linked_wallet_card_cancel.LinkedWalletCardCancelScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import s86.a;
import sek.q;
import suc.d;
import suc.g;
import suc.m;
import te0.w;
import vtc.i;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/linked_wallet_card_cancel/LinkedWalletCardCancelScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lsuc/g;", "Lsuc/d;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinkedWalletCardCancelScreen extends BaseBottomSheetRecyclerController<g, d> {
    public static final /* synthetic */ int U = 0;
    public final RowDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public LinkedWalletCardCancelScreen(LinkedWalletCardCancelScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = new RowDelegate(null, null, 7);
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: suc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedWalletCardCancelScreen f265702b;

            {
                this.f265702b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LinkedWalletCardCancelScreen linkedWalletCardCancelScreen = this.f265702b;
                switch (i2) {
                    case 0:
                        return u.c(linkedWalletCardCancelScreen.Q);
                    default:
                        int i3 = LinkedWalletCardCancelScreen.U;
                        return (m) ((vtc.i) linkedWalletCardCancelScreen.T.getValue()).f291989b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: suc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedWalletCardCancelScreen f265702b;

            {
                this.f265702b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LinkedWalletCardCancelScreen linkedWalletCardCancelScreen = this.f265702b;
                switch (i22) {
                    case 0:
                        return u.c(linkedWalletCardCancelScreen.Q);
                    default:
                        int i3 = LinkedWalletCardCancelScreen.U;
                        return (m) ((vtc.i) linkedWalletCardCancelScreen.T.getValue()).f291989b.get();
                }
            }
        });
        this.T = w.y0(new a(this, inputData, 27));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (m) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new rv6.e(new ryj.w(rd0.e.b(this.Q.f53218h), 25), 4), new q(this, null, 20), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (m) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getQ() {
        return (List) this.R.getValue();
    }
}
