package e30;

import a09.o;
import com.revolut.chat.data.network.TicketsInfoApi;
import dp4.z0;
import dt4.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import y10.h;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketsInfoApi f122165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f122166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f122167c;
    public final x4l.c d;

    public e(TicketsInfoApi ticketsInfoApi, h mapper, j memoryCache, ue0.c localStorage) {
        Intrinsics.checkNotNullParameter(ticketsInfoApi, "ticketsInfoApi");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f122165a = ticketsInfoApi;
        this.f122166b = memoryCache;
        this.f122167c = localStorage;
        Continuation continuation = null;
        this.d = new x4l.c(new o(this, continuation, 29), new e2j.j(this, 2), new p(this, 24), new d(this, null, 0), new z0(this, continuation, 2), new d(this, null, 1));
    }
}
