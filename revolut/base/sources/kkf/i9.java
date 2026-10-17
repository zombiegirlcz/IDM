package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f184759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.m1 f184760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vlf.b f184761c;
    public final elf.j2 d;

    public i9(klf.h0 commonDataSource, klf.m1 juniorDataSource, vlf.b commonUiMapper, elf.j2 userCommentClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(userCommentClickHandler, "userCommentClickHandler");
        this.f184759a = commonDataSource;
        this.f184760b = juniorDataSource;
        this.f184761c = commonUiMapper;
        this.d = userCommentClickHandler;
    }

    public final cmf.p a() {
        return new cmf.p(new t38.e(this.f184759a.d(), 24, new x5(this.f184760b.a(), 12), new ael.l0(3, this, i9.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Z)Ljava/util/List;", 4, 23)), new z5(13), zhm.u.c(this.d), "Note");
    }
}
