package y1e;

import com.revolut.feature.store.core.impl.data.network.StoreCoreService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uyd.e0;
import wf0.r0;
import wqj.g;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreCoreService f310367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f310368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f310369c;

    public d(StoreCoreService service, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f310367a = service;
        this.f310368b = memoryCache;
        Continuation continuation = null;
        this.f310369c = new x4l.c(new g(this, continuation, 15), new y1.a(this, 3), new xwd.a(this, 14), new r0(2, 7, null), new e0(3, 23, continuation));
    }
}
