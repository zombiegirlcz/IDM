package com.revolut.feature.store.impl.ui.brand_detail.screen.earn;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c2e.b;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.store.impl.R$layout;
import com.revolut.feature.store.impl.ui.brand_detail.screen.earn.StoreBrandDetailEarnScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import h30.q;
import k2e.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import t2e.d;
import t2e.j;
import t2e.k;
import t2e.l;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/store/impl/ui/brand_detail/screen/earn/StoreBrandDetailEarnScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lt2e/j;", "Ldli/a;", "Lt2e/l;", "Lc2e/b;", "Companion", "a", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoreBrandDetailEarnScreen extends ViewController<j> implements dli.a, b {
    public final q K;
    public final FullScreenStateDelegate L;
    public final FixedTabsDelegate M;
    public final ListSubheaderDelegate N;
    public final RowDelegate O;
    public final CellDetailsDelegate P;
    public final CellDetailsBadgeDelegate Q;
    public final PlainTextDelegate R;
    public final FooterTextDelegate S;
    public final h T;
    public final int U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(StoreBrandDetailEarnScreen.class, "binding", "getBinding()Lcom/revolut/feature/store/impl/databinding/ScreenStoreBrandDetailListBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.store.impl.ui.brand_detail.screen.earn.StoreBrandDetailEarnScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public StoreBrandDetailEarnScreen(StoreBrandDetailEarnScreenContract$InputData inputData, q componentBuilder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(componentBuilder, "componentBuilder");
        this.K = componentBuilder;
        this.L = new FullScreenStateDelegate();
        this.M = new FixedTabsDelegate();
        this.N = new ListSubheaderDelegate();
        this.O = new RowDelegate(null, null, 7);
        this.P = new CellDetailsDelegate();
        this.Q = new CellDetailsBadgeDelegate();
        this.R = new PlainTextDelegate();
        this.S = new FooterTextDelegate();
        this.T = s.t(this, t2e.b.f);
        this.U = R$layout.screen_store_brand_detail_list;
        this.V = w.y0(new sw6.a(this, inputData, 3));
        final int i = 0;
        this.W = w.y0(new Function0(this) { // from class: t2e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreBrandDetailEarnScreen f267542b;

            {
                this.f267542b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StoreBrandDetailEarnScreen storeBrandDetailEarnScreen = this.f267542b;
                switch (i2) {
                    case 0:
                        StoreBrandDetailEarnScreen.Companion companion = StoreBrandDetailEarnScreen.INSTANCE;
                        return (k) ((k2e.c) storeBrandDetailEarnScreen.V.getValue()).d.get();
                    case 1:
                        StoreBrandDetailEarnScreen.Companion companion2 = StoreBrandDetailEarnScreen.INSTANCE;
                        return (on.a) ((k2e.c) storeBrandDetailEarnScreen.V.getValue()).e.get();
                    default:
                        StoreBrandDetailEarnScreen.Companion companion3 = StoreBrandDetailEarnScreen.INSTANCE;
                        StoreBrandDetailEarnScreen storeBrandDetailEarnScreen2 = this.f267542b;
                        return dli.f.a(storeBrandDetailEarnScreen2, storeBrandDetailEarnScreen2.d(), v.k(new RowLoadingDelegate(), storeBrandDetailEarnScreen2.N, storeBrandDetailEarnScreen2.O, storeBrandDetailEarnScreen2.P, storeBrandDetailEarnScreen2.Q, storeBrandDetailEarnScreen2.R, storeBrandDetailEarnScreen2.L, storeBrandDetailEarnScreen2.M, storeBrandDetailEarnScreen2.S), storeBrandDetailEarnScreen2.d3().f148801b.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: t2e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreBrandDetailEarnScreen f267542b;

            {
                this.f267542b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StoreBrandDetailEarnScreen storeBrandDetailEarnScreen = this.f267542b;
                switch (i22) {
                    case 0:
                        StoreBrandDetailEarnScreen.Companion companion = StoreBrandDetailEarnScreen.INSTANCE;
                        return (k) ((k2e.c) storeBrandDetailEarnScreen.V.getValue()).d.get();
                    case 1:
                        StoreBrandDetailEarnScreen.Companion companion2 = StoreBrandDetailEarnScreen.INSTANCE;
                        return (on.a) ((k2e.c) storeBrandDetailEarnScreen.V.getValue()).e.get();
                    default:
                        StoreBrandDetailEarnScreen.Companion companion3 = StoreBrandDetailEarnScreen.INSTANCE;
                        StoreBrandDetailEarnScreen storeBrandDetailEarnScreen2 = this.f267542b;
                        return dli.f.a(storeBrandDetailEarnScreen2, storeBrandDetailEarnScreen2.d(), v.k(new RowLoadingDelegate(), storeBrandDetailEarnScreen2.N, storeBrandDetailEarnScreen2.O, storeBrandDetailEarnScreen2.P, storeBrandDetailEarnScreen2.Q, storeBrandDetailEarnScreen2.R, storeBrandDetailEarnScreen2.L, storeBrandDetailEarnScreen2.M, storeBrandDetailEarnScreen2.S), storeBrandDetailEarnScreen2.d3().f148801b.getId(), null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: t2e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreBrandDetailEarnScreen f267542b;

            {
                this.f267542b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StoreBrandDetailEarnScreen storeBrandDetailEarnScreen = this.f267542b;
                switch (i22) {
                    case 0:
                        StoreBrandDetailEarnScreen.Companion companion = StoreBrandDetailEarnScreen.INSTANCE;
                        return (k) ((k2e.c) storeBrandDetailEarnScreen.V.getValue()).d.get();
                    case 1:
                        StoreBrandDetailEarnScreen.Companion companion2 = StoreBrandDetailEarnScreen.INSTANCE;
                        return (on.a) ((k2e.c) storeBrandDetailEarnScreen.V.getValue()).e.get();
                    default:
                        StoreBrandDetailEarnScreen.Companion companion3 = StoreBrandDetailEarnScreen.INSTANCE;
                        StoreBrandDetailEarnScreen storeBrandDetailEarnScreen2 = this.f267542b;
                        return dli.f.a(storeBrandDetailEarnScreen2, storeBrandDetailEarnScreen2.d(), v.k(new RowLoadingDelegate(), storeBrandDetailEarnScreen2.N, storeBrandDetailEarnScreen2.O, storeBrandDetailEarnScreen2.P, storeBrandDetailEarnScreen2.Q, storeBrandDetailEarnScreen2.R, storeBrandDetailEarnScreen2.L, storeBrandDetailEarnScreen2.M, storeBrandDetailEarnScreen2.S), storeBrandDetailEarnScreen2.d3().f148801b.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ScreenContentRecyclerView screenStoreBrandDetailListRecyclerView = d3().f148801b;
        Intrinsics.checkNotNullExpressionValue(screenStoreBrandDetailListRecyclerView, "screenStoreBrandDetailListRecyclerView");
        Context context = d3().f148800a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ny0.l.a(screenStoreBrandDetailListRecyclerView, kli.a.w(uiState.f267552b, context), "EXPANDED_INSTRUCTIONS_BOTTOM_PADDING_TOKEN", 7);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getX() {
        return new AnalyticsProduct.Retail(super.f0());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52339c.f121375b), null, new t2e.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52371h.f121375b), null, new t2e.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.e.f121375b), null, new t2e.c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, ((sn.a) ((on.a) this.X.getValue())).b(((dli.c) this.Y.getValue()).h(), false), null, new t2e.c(this, continuation, 2), 3);
    }

    public final h2e.c d3() {
        ViewBinding value = this.T.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (h2e.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.W.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Y.getValue();
    }
}
