package myg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uyg.l f210503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kpj.f f210504b;

    public i(uyg.e timeframeMapper, uyg.l analyticsTypeMapper, kpj.f wealthAccountHeaderUiMapper) {
        Intrinsics.checkNotNullParameter(timeframeMapper, "timeframeMapper");
        Intrinsics.checkNotNullParameter(analyticsTypeMapper, "analyticsTypeMapper");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        this.f210503a = analyticsTypeMapper;
        this.f210504b = wealthAccountHeaderUiMapper;
    }
}
