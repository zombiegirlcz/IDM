package gul;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements e4i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4i.a f146982a;

    public e(bul.x tradingAutoTopUpBuilder, l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(tradingAutoTopUpBuilder, "tradingAutoTopUpBuilder");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f146982a = amountConverter;
    }

    @Override // e4i.a
    public final l4i.a e() {
        return this.f146982a;
    }
}
