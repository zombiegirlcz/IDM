package gab;

import com.revolut.feature.retail.junior.pricing_plans.impl.data.service.JuniorPricingPlansService;
import g2e.m0;
import g4k.e;
import g75.i;
import gaa.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorPricingPlansService f142132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f142133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f142134c;
    public final x4l.c d;

    public c(JuniorPricingPlansService service, ue0.c storage, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f142132a = service;
        this.f142133b = storage;
        this.f142134c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new frk.a(this, continuation, 21), new e(this, 17), new i(this, 7), new g(this, continuation, 1), new m0(this, continuation, 5));
    }

    public static String a(b bVar) {
        return p.a.p("U18_PRICING_PLAN", bVar.f142130a, bVar.f142131b);
    }
}
