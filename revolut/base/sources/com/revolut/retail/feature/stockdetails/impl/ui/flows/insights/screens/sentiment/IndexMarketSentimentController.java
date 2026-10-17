package com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.sentiment;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.j;
import cli.o;
import com.revolut.core.ui_kit.delegates.BigRadialGaugeDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HorizontalLegendDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.sentiment.IndexMarketSentimentController;
import com.revolut.retail.wealth.resources.R$string;
import dli.a;
import dli.c;
import jii.m;
import jij.d;
import jkc.g;
import juk.b;
import juk.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/screens/sentiment/IndexMarketSentimentController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IndexMarketSentimentController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(IndexMarketSentimentController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final FullScreenStateDelegate M;
    public final TextDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final j R;

    public IndexMarketSentimentController(IndexMarketSentimentControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, b.f);
        this.M = new FullScreenStateDelegate();
        this.N = new TextDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: juk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndexMarketSentimentController f178668b;

            {
                this.f178668b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = IndexMarketSentimentController.S;
                        IndexMarketSentimentController indexMarketSentimentController = this.f178668b;
                        return dli.f.a(indexMarketSentimentController, (h) indexMarketSentimentController.Q.getValue(), v.k(new BigRadialGaugeDelegate(), new HorizontalLegendDelegate(), indexMarketSentimentController.N, new TrendViewDelegate(1000L), indexMarketSentimentController.M), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = IndexMarketSentimentController.S;
                        return (h) ((prk.w) this.f178668b.P.getValue()).f.get();
                }
            }
        });
        this.P = w.y0(new jnf.a(this, inputData, 9));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: juk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndexMarketSentimentController f178668b;

            {
                this.f178668b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IndexMarketSentimentController.S;
                        IndexMarketSentimentController indexMarketSentimentController = this.f178668b;
                        return dli.f.a(indexMarketSentimentController, (h) indexMarketSentimentController.Q.getValue(), v.k(new BigRadialGaugeDelegate(), new HorizontalLegendDelegate(), indexMarketSentimentController.N, new TrendViewDelegate(1000L), indexMarketSentimentController.M), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = IndexMarketSentimentController.S;
                        return (h) ((prk.w) this.f178668b.P.getValue()).f.get();
                }
            }
        });
        this.R = new j(this, 14);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (prk.w) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (juk.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.instrument_sentiment_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new g(this, null, 19), 3);
        ViewController.P2(this, new d(rd0.e.b(this.M.f52371h.f121375b), 17), new juk.d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
