package chf;

import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wzi.a f24208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.b f24209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f24210c;
    public final rqd.h d;

    public c(wzi.a incomeSorterInteractor, whf.b transactionsContentProvider, n walletInteractor, rqd.h incomeSorterRatesInteractor) {
        Intrinsics.checkNotNullParameter(incomeSorterInteractor, "incomeSorterInteractor");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(incomeSorterRatesInteractor, "incomeSorterRatesInteractor");
        this.f24208a = incomeSorterInteractor;
        this.f24209b = transactionsContentProvider;
        this.f24210c = walletInteractor;
        this.d = incomeSorterRatesInteractor;
    }
}
