package com.revolut.feature.credit.card.impl.ui.settings.due_date;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.GridSingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.feature.credit.card.impl.ui.settings.due_date.CreditCardSelectDueDateScreen;
import com.revolut.feature.credit.card.impl.ui.settings.due_date.CreditCardSelectDueDateScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import ep4.b;
import jm4.a3;
import jm4.h2;
import jm4.i2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import yna.j1;
import yu4.e;
import yu4.g;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/settings/due_date/CreditCardSelectDueDateScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lyu4/e;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardSelectDueDateScreen extends ViewController<Object> implements a, m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CreditCardSelectDueDateScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final /* synthetic */ b K;
    public final CreditCardSelectDueDateScreenContract$InputData L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public CreditCardSelectDueDateScreen(CreditCardSelectDueDateScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        this.N = s.t(this, yu4.b.f);
        this.O = w.y0(new j1(24));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: yu4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardSelectDueDateScreen f316874b;

            {
                this.f316874b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardSelectDueDateScreen creditCardSelectDueDateScreen = this.f316874b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardSelectDueDateScreen.S;
                        CreditCardSelectDueDateScreen creditCardSelectDueDateScreen2 = this.f316874b;
                        return dli.f.a(creditCardSelectDueDateScreen2, (g) creditCardSelectDueDateScreen2.R.getValue(), v.k((GridSingleChoiceDelegate) creditCardSelectDueDateScreen2.O.getValue(), new CellDetailsDelegate()), creditCardSelectDueDateScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardSelectDueDateScreen.S;
                        qji.b bVarU2 = creditCardSelectDueDateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.settings.due_date.di.CreditCardSelectDueDateScreenInjector");
                        h2 h2Var = (h2) bVarU2;
                        a3 a3Var = h2Var.f176105b;
                        h2 h2Var2 = h2Var.f176106c;
                        CreditCardSelectDueDateScreenContract$InputData creditCardSelectDueDateScreenContract$InputData = creditCardSelectDueDateScreen.L;
                        creditCardSelectDueDateScreenContract$InputData.getClass();
                        return new i2(a3Var, h2Var2, creditCardSelectDueDateScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardSelectDueDateScreen.S;
                        return (g) ((i2) creditCardSelectDueDateScreen.Q.getValue()).f176120c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: yu4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardSelectDueDateScreen f316874b;

            {
                this.f316874b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardSelectDueDateScreen creditCardSelectDueDateScreen = this.f316874b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardSelectDueDateScreen.S;
                        CreditCardSelectDueDateScreen creditCardSelectDueDateScreen2 = this.f316874b;
                        return dli.f.a(creditCardSelectDueDateScreen2, (g) creditCardSelectDueDateScreen2.R.getValue(), v.k((GridSingleChoiceDelegate) creditCardSelectDueDateScreen2.O.getValue(), new CellDetailsDelegate()), creditCardSelectDueDateScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardSelectDueDateScreen.S;
                        qji.b bVarU2 = creditCardSelectDueDateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.settings.due_date.di.CreditCardSelectDueDateScreenInjector");
                        h2 h2Var = (h2) bVarU2;
                        a3 a3Var = h2Var.f176105b;
                        h2 h2Var2 = h2Var.f176106c;
                        CreditCardSelectDueDateScreenContract$InputData creditCardSelectDueDateScreenContract$InputData = creditCardSelectDueDateScreen.L;
                        creditCardSelectDueDateScreenContract$InputData.getClass();
                        return new i2(a3Var, h2Var2, creditCardSelectDueDateScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardSelectDueDateScreen.S;
                        return (g) ((i2) creditCardSelectDueDateScreen.Q.getValue()).f176120c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: yu4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardSelectDueDateScreen f316874b;

            {
                this.f316874b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardSelectDueDateScreen creditCardSelectDueDateScreen = this.f316874b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardSelectDueDateScreen.S;
                        CreditCardSelectDueDateScreen creditCardSelectDueDateScreen2 = this.f316874b;
                        return dli.f.a(creditCardSelectDueDateScreen2, (g) creditCardSelectDueDateScreen2.R.getValue(), v.k((GridSingleChoiceDelegate) creditCardSelectDueDateScreen2.O.getValue(), new CellDetailsDelegate()), creditCardSelectDueDateScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardSelectDueDateScreen.S;
                        qji.b bVarU2 = creditCardSelectDueDateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.settings.due_date.di.CreditCardSelectDueDateScreenInjector");
                        h2 h2Var = (h2) bVarU2;
                        a3 a3Var = h2Var.f176105b;
                        h2 h2Var2 = h2Var.f176106c;
                        CreditCardSelectDueDateScreenContract$InputData creditCardSelectDueDateScreenContract$InputData = creditCardSelectDueDateScreen.L;
                        creditCardSelectDueDateScreenContract$InputData.getClass();
                        return new i2(a3Var, h2Var2, creditCardSelectDueDateScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardSelectDueDateScreen.S;
                        return (g) ((i2) creditCardSelectDueDateScreen.Q.getValue()).f176120c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174545b.setEnabled(uiState.f316880b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i2) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarBottomSheet navBarBottomSheet = d3().f174546c;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_select_due_date_title, null, null, 14);
        Integer num = this.L.d;
        if (num != null) {
            textLocalisedClause = new TextLocalisedClause(R$string.credit_card_select_due_date_subtitle, u.c(Integer.valueOf(num.intValue())), null, 12);
        } else {
            textLocalisedClause = null;
        }
        navBarBottomSheet.setHeaderModel(new lw0.a(textLocalisedClause2, textLocalisedClause, null, null, false, 28));
        LargeActionButton largeActionButton = d3().f174545b;
        largeActionButton.setText(new TextLocalisedClause(R$string.credit_card_select_due_date_action, null, null, 14));
        largeActionButton.setLoadingButtonTag("tag_credit_card_change_due_date_action");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, new yph.b(rd0.e.b(((GridSingleChoiceDelegate) this.O.getValue()).f52390g.f121375b), 10), null, new y7i.h(this, null, 21), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174545b.o), null, new yl6.b(this, null, 9), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
