package ltl;

import kotlin.jvm.internal.Intrinsics;
import wul.o;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f199979a;

    public l(nbh.a instrumentImageProvider, o tradingOrderMapper) {
        Intrinsics.checkNotNullParameter(tradingOrderMapper, "tradingOrderMapper");
        Intrinsics.checkNotNullParameter(instrumentImageProvider, "instrumentImageProvider");
        this.f199979a = tradingOrderMapper;
    }
}
