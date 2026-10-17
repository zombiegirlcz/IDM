package ukk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f280774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f280775b;

    public h(Data rewardsPreview, Data pricingPlan) {
        Intrinsics.checkNotNullParameter(rewardsPreview, "rewardsPreview");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        this.f280774a = rewardsPreview;
        this.f280775b = pricingPlan;
    }

    public static h a(h hVar, Data rewardsPreview, Data pricingPlan, int i) {
        if ((i & 1) != 0) {
            rewardsPreview = hVar.f280774a;
        }
        if ((i & 2) != 0) {
            pricingPlan = hVar.f280775b;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(rewardsPreview, "rewardsPreview");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        return new h(rewardsPreview, pricingPlan);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f280774a, hVar.f280774a) && Intrinsics.f(this.f280775b, hVar.f280775b);
    }

    public final int hashCode() {
        return this.f280775b.hashCode() + (this.f280774a.hashCode() * 31);
    }
}
