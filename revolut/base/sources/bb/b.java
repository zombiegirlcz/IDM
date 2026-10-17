package bb;

import az.i;
import b6a.d;
import b9i.f;
import com.feature.user.details.impl.network.UserDetailsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import ue0.c;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cb.a f14120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UserDetailsService f14121c;
    public final j d;
    public final x4l.c e;

    public b(c storage, cb.a mapper, UserDetailsService service, j userDetailsCache) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(userDetailsCache, "userDetailsCache");
        this.f14119a = storage;
        this.f14120b = mapper;
        this.f14121c = service;
        this.d = userDetailsCache;
        int i = 6;
        Continuation continuation = null;
        this.e = new x4l.c(new d(this, continuation, i), new f(this, i), new b7d.c(this, 13), new i(this, continuation, 20), new awd.b(this, continuation, 8));
    }
}
