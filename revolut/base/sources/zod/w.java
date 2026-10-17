package zod;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qzi.h f324038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qzi.i f324039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f324040c;

    public w(qzi.h budget, qzi.i budgetingAccountType, e eVar) {
        Intrinsics.checkNotNullParameter(budget, "budget");
        Intrinsics.checkNotNullParameter(budgetingAccountType, "budgetingAccountType");
        this.f324038a = budget;
        this.f324039b = budgetingAccountType;
        this.f324040c = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f324038a, wVar.f324038a) && this.f324039b == wVar.f324039b && this.f324040c.equals(wVar.f324040c);
    }

    public final int hashCode() {
        return this.f324040c.f323982a.hashCode() + ((this.f324039b.hashCode() + (this.f324038a.hashCode() * 31)) * 31);
    }
}
