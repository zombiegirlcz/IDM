package k7c;

import com.revolut.feature.revolutpay.impl.data.service.RevolutPayService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutPayService f181946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f181947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f181948c;

    public b0(RevolutPayService revolutPayService, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(revolutPayService, "revolutPayService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f181946a = revolutPayService;
        this.f181947b = memoryCache;
        Continuation continuation = null;
        this.f181948c = new x4l.c(new x(this, continuation, 3), new k5e.k(this, 8), new k3k.k(this, 10), new iz1.g(2, 13, null), new k3c.l(3, 6, continuation));
    }

    public static String a(t6c.g gVar) {
        aim.e eVarB = zhm.u.b();
        eVarB.add("PAYMENT_OPTIONS_CACHE_PREFIX");
        eVarB.add(gVar.f268294a);
        eVarB.add(Long.valueOf(gVar.f268295b));
        eVarB.add(gVar.f268296c);
        String str = gVar.d;
        if (str != null) {
            eVarB.add(str);
        }
        return zhm.d0.k0(zhm.u.a(eVarB), "_", null, null, 0, null, 62);
    }
}
