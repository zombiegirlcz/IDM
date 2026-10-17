package hw9;

import com.revolut.feature.payments.profile.impl.data.network.UsernameService;
import e31.i;
import e6d.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UsernameService f156109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f156110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f156111c;

    public d(UsernameService usernameService, j memoryCache) {
        Intrinsics.checkNotNullParameter(usernameService, "usernameService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f156109a = usernameService;
        this.f156110b = memoryCache;
        Continuation continuation = null;
        int i = 0;
        this.f156111c = new x4l.c(new f(this, continuation, 17), new a(this, i), new b(this, i), new i(2, 26, continuation), new eci.a(3, 19, continuation));
    }
}
