package com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.feed;

import aii.q;
import android.content.Context;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ChatTimestampBubbleDelegate;
import com.revolut.core.ui_kit.delegates.ChatTooltipDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleLoadingDelegate;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.feed.RevolutFeedScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.notification_centre.R$id;
import com.revolut.notification_centre.R$layout;
import com.revolut.notification_centre.R$string;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import e79.f;
import ip0.g0;
import java.util.List;
import k50.a4;
import k79.d;
import k79.i;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import rmi.c;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/notification_centre/impl/ui/revolut_feed/screens/feed/RevolutFeedScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lk79/i;", "<init>", "()V", "Companion", "a", "feature_notification_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutFeedScreen extends ViewController<q> implements a {
    public final Object M;
    public final Object O;
    public final Object R;
    public final Object S;
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(RevolutFeedScreen.class, "binding", "getBinding()Lcom/revolut/notification_centre/databinding/ScreenRevolutFeedBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final ChatBubbleDelegate K = new ChatBubbleDelegate();
    public final FullScreenStateDelegate L = new FullScreenStateDelegate();
    public final h N = s.t(this, b.f);
    public int P = 1;
    public boolean Q = true;

    /* JADX INFO: renamed from: com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.feed.RevolutFeedScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/notification_centre/databinding/ScreenRevolutFeedBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
            int i = R$id.screenRevolutFeed_fab;
            SmallActionButton smallActionButton = (SmallActionButton) ViewBindings.findChildViewById(p0, i);
            if (smallActionButton != null) {
                i = R$id.screenRevolutFeed_navBar;
                BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
                if (basicNavBar != null) {
                    i = R$id.screenRevolutFeed_recyclerView;
                    ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                    if (screenContentRecyclerView != null) {
                        return new c(controllerContainerConstraintLayout, smallActionButton, basicNavBar, screenContentRecyclerView);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public RevolutFeedScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: k79.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutFeedScreen f181916b;

            {
                this.f181916b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevolutFeedScreen revolutFeedScreen = this.f181916b;
                switch (i2) {
                    case 0:
                        RevolutFeedScreen.Companion companion = RevolutFeedScreen.INSTANCE;
                        RevolutFeedScreen revolutFeedScreen2 = this.f181916b;
                        return dli.f.a(revolutFeedScreen2, revolutFeedScreen2.R2(), v.k(new CellDetailsLoadingDelegate(), new ChatTimestampBubbleDelegate(), new ChatTooltipDelegate(), revolutFeedScreen2.K, new ChatBubbleLoadingDelegate(), revolutFeedScreen2.L), R$id.screenRevolutFeed_recyclerView, null, null, null, 56);
                    case 1:
                        RevolutFeedScreen.Companion companion2 = RevolutFeedScreen.INSTANCE;
                        return revolutFeedScreen.d3().d;
                    case 2:
                        RevolutFeedScreen.Companion companion3 = RevolutFeedScreen.INSTANCE;
                        qji.b bVarU2 = revolutFeedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.feed.di.RevolutFeedScreenInjector");
                        e79.e eVar = (e79.e) bVarU2;
                        return new e79.f(eVar.f123131a, eVar.f123132b);
                    default:
                        RevolutFeedScreen.Companion companion4 = RevolutFeedScreen.INSTANCE;
                        return (h) ((e79.f) revolutFeedScreen.R.getValue()).f123136c.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: k79.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutFeedScreen f181916b;

            {
                this.f181916b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevolutFeedScreen revolutFeedScreen = this.f181916b;
                switch (i22) {
                    case 0:
                        RevolutFeedScreen.Companion companion = RevolutFeedScreen.INSTANCE;
                        RevolutFeedScreen revolutFeedScreen2 = this.f181916b;
                        return dli.f.a(revolutFeedScreen2, revolutFeedScreen2.R2(), v.k(new CellDetailsLoadingDelegate(), new ChatTimestampBubbleDelegate(), new ChatTooltipDelegate(), revolutFeedScreen2.K, new ChatBubbleLoadingDelegate(), revolutFeedScreen2.L), R$id.screenRevolutFeed_recyclerView, null, null, null, 56);
                    case 1:
                        RevolutFeedScreen.Companion companion2 = RevolutFeedScreen.INSTANCE;
                        return revolutFeedScreen.d3().d;
                    case 2:
                        RevolutFeedScreen.Companion companion3 = RevolutFeedScreen.INSTANCE;
                        qji.b bVarU2 = revolutFeedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.feed.di.RevolutFeedScreenInjector");
                        e79.e eVar = (e79.e) bVarU2;
                        return new e79.f(eVar.f123131a, eVar.f123132b);
                    default:
                        RevolutFeedScreen.Companion companion4 = RevolutFeedScreen.INSTANCE;
                        return (h) ((e79.f) revolutFeedScreen.R.getValue()).f123136c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: k79.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutFeedScreen f181916b;

            {
                this.f181916b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevolutFeedScreen revolutFeedScreen = this.f181916b;
                switch (i22) {
                    case 0:
                        RevolutFeedScreen.Companion companion = RevolutFeedScreen.INSTANCE;
                        RevolutFeedScreen revolutFeedScreen2 = this.f181916b;
                        return dli.f.a(revolutFeedScreen2, revolutFeedScreen2.R2(), v.k(new CellDetailsLoadingDelegate(), new ChatTimestampBubbleDelegate(), new ChatTooltipDelegate(), revolutFeedScreen2.K, new ChatBubbleLoadingDelegate(), revolutFeedScreen2.L), R$id.screenRevolutFeed_recyclerView, null, null, null, 56);
                    case 1:
                        RevolutFeedScreen.Companion companion2 = RevolutFeedScreen.INSTANCE;
                        return revolutFeedScreen.d3().d;
                    case 2:
                        RevolutFeedScreen.Companion companion3 = RevolutFeedScreen.INSTANCE;
                        qji.b bVarU2 = revolutFeedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.feed.di.RevolutFeedScreenInjector");
                        e79.e eVar = (e79.e) bVarU2;
                        return new e79.f(eVar.f123131a, eVar.f123132b);
                    default:
                        RevolutFeedScreen.Companion companion4 = RevolutFeedScreen.INSTANCE;
                        return (h) ((e79.f) revolutFeedScreen.R.getValue()).f123136c.get();
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: k79.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevolutFeedScreen f181916b;

            {
                this.f181916b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                RevolutFeedScreen revolutFeedScreen = this.f181916b;
                switch (i22) {
                    case 0:
                        RevolutFeedScreen.Companion companion = RevolutFeedScreen.INSTANCE;
                        RevolutFeedScreen revolutFeedScreen2 = this.f181916b;
                        return dli.f.a(revolutFeedScreen2, revolutFeedScreen2.R2(), v.k(new CellDetailsLoadingDelegate(), new ChatTimestampBubbleDelegate(), new ChatTooltipDelegate(), revolutFeedScreen2.K, new ChatBubbleLoadingDelegate(), revolutFeedScreen2.L), R$id.screenRevolutFeed_recyclerView, null, null, null, 56);
                    case 1:
                        RevolutFeedScreen.Companion companion2 = RevolutFeedScreen.INSTANCE;
                        return revolutFeedScreen.d3().d;
                    case 2:
                        RevolutFeedScreen.Companion companion3 = RevolutFeedScreen.INSTANCE;
                        qji.b bVarU2 = revolutFeedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.notification_centre.impl.ui.revolut_feed.screens.feed.di.RevolutFeedScreenInjector");
                        e79.e eVar = (e79.e) bVarU2;
                        return new e79.f(eVar.f123131a, eVar.f123132b);
                    default:
                        RevolutFeedScreen.Companion companion4 = RevolutFeedScreen.INSTANCE;
                        return (h) ((e79.f) revolutFeedScreen.R.getValue()).f123136c.get();
                }
            }
        });
    }

    public static void g3(int i, ScreenContentRecyclerView screenContentRecyclerView) {
        if (screenContentRecyclerView.getAdapter() == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = screenContentRecyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        if (i == r0.getItemCount() - 1) {
            linearLayoutManager.scrollToPosition(i);
        } else {
            linearLayoutManager.scrollToPositionWithOffset(i, 0);
        }
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f255346c.setMenuItems(uiState.f181922b);
        int size = uiState.f181923c;
        if (size < 0) {
            size = this.Q ? uiState.f181921a.size() - 1 : -1;
        }
        if (size >= 0) {
            g3(size, f3());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        SmallActionButton smallActionButton = d3().f255345b;
        smallActionButton.i(h4.INVERTED_PRIMARY);
        smallActionButton.setIconsColorFilterEnabled(false);
        smallActionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246));
        Context context = smallActionButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorBlack_20, context);
        smallActionButton.setOutlineAmbientShadowColor(iS);
        smallActionButton.setOutlineSpotShadowColor(iS);
        ViewCompat.setOnApplyWindowInsetsListener(d3().f255345b, new joe.e(11));
        BasicNavBar basicNavBar = d3().f255346c;
        basicNavBar.setTitle(new TextLocalisedClause(R$string.revolut_feed_screen_header_revolut_news_title, null, null, 14));
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        koi.a aVarW = ((dli.c) this.M.getValue()).w();
        Intrinsics.i(aVarW, "null cannot be cast to non-null type com.revolut.recyclerkit.delegates.DiffAdapter");
        new xv0.w(new a4(27), new k79.b(this, (koi.h) aVarW, 0)).b(f3());
        f3().addOnScrollListener(new d(this));
        RecyclerView.LayoutManager layoutManager = f3().getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.setStackFromEnd(true);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f255346c.f59211b), new k22.c(this, continuation, 9), 3);
        ViewController.P2(this, rd0.e.b(d3().f255346c.f59210a.f57403b), new jl6.b(2, R2(), k79.h.class, "onMenuItemClicked", "onMenuItemClicked(Ljava/lang/String;)V", 4, 6), 3);
        ChatBubbleDelegate chatBubbleDelegate = this.K;
        ViewController.P2(this, rd0.e.b(chatBubbleDelegate.d.f121375b), new jv.o(this, continuation, 22), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52371h.f121375b), new k79.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(chatBubbleDelegate.f53809j), new k79.f(this, null), 3);
        d3().f255345b.setOnClickListener(new g0(this, 10));
    }

    public final c d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k79.h d() {
        return (k79.h) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ScreenContentRecyclerView f3() {
        return (ScreenContentRecyclerView) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getW() {
        return R$layout.screen_revolut_feed;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
