package a08;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zw7.g0 f187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188b;

    public i(zw7.g0 planType, String monthlyPrice) {
        Intrinsics.checkNotNullParameter(planType, "planType");
        Intrinsics.checkNotNullParameter(monthlyPrice, "monthlyPrice");
        this.f187a = planType;
        this.f188b = monthlyPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f187a == iVar.f187a && Intrinsics.f(this.f188b, iVar.f188b);
    }

    public final int hashCode() {
        return this.f188b.hashCode() + (this.f187a.hashCode() * 31);
    }
}
