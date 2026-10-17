package lc6;

import kotlin.jvm.internal.Intrinsics;
import u80.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4i.a f193799a;

    public c(o moneyPrefixFormatter, l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f193799a = amountConverter;
    }
}
