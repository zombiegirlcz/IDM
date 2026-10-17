package wtc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f299855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nhf.a f299856b;

    public b(com.revolut.domain.interactors.transactions.a transactionsInteractor, nhf.a unitedWalletInteractor) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        this.f299855a = transactionsInteractor;
        this.f299856b = unitedWalletInteractor;
    }
}
