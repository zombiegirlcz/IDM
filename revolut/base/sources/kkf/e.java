package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184650l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f184651m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final elf.e f184652n;
    public final thf.c o;

    public e(klf.h0 commonDataSource, klf.m1 juniorDataSource, elf.e analyticsClickHandler, thf.c transactionCategoryResourcesMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(analyticsClickHandler, "analyticsClickHandler");
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        this.f184650l = commonDataSource;
        this.f184651m = juniorDataSource;
        this.f184652n = analyticsClickHandler;
        this.o = transactionCategoryResourcesMapper;
    }

    public final cmf.p Z2() {
        return new cmf.p(new t38.e(this.f184650l.d(), 24, new iyg.b0(this.f184651m.a(), 18), new ael.l0(3, this, e.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Z)Ljava/util/List;", 4, 6)), new ka9.b(23), zhm.u.c(this.f184652n), "Analytics");
    }
}
