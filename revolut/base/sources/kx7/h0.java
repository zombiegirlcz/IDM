package kx7;

import com.revolut.feature.insurance_pet.impl.network.service.PetService;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements c0 {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PetService f190461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f190462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i90.b f190463c;
    public final Lazy d;

    public h0(PetService service, ne0.d memoryCache, i90.b uuidGenerator) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.f190461a = service;
        this.f190462b = memoryCache;
        this.f190463c = uuidGenerator;
        this.d = yhm.j.b(new kob.a(this, 14));
    }
}
