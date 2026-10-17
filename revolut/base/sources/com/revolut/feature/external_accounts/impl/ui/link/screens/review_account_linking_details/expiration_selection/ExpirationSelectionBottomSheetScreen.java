package com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.expiration_selection;

import android.view.View;
import bo6.a;
import bo6.b;
import bo6.d;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.expiration_selection.ExpirationSelectionBottomSheetContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.expiration_selection.ExpirationSelectionBottomSheetScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xf6.d1;
import xf6.e1;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/screens/review_account_linking_details/expiration_selection/ExpirationSelectionBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lbo6/b;", "Lbo6/a;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExpirationSelectionBottomSheetScreen extends BaseBottomSheetRecyclerController<b, a> {
    public static final /* synthetic */ int V = 0;
    public final ExpirationSelectionBottomSheetContract$InputData Q;
    public final SelectableDelegate R;
    public final Object S;
    public final Object T;
    public final List U;

    public ExpirationSelectionBottomSheetScreen(ExpirationSelectionBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        SelectableDelegate selectableDelegate = new SelectableDelegate(new RowDelegate(null, null, 7));
        this.R = selectableDelegate;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: bo6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpirationSelectionBottomSheetScreen f17294b;

            {
                this.f17294b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ExpirationSelectionBottomSheetScreen expirationSelectionBottomSheetScreen = this.f17294b;
                switch (i2) {
                    case 0:
                        int i3 = ExpirationSelectionBottomSheetScreen.V;
                        qji.b bVarU2 = expirationSelectionBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.expiration_selection.di.ExpirationSelectionBottomSheetScreenInjector");
                        d1 d1Var = (d1) ((co6.a) bVarU2).j().mo3808a(expirationSelectionBottomSheetScreen);
                        ExpirationSelectionBottomSheetContract$InputData expirationSelectionBottomSheetContract$InputData = expirationSelectionBottomSheetScreen.Q;
                        switch (d1Var.f304819a) {
                            case 0:
                                expirationSelectionBottomSheetContract$InputData.getClass();
                                d1Var.d = expirationSelectionBottomSheetContract$InputData;
                                break;
                            default:
                                expirationSelectionBottomSheetContract$InputData.getClass();
                                d1Var.d = expirationSelectionBottomSheetContract$InputData;
                                break;
                        }
                        return (e1) d1Var.mo3783build();
                    default:
                        int i5 = ExpirationSelectionBottomSheetScreen.V;
                        e1 e1Var = (e1) expirationSelectionBottomSheetScreen.S.getValue();
                        switch (e1Var.f304832a) {
                            case 0:
                                return (e) e1Var.f304834c.get();
                            default:
                                return (e) e1Var.f304834c.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: bo6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpirationSelectionBottomSheetScreen f17294b;

            {
                this.f17294b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ExpirationSelectionBottomSheetScreen expirationSelectionBottomSheetScreen = this.f17294b;
                switch (i22) {
                    case 0:
                        int i3 = ExpirationSelectionBottomSheetScreen.V;
                        qji.b bVarU2 = expirationSelectionBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.expiration_selection.di.ExpirationSelectionBottomSheetScreenInjector");
                        d1 d1Var = (d1) ((co6.a) bVarU2).j().mo3808a(expirationSelectionBottomSheetScreen);
                        ExpirationSelectionBottomSheetContract$InputData expirationSelectionBottomSheetContract$InputData = expirationSelectionBottomSheetScreen.Q;
                        switch (d1Var.f304819a) {
                            case 0:
                                expirationSelectionBottomSheetContract$InputData.getClass();
                                d1Var.d = expirationSelectionBottomSheetContract$InputData;
                                break;
                            default:
                                expirationSelectionBottomSheetContract$InputData.getClass();
                                d1Var.d = expirationSelectionBottomSheetContract$InputData;
                                break;
                        }
                        return (e1) d1Var.mo3783build();
                    default:
                        int i5 = ExpirationSelectionBottomSheetScreen.V;
                        e1 e1Var = (e1) expirationSelectionBottomSheetScreen.S.getValue();
                        switch (e1Var.f304832a) {
                            case 0:
                                return (e) e1Var.f304834c.get();
                            default:
                                return (e) e1Var.f304834c.get();
                        }
                }
            }
        });
        this.U = u.c(selectableDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e1) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b k3() {
        return (bo6.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.r()), new d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (bo6.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
