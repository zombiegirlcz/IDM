package shd;

import com.revolut.feature.shops.api.model.ShopsOutlet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsOutlet f263457a;

    public d(ShopsOutlet nearestOutlet) {
        Intrinsics.checkNotNullParameter(nearestOutlet, "nearestOutlet");
        this.f263457a = nearestOutlet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f263457a, ((d) obj2).f263457a);
    }

    public final int hashCode() {
        return this.f263457a.hashCode();
    }
}
