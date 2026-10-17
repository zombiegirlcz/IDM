package rzi;

import kotlin.jvm.internal.Intrinsics;
import qzi.i;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f258687a;

    public b(i budgetingAccountType) {
        Intrinsics.checkNotNullParameter(budgetingAccountType, "budgetingAccountType");
        this.f258687a = budgetingAccountType;
    }

    public final i b() {
        return this.f258687a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f258687a == ((b) obj2).f258687a;
    }

    public final int hashCode() {
        return this.f258687a.hashCode();
    }
}
