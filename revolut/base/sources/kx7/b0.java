package kx7;

import com.revolut.feature.insurance_pet.impl.network.service.PetService;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PetService f190447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f190448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f190449c;
    public final Lazy d;

    public b0(PetService service, ue0.c storage, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f190447a = service;
        this.f190448b = storage;
        this.f190449c = memoryCache;
        this.d = yhm.j.b(new kob.a(this, 13));
    }
}
