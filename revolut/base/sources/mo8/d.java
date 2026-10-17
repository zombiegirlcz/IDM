package mo8;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f207560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f207561b;

    public d(Data juniorProfile, Data juniorPlanProducts) {
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(juniorPlanProducts, "juniorPlanProducts");
        this.f207560a = juniorProfile;
        this.f207561b = juniorPlanProducts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f207560a, dVar.f207560a) && Intrinsics.f(this.f207561b, dVar.f207561b);
    }

    public final int hashCode() {
        return this.f207561b.hashCode() + (this.f207560a.hashCode() * 31);
    }
}
