package akl;

import com.revolut.sso.impl.network.services.SocialAccountIdsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class w1 {

    @NotNull
    public static final u1 Companion = new u1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SocialAccountIdsService f6108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f6109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f6110c;

    public w1(SocialAccountIdsService service, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f6108a = service;
        this.f6109b = memoryCache;
        Continuation continuation = null;
        this.f6110c = new x4l.c(new a72.k(this, continuation, 4), new afa.q(this, 21), new ack.f(this, 23), new o(2, 2, null), new a19.e(3, 5, continuation));
    }
}
