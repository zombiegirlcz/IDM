package gc6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ba6.l f142354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qua.p f142355b;

    public i(ba6.l charity, qua.p recurringPayment) {
        Intrinsics.checkNotNullParameter(charity, "charity");
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        this.f142354a = charity;
        this.f142355b = recurringPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f142354a, iVar.f142354a) && Intrinsics.f(this.f142355b, iVar.f142355b);
    }

    public final int hashCode() {
        return this.f142355b.hashCode() + (this.f142354a.hashCode() * 31);
    }
}
