package com.revolut.sso.impl.ui.auth_cancellation;

import android.view.View;
import cli.k;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.auth_cancellation.AuthCancellationScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ljl.a1;
import ljl.z0;
import pki.b;
import skl.c;
import skl.d;
import te0.w;
import xki.e;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/sso/impl/ui/auth_cancellation/AuthCancellationScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lskl/c;", "Lcli/k;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AuthCancellationScreen extends BaseBottomSheetRecyclerController<c, k> {
    public static final /* synthetic */ int T = 0;
    public final Object Q;
    public final f0 R = f0.f322471a;
    public final Object S;

    public AuthCancellationScreen() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: skl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthCancellationScreen f263951b;

            {
                this.f263951b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AuthCancellationScreen authCancellationScreen = this.f263951b;
                switch (i2) {
                    case 0:
                        int i3 = AuthCancellationScreen.T;
                        qji.b bVarU2 = authCancellationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.auth_cancellation.di.AuthCancellationScreenInjector");
                        return (a1) ((z0) ((tkl.a) bVarU2).q().mo3808a(authCancellationScreen)).mo3783build();
                    default:
                        int i5 = AuthCancellationScreen.T;
                        a1 a1Var = (a1) authCancellationScreen.Q.getValue();
                        switch (a1Var.f195875a) {
                            case 0:
                                return (d) a1Var.f195876b.get();
                            default:
                                return (d) a1Var.f195876b.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: skl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthCancellationScreen f263951b;

            {
                this.f263951b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AuthCancellationScreen authCancellationScreen = this.f263951b;
                switch (i22) {
                    case 0:
                        int i3 = AuthCancellationScreen.T;
                        qji.b bVarU2 = authCancellationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.auth_cancellation.di.AuthCancellationScreenInjector");
                        return (a1) ((z0) ((tkl.a) bVarU2).q().mo3808a(authCancellationScreen)).mo3783build();
                    default:
                        int i5 = AuthCancellationScreen.T;
                        a1 a1Var = (a1) authCancellationScreen.Q.getValue();
                        switch (a1Var.f195875a) {
                            case 0:
                                return (d) a1Var.f195876b.get();
                            default:
                                return (d) a1Var.f195876b.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a1) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (d) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new skl.b(this, null, 0), 3);
        ViewController.P2(this, f3(), new skl.b(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (d) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getR() {
        return this.R;
    }
}
