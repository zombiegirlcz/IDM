package iuj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f168636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f168637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f168638c;

    public o() {
        this(0);
    }

    public static o a(o oVar, Data rewardsHub, Data standardReferrals, Data salaryReferrals, int i) {
        if ((i & 1) != 0) {
            rewardsHub = oVar.f168636a;
        }
        if ((i & 2) != 0) {
            standardReferrals = oVar.f168637b;
        }
        if ((i & 4) != 0) {
            salaryReferrals = oVar.f168638c;
        }
        oVar.getClass();
        Intrinsics.checkNotNullParameter(rewardsHub, "rewardsHub");
        Intrinsics.checkNotNullParameter(standardReferrals, "standardReferrals");
        Intrinsics.checkNotNullParameter(salaryReferrals, "salaryReferrals");
        return new o(rewardsHub, standardReferrals, salaryReferrals);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f168636a, oVar.f168636a) && Intrinsics.f(this.f168637b, oVar.f168637b) && Intrinsics.f(this.f168638c, oVar.f168638c);
    }

    public final int hashCode() {
        return this.f168638c.hashCode() + kii.e.c(this.f168637b, this.f168636a.hashCode() * 31, 31);
    }

    public o(Data rewardsHub, Data standardReferrals, Data salaryReferrals) {
        Intrinsics.checkNotNullParameter(rewardsHub, "rewardsHub");
        Intrinsics.checkNotNullParameter(standardReferrals, "standardReferrals");
        Intrinsics.checkNotNullParameter(salaryReferrals, "salaryReferrals");
        this.f168636a = rewardsHub;
        this.f168637b = standardReferrals;
        this.f168638c = salaryReferrals;
    }

    public /* synthetic */ o(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
