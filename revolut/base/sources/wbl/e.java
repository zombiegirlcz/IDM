package wbl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f296258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f296259b;

    public e(ArrayList stockDividends, ArrayList cashDividends) {
        Intrinsics.checkNotNullParameter(stockDividends, "stockDividends");
        Intrinsics.checkNotNullParameter(cashDividends, "cashDividends");
        this.f296258a = stockDividends;
        this.f296259b = cashDividends;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f296258a.equals(eVar.f296258a) && this.f296259b.equals(eVar.f296259b);
    }

    public final int hashCode() {
        return this.f296259b.hashCode() + (this.f296258a.hashCode() * 31);
    }
}
