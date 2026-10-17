package ghl;

import com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.screener.ScreenerService;
import ghk.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerService f144005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f144006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f144007c;

    public g(ScreenerService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f144005a = service;
        this.f144006b = memoryCache;
        this.f144007c = storage;
    }

    public static String a(List list) {
        return j6.a.q("SCREENER_CONFIG_", d0.k0(list, ",", null, null, 0, new r(9), 30));
    }
}
