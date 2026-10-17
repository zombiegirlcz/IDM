package com.revolut.feature.subaccount.impl.ui.invite.screen.decline;

import android.os.Parcelable;
import android.view.View;
import cli.a0;
import cli.q;
import cli.w;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.subaccount.impl.ui.invite.screen.decline.VaultInvitationDeclineInvitationScreen;
import com.revolut.feature.subaccount.impl.ui.invite.screen.decline.VaultInvitationDeclineScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m8e.h;
import m8e.i;
import no.m;
import pki.b;
import r6e.o;
import r6e.v;
import vkm.d;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/invite/screen/decline/VaultInvitationDeclineInvitationScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetController;", "Lm8e/h;", "Lcli/w;", "Lm8e/i;", "Lno/m;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VaultInvitationDeclineInvitationScreen extends BaseBottomSheetController<h> implements w, m {
    public static final /* synthetic */ int S = 0;
    public final VaultInvitationDeclineScreenContract$InputData N;
    public final AnalyticsProduct.Retail O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public VaultInvitationDeclineInvitationScreen(VaultInvitationDeclineScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        k9 k9Var = k9.Accounts;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.O = a.h(k9Var, "value", k9Var);
        final int i = 0;
        this.P = te0.w.y0(new Function0(this) { // from class: m8e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VaultInvitationDeclineInvitationScreen f203530b;

            {
                this.f203530b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                VaultInvitationDeclineInvitationScreen vaultInvitationDeclineInvitationScreen = this.f203530b;
                switch (i2) {
                    case 0:
                        int i3 = VaultInvitationDeclineInvitationScreen.S;
                        return n14.e.a(vaultInvitationDeclineInvitationScreen, (m) vaultInvitationDeclineInvitationScreen.Q.getValue());
                    case 1:
                        int i5 = VaultInvitationDeclineInvitationScreen.S;
                        return (m) ((v) vaultInvitationDeclineInvitationScreen.R.getValue()).f251812b.get();
                    default:
                        int i6 = VaultInvitationDeclineInvitationScreen.S;
                        qji.b bVarU2 = vaultInvitationDeclineInvitationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.subaccount.impl.ui.invite.screen.decline.di.VaultInvitationDeclineScreenComponentInjector");
                        r6e.w wVar = (r6e.w) bVarU2;
                        o oVar = wVar.f251814b;
                        r6e.w wVar2 = wVar.f251815c;
                        VaultInvitationDeclineScreenContract$InputData vaultInvitationDeclineScreenContract$InputData = vaultInvitationDeclineInvitationScreen.N;
                        vaultInvitationDeclineScreenContract$InputData.getClass();
                        return new v(oVar, wVar2, vaultInvitationDeclineScreenContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.Q = te0.w.y0(new Function0(this) { // from class: m8e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VaultInvitationDeclineInvitationScreen f203530b;

            {
                this.f203530b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                VaultInvitationDeclineInvitationScreen vaultInvitationDeclineInvitationScreen = this.f203530b;
                switch (i22) {
                    case 0:
                        int i3 = VaultInvitationDeclineInvitationScreen.S;
                        return n14.e.a(vaultInvitationDeclineInvitationScreen, (m) vaultInvitationDeclineInvitationScreen.Q.getValue());
                    case 1:
                        int i5 = VaultInvitationDeclineInvitationScreen.S;
                        return (m) ((v) vaultInvitationDeclineInvitationScreen.R.getValue()).f251812b.get();
                    default:
                        int i6 = VaultInvitationDeclineInvitationScreen.S;
                        qji.b bVarU2 = vaultInvitationDeclineInvitationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.subaccount.impl.ui.invite.screen.decline.di.VaultInvitationDeclineScreenComponentInjector");
                        r6e.w wVar = (r6e.w) bVarU2;
                        o oVar = wVar.f251814b;
                        r6e.w wVar2 = wVar.f251815c;
                        VaultInvitationDeclineScreenContract$InputData vaultInvitationDeclineScreenContract$InputData = vaultInvitationDeclineInvitationScreen.N;
                        vaultInvitationDeclineScreenContract$InputData.getClass();
                        return new v(oVar, wVar2, vaultInvitationDeclineScreenContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.R = te0.w.y0(new Function0(this) { // from class: m8e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VaultInvitationDeclineInvitationScreen f203530b;

            {
                this.f203530b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                VaultInvitationDeclineInvitationScreen vaultInvitationDeclineInvitationScreen = this.f203530b;
                switch (i22) {
                    case 0:
                        int i32 = VaultInvitationDeclineInvitationScreen.S;
                        return n14.e.a(vaultInvitationDeclineInvitationScreen, (m) vaultInvitationDeclineInvitationScreen.Q.getValue());
                    case 1:
                        int i5 = VaultInvitationDeclineInvitationScreen.S;
                        return (m) ((v) vaultInvitationDeclineInvitationScreen.R.getValue()).f251812b.get();
                    default:
                        int i6 = VaultInvitationDeclineInvitationScreen.S;
                        qji.b bVarU2 = vaultInvitationDeclineInvitationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.subaccount.impl.ui.invite.screen.decline.di.VaultInvitationDeclineScreenComponentInjector");
                        r6e.w wVar = (r6e.w) bVarU2;
                        o oVar = wVar.f251814b;
                        r6e.w wVar2 = wVar.f251815c;
                        VaultInvitationDeclineScreenContract$InputData vaultInvitationDeclineScreenContract$InputData = vaultInvitationDeclineInvitationScreen.N;
                        vaultInvitationDeclineScreenContract$InputData.getClass();
                        return new v(oVar, wVar2, vaultInvitationDeclineScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        j3(uiState.f203536a);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (m8e.m) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d dVarE3 = e3();
        ?? r102 = this.Q;
        ViewController.P2(this, dVarE3, new jl6.b(2, (m8e.m) r102.getValue(), m8e.m.class, "onPrimaryButtonClick", "onPrimaryButtonClick(Lcom/revolut/core/ui_kit/models/LargeActionButtonModel;)V", 4, 28), 3);
        ViewController.P2(this, f3(), new jl6.b(2, (m8e.m) r102.getValue(), m8e.m.class, "onSecondaryButtonClick", "onSecondaryButtonClick(Lcom/revolut/core/ui_kit/models/LargeActionButtonModel;)V", 4, 29), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.P.getValue();
    }
}
