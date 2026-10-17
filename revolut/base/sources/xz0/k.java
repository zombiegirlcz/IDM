package xz0;

import i8.t;
import i8.u;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a01.c f309770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a01.c f309771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a01.c f309772c;

    public k(a01.c authorizedOkHttpClient, a01.c phoneToolsProvider, a01.c failedImageRequestsRepository) {
        Intrinsics.checkNotNullParameter(authorizedOkHttpClient, "authorizedOkHttpClient");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(failedImageRequestsRepository, "failedImageRequestsRepository");
        this.f309770a = authorizedOkHttpClient;
        this.f309771b = phoneToolsProvider;
        this.f309772c = failedImageRequestsRepository;
    }

    @Override // i8.u
    public final t a(Object obj2, int i, int i2, c8.k options) {
        j userImageUrl = (j) obj2;
        Intrinsics.checkNotNullParameter(userImageUrl, "userImageUrl");
        Intrinsics.checkNotNullParameter(options, "options");
        return new t(userImageUrl, new g(userImageUrl, (OkHttpClient) this.f309770a.invoke(), (z80.b) this.f309771b.invoke(), (e) this.f309772c.invoke()));
    }

    @Override // i8.u
    public final boolean b(Object obj2) {
        j glideUrl = (j) obj2;
        Intrinsics.checkNotNullParameter(glideUrl, "glideUrl");
        return true;
    }
}
