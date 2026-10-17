package qb9;

import com.revolut.feature.onboarding.impl.onboarding.service.OnboardingCountriesService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import p24.q;
import pti.s;
import q43.m;
import q5g.f0;
import qa9.r;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnboardingCountriesService f244136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f244137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f244138c;
    public final x4l.c d;

    public b(OnboardingCountriesService service, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f244136a = service;
        this.f244137b = memoryCache;
        this.f244138c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new s(this, continuation, 3), new r(this, 6), new f0(this, 10), new m(this, continuation, 17), new q(this, continuation, 16));
    }
}
