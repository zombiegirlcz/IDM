package a0e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0e.a f371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zjh.j f372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0e.g f373c;
    public final zzd.c d;

    public t(d0e.a periodItemMapper, zjh.j periodSummaryMapper, h0e.g settingsItemsMapper, zzd.c errorItemsMapper, zzd.b emptyItemsMapper, y generatePayloadBuilder) {
        Intrinsics.checkNotNullParameter(periodItemMapper, "periodItemMapper");
        Intrinsics.checkNotNullParameter(periodSummaryMapper, "periodSummaryMapper");
        Intrinsics.checkNotNullParameter(settingsItemsMapper, "settingsItemsMapper");
        Intrinsics.checkNotNullParameter(errorItemsMapper, "errorItemsMapper");
        Intrinsics.checkNotNullParameter(emptyItemsMapper, "emptyItemsMapper");
        Intrinsics.checkNotNullParameter(generatePayloadBuilder, "generatePayloadBuilder");
        this.f371a = periodItemMapper;
        this.f372b = periodSummaryMapper;
        this.f373c = settingsItemsMapper;
        this.d = errorItemsMapper;
    }
}
