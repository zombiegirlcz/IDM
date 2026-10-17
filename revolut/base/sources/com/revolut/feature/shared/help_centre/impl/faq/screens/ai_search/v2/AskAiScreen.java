package com.revolut.feature.shared.help_centre.impl.faq.screens.ai_search.v2;

import aii.q;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import au0.j4;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.blur.BlurDrawable;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileTextLoadingDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared.help_centre.impl.R$id;
import com.revolut.feature.shared.help_centre.impl.R$layout;
import com.revolut.feature.shared.help_centre.impl.R$string;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import foh.i;
import hoi.j;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c4;
import mx0.e4;
import no.k;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import sgm.j1;
import te0.w;
import vc.s;
import y25.c;
import y66.p;
import y7d.a0;
import y7d.d;
import y7d.f;
import y7d.g;
import y7d.m;
import y7d.n;
import y7d.r;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/ai_search/v2/AskAiScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ly7d/r;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "Lno/k;", "<init>", "()V", "Companion", "a", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AskAiScreen extends BaseRecyclerViewScreen<r, IOData$EmptyInput, q> implements k {
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final CellDetailsDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final CellDetailsChevronDelegate f86215a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final PlainTextDelegate f86216b0;
    public final RowDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f86217d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f86218e0;
    public boolean f0;
    public final j g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final a0 f86219h0;
    public AnalyticsContext i0;
    public static final /* synthetic */ KProperty[] j0 = {o0.f186429a.j(new h0(AskAiScreen.class, "binding", "getBinding()Lcom/revolut/feature/shared/help_centre/impl/databinding/AskAiScreenBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, p7d.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/shared/help_centre/impl/databinding/AskAiScreenBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.askAiScreen_input;
            ChatInputView chatInputView = (ChatInputView) ViewBindings.findChildViewById(p0, i);
            if (chatInputView != null) {
                i = R$id.askAiScreen_navBarWithToolbar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.askAiScreen_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new p7d.a((ControllerContainerCoordinatorLayout) p0, chatInputView, navBarWithToolbar);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public AskAiScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.ask_ai_screen;
        this.V = R$id.askAiScreen_recyclerView;
        this.W = s.t(this, b.f);
        this.X = w.y0(new y7d.b(this, 0));
        this.Y = w.y0(new y7d.b(this, 1));
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.Z = cellDetailsDelegate;
        CellDetailsChevronDelegate cellDetailsChevronDelegate = new CellDetailsChevronDelegate();
        this.f86215a0 = cellDetailsChevronDelegate;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        PlainTextDelegate plainTextDelegate = new PlainTextDelegate();
        this.f86216b0 = plainTextDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.c0 = rowDelegate;
        this.f86217d0 = v.k(new SmartTileTextLoadingDelegate(), cellDetailsDelegate, cellDetailsChevronDelegate, listSubheaderDelegate, plainTextDelegate, rowDelegate, new RowLoadingDelegate());
        this.f86218e0 = w.y0(new y7d.b(this, 2));
        this.f0 = true;
        j jVar = new j(null, 7);
        jVar.setSupportsChangeAnimations(false);
        this.g0 = jVar;
        this.f86219h0 = new a0(System.currentTimeMillis() + 300, i.j(10), new y7d.b(this, 3));
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.i0 = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getI0() {
        return this.i0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (r7d.b) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        pd.b.p(view, new TextLocalisedClause(R$string.help_center_ask_ai_entrypoint_accessibility_label, null, null, 14));
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f233754c.f59410q), null, new y7d.h(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f233754c.f59409p.f57337m), null, new y7d.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f233754c.f59409p.o), null, new y7d.h(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f233754c.f59409p.f57336l), null, new y7d.h(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f233753b.b0()), null, new y7d.e(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f233753b.N), null, new y7d.h(this, null, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z.f), null, new y7d.i(this, null), 3);
        PlainTextDelegate plainTextDelegate = this.f86216b0;
        com.revolut.kompot.navigable.a.g2(this, e.b(plainTextDelegate.d.f121375b), null, new y7d.e(this, continuation, 3), 3);
        RowDelegate rowDelegate = this.c0;
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53218h), null, new y7d.j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f86215a0.f51821c), null, new d(this, null), 3);
        efm.r map = plainTextDelegate.f.f121375b.map(new c(new p(10), 10));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(map), null, new y7d.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.i), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53219j), null, new g(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        BlurDrawable blurDrawable;
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f233754c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.j0(false);
        ChatInputView askAiScreenInput = h3().f233753b;
        Intrinsics.checkNotNullExpressionValue(askAiScreenInput, "askAiScreenInput");
        askAiScreenInput.setMode(c4.SEARCH);
        askAiScreenInput.setFixedState(e4.ONLY_TEXT);
        BlurDrawable blurDrawable2 = null;
        askAiScreenInput.setHint(new TextLocalisedClause(R$string.help_center_ask_ai_search_bar_placeholder_inactive, null, null, 14));
        askAiScreenInput.addOnLayoutChangeListener(new bx0.v(this, askAiScreenInput, 15));
        D2().addOnLayoutChangeListener(new androidx.camera.viewfinder.a(this, 27));
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (D2().getBackground() instanceof BlurDrawable) {
            Drawable background = D2().getBackground();
            Intrinsics.i(background, "null cannot be cast to non-null type com.revolut.core.ui_kit.blur.BlurDrawable");
        } else {
            View viewA = nji.a.a(this.f98405m);
            if (viewA != null) {
                Intrinsics.checkNotNullParameter(viewA, "<this>");
                if (viewA.getWidth() == 0 || viewA.getHeight() == 0) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "BlurDrawable", "Zero-size view cannot be used to get BlurDrawable", null, h0Var);
                    blurDrawable = null;
                } else {
                    Context context = viewA.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    so0.b dVar = Build.VERSION.SDK_INT >= 31 ? new so0.d() : new so0.e(context);
                    dVar.b(viewA);
                    blurDrawable = new BlurDrawable(dVar);
                }
                if (blurDrawable != null) {
                    blurDrawable.setAlpha(rim.d.c(76.5f));
                    blurDrawable2 = blurDrawable;
                }
            }
            D2().setBackground(blurDrawable2);
        }
        ChatInputView askAiScreenInput2 = h3().f233753b;
        Intrinsics.checkNotNullExpressionValue(askAiScreenInput2, "askAiScreenInput");
        OneShotPreDrawListener.add(askAiScreenInput2, new j1(askAiScreenInput2, 12));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF67425b0() {
        return this.f86217d0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final koi.h d3() {
        return (koi.h) this.f86218e0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(r uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        AnalyticsContext analyticsContext = uiState.e;
        List list = uiState.d;
        y7d.p pVar = uiState.f311485c;
        y7d.q qVar = pVar.f311481a;
        this.i0 = analyticsContext;
        pd.b.p(D2(), uiState.f);
        m mVar = oVar instanceof m ? (m) oVar : null;
        NavBarWithToolbar askAiScreenNavBarWithToolbar = h3().f233754c;
        Intrinsics.checkNotNullExpressionValue(askAiScreenNavBarWithToolbar, "askAiScreenNavBarWithToolbar");
        ChatInputView askAiScreenInput = h3().f233753b;
        Intrinsics.checkNotNullExpressionValue(askAiScreenInput, "askAiScreenInput");
        if (mVar == null || mVar.f311478a) {
            RecyclerView.LayoutManager layoutManager = h().getLayoutManager();
            Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int i = y7d.c.f311469a[uiState.f311483a.ordinal()];
            if (i != 1) {
                a0 a0Var = this.f86219h0;
                if (i == 2) {
                    linearLayoutManager.setReverseLayout(false);
                    h().setItemAnimator(a0Var);
                    a0Var.e = false;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    linearLayoutManager.setReverseLayout(true);
                    h().setItemAnimator(a0Var);
                    a0Var.e = true;
                }
            } else {
                linearLayoutManager.setReverseLayout(false);
                h().setItemAnimator(this.g0);
            }
        }
        if (list.isEmpty()) {
            koi.h hVarD3 = d3();
            Intrinsics.i(hVarD3, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.faq.screens.ai_search.v2.AskAiAdapter");
            ((y7d.a) hVarD3).d();
        } else {
            koi.h hVarD32 = d3();
            Intrinsics.i(hVarD32, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.faq.screens.ai_search.v2.AskAiAdapter");
            ((y7d.a) hVarD32).c(list);
        }
        askAiScreenNavBarWithToolbar.L0(uiState.f311484b);
        if (this.f0) {
            this.f0 = false;
            int i2 = y7d.c.f311470b[qVar.ordinal()];
            if (i2 == 1) {
                askAiScreenNavBarWithToolbar.E0();
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                askAiScreenInput.c0();
            }
        }
        if (mVar == null || mVar.f311480c) {
            int i3 = y7d.c.f311470b[qVar.ordinal()];
            if (i3 == 1) {
                w01.k.a(askAiScreenInput);
                askAiScreenNavBarWithToolbar.setHint(new TextLocalisedClause(R$string.help_center_ask_ai_search_bar_placeholder_inactive_v3, null, null, 14));
                askAiScreenNavBarWithToolbar.K0(j4.NO_ANIMATION);
                askAiScreenNavBarWithToolbar.setSearchInput(new TextClause(pVar.f311482b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                askAiScreenNavBarWithToolbar.m0(j4.NO_ANIMATION);
                w01.k.d(askAiScreenInput);
                askAiScreenInput.setInput(new TextClause(pVar.f311482b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            }
        }
        if (mVar == null || !mVar.f311479b) {
            return;
        }
        Context context = D2().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        jh.d.f(context).n0().i(D2(), String.valueOf(uiState.f311486g));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.U;
    }

    public final p7d.a h3() {
        ViewBinding value = this.W.getValue(this, j0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (p7d.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final n T2() {
        return (n) this.Y.getValue();
    }
}
