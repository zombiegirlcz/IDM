package com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase;

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
import com.revolut.core.ui_kit.delegates.AppTipDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
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
import com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.InstalmentDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ep4.b;
import java.util.List;
import jii.d0;
import jm4.a3;
import jm4.c4;
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
import tx0.r3;
import tx0.t3;
import vc.s;
import vkm.d;
import xki.e;
import yy0.j;
import zr4.c;
import zr4.f;
import zr4.l;
import zr4.n;
import zr4.p;
import zr4.r;
import zr4.t;
import zr4.u;
import zr4.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/details/post_purchase/InstalmentDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzr4/l;", "Ldli/a;", "Lzr4/w;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstalmentDetailsScreen extends ViewController<l> implements dli.a, m {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f69363b0;
    public final /* synthetic */ b K;
    public final InstalmentDetailsScreenContract$InputData L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final h V;
    public final h W;
    public final int X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f69364a0;

    static {
        h0 h0Var = new h0(InstalmentDetailsScreen.class, "legacyBinding", "getLegacyBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        p0 p0Var = o0.f186429a;
        f69363b0 = new KProperty[]{p0Var.j(h0Var), p.a.y(InstalmentDetailsScreen.class, "redesignBinding", "getRedesignBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileBinding;", 0, p0Var)};
    }

    public InstalmentDetailsScreen(InstalmentDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        this.M = w.y0(new zj9.a(27));
        this.N = w.y0(new zj9.a(29));
        this.O = w.y0(new zr4.b(0));
        this.P = w.y0(new zr4.b(1));
        this.Q = w.y0(new zr4.b(2));
        this.R = w.y0(new zr4.b(3));
        this.S = w.y0(new zr4.b(4));
        this.T = w.y0(new zr4.b(5));
        this.U = w.y0(new zj9.a(28));
        this.V = s.t(this, c.f);
        this.W = s.t(this, f.f);
        this.X = inputData.f69370c ? R$layout.screen_recycler_navbarwithbigtile : R$layout.screen_recycler_navbar;
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: zr4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstalmentDetailsScreen f324551b;

            {
                this.f324551b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InstalmentDetailsScreen instalmentDetailsScreen = this.f324551b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InstalmentDetailsScreen.f69363b0;
                        InstalmentDetailsScreen instalmentDetailsScreen2 = this.f324551b;
                        m mVarR2 = instalmentDetailsScreen2.R2();
                        ListSubheaderDelegate listSubheaderDelegate = (ListSubheaderDelegate) instalmentDetailsScreen2.M.getValue();
                        LargeActionButtonDelegate largeActionButtonDelegate = (LargeActionButtonDelegate) instalmentDetailsScreen2.O.getValue();
                        CounterTextDelegate counterTextDelegate = (CounterTextDelegate) instalmentDetailsScreen2.P.getValue();
                        FullScreenStateDelegate fullScreenStateDelegate = (FullScreenStateDelegate) instalmentDetailsScreen2.R.getValue();
                        CellDetailsDelegate cellDetailsDelegate = (CellDetailsDelegate) instalmentDetailsScreen2.S.getValue();
                        ?? r87 = instalmentDetailsScreen2.Q;
                        return dli.f.a(instalmentDetailsScreen2, mVarR2, zhm.v.k(listSubheaderDelegate, largeActionButtonDelegate, counterTextDelegate, fullScreenStateDelegate, cellDetailsDelegate, (RowDelegate) r87.getValue(), (CellDetailsChevronDelegate) instalmentDetailsScreen2.U.getValue(), (CellDetailsActionDelegate) instalmentDetailsScreen2.T.getValue(), new AppTipDelegate(), new PlainTextWarningDelegate(), new ProgressStepVerticalV2Delegate(), new SwipeToActionDelegate((RowDelegate) r87.getValue(), false), new FooterTextDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new ProgressStepVerticalLoadingV2Delegate()), instalmentDetailsScreen2.L.f69370c ? R$id.screenRecyclerNavBarWithBigTile_recyclerView : R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InstalmentDetailsScreen.f69363b0;
                        phm.a aVar = (phm.a) ue0.e.j(instalmentDetailsScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (c4) ((as4.a) ((as4.b) aVar2.b()).c().mo3808a(instalmentDetailsScreen)).y(instalmentDetailsScreen.L).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = InstalmentDetailsScreen.f69363b0;
                        c4 c4Var = (c4) instalmentDetailsScreen.Z.getValue();
                        switch (c4Var.f176027a) {
                            case 0:
                                return (m) c4Var.f176030g.get();
                            default:
                                return (m) c4Var.f176030g.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: zr4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstalmentDetailsScreen f324551b;

            {
                this.f324551b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InstalmentDetailsScreen instalmentDetailsScreen = this.f324551b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InstalmentDetailsScreen.f69363b0;
                        InstalmentDetailsScreen instalmentDetailsScreen2 = this.f324551b;
                        m mVarR2 = instalmentDetailsScreen2.R2();
                        ListSubheaderDelegate listSubheaderDelegate = (ListSubheaderDelegate) instalmentDetailsScreen2.M.getValue();
                        LargeActionButtonDelegate largeActionButtonDelegate = (LargeActionButtonDelegate) instalmentDetailsScreen2.O.getValue();
                        CounterTextDelegate counterTextDelegate = (CounterTextDelegate) instalmentDetailsScreen2.P.getValue();
                        FullScreenStateDelegate fullScreenStateDelegate = (FullScreenStateDelegate) instalmentDetailsScreen2.R.getValue();
                        CellDetailsDelegate cellDetailsDelegate = (CellDetailsDelegate) instalmentDetailsScreen2.S.getValue();
                        ?? r87 = instalmentDetailsScreen2.Q;
                        return dli.f.a(instalmentDetailsScreen2, mVarR2, zhm.v.k(listSubheaderDelegate, largeActionButtonDelegate, counterTextDelegate, fullScreenStateDelegate, cellDetailsDelegate, (RowDelegate) r87.getValue(), (CellDetailsChevronDelegate) instalmentDetailsScreen2.U.getValue(), (CellDetailsActionDelegate) instalmentDetailsScreen2.T.getValue(), new AppTipDelegate(), new PlainTextWarningDelegate(), new ProgressStepVerticalV2Delegate(), new SwipeToActionDelegate((RowDelegate) r87.getValue(), false), new FooterTextDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new ProgressStepVerticalLoadingV2Delegate()), instalmentDetailsScreen2.L.f69370c ? R$id.screenRecyclerNavBarWithBigTile_recyclerView : R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InstalmentDetailsScreen.f69363b0;
                        phm.a aVar = (phm.a) ue0.e.j(instalmentDetailsScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (c4) ((as4.a) ((as4.b) aVar2.b()).c().mo3808a(instalmentDetailsScreen)).y(instalmentDetailsScreen.L).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = InstalmentDetailsScreen.f69363b0;
                        c4 c4Var = (c4) instalmentDetailsScreen.Z.getValue();
                        switch (c4Var.f176027a) {
                            case 0:
                                return (m) c4Var.f176030g.get();
                            default:
                                return (m) c4Var.f176030g.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.f69364a0 = w.y0(new Function0(this) { // from class: zr4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstalmentDetailsScreen f324551b;

            {
                this.f324551b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InstalmentDetailsScreen instalmentDetailsScreen = this.f324551b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InstalmentDetailsScreen.f69363b0;
                        InstalmentDetailsScreen instalmentDetailsScreen2 = this.f324551b;
                        m mVarR2 = instalmentDetailsScreen2.R2();
                        ListSubheaderDelegate listSubheaderDelegate = (ListSubheaderDelegate) instalmentDetailsScreen2.M.getValue();
                        LargeActionButtonDelegate largeActionButtonDelegate = (LargeActionButtonDelegate) instalmentDetailsScreen2.O.getValue();
                        CounterTextDelegate counterTextDelegate = (CounterTextDelegate) instalmentDetailsScreen2.P.getValue();
                        FullScreenStateDelegate fullScreenStateDelegate = (FullScreenStateDelegate) instalmentDetailsScreen2.R.getValue();
                        CellDetailsDelegate cellDetailsDelegate = (CellDetailsDelegate) instalmentDetailsScreen2.S.getValue();
                        ?? r87 = instalmentDetailsScreen2.Q;
                        return dli.f.a(instalmentDetailsScreen2, mVarR2, zhm.v.k(listSubheaderDelegate, largeActionButtonDelegate, counterTextDelegate, fullScreenStateDelegate, cellDetailsDelegate, (RowDelegate) r87.getValue(), (CellDetailsChevronDelegate) instalmentDetailsScreen2.U.getValue(), (CellDetailsActionDelegate) instalmentDetailsScreen2.T.getValue(), new AppTipDelegate(), new PlainTextWarningDelegate(), new ProgressStepVerticalV2Delegate(), new SwipeToActionDelegate((RowDelegate) r87.getValue(), false), new FooterTextDelegate(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new ProgressStepVerticalLoadingV2Delegate()), instalmentDetailsScreen2.L.f69370c ? R$id.screenRecyclerNavBarWithBigTile_recyclerView : R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InstalmentDetailsScreen.f69363b0;
                        phm.a aVar = (phm.a) ue0.e.j(instalmentDetailsScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (c4) ((as4.a) ((as4.b) aVar2.b()).c().mo3808a(instalmentDetailsScreen)).y(instalmentDetailsScreen.L).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = InstalmentDetailsScreen.f69363b0;
                        c4 c4Var = (c4) instalmentDetailsScreen.Z.getValue();
                        switch (c4Var.f176027a) {
                            case 0:
                                return (m) c4Var.f176030g.get();
                            default:
                                return (m) c4Var.f176030g.get();
                        }
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
        zr4.w uiState = (zr4.w) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        v vVar = uiState.f324579a;
        if (vVar instanceof u) {
            u uVar = (u) vVar;
            NavBarWithBigTile navBarWithBigTile = e3().f174510b;
            if (!(uVar instanceof r)) {
                if (uVar instanceof t) {
                    navBarWithBigTile.setLoadingState(true);
                    return;
                } else {
                    if (!(uVar instanceof zr4.s)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    navBarWithBigTile.setLoadingState(false);
                    return;
                }
            }
            yr4.c cVar = ((r) uVar).f324576a;
            ?? r06 = cVar.f316119b;
            NavBarWithContainerBackground navBarWithContainerBackground = cVar.f316121g;
            navBarWithBigTile.setLoadingState(false);
            c1.S(navBarWithBigTile, zhm.u.c(new u0(navBarWithContainerBackground == null ? NavBarWithContainerBackground.TransparentBackground.f57882a : navBarWithContainerBackground, new z0(cVar.f316118a, false), null, new w0(cVar.f316120c))), null, null, 6);
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
        if (!(vVar instanceof zr4.q)) {
            throw new NoWhenBranchMatchedException();
        }
        zr4.q qVar2 = (zr4.q) vVar;
        ViewBinding value = this.V.getValue(this, f69363b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setSecondDescriptionVisible(true);
        if (!(qVar2 instanceof n)) {
            if (qVar2 instanceof p) {
                navBarWithToolbar.H0(false);
                navBarWithToolbar.I0(t3.DEFAULT, false);
                navBarWithToolbar.setNavigationButtonImage(((p) qVar2).f324575a);
                return;
            } else {
                if (!(qVar2 instanceof zr4.o)) {
                    throw new NoWhenBranchMatchedException();
                }
                navBarWithToolbar.l0();
                navBarWithToolbar.setNavigationButtonImage(((zr4.o) qVar2).f324574a);
                return;
            }
        }
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.l0();
        n nVar = (n) qVar2;
        MoneyClause moneyClause = nVar.f324571a;
        gs4.a aVar2 = nVar.e;
        navBarWithToolbar.setTitle(moneyClause, null);
        navBarWithToolbar.setToolbarTitle(moneyClause);
        navBarWithToolbar.setDescriptionText(nVar.f324572b);
        navBarWithToolbar.setSecondDescriptionText(nVar.f324573c);
        navBarWithToolbar.setNavigationButtonImage(nVar.d);
        navBarWithToolbar.setFilters(nVar.f);
        navBarWithToolbar.setEndImage(new r3(new j(aVar2.f146305a)));
        navBarWithToolbar.setEndIconBadge(aVar2.f146306b);
        navBarWithToolbar.setEndProgress(aVar2.f146307c);
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
    public final e R1() {
        return (c4) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.L.f69370c) {
            NavBarWithBigTile navBarWithBigTile = e3().f174510b;
            navBarWithBigTile.setLayoutType(s0.CENTERED_SMALL_BUTTONS);
            navBarWithBigTile.setTitleStyle(b1.LARGE_SINGLE_LINE);
            navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
            navBarWithBigTile.setHeightMode(p2.f275222a);
            navBarWithBigTile.setIconClickable(false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d dVarB = rd0.e.b(((LargeActionButtonDelegate) this.O.getValue()).d.f121375b);
        d dVarB2 = rd0.e.b(((ListCellDelegate) this.N.getValue()).f52692c);
        d dVarB3 = rd0.e.b(((ListSubheaderDelegate) this.M.getValue()).f52707c);
        ?? r2 = this.P;
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(dVarB, dVarB2, dVarB3, rd0.e.b(((CounterTextDelegate) r2.getValue()).e), rd0.e.b(((CounterTextDelegate) r2.getValue()).d), rd0.e.b(((CellDetailsDelegate) this.S.getValue()).d), rd0.e.b(((RowDelegate) this.Q.getValue()).f53218h), rd0.e.b(((CellDetailsChevronDelegate) this.U.getValue()).f51821c), rd0.e.b(((FullScreenStateDelegate) this.R.getValue()).f52371h.f121375b), rd0.e.b(((CellDetailsActionDelegate) this.T.getValue()).d)), null, new zr4.d(this, null, 0), 3);
        if (this.L.f69370c) {
            NavBarWithBigTile navBarWithBigTile = e3().f174510b;
            com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(navBarWithBigTile.b()), rd0.e.b(navBarWithBigTile.K())), null, new zr4.d(this, null, 1), 3);
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile.f59357t), null, new zr4.e(this, null, 0), 3);
        } else {
            ViewBinding value = this.V.getValue(this, f69363b0[0]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
            com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(navBarWithToolbar.o.f57403b), rd0.e.b(navBarWithToolbar.s0())), null, new zr4.d(this, null, 2), 3);
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new zr4.e(this, null, 1), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final zr4.m d() {
        return (zr4.m) this.f69364a0.getValue();
    }

    public final d0 e3() {
        ViewBinding value = this.W.getValue(this, f69363b0[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d0) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Y.getValue();
    }
}
