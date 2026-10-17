package tch;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final adh.h f269830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1h.a f269831b;

    public i(adh.h recurringFundingFrequencyClauseProvider, s1h.a portfolioInfoMapper) {
        Intrinsics.checkNotNullParameter(recurringFundingFrequencyClauseProvider, "recurringFundingFrequencyClauseProvider");
        Intrinsics.checkNotNullParameter(portfolioInfoMapper, "portfolioInfoMapper");
        this.f269830a = recurringFundingFrequencyClauseProvider;
        this.f269831b = portfolioInfoMapper;
    }
}
