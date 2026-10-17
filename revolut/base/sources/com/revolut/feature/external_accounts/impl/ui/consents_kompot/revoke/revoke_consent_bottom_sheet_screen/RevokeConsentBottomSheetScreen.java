package com.revolut.feature.external_accounts.impl.ui.consents_kompot.revoke.revoke_consent_bottom_sheet_screen;

import am6.b;
import am6.c;
import am6.d;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.k;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.revoke.revoke_consent_bottom_sheet_screen.RevokeConsentBottomSheetScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.revoke.revoke_consent_bottom_sheet_screen.RevokeConsentBottomSheetScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xf6.h3;
import xf6.i3;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/revoke/revoke_consent_bottom_sheet_screen/RevokeConsentBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lam6/d;", "Lcli/k;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevokeConsentBottomSheetScreen extends BaseBottomSheetRecyclerController<d, k> {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(RevokeConsentBottomSheetScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final RevokeConsentBottomSheetScreenContract$InputData Q;
    public final h R;
    public final RowDelegate S;
    public final Object T;
    public final Object U;

    public RevokeConsentBottomSheetScreen(RevokeConsentBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = s.t(this, b.f);
        this.S = new RowDelegate(null, null, 7);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: am6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevokeConsentBottomSheetScreen f6288b;

            {
                this.f6288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevokeConsentBottomSheetScreen revokeConsentBottomSheetScreen = this.f6288b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevokeConsentBottomSheetScreen.V;
                        qji.b bVarU2 = revokeConsentBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.revoke.revoke_consent_bottom_sheet_screen.di.RevokeConsentBottomSheetScreenInjector");
                        h3 h3Var = (h3) ((bm6.a) bVarU2).c().mo3808a(revokeConsentBottomSheetScreen);
                        RevokeConsentBottomSheetScreenContract$InputData revokeConsentBottomSheetScreenContract$InputData = revokeConsentBottomSheetScreen.Q;
                        switch (h3Var.f304879a) {
                            case 0:
                                revokeConsentBottomSheetScreenContract$InputData.getClass();
                                h3Var.d = revokeConsentBottomSheetScreenContract$InputData;
                                break;
                            default:
                                revokeConsentBottomSheetScreenContract$InputData.getClass();
                                h3Var.d = revokeConsentBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (i3) h3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr2 = RevokeConsentBottomSheetScreen.V;
                        i3 i3Var = (i3) revokeConsentBottomSheetScreen.T.getValue();
                        switch (i3Var.f304894a) {
                            case 0:
                                return (e) i3Var.d.get();
                            default:
                                return (e) i3Var.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: am6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevokeConsentBottomSheetScreen f6288b;

            {
                this.f6288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevokeConsentBottomSheetScreen revokeConsentBottomSheetScreen = this.f6288b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevokeConsentBottomSheetScreen.V;
                        qji.b bVarU2 = revokeConsentBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.revoke.revoke_consent_bottom_sheet_screen.di.RevokeConsentBottomSheetScreenInjector");
                        h3 h3Var = (h3) ((bm6.a) bVarU2).c().mo3808a(revokeConsentBottomSheetScreen);
                        RevokeConsentBottomSheetScreenContract$InputData revokeConsentBottomSheetScreenContract$InputData = revokeConsentBottomSheetScreen.Q;
                        switch (h3Var.f304879a) {
                            case 0:
                                revokeConsentBottomSheetScreenContract$InputData.getClass();
                                h3Var.d = revokeConsentBottomSheetScreenContract$InputData;
                                break;
                            default:
                                revokeConsentBottomSheetScreenContract$InputData.getClass();
                                h3Var.d = revokeConsentBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (i3) h3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr2 = RevokeConsentBottomSheetScreen.V;
                        i3 i3Var = (i3) revokeConsentBottomSheetScreen.T.getValue();
                        switch (i3Var.f304894a) {
                            case 0:
                                return (e) i3Var.d.get();
                            default:
                                return (e) i3Var.d.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i3) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (am6.e) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = V;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.R;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((jii.e) value).f174513b.f), new c(this, null, 0), 3);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((jii.e) value2).f174513b.f58955g), new c(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (am6.e) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getQ() {
        return u.c(this.S);
    }
}
