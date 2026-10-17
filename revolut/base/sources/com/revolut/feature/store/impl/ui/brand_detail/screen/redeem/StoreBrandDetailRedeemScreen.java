package com.revolut.feature.store.impl.ui.brand_detail.screen.redeem;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c2e.b;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.store.impl.R$layout;
import com.revolut.feature.store.impl.ui.brand_detail.screen.redeem.StoreBrandDetailRedeemScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import h30.q;
import k2e.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ny0.l;
import org.jetbrains.annotations.NotNull;
import te0.w;
import uz8.s;
import v2e.c;
import v2e.d;
import v2e.g;
import v2e.i;
import v2e.j;
import v2e.k;
import v2e.p;
import v2e.v;
import xki.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/store/impl/ui/brand_detail/screen/redeem/StoreBrandDetailRedeemScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lv2e/p;", "Ldli/a;", "Lv2e/w;", "Lc2e/b;", "Companion", "a", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoreBrandDetailRedeemScreen extends ViewController<p> implements a, b {
    public final q K;
    public final FullScreenStateDelegate L;
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
    public final int W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f88687a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f88686b0 = {o0.f186429a.j(new h0(StoreBrandDetailRedeemScreen.class, "binding", "getBinding()Lcom/revolut/feature/store/impl/databinding/ScreenStoreBrandDetailRedeemBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.store.impl.ui.brand_detail.screen.redeem.StoreBrandDetailRedeemScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public StoreBrandDetailRedeemScreen(StoreBrandDetailRedeemScreenContract$InputData inputData, q componentBuilder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(componentBuilder, "componentBuilder");
        this.K = componentBuilder;
        this.L = new FullScreenStateDelegate();
        this.M = w.y0(new s(21));
        this.N = w.y0(new s(23));
        this.O = w.y0(new s(24));
        this.P = w.y0(new s(25));
        this.Q = w.y0(new s(26));
        this.R = w.y0(new s(27));
        this.S = w.y0(new s(28));
        this.T = w.y0(new s(22));
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: v2e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreBrandDetailRedeemScreen f285693b;

            {
                this.f285693b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StoreBrandDetailRedeemScreen storeBrandDetailRedeemScreen = this.f285693b;
                switch (i2) {
                    case 0:
                        StoreBrandDetailRedeemScreen.Companion companion = StoreBrandDetailRedeemScreen.INSTANCE;
                        return new GridBoxDelegate(zhm.v.k((AttributeSelectorSmallDelegate) storeBrandDetailRedeemScreen.S.getValue(), (NewsDelegate) storeBrandDetailRedeemScreen.T.getValue()), 0, 8.0f, 8.0f, 2);
                    case 1:
                        StoreBrandDetailRedeemScreen.Companion companion2 = StoreBrandDetailRedeemScreen.INSTANCE;
                        return (v) ((k2e.f) storeBrandDetailRedeemScreen.X.getValue()).d.get();
                    case 2:
                        StoreBrandDetailRedeemScreen.Companion companion3 = StoreBrandDetailRedeemScreen.INSTANCE;
                        return (on.a) ((k2e.f) storeBrandDetailRedeemScreen.X.getValue()).e.get();
                    default:
                        StoreBrandDetailRedeemScreen.Companion companion4 = StoreBrandDetailRedeemScreen.INSTANCE;
                        StoreBrandDetailRedeemScreen storeBrandDetailRedeemScreen2 = this.f285693b;
                        return dli.f.a(storeBrandDetailRedeemScreen2, storeBrandDetailRedeemScreen2.d(), zhm.v.k(new RowLoadingDelegate(), (ListSubheaderDelegate) storeBrandDetailRedeemScreen2.M.getValue(), (PlainTextDelegate) storeBrandDetailRedeemScreen2.N.getValue(), (RowDelegate) storeBrandDetailRedeemScreen2.P.getValue(), (CellDetailsDelegate) storeBrandDetailRedeemScreen2.Q.getValue(), (LargeActionButtonDelegate) storeBrandDetailRedeemScreen2.R.getValue(), (GridBoxDelegate) storeBrandDetailRedeemScreen2.U.getValue(), storeBrandDetailRedeemScreen2.L, (FooterTextDelegate) storeBrandDetailRedeemScreen2.O.getValue()), storeBrandDetailRedeemScreen2.d3().f148803b.getId(), null, null, null, 56);
                }
            }
        });
        this.V = vc.s.t(this, v2e.b.f);
        this.W = R$layout.screen_store_brand_detail_redeem;
        this.X = w.y0(new v0c.b(this, inputData, 9));
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: v2e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreBrandDetailRedeemScreen f285693b;

            {
                this.f285693b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StoreBrandDetailRedeemScreen storeBrandDetailRedeemScreen = this.f285693b;
                switch (i22) {
                    case 0:
                        StoreBrandDetailRedeemScreen.Companion companion = StoreBrandDetailRedeemScreen.INSTANCE;
                        return new GridBoxDelegate(zhm.v.k((AttributeSelectorSmallDelegate) storeBrandDetailRedeemScreen.S.getValue(), (NewsDelegate) storeBrandDetailRedeemScreen.T.getValue()), 0, 8.0f, 8.0f, 2);
                    case 1:
                        StoreBrandDetailRedeemScreen.Companion companion2 = StoreBrandDetailRedeemScreen.INSTANCE;
                        return (v) ((k2e.f) storeBrandDetailRedeemScreen.X.getValue()).d.get();
                    case 2:
                        StoreBrandDetailRedeemScreen.Companion companion3 = StoreBrandDetailRedeemScreen.INSTANCE;
                        return (on.a) ((k2e.f) storeBrandDetailRedeemScreen.X.getValue()).e.get();
                    default:
                        StoreBrandDetailRedeemScreen.Companion companion4 = StoreBrandDetailRedeemScreen.INSTANCE;
                        StoreBrandDetailRedeemScreen storeBrandDetailRedeemScreen2 = this.f285693b;
                        return dli.f.a(storeBrandDetailRedeemScreen2, storeBrandDetailRedeemScreen2.d(), zhm.v.k(new RowLoadingDelegate(), (ListSubheaderDelegate) storeBrandDetailRedeemScreen2.M.getValue(), (PlainTextDelegate) storeBrandDetailRedeemScreen2.N.getValue(), (RowDelegate) storeBrandDetailRedeemScreen2.P.getValue(), (CellDetailsDelegate) storeBrandDetailRedeemScreen2.Q.getValue(), (LargeActionButtonDelegate) storeBrandDetailRedeemScreen2.R.getValue(), (GridBoxDelegate) storeBrandDetailRedeemScreen2.U.getValue(), storeBrandDetailRedeemScreen2.L, (FooterTextDelegate) storeBrandDetailRedeemScreen2.O.getValue()), storeBrandDetailRedeemScreen2.d3().f148803b.getId(), null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Z = w.y0(new Function0(this) { // from class: v2e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreBrandDetailRedeemScreen f285693b;

            {
                this.f285693b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StoreBrandDetailRedeemScreen storeBrandDetailRedeemScreen = this.f285693b;
                switch (i22) {
                    case 0:
                        StoreBrandDetailRedeemScreen.Companion companion = StoreBrandDetailRedeemScreen.INSTANCE;
                        return new GridBoxDelegate(zhm.v.k((AttributeSelectorSmallDelegate) storeBrandDetailRedeemScreen.S.getValue(), (NewsDelegate) storeBrandDetailRedeemScreen.T.getValue()), 0, 8.0f, 8.0f, 2);
                    case 1:
                        StoreBrandDetailRedeemScreen.Companion companion2 = StoreBrandDetailRedeemScreen.INSTANCE;
                        return (v) ((k2e.f) storeBrandDetailRedeemScreen.X.getValue()).d.get();
                    case 2:
                        StoreBrandDetailRedeemScreen.Companion companion3 = StoreBrandDetailRedeemScreen.INSTANCE;
                        return (on.a) ((k2e.f) storeBrandDetailRedeemScreen.X.getValue()).e.get();
                    default:
                        StoreBrandDetailRedeemScreen.Companion companion4 = StoreBrandDetailRedeemScreen.INSTANCE;
                        StoreBrandDetailRedeemScreen storeBrandDetailRedeemScreen2 = this.f285693b;
                        return dli.f.a(storeBrandDetailRedeemScreen2, storeBrandDetailRedeemScreen2.d(), zhm.v.k(new RowLoadingDelegate(), (ListSubheaderDelegate) storeBrandDetailRedeemScreen2.M.getValue(), (PlainTextDelegate) storeBrandDetailRedeemScreen2.N.getValue(), (RowDelegate) storeBrandDetailRedeemScreen2.P.getValue(), (CellDetailsDelegate) storeBrandDetailRedeemScreen2.Q.getValue(), (LargeActionButtonDelegate) storeBrandDetailRedeemScreen2.R.getValue(), (GridBoxDelegate) storeBrandDetailRedeemScreen2.U.getValue(), storeBrandDetailRedeemScreen2.L, (FooterTextDelegate) storeBrandDetailRedeemScreen2.O.getValue()), storeBrandDetailRedeemScreen2.d3().f148803b.getId(), null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.f88687a0 = w.y0(new Function0(this) { // from class: v2e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreBrandDetailRedeemScreen f285693b;

            {
                this.f285693b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                StoreBrandDetailRedeemScreen storeBrandDetailRedeemScreen = this.f285693b;
                switch (i22) {
                    case 0:
                        StoreBrandDetailRedeemScreen.Companion companion = StoreBrandDetailRedeemScreen.INSTANCE;
                        return new GridBoxDelegate(zhm.v.k((AttributeSelectorSmallDelegate) storeBrandDetailRedeemScreen.S.getValue(), (NewsDelegate) storeBrandDetailRedeemScreen.T.getValue()), 0, 8.0f, 8.0f, 2);
                    case 1:
                        StoreBrandDetailRedeemScreen.Companion companion2 = StoreBrandDetailRedeemScreen.INSTANCE;
                        return (v) ((k2e.f) storeBrandDetailRedeemScreen.X.getValue()).d.get();
                    case 2:
                        StoreBrandDetailRedeemScreen.Companion companion3 = StoreBrandDetailRedeemScreen.INSTANCE;
                        return (on.a) ((k2e.f) storeBrandDetailRedeemScreen.X.getValue()).e.get();
                    default:
                        StoreBrandDetailRedeemScreen.Companion companion4 = StoreBrandDetailRedeemScreen.INSTANCE;
                        StoreBrandDetailRedeemScreen storeBrandDetailRedeemScreen2 = this.f285693b;
                        return dli.f.a(storeBrandDetailRedeemScreen2, storeBrandDetailRedeemScreen2.d(), zhm.v.k(new RowLoadingDelegate(), (ListSubheaderDelegate) storeBrandDetailRedeemScreen2.M.getValue(), (PlainTextDelegate) storeBrandDetailRedeemScreen2.N.getValue(), (RowDelegate) storeBrandDetailRedeemScreen2.P.getValue(), (CellDetailsDelegate) storeBrandDetailRedeemScreen2.Q.getValue(), (LargeActionButtonDelegate) storeBrandDetailRedeemScreen2.R.getValue(), (GridBoxDelegate) storeBrandDetailRedeemScreen2.U.getValue(), storeBrandDetailRedeemScreen2.L, (FooterTextDelegate) storeBrandDetailRedeemScreen2.O.getValue()), storeBrandDetailRedeemScreen2.d3().f148803b.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        v2e.w uiState = (v2e.w) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ScreenContentRecyclerView screenStoreBrandDetailRedeemRecyclerView = d3().f148803b;
        Intrinsics.checkNotNullExpressionValue(screenStoreBrandDetailRedeemRecyclerView, "screenStoreBrandDetailRedeemRecyclerView");
        Context context = d3().f148802a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        l.a(screenStoreBrandDetailRedeemRecyclerView, kli.a.w(uiState.f285729b, context), "EXPANDED_CONTENT_BOTTOM_PADDING_TOKEN", 7);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getQ() {
        return new AnalyticsProduct.Retail(super.f0());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52371h.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((AttributeSelectorSmallDelegate) this.S.getValue()).p()), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PlainTextDelegate) this.N.getValue()).f.f121375b), null, new v2e.e(this, null), 3);
        ?? r56 = this.P;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53218h), null, new v2e.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53220l), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsDelegate) this.Q.getValue()).f), null, new v2e.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.R.getValue()).d.f121375b), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((NewsDelegate) this.T.getValue()).p()), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FooterTextDelegate) this.O.getValue()).e.f121375b), null, new k(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, ((sn.a) ((on.a) this.Z.getValue())).b(((dli.c) this.f88687a0.getValue()).h(), false), null, new k(this, null, 1), 3);
    }

    public final h2e.d d3() {
        ViewBinding value = this.V.getValue(this, f88686b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (h2e.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final v d() {
        return (v) this.Y.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.W;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f88687a0.getValue();
    }
}
