package lnk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f197291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.d f197292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f197293c;
    public final boolean d;
    public final Data e;

    public e(Data subscribeInfo, hha.d pricingPlan, boolean z, boolean z3, Data footerClause) {
        Intrinsics.checkNotNullParameter(subscribeInfo, "subscribeInfo");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(footerClause, "footerClause");
        this.f197291a = subscribeInfo;
        this.f197292b = pricingPlan;
        this.f197293c = z;
        this.d = z3;
        this.e = footerClause;
    }

    public static e a(e eVar, Data data, boolean z, Data data2, int i) {
        if ((i & 1) != 0) {
            data = eVar.f197291a;
        }
        Data subscribeInfo = data;
        hha.d pricingPlan = eVar.f197292b;
        boolean z3 = eVar.f197293c;
        if ((i & 8) != 0) {
            z = eVar.d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            data2 = eVar.e;
        }
        Data footerClause = data2;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(subscribeInfo, "subscribeInfo");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(footerClause, "footerClause");
        return new e(subscribeInfo, pricingPlan, z3, z4, footerClause);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f197291a, eVar.f197291a) && Intrinsics.f(this.f197292b, eVar.f197292b) && this.f197293c == eVar.f197293c && this.d == eVar.d && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(j6.a.c((this.f197292b.hashCode() + (this.f197291a.hashCode() * 31)) * 31, 31, this.f197293c), 31, this.d);
    }
}
