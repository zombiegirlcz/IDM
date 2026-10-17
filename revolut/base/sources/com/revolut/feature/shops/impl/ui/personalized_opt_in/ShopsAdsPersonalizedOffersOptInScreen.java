package com.revolut.feature.shops.impl.ui.personalized_opt_in;

import android.view.View;
import cli.o;
import cli.q;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.shops.impl.R$id;
import com.revolut.feature.shops.impl.R$layout;
import com.revolut.feature.shops.impl.ui.personalized_opt_in.ShopsAdsPersonalizedOffersOptInScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.tracking.v3.AdsSourceContext;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.k;
import oa2.b;
import ofa.n;
import ojd.c;
import ojd.d;
import ojd.g;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/personalized_opt_in/ShopsAdsPersonalizedOffersOptInScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lojd/c;", "Ldli/a;", "Lojd/d;", "Lno/k;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShopsAdsPersonalizedOffersOptInScreen extends ViewController<c> implements a, k {
    public static final /* synthetic */ int R = 0;
    public AnalyticsContext K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public ShopsAdsPersonalizedOffersOptInScreen(ShopsAdsPersonalizedOffersOptInScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        AdsSourceContext.a aVarNewBuilder = AdsSourceContext.newBuilder();
        String str = inputData.f87240a;
        aVarNewBuilder.c();
        ((AdsSourceContext) aVarNewBuilder.f49761b).setSource(str);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        this.K = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        this.L = R$layout.screen_shops_ads_personalized_offer_opt_in;
        this.M = w.y0(new b(this, inputData, 15));
        this.N = w.y0(new n(28));
        this.O = w.y0(new n(29));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: ojd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsAdsPersonalizedOffersOptInScreen f225759b;

            {
                this.f225759b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ShopsAdsPersonalizedOffersOptInScreen shopsAdsPersonalizedOffersOptInScreen = this.f225759b;
                        return dli.f.a(shopsAdsPersonalizedOffersOptInScreen, (g) shopsAdsPersonalizedOffersOptInScreen.Q.getValue(), v.k((LargeActionButtonDelegate) shopsAdsPersonalizedOffersOptInScreen.N.getValue(), new SimpleMediaDelegate(), (TextDelegate) shopsAdsPersonalizedOffersOptInScreen.O.getValue()), R$id.shopsAdsPersonalizedOptIn_recyclerView, null, null, null, 56);
                    default:
                        return (g) ((did.c) this.f225759b.M.getValue()).f114991c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ojd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsAdsPersonalizedOffersOptInScreen f225759b;

            {
                this.f225759b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ShopsAdsPersonalizedOffersOptInScreen shopsAdsPersonalizedOffersOptInScreen = this.f225759b;
                        return dli.f.a(shopsAdsPersonalizedOffersOptInScreen, (g) shopsAdsPersonalizedOffersOptInScreen.Q.getValue(), v.k((LargeActionButtonDelegate) shopsAdsPersonalizedOffersOptInScreen.N.getValue(), new SimpleMediaDelegate(), (TextDelegate) shopsAdsPersonalizedOffersOptInScreen.O.getValue()), R$id.shopsAdsPersonalizedOptIn_recyclerView, null, null, null, 56);
                    default:
                        return (g) ((did.c) this.f225759b.M.getValue()).f114991c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((d) oVar);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.K = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (did.c) this.M.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.N.getValue()).d.f121375b), null, new ojd.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TextDelegate) this.O.getValue()).d), null, new o95.c(this, null, 24), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
