package eif;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mjf.q;
import tif.r;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r f126595l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(tif.d transactionsDaoWrapper, mif.j transactionDetailsDao, r transactionsMapperWrapper, tif.b loadingStateWrapper, ang.f userInteractor, q calculatedBalanceInteractor, mhf.j transactionsSearchIndexInteractor) {
        super(transactionsDaoWrapper, transactionDetailsDao, transactionsMapperWrapper, loadingStateWrapper, userInteractor, calculatedBalanceInteractor, transactionsSearchIndexInteractor);
        Intrinsics.checkNotNullParameter(transactionsDaoWrapper, "transactionsDaoWrapper");
        Intrinsics.checkNotNullParameter(transactionDetailsDao, "transactionDetailsDao");
        Intrinsics.checkNotNullParameter(transactionsMapperWrapper, "transactionsMapperWrapper");
        Intrinsics.checkNotNullParameter(loadingStateWrapper, "loadingStateWrapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(calculatedBalanceInteractor, "calculatedBalanceInteractor");
        Intrinsics.checkNotNullParameter(transactionsSearchIndexInteractor, "transactionsSearchIndexInteractor");
        this.f126595l = transactionsMapperWrapper;
    }

    @Override // eif.k
    public final ArrayList k(String currentUserId, List transactions) {
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        return this.f126595l.a(transactions, currentUserId, io3.i.EXTERNAL);
    }
}
