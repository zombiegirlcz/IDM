package com.revolut.feature.credit.direct.debit.set_account;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ay4.f;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.direct.debit.set_account.DirectDebitSetAccountScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import hul.c;
import hz4.b;
import hz4.i;
import hz4.j;
import hz4.l;
import hz4.m;
import jm4.g3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/direct/debit/set_account/DirectDebitSetAccountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhz4/i;", "Ldli/a;", "Lhz4/m;", "Lno/k;", "feature_credit_direct_debit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DirectDebitSetAccountScreen extends ViewController<i> implements a, k {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(DirectDebitSetAccountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public AnalyticsContext K;
    public final int L;
    public final Object M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public DirectDebitSetAccountScreen(DirectDebitSetAccountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData.f69918b;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = w.y0(new c(29));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: hz4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDebitSetAccountScreen f157018b;

            {
                this.f157018b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDebitSetAccountScreen.R;
                        DirectDebitSetAccountScreen directDebitSetAccountScreen = this.f157018b;
                        return dli.f.a(directDebitSetAccountScreen, (j) directDebitSetAccountScreen.Q.getValue(), u.c((InputTextDelegate) directDebitSetAccountScreen.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = DirectDebitSetAccountScreen.R;
                        return (j) ((g3) this.f157018b.P.getValue()).f176093c.get();
                }
            }
        });
        this.O = s.t(this, b.f);
        this.P = w.y0(new hl6.b(this, inputData, 23));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: hz4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDebitSetAccountScreen f157018b;

            {
                this.f157018b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDebitSetAccountScreen.R;
                        DirectDebitSetAccountScreen directDebitSetAccountScreen = this.f157018b;
                        return dli.f.a(directDebitSetAccountScreen, (j) directDebitSetAccountScreen.Q.getValue(), u.c((InputTextDelegate) directDebitSetAccountScreen.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = DirectDebitSetAccountScreen.R;
                        return (j) ((g3) this.f157018b.P.getValue()).f176093c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        l lVar = uiState.f157031b;
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setSecondDescriptionVisible(true);
        TextLocalisedClause textLocalisedClause = lVar.f157027a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setSecondDescriptionText(lVar.f157028b);
        navBarWithToolbar.setNavigationButtonImage(lVar.f157029c);
        hz4.k kVar = uiState.f157032c;
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setEnabled(kVar.f157026b);
        largeActionButton.setText(kVar.f157025a);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.K = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g3) this.P.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r13v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, new f(vkm.q.J(new hsl.c(rd0.e.b(d3().f174565c.f59410q), 9), new hsl.c(rd0.e.b(d3().f174564b.o), 10), rd0.e.b(((InputTextDelegate) this.M.getValue()).e.f121375b)), yx4.b.Companion, 8), null, new hp4.e(2, (j) this.Q.getValue(), j.class, "onItemClicked", "onItemClicked(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
