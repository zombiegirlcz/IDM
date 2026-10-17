package fm1;

import com.revolut.feature.apm.bills.billers.impl.data.network.BillersService;
import dp4.a1;
import e31.i;
import fgj.g;
import fjd.w;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillersService f136019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f136020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f136021c;

    public c(BillersService service, d memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f136019a = service;
        this.f136020b = memoryCache;
        Continuation continuation = null;
        this.f136021c = new x4l.c(new a1(this, continuation, 29), new w(this, 9), new g(this, 15), new i(2, 10, continuation), new eci.a(3, 6, continuation));
    }
}
