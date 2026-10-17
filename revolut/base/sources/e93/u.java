package e93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes21.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f123892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f123893b;

    public u(dj0.d promoPrice, DateTime endTime) {
        Intrinsics.checkNotNullParameter(promoPrice, "promoPrice");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        this.f123892a = promoPrice;
        this.f123893b = endTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f123892a, uVar.f123892a) && Intrinsics.f(this.f123893b, uVar.f123893b);
    }

    public final int hashCode() {
        return this.f123893b.hashCode() + (this.f123892a.hashCode() * 31);
    }
}
