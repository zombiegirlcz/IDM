package rqd;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    @NotNull
    private static final i Companion = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f256532b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f256533a;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        f256532b = kotlin.time.c.g(3, pkm.e.SECONDS);
    }

    public k(com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f256533a = transactionsInteractor;
    }
}
