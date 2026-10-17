package xif;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements x71.b {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x71.e f306351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f306352b;

    public e(x71.e transactionsRepository, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(transactionsRepository, "transactionsRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f306351a = transactionsRepository;
        this.f306352b = walletInteractor;
    }
}
