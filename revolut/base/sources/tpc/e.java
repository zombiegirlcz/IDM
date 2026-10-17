package tpc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ilc.b f273336a;

    public e(ilc.b recurringDepositInfo) {
        Intrinsics.checkNotNullParameter(recurringDepositInfo, "recurringDepositInfo");
        this.f273336a = recurringDepositInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f273336a, ((e) obj2).f273336a);
    }

    public final int hashCode() {
        return this.f273336a.hashCode();
    }
}
