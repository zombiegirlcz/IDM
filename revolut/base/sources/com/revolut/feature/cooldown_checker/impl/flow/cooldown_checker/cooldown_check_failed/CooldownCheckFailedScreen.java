package com.revolut.feature.cooldown_checker.impl.flow.cooldown_checker.cooldown_check_failed;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cooldown_checker.impl.R$string;
import com.revolut.feature.cooldown_checker.impl.flow.cooldown_checker.cooldown_check_failed.CooldownCheckFailedScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vn3.b;
import vn3.c;
import vn3.e;
import vn3.f;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cooldown_checker/impl/flow/cooldown_checker/cooldown_check_failed/CooldownCheckFailedScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lvn3/e;", "feature_cooldown_checker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CooldownCheckFailedScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(CooldownCheckFailedScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;

    public CooldownCheckFailedScreen(CooldownCheckFailedScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: vn3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CooldownCheckFailedScreen f290738b;

            {
                this.f290738b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CooldownCheckFailedScreen.P;
                        return (f) ((tn3.b) this.f290738b.M.getValue()).f272289c.get();
                    default:
                        KProperty[] kPropertyArr2 = CooldownCheckFailedScreen.P;
                        CooldownCheckFailedScreen cooldownCheckFailedScreen = this.f290738b;
                        return dli.f.a(cooldownCheckFailedScreen, (f) cooldownCheckFailedScreen.K.getValue(), u.c(new SimpleMediaDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: vn3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CooldownCheckFailedScreen f290738b;

            {
                this.f290738b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CooldownCheckFailedScreen.P;
                        return (f) ((tn3.b) this.f290738b.M.getValue()).f272289c.get();
                    default:
                        KProperty[] kPropertyArr2 = CooldownCheckFailedScreen.P;
                        CooldownCheckFailedScreen cooldownCheckFailedScreen = this.f290738b;
                        return dli.f.a(cooldownCheckFailedScreen, (f) cooldownCheckFailedScreen.K.getValue(), u.c(new SimpleMediaDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.M = w.y0(new vd1.a(this, inputData, 21));
        this.N = R$layout.screen_recycler_navbar_nextbutton;
        this.O = s.t(this, b.f);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setDescriptionVisible(true);
        TextLocalisedClause textLocalisedClause = uiState.f290742b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setDescriptionText(uiState.f290743c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (tn3.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.K.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        d3().f174564b.setText(new TextLocalisedClause(R$string.cooldown_check_action_got_it, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.O.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
