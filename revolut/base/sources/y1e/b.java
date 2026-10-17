package y1e;

import com.revolut.feature.store.core.impl.data.network.StoreCoreService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wqj.g;
import wvg.i;
import xv4.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreCoreService f310364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f310365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f310366c;
    public final x4l.c d;

    public b(StoreCoreService service, ne0.d memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f310364a = service;
        this.f310365b = memoryCache;
        this.f310366c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new g(this, continuation, 14), new y1.a(this, 2), new xwd.a(this, 13), new o(this, continuation, 15), new i(this, continuation, 23));
    }
}
