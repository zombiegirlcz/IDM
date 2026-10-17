package urd;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f282303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f282304b;

    public z(dj0.d currentValue, ArrayList dailyBalances) {
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(dailyBalances, "dailyBalances");
        this.f282303a = currentValue;
        this.f282304b = dailyBalances;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f282303a, zVar.f282303a) && this.f282304b.equals(zVar.f282304b);
    }

    public final int hashCode() {
        return this.f282304b.hashCode() + (this.f282303a.hashCode() * 31);
    }
}
