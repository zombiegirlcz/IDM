package pcd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 extends g0 {
    public final a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(a depositInfo) {
        super(depositInfo.d.f115082a, depositInfo.f234841a, depositInfo.k);
        Intrinsics.checkNotNullParameter(depositInfo, "depositInfo");
        this.d = depositInfo;
    }

    @Override // pcd.g0
    public final String b() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && Intrinsics.f(this.d, ((e0) obj2).d);
    }

    @Override // pcd.g0
    public final String getPocketId() {
        return this.d.f234843c;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
