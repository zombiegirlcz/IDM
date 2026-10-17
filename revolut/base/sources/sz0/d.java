package sz0;

import c8.k;
import i8.t;
import i8.u;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
public final class d implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a01.c f266723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a01.c f266724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a01.c f266725c;

    public d(a01.c authorizedOkHttpClient, a01.c fileSystemRepository, a01.c storage) {
        Intrinsics.checkNotNullParameter(authorizedOkHttpClient, "authorizedOkHttpClient");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f266723a = authorizedOkHttpClient;
        this.f266724b = fileSystemRepository;
        this.f266725c = storage;
    }

    @Override // i8.u
    public final t a(Object obj2, int i, int i2, k options) {
        b userImageUrl = (b) obj2;
        Intrinsics.checkNotNullParameter(userImageUrl, "userImageUrl");
        Intrinsics.checkNotNullParameter(options, "options");
        return new t(userImageUrl, new a(userImageUrl, (OkHttpClient) this.f266723a.invoke(), (zk0.b) this.f266724b.invoke(), (a01.b) this.f266725c.invoke()));
    }

    @Override // i8.u
    public final boolean b(Object obj2) {
        b glideUrl = (b) obj2;
        Intrinsics.checkNotNullParameter(glideUrl, "glideUrl");
        return true;
    }
}
