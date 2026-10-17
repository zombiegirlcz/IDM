package scl;

import com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingAccountsService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f261767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f261768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TradingAccountsService f261769c;

    public g(ne0.j memoryCache, ue0.c storageCache, TradingAccountsService service) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storageCache, "storageCache");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f261767a = memoryCache;
        this.f261768b = storageCache;
        this.f261769c = service;
    }
}
