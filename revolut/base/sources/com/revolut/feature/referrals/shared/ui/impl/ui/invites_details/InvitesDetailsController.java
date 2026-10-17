package com.revolut.feature.referrals.shared.ui.impl.ui.invites_details;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.r0;
import au0.s0;
import au0.z0;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScratchTileDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$raw;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsController;
import com.revolut.feature.shared.referrals.ui.impl.R$id;
import com.revolut.feature.shared.referrals.ui.impl.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import grl.k9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.Job;
import no.m;
import org.jetbrains.annotations.NotNull;
import pwa.l;
import pwa.n;
import pya.g;
import pya.i;
import pya.k;
import pya.p;
import pya.x;
import te0.w;
import tx0.q1;
import tx0.u1;
import vc.s;
import w01.c;
import xki.e;
import yhm.j;
import yi5.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/invites_details/InvitesDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpya/g;", "Ldli/a;", "Lpya/k;", "Lno/m;", "Companion", "a", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvitesDetailsController extends ViewController<g> implements dli.a, m {
    public final InvitesDetailsContract$InputData K;
    public final k9 L;
    public final Lazy M;
    public final Object N;
    public final boolean O;
    public final ArrayList P;
    public final h Q;
    public final int R;
    public final RowDelegate S;
    public final ScratchTileDelegate T;
    public final CellDetailsChevronDelegate U;
    public final TextDelegate V;
    public final Object W;
    public final Object X;
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(InvitesDetailsController.class, "binding", "getBinding()Lcom/revolut/feature/shared/referrals/ui/impl/databinding/ScreenInviteDetailsBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public InvitesDetailsController(InvitesDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137502n;
        companion.getClass();
        AnalyticsProduct.Companion.a(k9Var);
        this.L = k9Var;
        final int i = 0;
        this.M = j.b(new Function0(this) { // from class: pya.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvitesDetailsController f240724b;

            {
                this.f240724b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvitesDetailsController invitesDetailsController = this.f240724b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvitesDetailsController.Y;
                        View rootView = invitesDetailsController.m2().getWindow().getDecorView().getRootView();
                        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        return new w01.c((ViewGroup) rootView);
                    case 1:
                        KProperty[] kPropertyArr2 = InvitesDetailsController.Y;
                        qji.b bVarU2 = invitesDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.di.InvitesDetailsScreenInjector");
                        eya.f fVar = (eya.f) bVarU2;
                        eya.j jVar = fVar.f130626b;
                        eya.f fVar2 = fVar.f130627c;
                        InvitesDetailsContract$InputData invitesDetailsContract$InputData = invitesDetailsController.K;
                        invitesDetailsContract$InputData.getClass();
                        return new eya.c(jVar, fVar2, invitesDetailsController, invitesDetailsContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = InvitesDetailsController.Y;
                        InvitesDetailsController invitesDetailsController2 = this.f240724b;
                        return dli.f.a(invitesDetailsController2, invitesDetailsController2.R2(), zhm.v.k(invitesDetailsController2.S, new ListSubheaderDelegate(), new RowLoadingDelegate(), new CounterTextDelegate(), invitesDetailsController2.T, invitesDetailsController2.U, invitesDetailsController2.V), R$id.recyclerView, null, new koi.h(null, false, true, 3), null, 40);
                    default:
                        KProperty[] kPropertyArr4 = InvitesDetailsController.Y;
                        return (a) ((eya.c) invitesDetailsController.N.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: pya.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvitesDetailsController f240724b;

            {
                this.f240724b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvitesDetailsController invitesDetailsController = this.f240724b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvitesDetailsController.Y;
                        View rootView = invitesDetailsController.m2().getWindow().getDecorView().getRootView();
                        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        return new w01.c((ViewGroup) rootView);
                    case 1:
                        KProperty[] kPropertyArr2 = InvitesDetailsController.Y;
                        qji.b bVarU2 = invitesDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.di.InvitesDetailsScreenInjector");
                        eya.f fVar = (eya.f) bVarU2;
                        eya.j jVar = fVar.f130626b;
                        eya.f fVar2 = fVar.f130627c;
                        InvitesDetailsContract$InputData invitesDetailsContract$InputData = invitesDetailsController.K;
                        invitesDetailsContract$InputData.getClass();
                        return new eya.c(jVar, fVar2, invitesDetailsController, invitesDetailsContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = InvitesDetailsController.Y;
                        InvitesDetailsController invitesDetailsController2 = this.f240724b;
                        return dli.f.a(invitesDetailsController2, invitesDetailsController2.R2(), zhm.v.k(invitesDetailsController2.S, new ListSubheaderDelegate(), new RowLoadingDelegate(), new CounterTextDelegate(), invitesDetailsController2.T, invitesDetailsController2.U, invitesDetailsController2.V), R$id.recyclerView, null, new koi.h(null, false, true, 3), null, 40);
                    default:
                        KProperty[] kPropertyArr4 = InvitesDetailsController.Y;
                        return (a) ((eya.c) invitesDetailsController.N.getValue()).e.get();
                }
            }
        });
        this.O = !l.c(inputData.getD());
        this.P = new ArrayList();
        this.Q = s.t(this, pya.m.f);
        this.R = R$layout.screen_invite_details;
        this.S = new RowDelegate(null, null, 7);
        this.T = new ScratchTileDelegate();
        this.U = new CellDetailsChevronDelegate();
        this.V = new TextDelegate();
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: pya.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvitesDetailsController f240724b;

            {
                this.f240724b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvitesDetailsController invitesDetailsController = this.f240724b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvitesDetailsController.Y;
                        View rootView = invitesDetailsController.m2().getWindow().getDecorView().getRootView();
                        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        return new w01.c((ViewGroup) rootView);
                    case 1:
                        KProperty[] kPropertyArr2 = InvitesDetailsController.Y;
                        qji.b bVarU2 = invitesDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.di.InvitesDetailsScreenInjector");
                        eya.f fVar = (eya.f) bVarU2;
                        eya.j jVar = fVar.f130626b;
                        eya.f fVar2 = fVar.f130627c;
                        InvitesDetailsContract$InputData invitesDetailsContract$InputData = invitesDetailsController.K;
                        invitesDetailsContract$InputData.getClass();
                        return new eya.c(jVar, fVar2, invitesDetailsController, invitesDetailsContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = InvitesDetailsController.Y;
                        InvitesDetailsController invitesDetailsController2 = this.f240724b;
                        return dli.f.a(invitesDetailsController2, invitesDetailsController2.R2(), zhm.v.k(invitesDetailsController2.S, new ListSubheaderDelegate(), new RowLoadingDelegate(), new CounterTextDelegate(), invitesDetailsController2.T, invitesDetailsController2.U, invitesDetailsController2.V), R$id.recyclerView, null, new koi.h(null, false, true, 3), null, 40);
                    default:
                        KProperty[] kPropertyArr4 = InvitesDetailsController.Y;
                        return (a) ((eya.c) invitesDetailsController.N.getValue()).e.get();
                }
            }
        });
        final int i5 = 3;
        this.X = w.y0(new Function0(this) { // from class: pya.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvitesDetailsController f240724b;

            {
                this.f240724b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                InvitesDetailsController invitesDetailsController = this.f240724b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvitesDetailsController.Y;
                        View rootView = invitesDetailsController.m2().getWindow().getDecorView().getRootView();
                        Intrinsics.i(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        return new w01.c((ViewGroup) rootView);
                    case 1:
                        KProperty[] kPropertyArr2 = InvitesDetailsController.Y;
                        qji.b bVarU2 = invitesDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.di.InvitesDetailsScreenInjector");
                        eya.f fVar = (eya.f) bVarU2;
                        eya.j jVar = fVar.f130626b;
                        eya.f fVar2 = fVar.f130627c;
                        InvitesDetailsContract$InputData invitesDetailsContract$InputData = invitesDetailsController.K;
                        invitesDetailsContract$InputData.getClass();
                        return new eya.c(jVar, fVar2, invitesDetailsController, invitesDetailsContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = InvitesDetailsController.Y;
                        InvitesDetailsController invitesDetailsController2 = this.f240724b;
                        return dli.f.a(invitesDetailsController2, invitesDetailsController2.R2(), zhm.v.k(invitesDetailsController2.S, new ListSubheaderDelegate(), new RowLoadingDelegate(), new CounterTextDelegate(), invitesDetailsController2.T, invitesDetailsController2.U, invitesDetailsController2.V), R$id.recyclerView, null, new koi.h(null, false, true, 3), null, 40);
                    default:
                        KProperty[] kPropertyArr4 = InvitesDetailsController.Y;
                        return (a) ((eya.c) invitesDetailsController.N.getValue()).e.get();
                }
            }
        });
    }

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
        View view;
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        View viewG3 = g3();
        if (!(viewG3 instanceof NavBarLargeCentred) && !(viewG3 instanceof NavBarWithBigTile)) {
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = e3().f172626a;
            Context context = e3().f172626a.getContext();
            if (this.K.getD() == n.SALARY) {
                Intrinsics.h(context);
                NavBarWithBigTile navBarWithBigTile = new NavBarWithBigTile(context, null);
                navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
                view = navBarWithBigTile;
            } else {
                Intrinsics.h(context);
                NavBarLargeCentred navBarLargeCentred = new NavBarLargeCentred(context, null);
                navBarLargeCentred.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
                view = navBarLargeCentred;
            }
            view.setId(com.revolut.kompot.common.R$id.navBarWithToolbar);
            view.setLayoutParams(new CoordinatorLayout.LayoutParams(-1, -2));
            controllerContainerCoordinatorLayout.addView(view, 0);
            d3();
        }
        if (uiState instanceof pya.j) {
            View viewG32 = g3();
            if (viewG32 instanceof NavBarLargeCentred) {
                ((NavBarLargeCentred) viewG32).H(u1.DEFAULT);
                return;
            } else {
                if (viewG32 instanceof NavBarWithBigTile) {
                    ((NavBarWithBigTile) viewG32).setLoadingState(true);
                    return;
                }
                return;
            }
        }
        if (uiState instanceof i) {
            View viewG33 = g3();
            if (viewG33 instanceof NavBarLargeCentred) {
                ((NavBarLargeCentred) viewG33).B();
                return;
            } else {
                if (viewG33 instanceof NavBarWithBigTile) {
                    ((NavBarWithBigTile) viewG33).setLoadingState(false);
                    return;
                }
                return;
            }
        }
        if (!(uiState instanceof pya.h)) {
            throw new NoWhenBranchMatchedException();
        }
        pya.h hVar = (pya.h) uiState;
        Image image = hVar.f;
        Clause clause = hVar.f240720j;
        TextClause textClause = hVar.f240715a;
        if (hVar.i) {
            ((c) this.M.getValue()).a(R$raw.uikit_lottie_confetti_deprecated, w01.g.FIT_XY);
            com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar = (com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a) R2();
            aVar.getClass();
            aVar.l2(new x(aVar, null, 0), new b(26));
        }
        LargeActionButton nextButton = e3().f172627b;
        Intrinsics.checkNotNullExpressionValue(nextButton, "nextButton");
        nextButton.setVisibility(clause != null ? 0 : 8);
        e3().f172627b.setText(clause);
        View viewG34 = g3();
        if (viewG34 instanceof NavBarLargeCentred) {
            NavBarLargeCentred navBarLargeCentred2 = (NavBarLargeCentred) viewG34;
            navBarLargeCentred2.B();
            navBarLargeCentred2.setToolbarTitle(textClause);
            navBarLargeCentred2.setTitle(textClause);
            navBarLargeCentred2.setSubtitleText(hVar.f240716b);
            navBarLargeCentred2.setDescriptionText(hVar.f240717c);
            navBarLargeCentred2.setMenuItems(hVar.e);
            NavBarLargeCentred.setLargeImage$default(navBarLargeCentred2, image, (q1) null, 2, (Object) null);
            return;
        }
        if (viewG34 instanceof NavBarWithBigTile) {
            NavBarWithBigTile navBarWithBigTile2 = (NavBarWithBigTile) viewG34;
            navBarWithBigTile2.setLoadingState(false);
            navBarWithBigTile2.setToolbarTitle(textClause);
            navBarWithBigTile2.setTitle(new z0(textClause, false));
            if (image != null) {
                navBarWithBigTile2.setAvatar(new AvatarModel.Default(image, null, null, null, null, null, 126), r0.BLURRED_BACKGROUND);
            }
            Clause clause2 = hVar.d;
            if (clause2 != null) {
                navBarWithBigTile2.setActionStatusLabel(new aw0.k(6, clause2, null, false));
            }
            navBarWithBigTile2.setLayoutType(s0.CENTERED_HORIZONTALLY);
            navBarWithBigTile2.setThemeBasedColorSchemeEnabled(true);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getG0() {
        return new AnalyticsProduct.Retail(this.L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (eya.c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3();
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.f53276c.f121375b), null, new pya.n(this, null, 2), 3);
        RowDelegate rowDelegate = this.S;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new p(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53226s), null, new pya.o(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.U.f51821c), null, new pya.q(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(e3().f172627b.o), null, new pya.n(this, null, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.V.d), null, new pya.o(this, null, 3), 3);
    }

    public final void d3() {
        View viewG3 = g3();
        boolean z = viewG3 instanceof NavBarLargeCentred;
        ArrayList arrayList = this.P;
        if (z) {
            NavBarLargeCentred navBarLargeCentred = (NavBarLargeCentred) viewG3;
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                ((Job) it8.next()).f(null);
            }
            arrayList.clear();
            arrayList.add(com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarLargeCentred.f59292m), null, new pya.n(this, null, 0), 3));
            arrayList.add(com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarLargeCentred.f59291l.f57403b), null, new pya.o(this, null, 0), 3));
            return;
        }
        if (viewG3 instanceof NavBarWithBigTile) {
            NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) viewG3;
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                ((Job) it9.next()).f(null);
            }
            arrayList.clear();
            arrayList.add(com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile.f59357t), null, new pya.n(this, null, 1), 3));
            arrayList.add(com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile.b()), null, new pya.o(this, null, 1), 3));
        }
    }

    public final jbd.b e3() {
        ViewBinding value = this.Q.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jbd.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final pya.a R2() {
        return (pya.a) this.X.getValue();
    }

    public final View g3() {
        View childAt = e3().f172626a.getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
        return childAt;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
