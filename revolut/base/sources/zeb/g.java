package zeb;

import com.revolut.feature.retail.reverywhere.impl.network.ReverywhereService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y5b.b0;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReverywhereService f321653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f321654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f321655c;
    public final d d;
    public final x4l.c e;

    public g(ReverywhereService service, ne0.d memoryCache, ue0.c storage, d mapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f321653a = service;
        this.f321654b = memoryCache;
        this.f321655c = storage;
        this.d = mapper;
        Continuation continuation = null;
        this.e = new x4l.c(new b0(this, continuation, 11), new za9.c(this, 13), new zba.a(this, 6), new f(this, null), new wa7.j(this, continuation, 24));
    }
}
