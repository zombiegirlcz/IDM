package com.revolut.feature.credit.direct.debit.new_account;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.direct.debit.R$id;
import com.revolut.feature.credit.direct.debit.R$layout;
import com.revolut.feature.credit.direct.debit.new_account.DirectDebitNewAccountScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dw3.l4;
import dw3.m4;
import fna.f;
import fyh.k;
import fz4.c;
import fz4.d;
import fz4.h;
import fz4.i;
import fz4.j;
import java.util.List;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/direct/debit/new_account/DirectDebitNewAccountScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lfz4/j;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lfz4/h;", "<init>", "()V", "feature_credit_direct_debit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DirectDebitNewAccountScreen extends BaseRecyclerViewScreen<j, IOData$EmptyInput, h> {
    public static final /* synthetic */ KProperty[] i0 = {o0.f186429a.j(new h0(DirectDebitNewAccountScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/direct/debit/databinding/ScreenCreditDirectDebitRecyclerNavbarTwinbuttonBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final Object X;
    public final Object Y;
    public final Lazy Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Lazy f69912a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final fv1.a f69913b0;
    public final Lazy c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Lazy f69914d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Lazy f69915e0;
    public final Lazy f0;
    public final List g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final ao.h f69916h0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, yy4.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/credit/direct/debit/databinding/ScreenCreditDirectDebitRecyclerNavbarTwinbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.creditDirectDebit_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.creditDirectDebit_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    i = R$id.creditDirectDebit_twinVerticalButton;
                    TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ViewBindings.findChildViewById(p0, i);
                    if (twinVerticalButton != null) {
                        return new yy4.a((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar, screenContentRecyclerView, twinVerticalButton);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public DirectDebitNewAccountScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_credit_direct_debit_recycler_navbar_twinbutton;
        this.V = R$id.creditDirectDebit_recyclerView;
        final int i = 1;
        this.W = true;
        final int i2 = 0;
        this.X = w.y0(new Function0(this) { // from class: fz4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDebitNewAccountScreen f139088b;

            {
                this.f139088b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                DirectDebitNewAccountScreen directDebitNewAccountScreen = this.f139088b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDebitNewAccountScreen.i0;
                        qji.b bVarQ2 = directDebitNewAccountScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.credit.direct.debit.new_account.di.NewAccountScreenInjector");
                        return (m4) ((l4) ((gz4.a) bVarQ2).b().S(directDebitNewAccountScreen)).mo3800build();
                    case 1:
                        KProperty[] kPropertyArr2 = DirectDebitNewAccountScreen.i0;
                        m4 m4Var = (m4) directDebitNewAccountScreen.X.getValue();
                        switch (m4Var.f119275a) {
                            case 0:
                                return (i) m4Var.f119277c.get();
                            case 1:
                                return (i) m4Var.f119277c.get();
                            default:
                                return (i) m4Var.f119277c.get();
                        }
                    default:
                        return new InputTextDelegate(directDebitNewAccountScreen.f69913b0);
                }
            }
        });
        this.Y = w.y0(new Function0(this) { // from class: fz4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDebitNewAccountScreen f139088b;

            {
                this.f139088b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                DirectDebitNewAccountScreen directDebitNewAccountScreen = this.f139088b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDebitNewAccountScreen.i0;
                        qji.b bVarQ2 = directDebitNewAccountScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.credit.direct.debit.new_account.di.NewAccountScreenInjector");
                        return (m4) ((l4) ((gz4.a) bVarQ2).b().S(directDebitNewAccountScreen)).mo3800build();
                    case 1:
                        KProperty[] kPropertyArr2 = DirectDebitNewAccountScreen.i0;
                        m4 m4Var = (m4) directDebitNewAccountScreen.X.getValue();
                        switch (m4Var.f119275a) {
                            case 0:
                                return (i) m4Var.f119277c.get();
                            case 1:
                                return (i) m4Var.f119277c.get();
                            default:
                                return (i) m4Var.f119277c.get();
                        }
                    default:
                        return new InputTextDelegate(directDebitNewAccountScreen.f69913b0);
                }
            }
        });
        Lazy lazyB = yhm.j.b(new k(10));
        this.Z = lazyB;
        Lazy lazyB2 = yhm.j.b(new k(11));
        this.f69912a0 = lazyB2;
        this.f69913b0 = new fv1.a(this, 9);
        final int i3 = 2;
        Lazy lazyB3 = yhm.j.b(new Function0(this) { // from class: fz4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DirectDebitNewAccountScreen f139088b;

            {
                this.f139088b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                DirectDebitNewAccountScreen directDebitNewAccountScreen = this.f139088b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = DirectDebitNewAccountScreen.i0;
                        qji.b bVarQ2 = directDebitNewAccountScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.credit.direct.debit.new_account.di.NewAccountScreenInjector");
                        return (m4) ((l4) ((gz4.a) bVarQ2).b().S(directDebitNewAccountScreen)).mo3800build();
                    case 1:
                        KProperty[] kPropertyArr2 = DirectDebitNewAccountScreen.i0;
                        m4 m4Var = (m4) directDebitNewAccountScreen.X.getValue();
                        switch (m4Var.f119275a) {
                            case 0:
                                return (i) m4Var.f119277c.get();
                            case 1:
                                return (i) m4Var.f119277c.get();
                            default:
                                return (i) m4Var.f119277c.get();
                        }
                    default:
                        return new InputTextDelegate(directDebitNewAccountScreen.f69913b0);
                }
            }
        });
        this.c0 = lazyB3;
        Lazy lazyB4 = yhm.j.b(new k(12));
        this.f69914d0 = lazyB4;
        Lazy lazyB5 = yhm.j.b(new k(13));
        this.f69915e0 = lazyB5;
        Lazy lazyB6 = yhm.j.b(new k(14));
        this.f0 = lazyB6;
        this.g0 = v.k((AccountCellItemDelegate) lazyB.getValue(), (ListSubheaderDelegate) lazyB2.getValue(), (TextDelegate) lazyB4.getValue(), (InputTextDelegate) lazyB3.getValue(), (InputChecklistDelegate) lazyB5.getValue(), (LargeActionButtonDelegate) lazyB6.getValue());
        this.f69916h0 = s.t(this, a.f);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        j uiState = (j) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().d.setMainButtonEnabled(uiState.f139095a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (m4) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f317808b.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().d.m0()), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().d.o0()), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((InputChecklistDelegate) this.f69915e0.getValue()).f52518c), null, new fz4.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((TextDelegate) this.f69914d0.getValue()).d), null, new f(this, continuation, 27), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        g3().f317809c.setTag(com.revolut.core.ui_kit.R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
        NavBarWithToolbar navBarWithToolbar = g3().f317808b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_direct_debit_new_account_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.credit_direct_debit_new_account_subtitle, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setDescriptionVisible(true);
        TwinVerticalButton twinVerticalButton = g3().d;
        twinVerticalButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
        twinVerticalButton.setSecondaryButtonVisible(false);
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        j uiState = (j) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().d.setMainButtonEnabled(uiState.f139095a);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getG0() {
        return this.g0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final yy4.a g3() {
        ViewBinding value = this.f69916h0.getValue(this, i0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (yy4.a) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final i T2() {
        return (i) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
