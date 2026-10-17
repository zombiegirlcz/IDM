package ck2;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f24751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f24752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f24753c;

    public f(Data currentPlan, Data plansToUpgrade, Data planUsageLimits) {
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(plansToUpgrade, "plansToUpgrade");
        Intrinsics.checkNotNullParameter(planUsageLimits, "planUsageLimits");
        this.f24751a = currentPlan;
        this.f24752b = plansToUpgrade;
        this.f24753c = planUsageLimits;
    }

    public static f a(f fVar, Data currentPlan, Data plansToUpgrade, Data planUsageLimits, int i) {
        if ((i & 1) != 0) {
            currentPlan = fVar.f24751a;
        }
        if ((i & 2) != 0) {
            plansToUpgrade = fVar.f24752b;
        }
        if ((i & 4) != 0) {
            planUsageLimits = fVar.f24753c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(plansToUpgrade, "plansToUpgrade");
        Intrinsics.checkNotNullParameter(planUsageLimits, "planUsageLimits");
        return new f(currentPlan, plansToUpgrade, planUsageLimits);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f24751a, fVar.f24751a) && Intrinsics.f(this.f24752b, fVar.f24752b) && Intrinsics.f(this.f24753c, fVar.f24753c);
    }

    public final int hashCode() {
        return this.f24753c.hashCode() + kii.e.c(this.f24752b, this.f24751a.hashCode() * 31, 31);
    }
}
