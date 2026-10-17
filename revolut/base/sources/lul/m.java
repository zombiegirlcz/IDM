package lul;

import bul.o;
import bul.x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements e4i.a {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4i.a f200262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f200263b;

    public m(l4i.a amountConverter, o investValueBuilder, x tradingAutoTopUpBuilder) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(investValueBuilder, "investValueBuilder");
        Intrinsics.checkNotNullParameter(tradingAutoTopUpBuilder, "tradingAutoTopUpBuilder");
        this.f200262a = amountConverter;
        this.f200263b = investValueBuilder;
    }

    @Override // e4i.a
    public final l4i.a e() {
        return this.f200262a;
    }
}
