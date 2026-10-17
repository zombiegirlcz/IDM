package ivl;

import kotlin.jvm.internal.Intrinsics;
import l80.e;
import wul.o;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f168883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f168884b;

    public a(o tradingOrderMapper, e dateProvider) {
        Intrinsics.checkNotNullParameter(tradingOrderMapper, "tradingOrderMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f168883a = tradingOrderMapper;
        this.f168884b = dateProvider;
    }
}
