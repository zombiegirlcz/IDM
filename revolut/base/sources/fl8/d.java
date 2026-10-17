package fl8;

import com.revolut.feature.junior_remote_login.impl.data.service.JuniorRemoteLoginService;
import dp4.f1;
import fgj.g;
import fjd.w;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorRemoteLoginService f135905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f135906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f135907c;
    public final x4l.c d;

    public d(JuniorRemoteLoginService juniorRemoteLoginService, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(juniorRemoteLoginService, "juniorRemoteLoginService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f135905a = juniorRemoteLoginService;
        this.f135906b = memoryCache;
        this.f135907c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new c(this, null), new w(this, 5), new g(this, 13), new f9d.c(this, continuation, 26), new f1(this, continuation, 18));
    }

    public static String a(String str) {
        return j6.a.q("JUNIOR_REMOTE_LOGIN_INVITATION", str);
    }
}
