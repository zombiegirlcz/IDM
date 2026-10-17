package com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.joint_data_sharing;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import cli.a0;
import cli.o;
import cli.w;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.joint_data_sharing.JointDataSharingScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.joint_data_sharing.JointDataSharingScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import jl6.h;
import jl6.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import pki.b;
import vkm.d;
import xf6.o2;
import xf6.w2;
import xf6.x2;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/clients_list/joint_data_sharing/JointDataSharingScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetController;", "Laii/q;", "Lcli/w;", "Ljl6/h;", "Lno/m;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JointDataSharingScreen extends BaseBottomSheetController<q> implements w, m {
    public static final /* synthetic */ int S = 0;
    public final JointDataSharingScreenContract$InputData N;
    public final AnalyticsProduct.Retail O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public JointDataSharingScreen(JointDataSharingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        k9 k9Var = k9.OpenBanking;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.O = a.h(k9Var, "value", k9Var);
        final int i = 0;
        this.P = te0.w.y0(new Function0(this) { // from class: jl6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointDataSharingScreen f175600b;

            {
                this.f175600b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JointDataSharingScreen jointDataSharingScreen = this.f175600b;
                switch (i2) {
                    case 0:
                        int i3 = JointDataSharingScreen.S;
                        return n14.e.a(jointDataSharingScreen, (l) jointDataSharingScreen.Q.getValue());
                    case 1:
                        int i5 = JointDataSharingScreen.S;
                        return (l) ((o2) jointDataSharingScreen.R.getValue()).f304979b.get();
                    default:
                        int i6 = JointDataSharingScreen.S;
                        qji.b bVarU2 = jointDataSharingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.joint_data_sharing.di.JointDataSharingScreenComponentInjector");
                        x2 x2Var = (x2) bVarU2;
                        w2 w2Var = x2Var.f305161a;
                        x2 x2Var2 = x2Var.f305162b;
                        JointDataSharingScreenContract$InputData jointDataSharingScreenContract$InputData = jointDataSharingScreen.N;
                        jointDataSharingScreenContract$InputData.getClass();
                        return new o2(w2Var, x2Var2, jointDataSharingScreenContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.Q = te0.w.y0(new Function0(this) { // from class: jl6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointDataSharingScreen f175600b;

            {
                this.f175600b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JointDataSharingScreen jointDataSharingScreen = this.f175600b;
                switch (i22) {
                    case 0:
                        int i3 = JointDataSharingScreen.S;
                        return n14.e.a(jointDataSharingScreen, (l) jointDataSharingScreen.Q.getValue());
                    case 1:
                        int i5 = JointDataSharingScreen.S;
                        return (l) ((o2) jointDataSharingScreen.R.getValue()).f304979b.get();
                    default:
                        int i6 = JointDataSharingScreen.S;
                        qji.b bVarU2 = jointDataSharingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.joint_data_sharing.di.JointDataSharingScreenComponentInjector");
                        x2 x2Var = (x2) bVarU2;
                        w2 w2Var = x2Var.f305161a;
                        x2 x2Var2 = x2Var.f305162b;
                        JointDataSharingScreenContract$InputData jointDataSharingScreenContract$InputData = jointDataSharingScreen.N;
                        jointDataSharingScreenContract$InputData.getClass();
                        return new o2(w2Var, x2Var2, jointDataSharingScreenContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.R = te0.w.y0(new Function0(this) { // from class: jl6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointDataSharingScreen f175600b;

            {
                this.f175600b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JointDataSharingScreen jointDataSharingScreen = this.f175600b;
                switch (i22) {
                    case 0:
                        int i32 = JointDataSharingScreen.S;
                        return n14.e.a(jointDataSharingScreen, (l) jointDataSharingScreen.Q.getValue());
                    case 1:
                        int i5 = JointDataSharingScreen.S;
                        return (l) ((o2) jointDataSharingScreen.R.getValue()).f304979b.get();
                    default:
                        int i6 = JointDataSharingScreen.S;
                        qji.b bVarU2 = jointDataSharingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.joint_data_sharing.di.JointDataSharingScreenComponentInjector");
                        x2 x2Var = (x2) bVarU2;
                        w2 w2Var = x2Var.f305161a;
                        x2 x2Var2 = x2Var.f305162b;
                        JointDataSharingScreenContract$InputData jointDataSharingScreenContract$InputData = jointDataSharingScreen.N;
                        jointDataSharingScreenContract$InputData.getClass();
                        return new o2(w2Var, x2Var2, jointDataSharingScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        h uiState = (h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        j3(uiState.f175606a);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o2) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (l) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d dVarE3 = e3();
        ?? r102 = this.Q;
        ViewController.P2(this, dVarE3, new hp4.e(2, (l) r102.getValue(), l.class, "onPrimaryButtonClick", "onPrimaryButtonClick(Lcom/revolut/core/ui_kit/models/LargeActionButtonModel;)V", 4, 29), 3);
        ViewController.P2(this, f3(), new jl6.b(2, (l) r102.getValue(), l.class, "onSecondaryButtonClick", "onSecondaryButtonClick(Lcom/revolut/core/ui_kit/models/LargeActionButtonModel;)V", 4, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.P.getValue();
    }
}
