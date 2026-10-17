package tlf;

import klf.h0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jt0.b f272088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f272089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gqa.b f272090c;
    public final o d;

    public q(jt0.b commonHeaderProvider, h0 commonDataSource, gqa.b pushToCardStatusChecker, o pushToCardHeaderMapper) {
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(pushToCardStatusChecker, "pushToCardStatusChecker");
        Intrinsics.checkNotNullParameter(pushToCardHeaderMapper, "pushToCardHeaderMapper");
        this.f272088a = commonHeaderProvider;
        this.f272089b = commonDataSource;
        this.f272090c = pushToCardStatusChecker;
        this.d = pushToCardHeaderMapper;
    }
}
