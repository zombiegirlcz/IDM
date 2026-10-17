package kkf;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f184834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.k f184835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final klf.m1 f184836c;
    public final vlf.b d;
    public final elf.o e;

    public n(klf.h0 commonDataSource, klf.k cashbackDataSource, klf.m1 juniorDataSource, vlf.b commonUiMapper, elf.o cashbackClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(cashbackDataSource, "cashbackDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(cashbackClickHandler, "cashbackClickHandler");
        this.f184834a = commonDataSource;
        this.f184835b = cashbackDataSource;
        this.f184836c = juniorDataSource;
        this.d = commonUiMapper;
        this.e = cashbackClickHandler;
    }

    public final cmf.p a() {
        SharedFlow sharedFlowC = this.f184834a.c();
        klf.k kVar = this.f184835b;
        return new cmf.p(ta6.a.h(sharedFlowC, vkm.q.Q(kVar.f185518a.d(), new m5(null, kVar, 11)), this.f184836c.a(), new b9k.a(4, this, n.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/TransactionDetails;Lcom/revolut/feature/transactions/api/ui/list/TransactionsListContract$TransactionsContent;Lcom/revolut/feature/transactions/impl/ui/kompot/details/data_source/JuniorDataSource$YouthWalletOwner;)Ljava/util/List;", 4, 4)), new ka9.b(25), zhm.u.c(this.e), "Cashback");
    }
}
