package sz0;

import i8.b0;
import i8.u;
import i8.v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xz0.k;

/* JADX INFO: loaded from: classes.dex */
public final class c implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266720a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f266721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f266722c;
    public final Function0 d;

    public c(a01.c okHttpClient, a01.c phoneToolsProvider, a01.c failedImageRequestsRepository, byte b4) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(failedImageRequestsRepository, "failedImageRequestsRepository");
        this.f266721b = okHttpClient;
        this.f266722c = phoneToolsProvider;
        this.d = failedImageRequestsRepository;
    }

    @Override // i8.v
    public final u a(b0 multiFactory) {
        switch (this.f266720a) {
            case 0:
                Intrinsics.checkNotNullParameter(multiFactory, "multiFactory");
                return new d((a01.c) this.f266721b, (a01.c) this.f266722c, (a01.c) this.d);
            default:
                Intrinsics.checkNotNullParameter(multiFactory, "multiFactory");
                return new k((a01.c) this.f266721b, (a01.c) this.f266722c, (a01.c) this.d);
        }
    }

    public c(a01.c okHttpClient, a01.c fileSystemRepository, a01.c avatarStorage) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(avatarStorage, "avatarStorage");
        this.f266721b = okHttpClient;
        this.f266722c = fileSystemRepository;
        this.d = avatarStorage;
    }
}
