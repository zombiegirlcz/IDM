package i2k;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f157997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f157998b;

    public k(Data pricings, dj0.d recipientMoney) {
        Intrinsics.checkNotNullParameter(pricings, "pricings");
        Intrinsics.checkNotNullParameter(recipientMoney, "recipientMoney");
        this.f157997a = pricings;
        this.f157998b = recipientMoney;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f157997a, kVar.f157997a) && Intrinsics.f(this.f157998b, kVar.f157998b);
    }

    public final int hashCode() {
        return this.f157998b.hashCode() + (this.f157997a.hashCode() * 31);
    }
}
