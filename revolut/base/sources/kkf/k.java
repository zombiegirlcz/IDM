package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f184784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.i f184785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final klf.m1 f184786c;
    public final vlf.b d;

    public k(klf.h0 commonDataSource, klf.i cardDataSource, klf.m1 juniorDataSource, vlf.b commonUiMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(cardDataSource, "cardDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        this.f184784a = commonDataSource;
        this.f184785b = cardDataSource;
        this.f184786c = juniorDataSource;
        this.d = commonUiMapper;
    }

    public final cmf.p a() {
        klf.h0 h0Var = this.f184784a;
        return new cmf.p(ta6.a.d(h0Var.d(), h0Var.c(), h0Var.e(), this.f184785b.a(), new iyg.b0(this.f184786c.a(), 19), h0Var.i(), new blf.h(7, this, k.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;Ljava/util/Map;Lcom/revolut/feature/cards/models/revolutcard/RevolutCard;ZLorg/joda/time/DateTime;)Ljava/util/List;", 4, 1)), new chc.c0(23), zhm.f0.f322471a, "CardPaymentStatus");
    }
}
