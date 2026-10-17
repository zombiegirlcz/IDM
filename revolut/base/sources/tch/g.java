package tch;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1h.a f269826a;

    public g(s1h.a portfolioInfoMapper, d actionsMapper) {
        Intrinsics.checkNotNullParameter(portfolioInfoMapper, "portfolioInfoMapper");
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        this.f269826a = portfolioInfoMapper;
    }
}
