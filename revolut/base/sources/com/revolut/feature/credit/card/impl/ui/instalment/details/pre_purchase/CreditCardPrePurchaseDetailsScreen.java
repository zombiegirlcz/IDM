package com.revolut.feature.credit.card.impl.ui.instalment.details.pre_purchase;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import au0.b1;
import au0.r0;
import au0.s0;
import au0.u0;
import au0.w0;
import au0.z0;
import aw0.k;
import br4.e;
import bs4.d;
import bs4.h;
import bs4.i;
import bs4.j;
import bs4.l;
import bs4.n;
import bs4.p;
import bs4.r;
import bs4.t;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.instalment.details.pre_purchase.CreditCardPrePurchaseDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.details.pre_purchase.CreditCardPrePurchaseDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ep4.b;
import java.util.List;
import jii.d0;
import jm4.a3;
import jm4.c1;
import jm4.u1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import no.m;
import org.jmrtd.lds.LDSFile;
import te0.w;
import tx0.j0;
import tx0.p2;
import tx0.t3;
import vc.s;
import yr4.c;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/details/pre_purchase/CreditCardPrePurchaseDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbs4/h;", "Ldli/a;", "Lbs4/r;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardPrePurchaseDetailsScreen extends ViewController<h> implements a, m {
    public static final /* synthetic */ KProperty[] X;
    public final /* synthetic */ b K;
    public final CreditCardPrePurchaseDetailsScreenContract$InputData L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final ao.h R;
    public final ao.h S;
    public final int T;
    public final Object U;
    public final Object V;
    public final Object W;

    static {
        h0 h0Var = new h0(CreditCardPrePurchaseDetailsScreen.class, "legacyBinding", "getLegacyBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        p0 p0Var = o0.f186429a;
        X = new KProperty[]{p0Var.j(h0Var), p.a.y(CreditCardPrePurchaseDetailsScreen.class, "redesignBinding", "getRedesignBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileBinding;", 0, p0Var)};
    }

    public CreditCardPrePurchaseDetailsScreen(CreditCardPrePurchaseDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        this.M = w.y0(new e(9));
        this.N = w.y0(new e(10));
        this.O = w.y0(new e(11));
        this.P = w.y0(new e(12));
        this.Q = w.y0(new e(13));
        this.R = s.t(this, bs4.b.f);
        this.S = s.t(this, bs4.e.f);
        this.T = inputData.f69385c ? R$layout.screen_recycler_navbarwithbigtile : R$layout.screen_recycler_navbar;
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: bs4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardPrePurchaseDetailsScreen f18043b;

            {
                this.f18043b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardPrePurchaseDetailsScreen creditCardPrePurchaseDetailsScreen = this.f18043b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardPrePurchaseDetailsScreen.X;
                        CreditCardPrePurchaseDetailsScreen creditCardPrePurchaseDetailsScreen2 = this.f18043b;
                        return dli.f.a(creditCardPrePurchaseDetailsScreen2, creditCardPrePurchaseDetailsScreen2.d(), zhm.v.k(new ProgressStepVerticalV2Delegate(), (ListSubheaderDelegate) creditCardPrePurchaseDetailsScreen2.M.getValue(), (FullScreenStateDelegate) creditCardPrePurchaseDetailsScreen2.P.getValue(), (CellDetailsDelegate) creditCardPrePurchaseDetailsScreen2.Q.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new ProgressStepVerticalLoadingV2Delegate(), new SwipeToActionDelegate((RowDelegate) creditCardPrePurchaseDetailsScreen2.O.getValue(), false)), creditCardPrePurchaseDetailsScreen2.L.f69385c ? R$id.screenRecyclerNavBarWithBigTile_recyclerView : R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardPrePurchaseDetailsScreen.X;
                        qji.b bVarU2 = creditCardPrePurchaseDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.details.pre_purchase.di.CreditCardPrePurchaseDetailsScreenInjector");
                        c1 c1Var = (c1) bVarU2;
                        a3 a3Var = c1Var.f176017b;
                        c1 c1Var2 = c1Var.f176018c;
                        CreditCardPrePurchaseDetailsScreenContract$InputData creditCardPrePurchaseDetailsScreenContract$InputData = creditCardPrePurchaseDetailsScreen.L;
                        creditCardPrePurchaseDetailsScreenContract$InputData.getClass();
                        return new u1(a3Var, c1Var2, creditCardPrePurchaseDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardPrePurchaseDetailsScreen.X;
                        return (t) ((u1) creditCardPrePurchaseDetailsScreen.V.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: bs4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardPrePurchaseDetailsScreen f18043b;

            {
                this.f18043b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardPrePurchaseDetailsScreen creditCardPrePurchaseDetailsScreen = this.f18043b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardPrePurchaseDetailsScreen.X;
                        CreditCardPrePurchaseDetailsScreen creditCardPrePurchaseDetailsScreen2 = this.f18043b;
                        return dli.f.a(creditCardPrePurchaseDetailsScreen2, creditCardPrePurchaseDetailsScreen2.d(), zhm.v.k(new ProgressStepVerticalV2Delegate(), (ListSubheaderDelegate) creditCardPrePurchaseDetailsScreen2.M.getValue(), (FullScreenStateDelegate) creditCardPrePurchaseDetailsScreen2.P.getValue(), (CellDetailsDelegate) creditCardPrePurchaseDetailsScreen2.Q.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new ProgressStepVerticalLoadingV2Delegate(), new SwipeToActionDelegate((RowDelegate) creditCardPrePurchaseDetailsScreen2.O.getValue(), false)), creditCardPrePurchaseDetailsScreen2.L.f69385c ? R$id.screenRecyclerNavBarWithBigTile_recyclerView : R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardPrePurchaseDetailsScreen.X;
                        qji.b bVarU2 = creditCardPrePurchaseDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.details.pre_purchase.di.CreditCardPrePurchaseDetailsScreenInjector");
                        c1 c1Var = (c1) bVarU2;
                        a3 a3Var = c1Var.f176017b;
                        c1 c1Var2 = c1Var.f176018c;
                        CreditCardPrePurchaseDetailsScreenContract$InputData creditCardPrePurchaseDetailsScreenContract$InputData = creditCardPrePurchaseDetailsScreen.L;
                        creditCardPrePurchaseDetailsScreenContract$InputData.getClass();
                        return new u1(a3Var, c1Var2, creditCardPrePurchaseDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardPrePurchaseDetailsScreen.X;
                        return (t) ((u1) creditCardPrePurchaseDetailsScreen.V.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: bs4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardPrePurchaseDetailsScreen f18043b;

            {
                this.f18043b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardPrePurchaseDetailsScreen creditCardPrePurchaseDetailsScreen = this.f18043b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardPrePurchaseDetailsScreen.X;
                        CreditCardPrePurchaseDetailsScreen creditCardPrePurchaseDetailsScreen2 = this.f18043b;
                        return dli.f.a(creditCardPrePurchaseDetailsScreen2, creditCardPrePurchaseDetailsScreen2.d(), zhm.v.k(new ProgressStepVerticalV2Delegate(), (ListSubheaderDelegate) creditCardPrePurchaseDetailsScreen2.M.getValue(), (FullScreenStateDelegate) creditCardPrePurchaseDetailsScreen2.P.getValue(), (CellDetailsDelegate) creditCardPrePurchaseDetailsScreen2.Q.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new ProgressStepVerticalLoadingV2Delegate(), new SwipeToActionDelegate((RowDelegate) creditCardPrePurchaseDetailsScreen2.O.getValue(), false)), creditCardPrePurchaseDetailsScreen2.L.f69385c ? R$id.screenRecyclerNavBarWithBigTile_recyclerView : R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardPrePurchaseDetailsScreen.X;
                        qji.b bVarU2 = creditCardPrePurchaseDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.details.pre_purchase.di.CreditCardPrePurchaseDetailsScreenInjector");
                        c1 c1Var = (c1) bVarU2;
                        a3 a3Var = c1Var.f176017b;
                        c1 c1Var2 = c1Var.f176018c;
                        CreditCardPrePurchaseDetailsScreenContract$InputData creditCardPrePurchaseDetailsScreenContract$InputData = creditCardPrePurchaseDetailsScreen.L;
                        creditCardPrePurchaseDetailsScreenContract$InputData.getClass();
                        return new u1(a3Var, c1Var2, creditCardPrePurchaseDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardPrePurchaseDetailsScreen.X;
                        return (t) ((u1) creditCardPrePurchaseDetailsScreen.V.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    public final void B(o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        bs4.q qVar2 = uiState.f18057a;
        if (qVar2 instanceof p) {
            p pVar = (p) qVar2;
            NavBarWithBigTile navBarWithBigTile = f3().f174510b;
            if (!(pVar instanceof bs4.m)) {
                if (pVar instanceof bs4.o) {
                    navBarWithBigTile.setLoadingState(true);
                    return;
                } else {
                    if (!(pVar instanceof n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    navBarWithBigTile.setLoadingState(false);
                    return;
                }
            }
            c cVar = ((bs4.m) pVar).f18054a;
            ?? r06 = cVar.f316119b;
            NavBarWithContainerBackground navBarWithContainerBackground = cVar.f316121g;
            navBarWithBigTile.setLoadingState(false);
            au0.c1.S(navBarWithBigTile, u.c(new u0(navBarWithContainerBackground == null ? NavBarWithContainerBackground.TransparentBackground.f57882a : navBarWithContainerBackground, new z0(cVar.f316118a, false), null, new w0(cVar.f316120c))), null, null, 6);
            navBarWithBigTile.setActionStatusLabel(new k(6, r06, null, false));
            navBarWithBigTile.setToolbarTitle(r06);
            gs4.a aVar = cVar.d;
            Image image = aVar.f146305a;
            AvatarModel.State state = cVar.e;
            CircleIconBadge circleIconBadge = aVar.f146306b;
            navBarWithBigTile.setAvatar(new AvatarModel.Default(image, state, null, null, circleIconBadge != null ? new AvatarModel.BadgeModel(circleIconBadge, com.revolut.core.ui_kit.models.avatar.b.BOTTOM) : null, null, LDSFile.EF_DG12_TAG), navBarWithContainerBackground != null ? r0.DEFAULT : r0.BLURRED_BACKGROUND);
            navBarWithBigTile.setActions(cVar.f);
            return;
        }
        if (!(qVar2 instanceof l)) {
            throw new NoWhenBranchMatchedException();
        }
        l lVar = (l) qVar2;
        NavBarWithToolbar navBarWithToolbar = e3().f174539b;
        navBarWithToolbar.setSecondDescriptionVisible(true);
        if (!(lVar instanceof i)) {
            if (lVar instanceof bs4.k) {
                navBarWithToolbar.I0(t3.PROFILE, false);
                return;
            } else {
                if (!(lVar instanceof j)) {
                    throw new NoWhenBranchMatchedException();
                }
                navBarWithToolbar.l0();
                return;
            }
        }
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.l0();
        i iVar = (i) lVar;
        MoneyClause moneyClause = iVar.f18049a;
        navBarWithToolbar.setTitle(moneyClause, null);
        navBarWithToolbar.setToolbarTitle(moneyClause);
        navBarWithToolbar.setDescriptionText(iVar.f18050b);
        navBarWithToolbar.setSecondDescriptionText(iVar.f18051c);
        gs4.a aVar2 = iVar.e;
        navBarWithToolbar.setEndImage(new yy0.j(aVar2.f146305a));
        navBarWithToolbar.setEndProgress(aVar2.f146307c);
        navBarWithToolbar.setEndIconBadge(aVar2.f146306b);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setFilters(iVar.d);
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
        return (u1) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        if (!this.L.f69385c) {
            NavBarWithToolbar navBarWithToolbar = e3().f174539b;
            navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
            navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        } else {
            NavBarWithBigTile navBarWithBigTile = f3().f174510b;
            navBarWithBigTile.setLayoutType(s0.CENTERED_SMALL_BUTTONS);
            navBarWithBigTile.setTitleStyle(b1.LARGE_SINGLE_LINE);
            navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
            navBarWithBigTile.setHeightMode(p2.f275222a);
            navBarWithBigTile.setIconClickable(false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(((ListCellDelegate) this.N.getValue()).f52692c), rd0.e.b(((CellDetailsDelegate) this.Q.getValue()).d), rd0.e.b(((FullScreenStateDelegate) this.P.getValue()).f52371h.f121375b)), null, new bs4.c(this, null, 0), 3);
        if (this.L.f69385c) {
            NavBarWithBigTile navBarWithBigTile = f3().f174510b;
            com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(navBarWithBigTile.b()), rd0.e.b(navBarWithBigTile.K())), null, new bs4.c(this, null, 1), 3);
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile.f59357t), null, new d(this, null, 0), 3);
        } else {
            NavBarWithToolbar navBarWithToolbar = e3().f174539b;
            com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(navBarWithToolbar.o.f57403b), rd0.e.b(navBarWithToolbar.s0())), null, new bs4.c(this, null, 2), 3);
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new d(this, null, 1), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final t d() {
        return (t) this.W.getValue();
    }

    public final jii.m e3() {
        ViewBinding value = this.R.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    public final d0 f3() {
        ViewBinding value = this.S.getValue(this, X[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d0) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
