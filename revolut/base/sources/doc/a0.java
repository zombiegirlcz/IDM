package doc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yoc.p f116486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r10.r f116487b;

    public a0(foc.j timeSpanTabIdMapper, yoc.p timeSpanClauseProvider, r10.r uiMapperProvider) {
        Intrinsics.checkNotNullParameter(timeSpanTabIdMapper, "timeSpanTabIdMapper");
        Intrinsics.checkNotNullParameter(timeSpanClauseProvider, "timeSpanClauseProvider");
        Intrinsics.checkNotNullParameter(uiMapperProvider, "uiMapperProvider");
        this.f116486a = timeSpanClauseProvider;
        this.f116487b = uiMapperProvider;
    }
}
