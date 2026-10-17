package com.revolut.feature.masav.impl.ui;

import a01.e;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rea.m;
import yki.i;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements a69.b {
    public final zja.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f78107p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ProductArticleParams f78108q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f78109r;

    public c(zja.a productArticleInteractor, m pocketDetailsInteractor) {
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        this.o = productArticleInteractor;
        this.f78107p = pocketDetailsInteractor;
        this.f78108q = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(new MasavDirectDebitsProductArticleKey(0)));
        this.f78109r = d.a(this, new a09.b(this, 15));
    }

    @Override // yki.j
    public final void M0() {
        l2(new e(this, null, 8), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f78109r;
    }
}
