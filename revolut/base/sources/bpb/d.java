package bpb;

import kotlin.jvm.internal.Intrinsics;
import l80.e;
import org.jetbrains.annotations.NotNull;
import ypg.f;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f17571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lqg.a f17572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f17573c;
    public final e d;

    public d(com.revolut.domain.interactors.transactions.a transactionsInteractor, lqg.a vaultTransactionsFilterFactory, f transactionsMoneyBoxInteractor, e dateProvider) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(vaultTransactionsFilterFactory, "vaultTransactionsFilterFactory");
        Intrinsics.checkNotNullParameter(transactionsMoneyBoxInteractor, "transactionsMoneyBoxInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f17571a = transactionsInteractor;
        this.f17572b = vaultTransactionsFilterFactory;
        this.f17573c = transactionsMoneyBoxInteractor;
        this.d = dateProvider;
    }
}
