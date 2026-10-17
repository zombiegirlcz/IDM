package kx7;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.insurance_pet.impl.network.service.PetService;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements a {

    @NotNull
    public static final d Companion = new d();
    public static final Type e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PetService f190454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f190455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f190456c;
    public final Lazy d;

    static {
        Type type = new TypeToken<List<? extends gx7.j>>() { // from class: com.revolut.feature.insurance_pet.impl.repository.NotificationRepositoryImpl$Companion$NOTIFICATION_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        e = type;
    }

    public f(PetService service, ue0.c storage, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f190454a = service;
        this.f190455b = storage;
        this.f190456c = memoryCache;
        this.d = yhm.j.b(new kob.a(this, 11));
    }
}
