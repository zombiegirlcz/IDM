package s1k;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f259147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f259148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f259149c;

    public d(Data currentBalanceData, Data vaultsData, dj0.d dueAmount) {
        Intrinsics.checkNotNullParameter(dueAmount, "dueAmount");
        Intrinsics.checkNotNullParameter(currentBalanceData, "currentBalanceData");
        Intrinsics.checkNotNullParameter(vaultsData, "vaultsData");
        this.f259147a = dueAmount;
        this.f259148b = currentBalanceData;
        this.f259149c = vaultsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f259147a, dVar.f259147a) && Intrinsics.f(this.f259148b, dVar.f259148b) && Intrinsics.f(this.f259149c, dVar.f259149c);
    }

    public final int hashCode() {
        return this.f259149c.hashCode() + kii.e.c(this.f259148b, this.f259147a.hashCode() * 31, 31);
    }
}
