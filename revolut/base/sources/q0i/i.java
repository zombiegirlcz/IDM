package q0i;

import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import io3.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentPocketInfo f241298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f241299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f241300c;

    public i(PaymentPocketInfo pocketInfo, l pocketType, c pocketBalance) {
        Intrinsics.checkNotNullParameter(pocketInfo, "pocketInfo");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(pocketBalance, "pocketBalance");
        this.f241298a = pocketInfo;
        this.f241299b = pocketType;
        this.f241300c = pocketBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f241298a, iVar.f241298a) && this.f241299b == iVar.f241299b && Intrinsics.f(this.f241300c, iVar.f241300c);
    }

    public final int hashCode() {
        return this.f241300c.hashCode() + t61.a.c(this.f241299b, this.f241298a.hashCode() * 31, 31);
    }
}
