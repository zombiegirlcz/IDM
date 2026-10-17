package com.revolut.sso.impl.ui.signin_sessions_flow.bottom_dialog;

import android.view.View;
import cf6.a;
import ck7.j;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.signin_sessions_flow.bottom_dialog.SignInSessionsBottomSheet;
import cpi.b;
import cql.c;
import cql.f;
import cql.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ljl.s0;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/signin_sessions_flow/bottom_dialog/SignInSessionsBottomSheet;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lcql/f;", "Lcql/c;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SignInSessionsBottomSheet extends BaseBottomSheetRecyclerController<f, c> {
    public static final /* synthetic */ int U = 0;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public SignInSessionsBottomSheet(SignInSessionsBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = w.y0(new b(3));
        this.R = w.y0(new a(this, inputData, 21));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: cql.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignInSessionsBottomSheet f108153b;

            {
                this.f108153b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SignInSessionsBottomSheet signInSessionsBottomSheet = this.f108153b;
                switch (i2) {
                    case 0:
                        int i3 = SignInSessionsBottomSheet.U;
                        return u.c((RowDelegate) signInSessionsBottomSheet.Q.getValue());
                    default:
                        int i5 = SignInSessionsBottomSheet.U;
                        return (h) ((s0) signInSessionsBottomSheet.R.getValue()).f196096c.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: cql.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SignInSessionsBottomSheet f108153b;

            {
                this.f108153b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SignInSessionsBottomSheet signInSessionsBottomSheet = this.f108153b;
                switch (i22) {
                    case 0:
                        int i3 = SignInSessionsBottomSheet.U;
                        return u.c((RowDelegate) signInSessionsBottomSheet.Q.getValue());
                    default:
                        int i5 = SignInSessionsBottomSheet.U;
                        return (h) ((s0) signInSessionsBottomSheet.R.getValue()).f196096c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (s0) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (h) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.Q.getValue()).f53218h), new cql.b(this, null), 3);
        ViewController.P2(this, i3(), new j(this, null, 15), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (h) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getS() {
        return (List) this.S.getValue();
    }
}
