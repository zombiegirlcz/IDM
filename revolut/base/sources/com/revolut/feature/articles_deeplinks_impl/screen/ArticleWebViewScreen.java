package com.revolut.feature.articles_deeplinks_impl.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenDocumentLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.articles_deeplinks_impl.screen.ArticleWebViewScreen;
import com.revolut.feature.articles_deeplinks_impl.screen.ArticleWebViewScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.j;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ocb.d;
import ofa.n;
import oj2.b;
import oj2.c;
import oj2.f;
import oj2.g;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/articles_deeplinks_impl/screen/ArticleWebViewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Loj2/g;", "feature_articles_deeplinks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ArticleWebViewScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ArticleWebViewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerBasicNavbarBinding;", 0))};
    public final ArticleWebViewScreenContract$InputData K;
    public final h L;
    public final Object M;
    public final FullScreenStateDelegate N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public ArticleWebViewScreen(ArticleWebViewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = w.y0(new n(27));
        this.N = new FullScreenStateDelegate();
        this.O = R$layout.screen_recycler_basic_navbar;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: oj2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ArticleWebViewScreen f225712b;

            {
                this.f225712b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ArticleWebViewScreen articleWebViewScreen = this.f225712b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ArticleWebViewScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(articleWebViewScreen.m2()).a().get(kj2.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", kj2.b.class, " is not found"));
                        }
                        mj2.b bVar = ((mj2.b) aVar2.b()).f205903c;
                        ArticleWebViewScreenContract$InputData articleWebViewScreenContract$InputData = articleWebViewScreen.K;
                        articleWebViewScreenContract$InputData.getClass();
                        return new mj2.a(bVar, articleWebViewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ArticleWebViewScreen.S;
                        return (f) ((mj2.a) articleWebViewScreen.P.getValue()).f205900b.get();
                    default:
                        KProperty[] kPropertyArr3 = ArticleWebViewScreen.S;
                        ArticleWebViewScreen articleWebViewScreen2 = this.f225712b;
                        return dli.f.a(articleWebViewScreen2, articleWebViewScreen2.R2(), v.k((WebViewDelegate) articleWebViewScreen2.M.getValue(), new FullScreenDocumentLoadingDelegate(), articleWebViewScreen2.N), 0, new oh3.a(15), null, null, 52);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: oj2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ArticleWebViewScreen f225712b;

            {
                this.f225712b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ArticleWebViewScreen articleWebViewScreen = this.f225712b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ArticleWebViewScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(articleWebViewScreen.m2()).a().get(kj2.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", kj2.b.class, " is not found"));
                        }
                        mj2.b bVar = ((mj2.b) aVar2.b()).f205903c;
                        ArticleWebViewScreenContract$InputData articleWebViewScreenContract$InputData = articleWebViewScreen.K;
                        articleWebViewScreenContract$InputData.getClass();
                        return new mj2.a(bVar, articleWebViewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ArticleWebViewScreen.S;
                        return (f) ((mj2.a) articleWebViewScreen.P.getValue()).f205900b.get();
                    default:
                        KProperty[] kPropertyArr3 = ArticleWebViewScreen.S;
                        ArticleWebViewScreen articleWebViewScreen2 = this.f225712b;
                        return dli.f.a(articleWebViewScreen2, articleWebViewScreen2.R2(), v.k((WebViewDelegate) articleWebViewScreen2.M.getValue(), new FullScreenDocumentLoadingDelegate(), articleWebViewScreen2.N), 0, new oh3.a(15), null, null, 52);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: oj2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ArticleWebViewScreen f225712b;

            {
                this.f225712b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ArticleWebViewScreen articleWebViewScreen = this.f225712b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ArticleWebViewScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(articleWebViewScreen.m2()).a().get(kj2.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", kj2.b.class, " is not found"));
                        }
                        mj2.b bVar = ((mj2.b) aVar2.b()).f205903c;
                        ArticleWebViewScreenContract$InputData articleWebViewScreenContract$InputData = articleWebViewScreen.K;
                        articleWebViewScreenContract$InputData.getClass();
                        return new mj2.a(bVar, articleWebViewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ArticleWebViewScreen.S;
                        return (f) ((mj2.a) articleWebViewScreen.P.getValue()).f205900b.get();
                    default:
                        KProperty[] kPropertyArr3 = ArticleWebViewScreen.S;
                        ArticleWebViewScreen articleWebViewScreen2 = this.f225712b;
                        return dli.f.a(articleWebViewScreen2, articleWebViewScreen2.R2(), v.k((WebViewDelegate) articleWebViewScreen2.M.getValue(), new FullScreenDocumentLoadingDelegate(), articleWebViewScreen2.N), 0, new oh3.a(15), null, null, 52);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        Clause clause = uiState.f225717b;
        if (clause != null) {
            d3().f174530b.setTitle(clause);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (mj2.a) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174530b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174530b.f59211b), new d(this, continuation, 7), 3);
        ?? r62 = this.M;
        ViewController.P2(this, rd0.e.b(((WebViewDelegate) r62.getValue()).f), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(((WebViewDelegate) r62.getValue()).f53638g), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new oj2.d(this, null), 3);
    }

    public final j d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (j) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
