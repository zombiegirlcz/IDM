package ltl;

import kotlin.jvm.internal.Intrinsics;
import wul.o;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f199970a;

    public d(nbh.a instrumentImageProvider, o tradingOrderMapper) {
        Intrinsics.checkNotNullParameter(instrumentImageProvider, "instrumentImageProvider");
        Intrinsics.checkNotNullParameter(tradingOrderMapper, "tradingOrderMapper");
        this.f199970a = tradingOrderMapper;
    }
}
