package hq7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f154609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f154610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f154611c;

    public f(Data policy, Data planDetail, Data countryName) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(planDetail, "planDetail");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        this.f154609a = policy;
        this.f154610b = planDetail;
        this.f154611c = countryName;
    }

    public static f a(f fVar, Data policy, Data planDetail, Data countryName, int i) {
        if ((i & 1) != 0) {
            policy = fVar.f154609a;
        }
        if ((i & 2) != 0) {
            planDetail = fVar.f154610b;
        }
        if ((i & 4) != 0) {
            countryName = fVar.f154611c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(planDetail, "planDetail");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        return new f(policy, planDetail, countryName);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f154609a, fVar.f154609a) && Intrinsics.f(this.f154610b, fVar.f154610b) && Intrinsics.f(this.f154611c, fVar.f154611c);
    }

    public final int hashCode() {
        return this.f154611c.hashCode() + kii.e.c(this.f154610b, this.f154609a.hashCode() * 31, 31);
    }
}
