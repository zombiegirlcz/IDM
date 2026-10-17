package com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import buf.u;
import cd4.b;
import cd4.c;
import cd4.d;
import cd4.f;
import cd4.h;
import cd4.i;
import cd4.j;
import cd4.k;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginRecyclerViewScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.list.CreditLinkedAccountsV2ListScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import dw3.r8;
import j60.a;
import java.util.List;
import jii.x;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/list/CreditLinkedAccountsV2ListScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginRecyclerViewScreen;", "Lcd4/j;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/list/CreditLinkedAccountsV2ListScreenContract$InputData;", "Lcd4/h;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditLinkedAccountsV2ListScreen extends PluginRecyclerViewScreen<j, CreditLinkedAccountsV2ListScreenContract$InputData, h> {
    public static final /* synthetic */ KProperty[] g0 = {o0.f186429a.j(new h0(CreditLinkedAccountsV2ListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final ao.h V;
    public final int W;
    public final int X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f67846a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f67847b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f67848d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f67849e0;
    public final Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditLinkedAccountsV2ListScreen(CreditLinkedAccountsV2ListScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.V = s.t(this, b.f);
        this.W = R$layout.screen_recycler_navbar_two_buttons;
        this.X = R$id.screenRecyclerNavbarTwoButtons_recyclerView;
        this.Y = w.y0(new cbh.b(12));
        this.Z = w.y0(new cbh.b(13));
        this.f67846a0 = w.y0(new cbh.b(14));
        this.f67847b0 = w.y0(new cbh.b(15));
        final int i = 0;
        this.c0 = w.y0(new Function0(this) { // from class: cd4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditLinkedAccountsV2ListScreen f23173b;

            {
                this.f23173b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditLinkedAccountsV2ListScreen creditLinkedAccountsV2ListScreen = this.f23173b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditLinkedAccountsV2ListScreen.g0;
                        r8 r8Var = (r8) creditLinkedAccountsV2ListScreen.f67849e0.getValue();
                        switch (r8Var.f119697a) {
                            case 0:
                                return (j60.a) r8Var.e.get();
                            default:
                                return (j60.a) r8Var.e.get();
                        }
                    case 1:
                        return v.k((ListSubheaderDelegate) creditLinkedAccountsV2ListScreen.Y.getValue(), (RowDelegate) creditLinkedAccountsV2ListScreen.Z.getValue(), (LargeActionButtonDelegate) creditLinkedAccountsV2ListScreen.f67846a0.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) creditLinkedAccountsV2ListScreen.f67847b0.getValue());
                    default:
                        KProperty[] kPropertyArr2 = CreditLinkedAccountsV2ListScreen.g0;
                        r8 r8Var2 = (r8) creditLinkedAccountsV2ListScreen.f67849e0.getValue();
                        switch (r8Var2.f119697a) {
                            case 0:
                                return (i) r8Var2.k.get();
                            default:
                                return (i) r8Var2.k.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.f67848d0 = w.y0(new Function0(this) { // from class: cd4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditLinkedAccountsV2ListScreen f23173b;

            {
                this.f23173b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditLinkedAccountsV2ListScreen creditLinkedAccountsV2ListScreen = this.f23173b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditLinkedAccountsV2ListScreen.g0;
                        r8 r8Var = (r8) creditLinkedAccountsV2ListScreen.f67849e0.getValue();
                        switch (r8Var.f119697a) {
                            case 0:
                                return (j60.a) r8Var.e.get();
                            default:
                                return (j60.a) r8Var.e.get();
                        }
                    case 1:
                        return v.k((ListSubheaderDelegate) creditLinkedAccountsV2ListScreen.Y.getValue(), (RowDelegate) creditLinkedAccountsV2ListScreen.Z.getValue(), (LargeActionButtonDelegate) creditLinkedAccountsV2ListScreen.f67846a0.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) creditLinkedAccountsV2ListScreen.f67847b0.getValue());
                    default:
                        KProperty[] kPropertyArr2 = CreditLinkedAccountsV2ListScreen.g0;
                        r8 r8Var2 = (r8) creditLinkedAccountsV2ListScreen.f67849e0.getValue();
                        switch (r8Var2.f119697a) {
                            case 0:
                                return (i) r8Var2.k.get();
                            default:
                                return (i) r8Var2.k.get();
                        }
                }
            }
        });
        this.f67849e0 = w.y0(new u(this, inputData, 28));
        final int i3 = 2;
        this.f0 = w.y0(new Function0(this) { // from class: cd4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditLinkedAccountsV2ListScreen f23173b;

            {
                this.f23173b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditLinkedAccountsV2ListScreen creditLinkedAccountsV2ListScreen = this.f23173b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditLinkedAccountsV2ListScreen.g0;
                        r8 r8Var = (r8) creditLinkedAccountsV2ListScreen.f67849e0.getValue();
                        switch (r8Var.f119697a) {
                            case 0:
                                return (j60.a) r8Var.e.get();
                            default:
                                return (j60.a) r8Var.e.get();
                        }
                    case 1:
                        return v.k((ListSubheaderDelegate) creditLinkedAccountsV2ListScreen.Y.getValue(), (RowDelegate) creditLinkedAccountsV2ListScreen.Z.getValue(), (LargeActionButtonDelegate) creditLinkedAccountsV2ListScreen.f67846a0.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) creditLinkedAccountsV2ListScreen.f67847b0.getValue());
                    default:
                        KProperty[] kPropertyArr2 = CreditLinkedAccountsV2ListScreen.g0;
                        r8 r8Var2 = (r8) creditLinkedAccountsV2ListScreen.f67849e0.getValue();
                        switch (r8Var2.f119697a) {
                            case 0:
                                return (i) r8Var2.k.get();
                            default:
                                return (i) r8Var2.k.get();
                        }
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        k kVar = (k) T2();
        a aVar = kVar.f23181p;
        if (aVar.j()) {
            a.v(aVar, false, null, 3);
            return true;
        }
        if (!kVar.f23184s.f67851b) {
            return super.F2();
        }
        kVar.v2(h.b.f23176a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (r8) this.f67849e0.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174574c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174573b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().e.o), null, new c(this, null, 2), 3);
        h3().e.setText(new TextLocalisedClause(R$string.linked_accounts_v2_hub_action_add_another, null, null, 14));
        com.revolut.kompot.navigable.a.g2(this, e.b(((RowDelegate) this.Z.getValue()).f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((FullScreenStateDelegate) this.f67847b0.getValue()).f52371h.f121375b), null, new cd4.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((LargeActionButtonDelegate) this.f67846a0.getValue()).d.f121375b), null, new f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((a) this.c0.getValue()).d(zhm.u.c((LargeActionButtonDelegate) this.f67846a0.getValue()));
        NavBarWithToolbar navBarWithToolbar = h3().f174574c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setEnabled(false);
        LargeActionButton largeActionButton = h3().f174573b;
        largeActionButton.setText(new TextLocalisedClause(R$string.linked_accounts_v2_hub_action_continue, null, null, 14));
        largeActionButton.setEnabled(false);
        LargeActionButton largeActionButton2 = h3().e;
        largeActionButton2.setText(new TextLocalisedClause(R$string.linked_accounts_v2_hub_action_add_another, null, null, 14));
        largeActionButton2.o(LargeActionButton.ButtonStyle.f58726b);
        largeActionButton2.setEnabled(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getZ() {
        return (List) this.f67848d0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174574c;
        Clause clause = uiState.f23179b;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setDescriptionText(uiState.f23180c);
        LargeActionButton largeActionButton = h3().f174573b;
        boolean z = uiState.d;
        largeActionButton.setEnabled(z);
        h3().e.setEnabled(z);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.W;
    }

    public final x h3() {
        ViewBinding value = this.V.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final i T2() {
        return (i) this.f0.getValue();
    }
}
