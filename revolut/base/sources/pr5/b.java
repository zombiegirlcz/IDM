package pr5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f238933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f238934b;

    public b(ArrayList midRates, List pocketBalances) {
        Intrinsics.checkNotNullParameter(pocketBalances, "pocketBalances");
        Intrinsics.checkNotNullParameter(midRates, "midRates");
        this.f238933a = pocketBalances;
        this.f238934b = midRates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f238933a, bVar.f238933a) && this.f238934b.equals(bVar.f238934b);
    }

    public final int hashCode() {
        return this.f238934b.hashCode() + (this.f238933a.hashCode() * 31);
    }
}
