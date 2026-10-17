package mlk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f207019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f207020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f207021c;
    public final w d;

    public r(List cardsToTerminate, List mappedBenefits, List availableOffers, w wVar) {
        Intrinsics.checkNotNullParameter(cardsToTerminate, "cardsToTerminate");
        Intrinsics.checkNotNullParameter(mappedBenefits, "mappedBenefits");
        Intrinsics.checkNotNullParameter(availableOffers, "availableOffers");
        this.f207019a = cardsToTerminate;
        this.f207020b = mappedBenefits;
        this.f207021c = availableOffers;
        this.d = wVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f207019a, rVar.f207019a) && Intrinsics.f(this.f207020b, rVar.f207020b) && Intrinsics.f(this.f207021c, rVar.f207021c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(this.f207019a.hashCode() * 31, 31, this.f207020b), 31, this.f207021c);
        w wVar = this.d;
        return iD + (wVar == null ? 0 : wVar.hashCode());
    }
}
