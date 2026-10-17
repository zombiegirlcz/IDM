package cta;

import b6a.d;
import bwb.n;
import cnc.t;
import com.revolut.feature.raffle.impl.data.service.RaffleService;
import cp7.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f108653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f108654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RaffleService f108655c;
    public final x4l.c d;

    public c(ue0.c storage, j memoryCache, RaffleService service) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f108653a = storage;
        this.f108654b = memoryCache;
        this.f108655c = service;
        Continuation continuation = null;
        this.d = new x4l.c(new d(this, continuation, 27), new k(this, 21), new t(this, 14), new ck7.j(this, continuation, 20), new n(this, continuation, 14));
    }

    public static final String a(c cVar, String str) {
        return a0.d.v(new Object[]{str}, 1, "RAFFLE_CAMPAIGN_STORAGE_KEY_%s", "format(...)");
    }

    public static String b(String str) {
        return a0.d.v(new Object[]{str}, 1, "RAFFLE_CAMPAIGN_MEMORY_KEY_%s", "format(...)");
    }
}
