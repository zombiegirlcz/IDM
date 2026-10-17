package com.revolut.feature.credit.card.impl.ui.limit_hub.limit_increase_preference;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_increase_preference.CreditCardLimitIncreasePreferenceController;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import ep4.b;
import jm4.q1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import pqc.k;
import pt4.d;
import pt4.e;
import pt4.g;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/limit_hub/limit_increase_preference/CreditCardLimitIncreasePreferenceController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lpt4/b;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardLimitIncreasePreferenceController extends ViewController<q> implements a, m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CreditCardLimitIncreasePreferenceController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final /* synthetic */ b K;
    public final Object L;
    public final Object M;
    public final h N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public CreditCardLimitIncreasePreferenceController(CreditCardLimitIncreasePreferenceContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = w.y0(new pni.a(11));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: pt4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardLimitIncreasePreferenceController f239605b;

            {
                this.f239605b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardLimitIncreasePreferenceController creditCardLimitIncreasePreferenceController = this.f239605b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardLimitIncreasePreferenceController.S;
                        return new SelectableDelegate((RowDelegate) creditCardLimitIncreasePreferenceController.L.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardLimitIncreasePreferenceController.S;
                        CreditCardLimitIncreasePreferenceController creditCardLimitIncreasePreferenceController2 = this.f239605b;
                        return dli.f.a(creditCardLimitIncreasePreferenceController2, (h) creditCardLimitIncreasePreferenceController2.R.getValue(), u.c((SelectableDelegate) creditCardLimitIncreasePreferenceController2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardLimitIncreasePreferenceController.S;
                        return (h) ((q1) creditCardLimitIncreasePreferenceController.Q.getValue()).f176267b.get();
                }
            }
        });
        this.N = s.t(this, e.f);
        this.O = R$layout.screen_recycler_navbar_nextbutton;
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: pt4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardLimitIncreasePreferenceController f239605b;

            {
                this.f239605b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardLimitIncreasePreferenceController creditCardLimitIncreasePreferenceController = this.f239605b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardLimitIncreasePreferenceController.S;
                        return new SelectableDelegate((RowDelegate) creditCardLimitIncreasePreferenceController.L.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardLimitIncreasePreferenceController.S;
                        CreditCardLimitIncreasePreferenceController creditCardLimitIncreasePreferenceController2 = this.f239605b;
                        return dli.f.a(creditCardLimitIncreasePreferenceController2, (h) creditCardLimitIncreasePreferenceController2.R.getValue(), u.c((SelectableDelegate) creditCardLimitIncreasePreferenceController2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardLimitIncreasePreferenceController.S;
                        return (h) ((q1) creditCardLimitIncreasePreferenceController.Q.getValue()).f176267b.get();
                }
            }
        });
        this.Q = w.y0(new d(this, inputData, 0));
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: pt4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardLimitIncreasePreferenceController f239605b;

            {
                this.f239605b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardLimitIncreasePreferenceController creditCardLimitIncreasePreferenceController = this.f239605b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardLimitIncreasePreferenceController.S;
                        return new SelectableDelegate((RowDelegate) creditCardLimitIncreasePreferenceController.L.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardLimitIncreasePreferenceController.S;
                        CreditCardLimitIncreasePreferenceController creditCardLimitIncreasePreferenceController2 = this.f239605b;
                        return dli.f.a(creditCardLimitIncreasePreferenceController2, (h) creditCardLimitIncreasePreferenceController2.R.getValue(), u.c((SelectableDelegate) creditCardLimitIncreasePreferenceController2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardLimitIncreasePreferenceController.S;
                        return (h) ((q1) creditCardLimitIncreasePreferenceController.Q.getValue()).f176267b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        pt4.b uiState = (pt4.b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f239603b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (q1) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (pt4.h) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_card_limit_increase_preferences_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_card_limit_increase_preferences_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.credit_card_limit_increase_preferences_description, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        d3().f174564b.setText(new TextLocalisedClause(R$string.credit_card_limit_increase_preferences_cta_title, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new g(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new g(this, null, 1), 3);
        ViewController.P2(this, new p73.d(rd0.e.b(((SelectableDelegate) this.M.getValue()).r()), 27), new k(this, null, 10), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
