package com.revolut.feature.travel.flights.impl.ui.screen.search_results;

import a7g.a0;
import a7g.b0;
import a7g.e;
import a7g.g;
import a7g.i;
import a7g.j;
import a7g.k;
import a7g.l;
import a7g.m;
import a7g.n;
import a7g.p;
import a7g.t;
import a7g.y;
import a7g.z;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.transition.TransitionManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.f6;
import aw0.g6;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsRevPointsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TagDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.InputTravelSearchItemView;
import com.revolut.core.ui_kit.views.InputTravelSearchView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.search_results.TravelFlightsSearchScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import f4g.r0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rd0.d;
import te0.w;
import tki.c;
import vc.s;
import yp0.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/search_results/TravelFlightsSearchScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "La7g/t;", "Ltki/c;", "La7g/b0;", "Companion", "a", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsSearchScreen extends ViewController<t> implements c {
    public final TravelFlightsSearchScreenContract$InputData K;
    public final h L;
    public e M;
    public v N;
    public boolean O;
    public final p P;
    public final int Q;
    public final Object R;
    public final Object S;
    public final FullScreenStateDelegate T;
    public final RowDelegate U;
    public final TagDelegate V;
    public final CellDetailsRevPointsDelegate W;
    public final CellDetailsDelegate X;
    public final TextDelegate Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f93404a0 = {o0.f186429a.j(new h0(TravelFlightsSearchScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/flights/impl/databinding/ScreenSearchResultsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.travel.flights.impl.ui.screen.search_results.TravelFlightsSearchScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public TravelFlightsSearchScreen(TravelFlightsSearchScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, a7g.h.f);
        this.P = new p(this);
        this.Q = R$layout.screen_search_results;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: a7g.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsSearchScreen f1887b;

            {
                this.f1887b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelFlightsSearchScreen travelFlightsSearchScreen = this.f1887b;
                switch (i2) {
                    case 0:
                        TravelFlightsSearchScreen.Companion companion = TravelFlightsSearchScreen.INSTANCE;
                        qji.b bVarU2 = travelFlightsSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.search_results.di.TravelFlightsSearchScreenInjector");
                        return (r0) ((b7g.a) ((b7g.b) bVarU2).j().mo3808a(travelFlightsSearchScreen)).u(travelFlightsSearchScreen.K).mo3783build();
                    case 1:
                        TravelFlightsSearchScreen.Companion companion2 = TravelFlightsSearchScreen.INSTANCE;
                        r0 r0Var = (r0) travelFlightsSearchScreen.R.getValue();
                        switch (r0Var.f132182a) {
                            case 0:
                                return (v) r0Var.f132185g.get();
                            case 1:
                                return (v) r0Var.f132185g.get();
                            default:
                                return (v) r0Var.f132185g.get();
                        }
                    default:
                        TravelFlightsSearchScreen.Companion companion3 = TravelFlightsSearchScreen.INSTANCE;
                        TravelFlightsSearchScreen travelFlightsSearchScreen2 = this.f1887b;
                        return tki.g.a(travelFlightsSearchScreen2, travelFlightsSearchScreen2.d(), zhm.v.k(travelFlightsSearchScreen2.T, travelFlightsSearchScreen2.U, travelFlightsSearchScreen2.V, new RowLoadingDelegate(), travelFlightsSearchScreen2.W, travelFlightsSearchScreen2.X, travelFlightsSearchScreen2.Y), R$id.travelFlightsSearchResultsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: a7g.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsSearchScreen f1887b;

            {
                this.f1887b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelFlightsSearchScreen travelFlightsSearchScreen = this.f1887b;
                switch (i22) {
                    case 0:
                        TravelFlightsSearchScreen.Companion companion = TravelFlightsSearchScreen.INSTANCE;
                        qji.b bVarU2 = travelFlightsSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.search_results.di.TravelFlightsSearchScreenInjector");
                        return (r0) ((b7g.a) ((b7g.b) bVarU2).j().mo3808a(travelFlightsSearchScreen)).u(travelFlightsSearchScreen.K).mo3783build();
                    case 1:
                        TravelFlightsSearchScreen.Companion companion2 = TravelFlightsSearchScreen.INSTANCE;
                        r0 r0Var = (r0) travelFlightsSearchScreen.R.getValue();
                        switch (r0Var.f132182a) {
                            case 0:
                                return (v) r0Var.f132185g.get();
                            case 1:
                                return (v) r0Var.f132185g.get();
                            default:
                                return (v) r0Var.f132185g.get();
                        }
                    default:
                        TravelFlightsSearchScreen.Companion companion3 = TravelFlightsSearchScreen.INSTANCE;
                        TravelFlightsSearchScreen travelFlightsSearchScreen2 = this.f1887b;
                        return tki.g.a(travelFlightsSearchScreen2, travelFlightsSearchScreen2.d(), zhm.v.k(travelFlightsSearchScreen2.T, travelFlightsSearchScreen2.U, travelFlightsSearchScreen2.V, new RowLoadingDelegate(), travelFlightsSearchScreen2.W, travelFlightsSearchScreen2.X, travelFlightsSearchScreen2.Y), R$id.travelFlightsSearchResultsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.T = new FullScreenStateDelegate();
        this.U = new RowDelegate(null, null, 7);
        this.V = new TagDelegate();
        this.W = new CellDetailsRevPointsDelegate();
        this.X = new CellDetailsDelegate();
        this.Y = new TextDelegate();
        final int i3 = 2;
        this.Z = w.y0(new Function0(this) { // from class: a7g.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsSearchScreen f1887b;

            {
                this.f1887b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelFlightsSearchScreen travelFlightsSearchScreen = this.f1887b;
                switch (i22) {
                    case 0:
                        TravelFlightsSearchScreen.Companion companion = TravelFlightsSearchScreen.INSTANCE;
                        qji.b bVarU2 = travelFlightsSearchScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.flights.impl.ui.screen.search_results.di.TravelFlightsSearchScreenInjector");
                        return (r0) ((b7g.a) ((b7g.b) bVarU2).j().mo3808a(travelFlightsSearchScreen)).u(travelFlightsSearchScreen.K).mo3783build();
                    case 1:
                        TravelFlightsSearchScreen.Companion companion2 = TravelFlightsSearchScreen.INSTANCE;
                        r0 r0Var = (r0) travelFlightsSearchScreen.R.getValue();
                        switch (r0Var.f132182a) {
                            case 0:
                                return (v) r0Var.f132185g.get();
                            case 1:
                                return (v) r0Var.f132185g.get();
                            default:
                                return (v) r0Var.f132185g.get();
                        }
                    default:
                        TravelFlightsSearchScreen.Companion companion3 = TravelFlightsSearchScreen.INSTANCE;
                        TravelFlightsSearchScreen travelFlightsSearchScreen2 = this.f1887b;
                        return tki.g.a(travelFlightsSearchScreen2, travelFlightsSearchScreen2.d(), zhm.v.k(travelFlightsSearchScreen2.T, travelFlightsSearchScreen2.U, travelFlightsSearchScreen2.V, new RowLoadingDelegate(), travelFlightsSearchScreen2.W, travelFlightsSearchScreen2.X, travelFlightsSearchScreen2.Y), R$id.travelFlightsSearchResultsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        b0 uiState = (b0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f21245c.setMenuItems(uiState.f1877c);
        ActionsView actionsView = d3().d;
        List list = uiState.d;
        ActionsView.Companion companion = ActionsView.INSTANCE;
        actionsView.k(list, mx0.t.f210002a);
        a0 a0Var = uiState.f1876b;
        if (a0Var instanceof y) {
            y yVar = (y) a0Var;
            InputTravelSearchItemView inputTravelSearchItemView = d3().f21246g;
            inputTravelSearchItemView.setPrimarySearchText(yVar.f1901a);
            inputTravelSearchItemView.setSecondarySearchText(yVar.f1902b);
            inputTravelSearchItemView.setProgressVisible(false);
        } else {
            if (!(a0Var instanceof z)) {
                throw new NoWhenBranchMatchedException();
            }
            z zVar = (z) a0Var;
            d3().f.setConfiguration(new f6(zVar.f1903a, zVar.f1904b, zVar.f1905c, null, g6.RIGHT, zVar.d));
        }
        a7g.q qVar2 = uiState.e;
        boolean z = qVar2 == a7g.q.SEARCH_INPUT_EXPANDED;
        boolean z3 = qVar2 == a7g.q.FILTERS_EXPANDED && !list.isEmpty();
        e eVar = this.M;
        if (eVar == null) {
            InputTravelSearchItemView travelFlightsSearchResultsScreenSearchInputView = d3().f21246g;
            Intrinsics.checkNotNullExpressionValue(travelFlightsSearchResultsScreenSearchInputView, "travelFlightsSearchResultsScreenSearchInputView");
            travelFlightsSearchResultsScreenSearchInputView.setVisibility(!z ? 0 : 8);
            InputTravelSearchView inputTravelSearchView = d3().f;
            Intrinsics.checkNotNullExpressionValue(inputTravelSearchView, "travelFlightsSearchResul…reenSearchFieldsInputView");
            inputTravelSearchView.setVisibility(z ? 0 : 8);
            ActionsView actionsView2 = d3().d;
            Intrinsics.checkNotNullExpressionValue(actionsView2, "travelFlightsSearchResul…ScreenQuickFiltersActions");
            actionsView2.setVisibility(z3 ? 0 : 8);
            IllegalStateException illegalStateException = new IllegalStateException("Input animator is null when rendering toolbar state");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        if (eVar.b(z, z3)) {
            return;
        }
        g gVar = eVar.e;
        ViewGroup viewGroup = eVar.f1882a;
        if (eVar.b(z, z3)) {
            return;
        }
        if (!viewGroup.isAttachedToWindow() || !viewGroup.isLaidOut()) {
            gVar.invoke(a7g.c.IDLE);
            eVar.a(z, z3);
        } else {
            TransitionManager.endTransitions(viewGroup);
            gVar.invoke(a7g.c.ANIMATING);
            TransitionManager.beginDelayedTransition(viewGroup, eVar.f);
            eVar.a(z, z3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r0) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar travelFlightsSearchResultsScreenNavBar = d3().f21245c;
        Intrinsics.checkNotNullExpressionValue(travelFlightsSearchResultsScreenNavBar, "travelFlightsSearchResultsScreenNavBar");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_search_result_header_title_results, null, null, 14);
        Integer numValueOf = Integer.valueOf(ofm.q.k(q2()));
        a7g.a model = new a7g.a(textLocalisedClause, numValueOf);
        Intrinsics.checkNotNullParameter(travelFlightsSearchResultsScreenNavBar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        travelFlightsSearchResultsScreenNavBar.setTitle(textLocalisedClause);
        travelFlightsSearchResultsScreenNavBar.setNavigationButtonIcon(numValueOf);
        d3().f21246g.setSearchIconImage(new ResourceImage(R$drawable.uikit_icn_16_chevron_down_small, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246));
        ControllerContainerCoordinatorLayout travelFlightsSearchResultsScreenContainer = d3().f21244b;
        Intrinsics.checkNotNullExpressionValue(travelFlightsSearchResultsScreenContainer, "travelFlightsSearchResultsScreenContainer");
        FrameLayout frameLayout = d3().f21247h;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "travelFlightsSearchResul…reenSearchInputsContainer");
        BasicNavBar travelFlightsSearchResultsScreenNavBar2 = d3().f21245c;
        Intrinsics.checkNotNullExpressionValue(travelFlightsSearchResultsScreenNavBar2, "travelFlightsSearchResultsScreenNavBar");
        ScreenContentRecyclerView travelFlightsSearchResultsScreenRecyclerView = d3().e;
        Intrinsics.checkNotNullExpressionValue(travelFlightsSearchResultsScreenRecyclerView, "travelFlightsSearchResultsScreenRecyclerView");
        InputTravelSearchItemView travelFlightsSearchResultsScreenSearchInputView = d3().f21246g;
        Intrinsics.checkNotNullExpressionValue(travelFlightsSearchResultsScreenSearchInputView, "travelFlightsSearchResultsScreenSearchInputView");
        InputTravelSearchView inputTravelSearchView = d3().f;
        Intrinsics.checkNotNullExpressionValue(inputTravelSearchView, "travelFlightsSearchResul…reenSearchFieldsInputView");
        ActionsView actionsView = d3().d;
        Intrinsics.checkNotNullExpressionValue(actionsView, "travelFlightsSearchResul…ScreenQuickFiltersActions");
        this.M = new e(travelFlightsSearchResultsScreenContainer, frameLayout, travelFlightsSearchResultsScreenNavBar2, travelFlightsSearchResultsScreenRecyclerView, travelFlightsSearchResultsScreenSearchInputView, inputTravelSearchView, actionsView, new g(this, 0));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ScreenContentRecyclerView screenContentRecyclerView = d3().e;
        screenContentRecyclerView.removeOnScrollListener(this.P);
        v vVar = this.N;
        if (vVar != null) {
            screenContentRecyclerView.removeOnScrollListener(vVar);
        }
        this.O = false;
        this.N = null;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView travelFlightsSearchResultsScreenRecyclerView = d3().e;
        Intrinsics.checkNotNullExpressionValue(travelFlightsSearchResultsScreenRecyclerView, "travelFlightsSearchResultsScreenRecyclerView");
        this.N = yp0.y.a(travelFlightsSearchResultsScreenRecyclerView, 10, true, new g(this, 1));
        d3().e.addOnScrollListener(this.P);
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f21245c.f59211b), new k(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(d3().f21245c.f59210a.f57403b), new i(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.T.f52371h.f121375b), new n(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.U.f53218h), new a7g.o(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.V.d), new i(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f21246g.a()), new k(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(d3().f.f58673g.f58664a.getTextInput1().u0), new k(this, continuation, 5), 3);
        ViewController.P2(this, rd0.e.b(d3().f.f58673g.f58664a.getTextInput2().u0), new k(this, continuation, 6), 3);
        int i = 0;
        ViewController.P2(this, rd0.e.b(this.W.f51889c), new i(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(this.X.d), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f.f58673g.f58664a.f58662g), new k(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(d3().f.i.u0), new k(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f.f58675j.u0), new k(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.Y.f53530c), new l(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().d.f58296a.f121375b), new m(this, null), 3);
    }

    public final c4g.a d3() {
        ViewBinding value = this.L.getValue(this, f93404a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c4g.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final a7g.v d() {
        return (a7g.v) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Z.getValue();
    }
}
