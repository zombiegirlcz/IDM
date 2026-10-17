package zjh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f322840a;

    public k(List convertedCashHoldings) {
        Intrinsics.checkNotNullParameter(convertedCashHoldings, "convertedCashHoldings");
        this.f322840a = convertedCashHoldings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f322840a, ((k) obj2).f322840a);
    }

    public final int hashCode() {
        return this.f322840a.hashCode();
    }
}
