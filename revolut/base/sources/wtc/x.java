package wtc;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f299918a;

    public x() {
        String[] elements = {"BRL_TO_USD_EXCHANGE_YEARLY", "INBOUND_TRANSFER_YEARLY", "TRANSFER_DAILY", "TRANSFER_WEEKLY", "MONETISATION", "FLOW", "STOCK"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f299918a = kotlin.collections.d.y0(elements);
    }
}
