package xif;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nif.f3;
import uyd.e0;
import xec.c0;

/* JADX INFO: loaded from: classes13.dex */
public final class o implements x71.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f306368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f306369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wif.d f306370c;
    public final tif.d d;
    public final mif.j e;
    public final tif.r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mjf.q f306371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final phm.a f306372h;
    public final x4l.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ao.h f306373j;

    public o(ne0.j memoryCache, ang.f userInteractor, wif.d transactionDetailsRemoteProvidersFactory, tif.d transactionsDaoWrapper, mif.j transactionDetailsDao, tif.r transactionsMapperWrapper, tif.c transactionDetailsMapperDelegate, sjf.e transactionsPerformanceTracker, mjf.q calculatedBalanceInteractor, phm.a transactionsSearchIndexInteractor) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(transactionDetailsRemoteProvidersFactory, "transactionDetailsRemoteProvidersFactory");
        Intrinsics.checkNotNullParameter(transactionsDaoWrapper, "transactionsDaoWrapper");
        Intrinsics.checkNotNullParameter(transactionDetailsDao, "transactionDetailsDao");
        Intrinsics.checkNotNullParameter(transactionsMapperWrapper, "transactionsMapperWrapper");
        Intrinsics.checkNotNullParameter(transactionDetailsMapperDelegate, "transactionDetailsMapperDelegate");
        Intrinsics.checkNotNullParameter(transactionsPerformanceTracker, "transactionsPerformanceTracker");
        Intrinsics.checkNotNullParameter(calculatedBalanceInteractor, "calculatedBalanceInteractor");
        Intrinsics.checkNotNullParameter(transactionsSearchIndexInteractor, "transactionsSearchIndexInteractor");
        this.f306368a = memoryCache;
        this.f306369b = userInteractor;
        this.f306370c = transactionDetailsRemoteProvidersFactory;
        this.d = transactionsDaoWrapper;
        this.e = transactionDetailsDao;
        this.f = transactionsMapperWrapper;
        this.f306371g = calculatedBalanceInteractor;
        this.f306372h = transactionsSearchIndexInteractor;
        Continuation continuation = null;
        this.i = new x4l.c(new wqj.g(this, continuation, 6), new j(this, 1), new k(this, 0), new c0(this, continuation, 13), new e0(20));
        this.f306373j = new ao.h(20, new j(this, 2));
    }

    public static boolean a(f3 f3Var, f3 f3Var2) {
        return (Intrinsics.f(f3Var.x0(), f3Var2.x0()) && f3Var.g() == f3Var2.g() && f3Var.h() == f3Var2.h()) ? false : true;
    }
}
