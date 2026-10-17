package ip0;

import java.time.YearMonth;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class kx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx f165092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final YearMonth f165093b;

    public kx(mx model, YearMonth month) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(month, "month");
        this.f165092a = model;
        this.f165093b = month;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof kx)) {
            return false;
        }
        kx kxVar = (kx) obj2;
        return Intrinsics.f(this.f165092a, kxVar.f165092a) && Intrinsics.f(this.f165093b, kxVar.f165093b);
    }

    public final int hashCode() {
        return this.f165093b.hashCode() + (this.f165092a.hashCode() * 31);
    }
}
