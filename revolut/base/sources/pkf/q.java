package pkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends yji.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f237111l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hof.e f237112m;

    public q(klf.h0 commonDataSource, hof.e settlementDelayMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(settlementDelayMapper, "settlementDelayMapper");
        this.f237111l = commonDataSource;
        this.f237112m = settlementDelayMapper;
    }
}
