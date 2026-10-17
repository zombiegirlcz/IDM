package h59;

import com.revolut.feature.market_alert_settings.impl.data.network.MarketAlertSettingsService;
import dp4.z0;
import e6d.f;
import gqh.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MarketAlertSettingsService f149514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f149515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f149516c;
    public final x4l.c d;

    public c(MarketAlertSettingsService service, ue0.c storage, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f149514a = service;
        this.f149515b = storage;
        this.f149516c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new f(this, continuation, 15), new h56.a(this, 1), new h1c.c(this, 10), new o(this, continuation, 17), new z0(this, continuation, 26));
    }
}
