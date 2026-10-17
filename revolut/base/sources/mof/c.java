package mof;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import thf.g;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f207653a;

    public c(com.revolut.domain.interactors.transactions.a transactionsInteractor, nhf.a unitedWalletInteractor, g transactionsItemMapper) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        this.f207653a = transactionsItemMapper;
        new AtomicReference();
        new AtomicReference();
    }
}
