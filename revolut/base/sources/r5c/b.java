package r5c;

import com.revolut.feature.revolut_x_promo.impl.service.CryptoExchangeEligibilityService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import p24.q;
import pti.d;
import r38.m;
import ue0.c;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f251578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f251579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p5c.a f251580c;
    public final CryptoExchangeEligibilityService d;
    public final x4l.c e;

    public b(j memoryCache, c storage, p5c.a mapper, CryptoExchangeEligibilityService service) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f251578a = memoryCache;
        this.f251579b = storage;
        this.f251580c = mapper;
        this.d = service;
        Continuation continuation = null;
        this.e = new x4l.c(new d(this, continuation, 13), new m(this, 12), new qm2.c(this, 28), new r0e.c(this, continuation, 8), new q(this, continuation, 21));
    }
}
