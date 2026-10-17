package cuc;

import com.revolut.feature.security_hub.impl.network.StreetModeService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 {

    @NotNull
    private static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f108953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f108954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StreetModeService f108955c;
    public final x4l.c d;

    public e0(ue0.c storage, ne0.j memoryCache, StreetModeService service, a0 mapper) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f108953a = storage;
        this.f108954b = memoryCache;
        this.f108955c = service;
        Continuation continuation = null;
        this.d = new x4l.c(new a09.o(this, continuation, 27), new cp7.k(this, 26), new cnc.t(this, 18), new co7.c(this, continuation, 10), new awd.b(this, continuation, 23));
    }

    public static final void a(e0 e0Var, Response response) {
        e0Var.getClass();
        if (!response.isSuccessful()) {
            throw new HttpException(response);
        }
    }
}
