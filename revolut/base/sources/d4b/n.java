package d4b;

import b4b.p;
import kotlin.jvm.internal.Intrinsics;
import wul.o;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f111268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f111269b;

    public n(p inputData, o tradingOrderMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(tradingOrderMapper, "tradingOrderMapper");
        this.f111268a = inputData;
        this.f111269b = tradingOrderMapper;
    }
}
