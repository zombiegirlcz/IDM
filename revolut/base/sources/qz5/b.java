package qz5;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import te0.w;
import ufm.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r2c.a f250366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f250367b;

    public b(r2c.a accessTokenInteractor, j memoryCache) {
        Intrinsics.checkNotNullParameter(accessTokenInteractor, "accessTokenInteractor");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f250366a = accessTokenInteractor;
        this.f250367b = memoryCache;
    }

    public final i a() {
        d0<s2c.a> accessToken = this.f250366a.f251092a.getAccessToken();
        r25.c cVar = new r25.c(2, new r0e.i(29));
        accessToken.getClass();
        i iVar = new i(accessToken, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        i iVar2 = new i(w.i0(iVar), new qsa.a(21, new qtb.c(this, 17)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }

    public final String b() {
        String str;
        synchronized (this) {
            str = (String) this.f250367b.get("KEY_ACCESS_TOKEN");
        }
        return str;
    }
}
