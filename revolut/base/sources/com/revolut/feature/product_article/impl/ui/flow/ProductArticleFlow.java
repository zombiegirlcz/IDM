package com.revolut.feature.product_article.impl.ui.flow;

import com.revolut.feature.product_article.api.ProductArticleApi$Toggles;
import com.revolut.feature.product_article.api.flow.ProductArticleFlowContract$InputData;
import com.revolut.feature.product_article.impl.ui.flow.ProductArticleFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import gte.a;
import ika.d;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import te0.w;
import xki.e;
import yja.b;
import yki.c;
import yki.f;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product_article/impl/ui/flow/ProductArticleFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyja/b;", "Lyki/f;", "Lno/d1;", "feature_product_article_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProductArticleFlow extends ViewController<b> implements f, d1 {
    public final ProductArticleFlowContract$InputData K;
    public final a L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public ProductArticleFlow(ProductArticleFlowContract$InputData inputData, a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.K = inputData;
        this.L = featureToggleInteractor;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: wka.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductArticleFlow f298258b;

            {
                this.f298258b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ProductArticleFlow productArticleFlow = this.f298258b;
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(productArticleFlow.m2()).a().get(ika.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ika.f.class, " is not found"));
                        }
                        ika.b bVar = ((ika.b) ((ika.f) aVar2.b())).f161917h;
                        ProductArticleFlowContract$InputData productArticleFlowContract$InputData = productArticleFlow.K;
                        productArticleFlowContract$InputData.getClass();
                        Boolean boolValueOf = Boolean.valueOf(productArticleFlow.q2().d());
                        boolean z = false;
                        if (!productArticleFlow.L.a(ProductArticleApi$Toggles.ModalProductArticles.f81261c)) {
                            if (productArticleFlow.q2().c()) {
                                z = true;
                            } else {
                                IllegalStateException illegalStateException = new IllegalStateException("Product article should not be shown using a non-fullscreen style");
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                            }
                        }
                        return new ika.d(bVar, productArticleFlowContract$InputData, boolValueOf, Boolean.valueOf(z));
                    case 1:
                        return (yja.a) ((ika.d) productArticleFlow.N.getValue()).f.get();
                    default:
                        return czi.c.d(R$id.screen_transparent_container, 4, null, productArticleFlow, (yja.a) productArticleFlow.O.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: wka.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductArticleFlow f298258b;

            {
                this.f298258b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ProductArticleFlow productArticleFlow = this.f298258b;
                switch (i22) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(productArticleFlow.m2()).a().get(ika.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ika.f.class, " is not found"));
                        }
                        ika.b bVar = ((ika.b) ((ika.f) aVar2.b())).f161917h;
                        ProductArticleFlowContract$InputData productArticleFlowContract$InputData = productArticleFlow.K;
                        productArticleFlowContract$InputData.getClass();
                        Boolean boolValueOf = Boolean.valueOf(productArticleFlow.q2().d());
                        boolean z = false;
                        if (!productArticleFlow.L.a(ProductArticleApi$Toggles.ModalProductArticles.f81261c)) {
                            if (productArticleFlow.q2().c()) {
                                z = true;
                            } else {
                                IllegalStateException illegalStateException = new IllegalStateException("Product article should not be shown using a non-fullscreen style");
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                            }
                        }
                        return new ika.d(bVar, productArticleFlowContract$InputData, boolValueOf, Boolean.valueOf(z));
                    case 1:
                        return (yja.a) ((ika.d) productArticleFlow.N.getValue()).f.get();
                    default:
                        return czi.c.d(R$id.screen_transparent_container, 4, null, productArticleFlow, (yja.a) productArticleFlow.O.getValue());
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: wka.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductArticleFlow f298258b;

            {
                this.f298258b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ProductArticleFlow productArticleFlow = this.f298258b;
                switch (i22) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(productArticleFlow.m2()).a().get(ika.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ika.f.class, " is not found"));
                        }
                        ika.b bVar = ((ika.b) ((ika.f) aVar2.b())).f161917h;
                        ProductArticleFlowContract$InputData productArticleFlowContract$InputData = productArticleFlow.K;
                        productArticleFlowContract$InputData.getClass();
                        Boolean boolValueOf = Boolean.valueOf(productArticleFlow.q2().d());
                        boolean z = false;
                        if (!productArticleFlow.L.a(ProductArticleApi$Toggles.ModalProductArticles.f81261c)) {
                            if (productArticleFlow.q2().c()) {
                                z = true;
                            } else {
                                IllegalStateException illegalStateException = new IllegalStateException("Product article should not be shown using a non-fullscreen style");
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                            }
                        }
                        return new ika.d(bVar, productArticleFlowContract$InputData, boolValueOf, Boolean.valueOf(z));
                    case 1:
                        return (yja.a) ((ika.d) productArticleFlow.N.getValue()).f.get();
                    default:
                        return czi.c.d(R$id.screen_transparent_container, 4, null, productArticleFlow, (yja.a) productArticleFlow.O.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (d) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (yja.a) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.P.getValue();
    }
}
