package scl;

import com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingAccountsService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f261772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f261773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TradingAccountsService f261774c;

    public j(ne0.j memoryCache, ue0.c storageCache, TradingAccountsService service) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storageCache, "storageCache");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f261772a = memoryCache;
        this.f261773b = storageCache;
        this.f261774c = service;
    }
}
