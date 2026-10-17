package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.AppTipDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.badge.FlagCircleBadge;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.AccountFieldsScreen;
import efm.r;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mzb.e;
import n3j.f;
import n3j.g;
import n3j.i;
import n3j.k;
import n3j.m;
import n3j.p;
import n3j.q;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import wp5.y;
import yhm.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/AccountFieldsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ln3j/q;", "Ldli/a;", "Ln3j/s;", "Companion", "a", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountFieldsScreen extends ViewController<q> implements dli.a {
    public final FullScreenStateDelegate K;
    public final RowDelegate L;
    public final FixedTabsDelegate M;
    public final Lazy N;
    public final LargeActionButtonDelegate O;
    public final ListSubheaderDelegate P;
    public final AppTipDelegate Q;
    public final Object R;
    public final int S;
    public final Object T;
    public final Object U;
    public final h V;
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(AccountFieldsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarCollapsingNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.AccountFieldsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public AccountFieldsScreen(AccountFieldsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new FullScreenStateDelegate();
        this.L = new RowDelegate(null, null, 7);
        this.M = new FixedTabsDelegate();
        final int i = 0;
        this.N = j.b(new Function0(this) { // from class: n3j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountFieldsScreen f212139b;

            {
                this.f212139b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountFieldsScreen accountFieldsScreen = this.f212139b;
                switch (i2) {
                    case 0:
                        AccountFieldsScreen.Companion companion = AccountFieldsScreen.INSTANCE;
                        return new InputTextDelegate(new mz3.r(accountFieldsScreen, 13));
                    case 1:
                        AccountFieldsScreen.Companion companion2 = AccountFieldsScreen.INSTANCE;
                        AccountFieldsScreen accountFieldsScreen2 = this.f212139b;
                        return dli.f.a(accountFieldsScreen2, accountFieldsScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), accountFieldsScreen2.L, accountFieldsScreen2.M, (InputTextDelegate) accountFieldsScreen2.N.getValue(), accountFieldsScreen2.O, accountFieldsScreen2.P, accountFieldsScreen2.K, accountFieldsScreen2.Q), R$id.recyclerView, null, null, null, 56);
                    default:
                        AccountFieldsScreen.Companion companion3 = AccountFieldsScreen.INSTANCE;
                        return (r) ((b3j.q) accountFieldsScreen.T.getValue()).f12087x.get();
                }
            }
        });
        this.O = new LargeActionButtonDelegate();
        this.P = new ListSubheaderDelegate();
        this.Q = new AppTipDelegate();
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: n3j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountFieldsScreen f212139b;

            {
                this.f212139b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountFieldsScreen accountFieldsScreen = this.f212139b;
                switch (i22) {
                    case 0:
                        AccountFieldsScreen.Companion companion = AccountFieldsScreen.INSTANCE;
                        return new InputTextDelegate(new mz3.r(accountFieldsScreen, 13));
                    case 1:
                        AccountFieldsScreen.Companion companion2 = AccountFieldsScreen.INSTANCE;
                        AccountFieldsScreen accountFieldsScreen2 = this.f212139b;
                        return dli.f.a(accountFieldsScreen2, accountFieldsScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), accountFieldsScreen2.L, accountFieldsScreen2.M, (InputTextDelegate) accountFieldsScreen2.N.getValue(), accountFieldsScreen2.O, accountFieldsScreen2.P, accountFieldsScreen2.K, accountFieldsScreen2.Q), R$id.recyclerView, null, null, null, 56);
                    default:
                        AccountFieldsScreen.Companion companion3 = AccountFieldsScreen.INSTANCE;
                        return (r) ((b3j.q) accountFieldsScreen.T.getValue()).f12087x.get();
                }
            }
        });
        this.S = R$layout.screen_recycler_navbar_collapsing_nextbutton;
        this.T = w.y0(new e(this, inputData, 10));
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: n3j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountFieldsScreen f212139b;

            {
                this.f212139b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccountFieldsScreen accountFieldsScreen = this.f212139b;
                switch (i22) {
                    case 0:
                        AccountFieldsScreen.Companion companion = AccountFieldsScreen.INSTANCE;
                        return new InputTextDelegate(new mz3.r(accountFieldsScreen, 13));
                    case 1:
                        AccountFieldsScreen.Companion companion2 = AccountFieldsScreen.INSTANCE;
                        AccountFieldsScreen accountFieldsScreen2 = this.f212139b;
                        return dli.f.a(accountFieldsScreen2, accountFieldsScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), accountFieldsScreen2.L, accountFieldsScreen2.M, (InputTextDelegate) accountFieldsScreen2.N.getValue(), accountFieldsScreen2.O, accountFieldsScreen2.P, accountFieldsScreen2.K, accountFieldsScreen2.Q), R$id.recyclerView, null, null, null, 56);
                    default:
                        AccountFieldsScreen.Companion companion3 = AccountFieldsScreen.INSTANCE;
                        return (r) ((b3j.q) accountFieldsScreen.T.getValue()).f12087x.get();
                }
            }
        });
        this.V = s.t(this, n3j.b.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        n3j.s uiState = (n3j.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174552c;
        p pVar = uiState.f212155b;
        if (pVar != null) {
            Clause clause = pVar.f212151b;
            ?? r4 = pVar.f212150a;
            navBarWithToolbar.setLoadingVisible(false);
            navBarWithToolbar.setToolbarTitle(r4);
            navBarWithToolbar.setTitle(r4, null);
            navBarWithToolbar.setSecondDescriptionText(clause);
            navBarWithToolbar.setSecondDescriptionVisible(clause != null);
            Image image = pVar.f212152c;
            navBarWithToolbar.setEndImage(image != null ? new yy0.j(image) : null);
            wi0.b bVar = pVar.d;
            navBarWithToolbar.setEndIconBadge(bVar != null ? new FlagCircleBadge(bVar.f297794a) : null);
            navBarWithToolbar.setMenuItems(pVar.e);
        } else {
            navBarWithToolbar.setLoadingVisible(true);
        }
        m mVar = uiState.f212156c;
        if (mVar == null) {
            CollapsingActionButton collapsingGoToButton = d3().f174551b;
            Intrinsics.checkNotNullExpressionValue(collapsingGoToButton, "collapsingGoToButton");
            collapsingGoToButton.setVisibility(8);
        } else {
            CollapsingActionButton collapsingActionButton = d3().f174551b;
            collapsingActionButton.setVisibility(0);
            collapsingActionButton.setLargeButtonText(mVar.f212144a);
            collapsingActionButton.setLargeButtonEnabled(mVar.f212145b);
            collapsingActionButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
            collapsingActionButton.setLoadingButtonTag("AccountFieldsScreenContract_BUTTON_TAG");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b3j.q) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174552c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174551b.setLargeButtonCustomE2ETestId("AddRecipientButton");
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174552c.f59410q), new n3j.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174552c.o.f57403b), new f(this, continuation, 2), 3);
        Lazy lazy = this.N;
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) lazy.getValue()).f52575g.f121375b), new n3j.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52707c), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52339c.f121375b), new f(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(this.K.f52371h.f121375b), new n3j.j(this, null), 3);
        r rVarHide = ((r4j.c) ((r4j.a) ((b3j.q) this.T.getValue()).f12088y.get())).f251468b.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        ViewController.P2(this, rd0.e.b(rVarHide), new f(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) lazy.getValue()).e.f121375b), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) lazy.getValue()).f.f121375b), new f(this, continuation, 5), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) lazy.getValue()).i.f121375b), new n3j.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174551b.d()), new n3j.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174551b.c()), new n3j.e(this, continuation, 0), 3);
        AppTipDelegate appTipDelegate = this.Q;
        ViewController.P2(this, y.x(appTipDelegate.d, appTipDelegate.f, "mergeWith(...)"), new f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(appTipDelegate.f51654g), new f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.L.f53218h), new g(this, null), 3);
    }

    public final jii.q d3() {
        ViewBinding value = this.V.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.q) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n3j.r R2() {
        return (n3j.r) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
