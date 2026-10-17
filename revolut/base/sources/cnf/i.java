package cnf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements f {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f25416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f25417b;

    public i(m transferLinkExpirationNoticeMapper, c fallbackMapper) {
        Intrinsics.checkNotNullParameter(transferLinkExpirationNoticeMapper, "transferLinkExpirationNoticeMapper");
        Intrinsics.checkNotNullParameter(fallbackMapper, "fallbackMapper");
        this.f25416a = transferLinkExpirationNoticeMapper;
        this.f25417b = fallbackMapper;
    }
}
