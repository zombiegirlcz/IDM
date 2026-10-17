package com.revolut.feature.apm.core.ui.impl.ui.transfer.amount_settings;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount_settings.TransferSettingsContract$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount_settings.TransferSettingsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p12.l0;
import p12.x0;
import te0.w;
import vc.s;
import x1e.g;
import x42.b;
import x42.f;
import x42.i;
import x42.j;
import x42.k;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/amount_settings/TransferSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lx42/b;", "Ldli/a;", "Lx42/f;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferSettingsScreen extends ViewController<b> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TransferSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final TransferSettingsContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public TransferSettingsScreen(TransferSettingsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = true;
        this.N = s.t(this, i.f);
        this.O = w.y0(new g(23));
        this.P = w.y0(new g(24));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: x42.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferSettingsScreen f302782b;

            {
                this.f302782b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransferSettingsScreen transferSettingsScreen = this.f302782b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TransferSettingsScreen.T;
                        TransferSettingsScreen transferSettingsScreen2 = this.f302782b;
                        return dli.f.a(transferSettingsScreen2, (g) transferSettingsScreen2.S.getValue(), v.k((RowDelegate) transferSettingsScreen2.O.getValue(), (CellDetailsActionDelegate) transferSettingsScreen2.P.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferSettingsScreen.T;
                        qji.b bVarU2 = transferSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.transfer.amount_settings.di.TransferSettingsScreenInjector");
                        l0 l0Var = (l0) bVarU2;
                        p12.v vVar = l0Var.f231717b;
                        l0 l0Var2 = l0Var.f231718c;
                        TransferSettingsContract$InputData transferSettingsContract$InputData = transferSettingsScreen.K;
                        transferSettingsContract$InputData.getClass();
                        return new x0(vVar, l0Var2, transferSettingsContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TransferSettingsScreen.T;
                        return (g) ((x0) transferSettingsScreen.R.getValue()).f231821c.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: x42.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferSettingsScreen f302782b;

            {
                this.f302782b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransferSettingsScreen transferSettingsScreen = this.f302782b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferSettingsScreen.T;
                        TransferSettingsScreen transferSettingsScreen2 = this.f302782b;
                        return dli.f.a(transferSettingsScreen2, (g) transferSettingsScreen2.S.getValue(), v.k((RowDelegate) transferSettingsScreen2.O.getValue(), (CellDetailsActionDelegate) transferSettingsScreen2.P.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferSettingsScreen.T;
                        qji.b bVarU2 = transferSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.transfer.amount_settings.di.TransferSettingsScreenInjector");
                        l0 l0Var = (l0) bVarU2;
                        p12.v vVar = l0Var.f231717b;
                        l0 l0Var2 = l0Var.f231718c;
                        TransferSettingsContract$InputData transferSettingsContract$InputData = transferSettingsScreen.K;
                        transferSettingsContract$InputData.getClass();
                        return new x0(vVar, l0Var2, transferSettingsContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TransferSettingsScreen.T;
                        return (g) ((x0) transferSettingsScreen.R.getValue()).f231821c.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: x42.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferSettingsScreen f302782b;

            {
                this.f302782b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TransferSettingsScreen transferSettingsScreen = this.f302782b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TransferSettingsScreen.T;
                        TransferSettingsScreen transferSettingsScreen2 = this.f302782b;
                        return dli.f.a(transferSettingsScreen2, (g) transferSettingsScreen2.S.getValue(), v.k((RowDelegate) transferSettingsScreen2.O.getValue(), (CellDetailsActionDelegate) transferSettingsScreen2.P.getValue()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TransferSettingsScreen.T;
                        qji.b bVarU2 = transferSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.core.ui.impl.ui.transfer.amount_settings.di.TransferSettingsScreenInjector");
                        l0 l0Var = (l0) bVarU2;
                        p12.v vVar = l0Var.f231717b;
                        l0 l0Var2 = l0Var.f231718c;
                        TransferSettingsContract$InputData transferSettingsContract$InputData = transferSettingsScreen.K;
                        transferSettingsContract$InputData.getClass();
                        return new x0(vVar, l0Var2, transferSettingsContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TransferSettingsScreen.T;
                        return (g) ((x0) transferSettingsScreen.R.getValue()).f231821c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x0) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (x42.g) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.apm_transfer_amount_settings_title, null, null, 14), null);
        d3().f174557b.setText(new TextLocalisedClause(R$string.apm_transfer_amount_settings_action, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new j(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new j(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((RowDelegate) this.O.getValue()).f53225r, new x29.a(11))), null, new wuh.q(this, (Continuation) null, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) this.P.getValue()).d), null, new k(this, null), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
