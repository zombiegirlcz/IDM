package com.revolut.feature.password.ui.create_password;

import af9.b;
import af9.c;
import af9.d;
import af9.g;
import af9.j;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.password.R$layout;
import com.revolut.feature.password.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljl.r;
import no.m;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006:\u0001\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/password/ui/create_password/CreatePasswordScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laf9/g;", "Ldli/a;", "Laf9/h;", "Lin0/g;", "Lno/m;", "Companion", "a", "feature_password_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreatePasswordScreen extends ViewController<g> implements dli.a, in0.g, m {
    public final h K;
    public final InputTextDelegate L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final AnalyticsProduct Q;
    public final boolean R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CreatePasswordScreen.class, "binding", "getBinding()Lcom/revolut/feature/password/databinding/ScreenCreatePasswordBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public CreatePasswordScreen(CreatePasswordScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = new InputTextDelegate(null);
        this.M = R$layout.screen_create_password;
        this.N = w.y0(new af9.a(this, inputData));
        this.O = w.y0(new af9.a(this, 1));
        this.P = w.y0(new af9.a(this, 2));
        this.Q = inputData.f78656a;
        this.R = true;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        af9.h uiState = (af9.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f304556b.setEnabled(uiState.f3970b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getQ() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: T2 */
    public final Boolean getG() {
        return Boolean.valueOf(this.R);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f304557c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_password_create_screen_title, null, null, 14);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        d3().f304556b.setText(new TextLocalisedClause(R$string.revolut_password_common_actions_continue, null, null, 14));
        ScreenContentRecyclerView createPasswordScreenRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(createPasswordScreenRecyclerView, "createPasswordScreenRecyclerView");
        Intrinsics.checkNotNullParameter(createPasswordScreenRecyclerView, "<this>");
        createPasswordScreenRecyclerView.setImportantForAutofill(1);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f304557c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f304556b.o), null, new c(this, null, 1), 3);
        InputTextDelegate inputTextDelegate = this.L;
        com.revolut.kompot.navigable.a.g2(this, t1.d(rd0.e.b(inputTextDelegate.e.f121375b), 300L), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.f52577j.f121375b), null, new af9.e(this, null), 3);
    }

    public final xe9.a d3() {
        ViewBinding value = this.K.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (xe9.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
