package rmd;

import kotlin.jvm.internal.Intrinsics;
import qzi.i;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f255247b;

    public d(i budgetingAccountType) {
        Intrinsics.checkNotNullParameter(budgetingAccountType, "budgetingAccountType");
        this.f255247b = budgetingAccountType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f255247b == ((d) obj2).f255247b;
    }

    public final int hashCode() {
        return this.f255247b.hashCode();
    }
}
