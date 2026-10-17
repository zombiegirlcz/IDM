package f33;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d93.b f131898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d93.b f131899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f131900c;
    public final c93.j d;

    public m(d93.b selectedDeliveryMethod, d93.b upgradableDeliveryMethod, List availablePlans, c93.j jVar) {
        Intrinsics.checkNotNullParameter(selectedDeliveryMethod, "selectedDeliveryMethod");
        Intrinsics.checkNotNullParameter(upgradableDeliveryMethod, "upgradableDeliveryMethod");
        Intrinsics.checkNotNullParameter(availablePlans, "availablePlans");
        this.f131898a = selectedDeliveryMethod;
        this.f131899b = upgradableDeliveryMethod;
        this.f131900c = availablePlans;
        this.d = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f131898a, mVar.f131898a) && Intrinsics.f(this.f131899b, mVar.f131899b) && Intrinsics.f(this.f131900c, mVar.f131900c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d((this.f131899b.hashCode() + (this.f131898a.hashCode() * 31)) * 31, 31, this.f131900c);
        c93.j jVar = this.d;
        return iD + (jVar == null ? 0 : jVar.hashCode());
    }
}
