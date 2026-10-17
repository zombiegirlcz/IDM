package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f184815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.i f184816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final klf.m1 f184817c;
    public final vlf.b d;
    public final elf.d1 e;

    public m(klf.h0 commonDataSource, klf.i cardDataSource, klf.m1 juniorDataSource, vlf.b commonUiMapper, elf.d1 noticeLinkClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(cardDataSource, "cardDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(noticeLinkClickHandler, "noticeLinkClickHandler");
        this.f184815a = commonDataSource;
        this.f184816b = cardDataSource;
        this.f184817c = juniorDataSource;
        this.d = commonUiMapper;
        this.e = noticeLinkClickHandler;
    }

    public final cmf.p a() {
        klf.h0 h0Var = this.f184815a;
        return new cmf.p(ta6.a.d(h0Var.d(), h0Var.c(), h0Var.e(), this.f184816b.a(), new iyg.b0(this.f184817c.a(), 20), h0Var.i(), new blf.h(7, this, m.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;Ljava/util/Map;Lcom/revolut/feature/cards/models/revolutcard/RevolutCard;ZLorg/joda/time/DateTime;)Ljava/util/List;", 4, 2)), new chc.c0(23), zhm.u.c(this.e), "CardPaymentStatusWithNotice");
    }
}
