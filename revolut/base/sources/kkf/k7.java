package kkf;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f184794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.m1 f184795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vlf.b f184796c;

    public k7(klf.h0 commonDataSource, klf.m1 juniorDataSource, vlf.b commonUiMapper, t1j.b refundsUIStateProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(refundsUIStateProvider, "refundsUIStateProvider");
        this.f184794a = commonDataSource;
        this.f184795b = juniorDataSource;
        this.f184796c = commonUiMapper;
    }

    public final cmf.p a() {
        klf.h0 h0Var = this.f184794a;
        return new cmf.p(ta6.a.e(h0Var.d(), h0Var.c(), new x5(this.f184795b.a(), 5), h0Var.i(), (Flow) h0Var.f185501s.getValue(), new f(6, this, k7.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;ZLorg/joda/time/DateTime;Lcom/revolut/feature/transactions/impl/ui/transactiondetails/content_provider/common/refunds/RefundsInfo;)Ljava/util/List;", 4, 2)), new z5(4), zhm.f0.f322471a, "Status");
    }
}
