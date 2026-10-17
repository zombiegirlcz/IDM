package qhc;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.rewards.impl.data.network.services.SubscriptionsSearchService;
import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import lhc.l;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import pvc.e;
import qe0.s;
import re0.d;
import ue0.c;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements igc.a {

    @NotNull
    private static final a Companion = new a();
    public static final long f = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f246598g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubscriptionsSearchService f246599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f246600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f246601c;
    public final s d;
    public final re0.c e;

    public b(SubscriptionsSearchService service, c storage, j memoryCache, ze0.a forceReloadStrategyFactory) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        this.f246599a = service;
        this.f246600b = storage;
        this.f246601c = memoryCache;
        this.d = ((ze0.c) forceReloadStrategyFactory).a(storage, f);
        d dVar = new d(memoryCache, storage);
        e eVar = new e(1, this, b.class, "storageKey", "storageKey(Ljava/lang/String;)Ljava/lang/String;", 0, 29);
        qc8.a aVar = new qc8.a(21);
        qc8.a aVar2 = new qc8.a(22);
        pti.d dVar2 = new pti.d(this, null, 8);
        Type type = new TypeToken<l>() { // from class: com.revolut.feature.rewards.impl.data.repository.subscriptions_search.SubscriptionsSearchRepositoryImpl$special$$inlined$invoke$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        this.e = new re0.c(dVar, eVar, type, aVar, aVar2, dVar2);
    }
}
