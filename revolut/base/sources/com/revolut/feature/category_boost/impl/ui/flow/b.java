package com.revolut.feature.category_boost.impl.ui.flow;

import ack.f;
import af3.c;
import com.revolut.feature.category_boost.impl.ui.flow.CategoryBoostFlowContract$Step;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.navigable.TransitionAnimation;
import d8l.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yki.i;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements af3.b {

    @NotNull
    public static final c Companion = new c();
    public final ve3.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ugc.a f65761p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ProductArticleParams f65762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f65763r;

    public b(ve3.b introductionInteractor, ugc.a categoryBoostsInteractor) {
        Intrinsics.checkNotNullParameter(introductionInteractor, "introductionInteractor");
        Intrinsics.checkNotNullParameter(categoryBoostsInteractor, "categoryBoostsInteractor");
        this.o = introductionInteractor;
        this.f65761p = categoryBoostsInteractor;
        this.f65762q = new ProductArticleParams(new ProductArticleParams.ArticleReference.Id("category-boost-intro"));
        this.f65763r = d.a(this, new f(this, 6));
    }

    @Override // yki.j
    public final void M0() {
        Boolean bool = (Boolean) this.o.f288109a.a(new tk0.b("CATEGORY_BOOST_INTRODUCTION_COMPLETED"));
        boolean z = false;
        if (bool != null ? bool.booleanValue() : false) {
            l2(new af3.f(this, z, (Continuation) null, 0), new yi5.b(26));
        } else {
            h.s2(this.f65763r, CategoryBoostFlowContract$Step.Introduction.f65759a, false, TransitionAnimation.NONE.f98393a, true);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f65763r;
    }
}
