package com.revolut.feature.joint.impl.ui.withdraw;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.j8;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.joint.impl.R$id;
import com.revolut.feature.joint.impl.R$layout;
import com.revolut.feature.joint.impl.ui.withdraw.JointWithdrawScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m58.c;
import m58.f;
import no.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/withdraw/JointWithdrawScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lm58/c;", "Lno/m;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JointWithdrawScreen extends ViewController<q> implements dli.a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(JointWithdrawScreen.class, "binding", "getBinding()Lcom/revolut/feature/joint/impl/databinding/ScreenWithdrawV2Binding;", 0))};
    public final Object K;
    public final Object L;
    public final Object M;
    public final h N;
    public final AnalyticsProduct.Retail O;
    public final boolean P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final int T;

    public JointWithdrawScreen(JointWithdrawContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: m58.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointWithdrawScreen f202856b;

            {
                this.f202856b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JointWithdrawScreen jointWithdrawScreen = this.f202856b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JointWithdrawScreen.U;
                        return new u80.d(((s80.b) ((qd0.b) jointWithdrawScreen.L.getValue())).b());
                    case 1:
                        KProperty[] kPropertyArr2 = JointWithdrawScreen.U;
                        qd0.b bVarN = ((e48.q) jointWithdrawScreen.S.getValue()).f122467b.v.n();
                        s.j(bVarN);
                        return bVarN;
                    case 2:
                        KProperty[] kPropertyArr3 = JointWithdrawScreen.U;
                        return new CenteredAmountDelegate(new lp2.c(jointWithdrawScreen, 25));
                    case 3:
                        KProperty[] kPropertyArr4 = JointWithdrawScreen.U;
                        JointWithdrawScreen jointWithdrawScreen2 = this.f202856b;
                        return dli.f.a(jointWithdrawScreen2, (b) jointWithdrawScreen2.R.getValue(), u.c((CenteredAmountDelegate) jointWithdrawScreen2.M.getValue()), R$id.screenWithdraw_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr5 = JointWithdrawScreen.U;
                        return (b) ((e48.q) jointWithdrawScreen.S.getValue()).f122468c.get();
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: m58.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointWithdrawScreen f202856b;

            {
                this.f202856b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JointWithdrawScreen jointWithdrawScreen = this.f202856b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JointWithdrawScreen.U;
                        return new u80.d(((s80.b) ((qd0.b) jointWithdrawScreen.L.getValue())).b());
                    case 1:
                        KProperty[] kPropertyArr2 = JointWithdrawScreen.U;
                        qd0.b bVarN = ((e48.q) jointWithdrawScreen.S.getValue()).f122467b.v.n();
                        s.j(bVarN);
                        return bVarN;
                    case 2:
                        KProperty[] kPropertyArr3 = JointWithdrawScreen.U;
                        return new CenteredAmountDelegate(new lp2.c(jointWithdrawScreen, 25));
                    case 3:
                        KProperty[] kPropertyArr4 = JointWithdrawScreen.U;
                        JointWithdrawScreen jointWithdrawScreen2 = this.f202856b;
                        return dli.f.a(jointWithdrawScreen2, (b) jointWithdrawScreen2.R.getValue(), u.c((CenteredAmountDelegate) jointWithdrawScreen2.M.getValue()), R$id.screenWithdraw_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr5 = JointWithdrawScreen.U;
                        return (b) ((e48.q) jointWithdrawScreen.S.getValue()).f122468c.get();
                }
            }
        });
        final int i3 = 2;
        this.M = w.y0(new Function0(this) { // from class: m58.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointWithdrawScreen f202856b;

            {
                this.f202856b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JointWithdrawScreen jointWithdrawScreen = this.f202856b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JointWithdrawScreen.U;
                        return new u80.d(((s80.b) ((qd0.b) jointWithdrawScreen.L.getValue())).b());
                    case 1:
                        KProperty[] kPropertyArr2 = JointWithdrawScreen.U;
                        qd0.b bVarN = ((e48.q) jointWithdrawScreen.S.getValue()).f122467b.v.n();
                        s.j(bVarN);
                        return bVarN;
                    case 2:
                        KProperty[] kPropertyArr3 = JointWithdrawScreen.U;
                        return new CenteredAmountDelegate(new lp2.c(jointWithdrawScreen, 25));
                    case 3:
                        KProperty[] kPropertyArr4 = JointWithdrawScreen.U;
                        JointWithdrawScreen jointWithdrawScreen2 = this.f202856b;
                        return dli.f.a(jointWithdrawScreen2, (b) jointWithdrawScreen2.R.getValue(), u.c((CenteredAmountDelegate) jointWithdrawScreen2.M.getValue()), R$id.screenWithdraw_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr5 = JointWithdrawScreen.U;
                        return (b) ((e48.q) jointWithdrawScreen.S.getValue()).f122468c.get();
                }
            }
        });
        this.N = s.t(this, f.f);
        k9 k9Var = k9.JointAccounts;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.O = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.P = true;
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: m58.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointWithdrawScreen f202856b;

            {
                this.f202856b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                JointWithdrawScreen jointWithdrawScreen = this.f202856b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JointWithdrawScreen.U;
                        return new u80.d(((s80.b) ((qd0.b) jointWithdrawScreen.L.getValue())).b());
                    case 1:
                        KProperty[] kPropertyArr2 = JointWithdrawScreen.U;
                        qd0.b bVarN = ((e48.q) jointWithdrawScreen.S.getValue()).f122467b.v.n();
                        s.j(bVarN);
                        return bVarN;
                    case 2:
                        KProperty[] kPropertyArr3 = JointWithdrawScreen.U;
                        return new CenteredAmountDelegate(new lp2.c(jointWithdrawScreen, 25));
                    case 3:
                        KProperty[] kPropertyArr4 = JointWithdrawScreen.U;
                        JointWithdrawScreen jointWithdrawScreen2 = this.f202856b;
                        return dli.f.a(jointWithdrawScreen2, (b) jointWithdrawScreen2.R.getValue(), u.c((CenteredAmountDelegate) jointWithdrawScreen2.M.getValue()), R$id.screenWithdraw_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr5 = JointWithdrawScreen.U;
                        return (b) ((e48.q) jointWithdrawScreen.S.getValue()).f122468c.get();
                }
            }
        });
        final int i6 = 4;
        this.R = w.y0(new Function0(this) { // from class: m58.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointWithdrawScreen f202856b;

            {
                this.f202856b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                JointWithdrawScreen jointWithdrawScreen = this.f202856b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JointWithdrawScreen.U;
                        return new u80.d(((s80.b) ((qd0.b) jointWithdrawScreen.L.getValue())).b());
                    case 1:
                        KProperty[] kPropertyArr2 = JointWithdrawScreen.U;
                        qd0.b bVarN = ((e48.q) jointWithdrawScreen.S.getValue()).f122467b.v.n();
                        s.j(bVarN);
                        return bVarN;
                    case 2:
                        KProperty[] kPropertyArr3 = JointWithdrawScreen.U;
                        return new CenteredAmountDelegate(new lp2.c(jointWithdrawScreen, 25));
                    case 3:
                        KProperty[] kPropertyArr4 = JointWithdrawScreen.U;
                        JointWithdrawScreen jointWithdrawScreen2 = this.f202856b;
                        return dli.f.a(jointWithdrawScreen2, (b) jointWithdrawScreen2.R.getValue(), u.c((CenteredAmountDelegate) jointWithdrawScreen2.M.getValue()), R$id.screenWithdraw_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr5 = JointWithdrawScreen.U;
                        return (b) ((e48.q) jointWithdrawScreen.S.getValue()).f122468c.get();
                }
            }
        });
        this.S = w.y0(new ltf.b(this, inputData, 16));
        this.T = R$layout.screen_withdraw_v2;
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        j8 j8Var = uiState.d;
        if (j8Var != null) {
            d3().f111255c.setModel(j8Var);
        }
        LargeActionButton largeActionButton = d3().f111254b;
        largeActionButton.setEnabled(uiState.f202852b);
        largeActionButton.setText(uiState.f202853c);
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
        return (e48.q) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (m58.b) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f111255c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f111255c.f59338a), new m58.h(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f111254b.o), new m58.h(this, continuation, 1), 3);
    }

    public final d48.e d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d48.e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}
