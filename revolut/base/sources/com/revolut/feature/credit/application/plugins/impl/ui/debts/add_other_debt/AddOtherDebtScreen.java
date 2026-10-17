package com.revolut.feature.credit.application.plugins.impl.ui.debts.add_other_debt;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginRecyclerViewScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.add_other_debt.AddOtherDebtScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import dmc.b0;
import dw3.r;
import dw3.s4;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sy6.j;
import t05.c;
import t84.b;
import t84.e;
import t84.f;
import t84.g;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/add_other_debt/AddOtherDebtScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginRecyclerViewScreen;", "Lt84/f;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/add_other_debt/AddOtherDebtScreenContract$InputData;", "Lt84/e;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddOtherDebtScreen extends PluginRecyclerViewScreen<f, AddOtherDebtScreenContract$InputData, e> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f67429b0 = {o0.f186429a.j(new h0(AddOtherDebtScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int V;
    public final Object W;
    public final Object X;
    public final InputDisclosureDelegate Y;
    public final List Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final h f67430a0;

    /* JADX WARN: Illegal instructions before constructor call */
    public AddOtherDebtScreen() {
        AddOtherDebtScreenContract$InputData inputData = AddOtherDebtScreenContract$InputData.f67431a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        super(inputData);
        this.V = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.W = w.y0(new Function0(this) { // from class: t84.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddOtherDebtScreen f268833b;

            {
                this.f268833b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddOtherDebtScreen addOtherDebtScreen = this.f268833b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddOtherDebtScreen.f67429b0;
                        qji.b bVarQ2 = addOtherDebtScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.debts.add_other_debt.di.AddOtherDebtScreenInjector");
                        s4 s4Var = ((s4) bVarQ2).d;
                        r rVar = new r();
                        rVar.f119608a = e4m.b.b(e4m.c.a(addOtherDebtScreen));
                        b0 b0Var = new b0(s4Var, rVar, 1, 2);
                        rVar.f119609b = b0Var;
                        rVar.f119610c = e4m.b.b(b0Var);
                        rVar.d = e4m.b.b(new b0(s4Var, rVar, 0, 2));
                        rVar.e = e4m.b.b(rVar.f119609b);
                        rVar.f = e4m.b.b(new b0(s4Var, rVar, 3, 2));
                        rVar.f119611g = e4m.b.b(new b0(s4Var, rVar, 2, 2));
                        return rVar;
                    default:
                        KProperty[] kPropertyArr2 = AddOtherDebtScreen.f67429b0;
                        return (g) ((r) addOtherDebtScreen.W.getValue()).f119611g.get();
                }
            }
        });
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: t84.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddOtherDebtScreen f268833b;

            {
                this.f268833b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddOtherDebtScreen addOtherDebtScreen = this.f268833b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddOtherDebtScreen.f67429b0;
                        qji.b bVarQ2 = addOtherDebtScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.debts.add_other_debt.di.AddOtherDebtScreenInjector");
                        s4 s4Var = ((s4) bVarQ2).d;
                        r rVar = new r();
                        rVar.f119608a = e4m.b.b(e4m.c.a(addOtherDebtScreen));
                        b0 b0Var = new b0(s4Var, rVar, 1, 2);
                        rVar.f119609b = b0Var;
                        rVar.f119610c = e4m.b.b(b0Var);
                        rVar.d = e4m.b.b(new b0(s4Var, rVar, 0, 2));
                        rVar.e = e4m.b.b(rVar.f119609b);
                        rVar.f = e4m.b.b(new b0(s4Var, rVar, 3, 2));
                        rVar.f119611g = e4m.b.b(new b0(s4Var, rVar, 2, 2));
                        return rVar;
                    default:
                        KProperty[] kPropertyArr2 = AddOtherDebtScreen.f67429b0;
                        return (g) ((r) addOtherDebtScreen.W.getValue()).f119611g.get();
                }
            }
        });
        InputDisclosureDelegate inputDisclosureDelegate = new InputDisclosureDelegate();
        this.Y = inputDisclosureDelegate;
        this.Z = u.c(inputDisclosureDelegate);
        this.f67430a0 = s.t(this, b.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (r) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.f67430a0.getValue(this, f67429b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_application_outstanding_debts_add_debt_dialog_other_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_application_outstanding_debts_add_debt_dialog_other_title, null, null, 14), null);
        a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new t05.m(this, null, 11), 3);
        a.g2(this, new c(rd0.e.b(this.Y.f52538c), 29), null, new j(this, null, 25), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getZ() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getC0() {
        return this.V;
    }
}
