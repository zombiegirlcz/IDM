package com.revolut.feature.revolutpay.management.impl.ui.management.flow;

import cn7.c;
import com.revolut.feature.revolutpay.management.impl.ui.management.flow.RevolutPayManagementFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import x9c.d;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements dac.b {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zja.a f84584p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f84585q;

    public b(d revolutPayArticleParamsProvider, zja.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(revolutPayArticleParamsProvider, "revolutPayArticleParamsProvider");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.o = revolutPayArticleParamsProvider;
        this.f84584p = productArticleInteractor;
        cwj.h hVar = new cwj.h(this, 17);
        this.f84585q = cp5.d.a(this, RevolutPayManagementFlowContract$Step.HomeManagement.f84581a, f0.f322471a, hVar);
    }

    @Override // yji.l
    public final void I1() {
        l2(new a(this, null), new c(1, this, b.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 24));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f84585q;
    }
}
