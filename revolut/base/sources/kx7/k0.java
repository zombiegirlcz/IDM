package kx7;

import com.revolut.feature.insurance_pet.impl.network.service.PetService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PetService f190469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i90.b f190470b;

    public k0(PetService service, i90.b uuidGenerator) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.f190469a = service;
        this.f190470b = uuidGenerator;
    }
}
