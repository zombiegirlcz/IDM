package xr3;

import ch.qos.logback.core.spi.ComponentTracker;
import cie.k1;
import com.revolut.feature.credit.application.impl.network.CreditOnboardingService;
import ft3.d1;
import ft3.g1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditOnboardingService f308243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f308244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ve0.c f308245c;
    public final qe0.s d;
    public final x4l.c e;

    public w(CreditOnboardingService api2, ne0.d memoryCache, ve0.c storage, ze0.a forceReloadStrategyFactory) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        this.f308243a = api2;
        this.f308244b = memoryCache;
        this.f308245c = storage;
        this.d = ((ze0.c) forceReloadStrategyFactory).a(storage, ComponentTracker.DEFAULT_TIMEOUT);
        Continuation continuation = null;
        this.e = new x4l.c(new wqj.g(this, continuation, 11), new xng.l(this, 15), new xif.k(this, 21), new xjl.g(this, continuation, 19), new k1(this, continuation, 4));
    }

    public static String a(d1 d1Var) {
        String strI = g1.i(d1Var.f137810a);
        gt3.f fVar = d1Var.f137811b;
        String strG = fVar != null ? hb9.b.G(fVar) : null;
        it3.k kVar = d1Var.f137812c;
        String[] elements = {"MARKETING_AVAILABILITY", strI, strG, kVar != null ? kVar.name() : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return zhm.d0.k0(kotlin.collections.d.L(elements), "_", null, null, 0, null, 62);
    }
}
