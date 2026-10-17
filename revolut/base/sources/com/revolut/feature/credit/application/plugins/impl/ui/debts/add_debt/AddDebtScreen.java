package com.revolut.feature.credit.application.plugins.impl.ui.debts.add_debt;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginRecyclerViewScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.add_debt.AddDebtScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$layout;
import dw3.p;
import java.util.List;
import jii.u;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qvf.a;
import r84.b;
import r84.c;
import r84.d;
import r84.f;
import r84.g;
import r84.h;
import rd0.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/add_debt/AddDebtScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginRecyclerViewScreen;", "Lr84/h;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts/add_debt/AddDebtScreenContract$InputData;", "Lr84/f;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddDebtScreen extends PluginRecyclerViewScreen<h, AddDebtScreenContract$InputData, f> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f67423d0 = {o0.f186429a.j(new h0(AddDebtScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final InputChecklistDelegate f67424a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f67425b0;
    public final ao.h c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddDebtScreen(AddDebtScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.V = R$layout.screen_recycler_navbar_nextbutton;
        this.W = w.y0(new a(this, inputData, 20));
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: r84.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddDebtScreen f252353b;

            {
                this.f252353b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddDebtScreen addDebtScreen = this.f252353b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddDebtScreen.f67423d0;
                        return (g) ((p) addDebtScreen.W.getValue()).f119476j.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AddDebtScreen.f67423d0;
                        qd0.b bVarN = ((p) addDebtScreen.W.getValue()).f119472b.f118443h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr3 = AddDebtScreen.f67423d0;
                        return new InputTextDelegate(new r6f.i(addDebtScreen, 5));
                }
            }
        });
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: r84.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddDebtScreen f252353b;

            {
                this.f252353b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddDebtScreen addDebtScreen = this.f252353b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddDebtScreen.f67423d0;
                        return (g) ((p) addDebtScreen.W.getValue()).f119476j.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AddDebtScreen.f67423d0;
                        qd0.b bVarN = ((p) addDebtScreen.W.getValue()).f119472b.f118443h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr3 = AddDebtScreen.f67423d0;
                        return new InputTextDelegate(new r6f.i(addDebtScreen, 5));
                }
            }
        });
        final int i3 = 2;
        Lazy lazyY0 = w.y0(new Function0(this) { // from class: r84.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddDebtScreen f252353b;

            {
                this.f252353b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddDebtScreen addDebtScreen = this.f252353b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddDebtScreen.f67423d0;
                        return (g) ((p) addDebtScreen.W.getValue()).f119476j.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AddDebtScreen.f67423d0;
                        qd0.b bVarN = ((p) addDebtScreen.W.getValue()).f119472b.f118443h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr3 = AddDebtScreen.f67423d0;
                        return new InputTextDelegate(new r6f.i(addDebtScreen, 5));
                }
            }
        });
        this.Z = lazyY0;
        InputChecklistDelegate inputChecklistDelegate = new InputChecklistDelegate();
        this.f67424a0 = inputChecklistDelegate;
        this.f67425b0 = v.k((InputTextDelegate) lazyY0.getValue(), inputChecklistDelegate);
        this.c0 = s.t(this, b.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (p) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.f59410q), null, new r5e.e(navBarWithToolbar, this, null, 9), 3);
        LargeActionButton largeActionButton = h3().f174564b;
        largeActionButton.setEnabled(false);
        largeActionButton.setText(new TextLocalisedClause(R$string.credit_application_outstanding_debts_debt_details_action_add, null, null, 14));
        com.revolut.kompot.navigable.a.g2(this, e.b(largeActionButton.o), null, new r5e.e(largeActionButton, this, null, 10), 3);
        ?? r06 = this.Z;
        com.revolut.kompot.navigable.a.g2(this, e.b(((InputTextDelegate) r06.getValue()).e.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((InputTextDelegate) r06.getValue()).f52579m), null, new r5e.e(this, null, 11), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f67424a0.f52518c), null, new d(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF67425b0() {
        return this.f67425b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(h uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f252358a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        Clause clause = uiState.f252359b;
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        h3().f174564b.setEnabled(uiState.f252360c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.V;
    }

    public final u h3() {
        ViewBinding value = this.c0.getValue(this, f67423d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }
}
