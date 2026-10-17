package com.revolut.feature.credit.application.plugins.impl.ui.product_articles;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.product_articles.ProductArticlesFlowContract$Step;
import cp5.d;
import e84.e;
import hw3.c;
import kotlin.jvm.internal.Intrinsics;
import wli.x;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements tg4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ProductArticlesFlowContract$InputData f68239p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f68240q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f68241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f68242s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ProductArticlesFlowContract$InputData inputData, c interactor, x deeplinkHandler, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68239p = inputData;
        this.f68240q = interactor;
        this.f68241r = deeplinkHandler;
        ta8.a aVar = new ta8.a(this, 13);
        this.f68242s = d.a(this, ProductArticlesFlowContract$Step.ProductArticles.f68238a, f0.f322471a, aVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f68242s;
    }
}
