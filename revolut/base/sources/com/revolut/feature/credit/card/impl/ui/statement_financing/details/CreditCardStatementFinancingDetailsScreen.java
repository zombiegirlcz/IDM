package com.revolut.feature.credit.card.impl.ui.statement_financing.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.c1;
import au0.r0;
import au0.s0;
import au0.u0;
import au0.w0;
import au0.z0;
import aw0.k;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
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
import com.revolut.feature.credit.card.impl.ui.statement_financing.details.CreditCardStatementFinancingDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.statement_financing.details.CreditCardStatementFinancingDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ep4.b;
import ew4.d;
import ew4.f;
import ew4.i;
import ew4.l;
import ew4.n;
import ew4.p;
import ew4.r;
import ew4.t;
import java.util.List;
import jii.d0;
import jm4.a3;
import jm4.q2;
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
import tx0.p2;
import tx0.t3;
import vc.s;
import xki.e;
import yr4.c;
import yy0.j;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement_financing/details/CreditCardStatementFinancingDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lew4/i;", "Ldli/a;", "Lew4/t;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardStatementFinancingDetailsScreen extends ViewController<i> implements dli.a, m {
    public static final /* synthetic */ KProperty[] W;
    public final /* synthetic */ b K;
    public final CreditCardStatementFinancingDetailsScreenContract$InputData L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final h Q;
    public final h R;
    public final int S;
    public final Object T;
    public final Object U;
    public final Object V;

    static {
        h0 h0Var = new h0(CreditCardStatementFinancingDetailsScreen.class, "legacyBinding", "getLegacyBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        p0 p0Var = o0.f186429a;
        W = new KProperty[]{p0Var.j(h0Var), p.a.y(CreditCardStatementFinancingDetailsScreen.class, "redesignBinding", "getRedesignBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileBinding;", 0, p0Var)};
    }

    public CreditCardStatementFinancingDetailsScreen(CreditCardStatementFinancingDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        this.M = w.y0(new euf.a(10));
        this.N = w.y0(new euf.a(11));
        this.O = w.y0(new euf.a(12));
        this.P = w.y0(new euf.a(13));
        this.Q = s.t(this, ew4.b.f);
        this.R = s.t(this, f.f);
        this.S = inputData.f69748c ? R$layout.screen_recycler_navbarwithbigtile : R$layout.screen_recycler_navbar;
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: ew4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementFinancingDetailsScreen f130072b;

            {
                this.f130072b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardStatementFinancingDetailsScreen creditCardStatementFinancingDetailsScreen = this.f130072b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementFinancingDetailsScreen.W;
                        CreditCardStatementFinancingDetailsScreen creditCardStatementFinancingDetailsScreen2 = this.f130072b;
                        return dli.f.a(creditCardStatementFinancingDetailsScreen2, creditCardStatementFinancingDetailsScreen2.d(), zhm.v.k((ListSubheaderDelegate) creditCardStatementFinancingDetailsScreen2.M.getValue(), (FullScreenStateDelegate) creditCardStatementFinancingDetailsScreen2.O.getValue(), (CellDetailsDelegate) creditCardStatementFinancingDetailsScreen2.P.getValue(), (RowDelegate) creditCardStatementFinancingDetailsScreen2.N.getValue(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new ProgressStepVerticalLoadingV2Delegate(), new ProgressStepVerticalV2Delegate(), new FooterTextDelegate()), creditCardStatementFinancingDetailsScreen2.L.f69748c ? R$id.screenRecyclerNavBarWithBigTile_recyclerView : R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementFinancingDetailsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardStatementFinancingDetailsScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardStatementFinancingDetailsScreenContract$InputData creditCardStatementFinancingDetailsScreenContract$InputData = creditCardStatementFinancingDetailsScreen.L;
                        creditCardStatementFinancingDetailsScreenContract$InputData.getClass();
                        return new q2(a3Var, creditCardStatementFinancingDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementFinancingDetailsScreen.W;
                        return (j) ((q2) creditCardStatementFinancingDetailsScreen.U.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: ew4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementFinancingDetailsScreen f130072b;

            {
                this.f130072b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardStatementFinancingDetailsScreen creditCardStatementFinancingDetailsScreen = this.f130072b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementFinancingDetailsScreen.W;
                        CreditCardStatementFinancingDetailsScreen creditCardStatementFinancingDetailsScreen2 = this.f130072b;
                        return dli.f.a(creditCardStatementFinancingDetailsScreen2, creditCardStatementFinancingDetailsScreen2.d(), zhm.v.k((ListSubheaderDelegate) creditCardStatementFinancingDetailsScreen2.M.getValue(), (FullScreenStateDelegate) creditCardStatementFinancingDetailsScreen2.O.getValue(), (CellDetailsDelegate) creditCardStatementFinancingDetailsScreen2.P.getValue(), (RowDelegate) creditCardStatementFinancingDetailsScreen2.N.getValue(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new ProgressStepVerticalLoadingV2Delegate(), new ProgressStepVerticalV2Delegate(), new FooterTextDelegate()), creditCardStatementFinancingDetailsScreen2.L.f69748c ? R$id.screenRecyclerNavBarWithBigTile_recyclerView : R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementFinancingDetailsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardStatementFinancingDetailsScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardStatementFinancingDetailsScreenContract$InputData creditCardStatementFinancingDetailsScreenContract$InputData = creditCardStatementFinancingDetailsScreen.L;
                        creditCardStatementFinancingDetailsScreenContract$InputData.getClass();
                        return new q2(a3Var, creditCardStatementFinancingDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementFinancingDetailsScreen.W;
                        return (j) ((q2) creditCardStatementFinancingDetailsScreen.U.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: ew4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementFinancingDetailsScreen f130072b;

            {
                this.f130072b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardStatementFinancingDetailsScreen creditCardStatementFinancingDetailsScreen = this.f130072b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementFinancingDetailsScreen.W;
                        CreditCardStatementFinancingDetailsScreen creditCardStatementFinancingDetailsScreen2 = this.f130072b;
                        return dli.f.a(creditCardStatementFinancingDetailsScreen2, creditCardStatementFinancingDetailsScreen2.d(), zhm.v.k((ListSubheaderDelegate) creditCardStatementFinancingDetailsScreen2.M.getValue(), (FullScreenStateDelegate) creditCardStatementFinancingDetailsScreen2.O.getValue(), (CellDetailsDelegate) creditCardStatementFinancingDetailsScreen2.P.getValue(), (RowDelegate) creditCardStatementFinancingDetailsScreen2.N.getValue(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new ProgressStepVerticalLoadingV2Delegate(), new ProgressStepVerticalV2Delegate(), new FooterTextDelegate()), creditCardStatementFinancingDetailsScreen2.L.f69748c ? R$id.screenRecyclerNavBarWithBigTile_recyclerView : R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementFinancingDetailsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardStatementFinancingDetailsScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditCardStatementFinancingDetailsScreenContract$InputData creditCardStatementFinancingDetailsScreenContract$InputData = creditCardStatementFinancingDetailsScreen.L;
                        creditCardStatementFinancingDetailsScreenContract$InputData.getClass();
                        return new q2(a3Var, creditCardStatementFinancingDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementFinancingDetailsScreen.W;
                        return (j) ((q2) creditCardStatementFinancingDetailsScreen.U.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        t uiState = (t) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ew4.s sVar = uiState.f130086a;
        if (sVar instanceof r) {
            r rVar = (r) sVar;
            NavBarWithBigTile navBarWithBigTile = f3().f174510b;
            if (!(rVar instanceof ew4.o)) {
                if (rVar instanceof ew4.q) {
                    navBarWithBigTile.setLoadingState(true);
                    return;
                } else {
                    if (!(rVar instanceof p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    navBarWithBigTile.setLoadingState(false);
                    return;
                }
            }
            c cVar = ((ew4.o) rVar).f130083a;
            ?? r06 = cVar.f316119b;
            NavBarWithContainerBackground navBarWithContainerBackground = cVar.f316121g;
            navBarWithBigTile.setLoadingState(false);
            c1.S(navBarWithBigTile, u.c(new u0(navBarWithContainerBackground == null ? NavBarWithContainerBackground.TransparentBackground.f57882a : navBarWithContainerBackground, new z0(cVar.f316118a, false), null, new w0(cVar.f316120c))), null, null, 6);
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
        if (!(sVar instanceof n)) {
            throw new NoWhenBranchMatchedException();
        }
        n nVar = (n) sVar;
        NavBarWithToolbar navBarWithToolbar = e3().f174539b;
        if (!(nVar instanceof ew4.k)) {
            if (nVar instanceof ew4.m) {
                t3 t3Var = t3.PROFILE;
                NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
                navBarWithToolbar.I0(t3Var, false);
                return;
            } else {
                if (!(nVar instanceof l)) {
                    throw new NoWhenBranchMatchedException();
                }
                navBarWithToolbar.l0();
                return;
            }
        }
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.l0();
        ew4.k kVar = (ew4.k) nVar;
        MoneyClause moneyClause = kVar.f130078a;
        gs4.a aVar2 = kVar.d;
        navBarWithToolbar.setTitle(moneyClause, null);
        navBarWithToolbar.setToolbarTitle(moneyClause);
        navBarWithToolbar.setDescriptionText(kVar.f130079b);
        navBarWithToolbar.setSecondDescriptionText(kVar.f130080c);
        navBarWithToolbar.setEndImage(new j(aVar2.f146305a));
        navBarWithToolbar.setEndIconBadge(aVar2.f146306b);
        navBarWithToolbar.setEndProgress(aVar2.f146307c);
        navBarWithToolbar.setFilters(kVar.e);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q2) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        if (!this.L.f69748c) {
            e3().f174539b.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
            return;
        }
        NavBarWithBigTile navBarWithBigTile = f3().f174510b;
        navBarWithBigTile.setLayoutType(s0.CENTERED_SMALL_BUTTONS);
        navBarWithBigTile.setTitleStyle(b1.LARGE_SINGLE_LINE);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setHeightMode(p2.f275222a);
        navBarWithBigTile.setIconClickable(false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(((CellDetailsDelegate) this.P.getValue()).d), rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), rd0.e.b(((RowDelegate) this.N.getValue()).f53218h)), null, new ew4.c(this, null, 0), 3);
        if (this.L.f69748c) {
            NavBarWithBigTile navBarWithBigTile = f3().f174510b;
            com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(navBarWithBigTile.b()), rd0.e.b(navBarWithBigTile.K())), null, new ew4.c(this, null, 1), 3);
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile.f59357t), null, new d(this, null, 0), 3);
        } else {
            NavBarWithToolbar navBarWithToolbar = e3().f174539b;
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.s0()), null, new ew4.e(this, null), 3);
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new d(this, null, 1), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final ew4.j d() {
        return (ew4.j) this.V.getValue();
    }

    public final jii.m e3() {
        ViewBinding value = this.Q.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    public final d0 f3() {
        ViewBinding value = this.R.getValue(this, W[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d0) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
