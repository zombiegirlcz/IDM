package pcd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 extends g0 {
    public final p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p pocketInfo) {
        super(pocketInfo.e, pocketInfo.f234877c, new xi0.b(6, pocketInfo.d, null));
        Intrinsics.checkNotNullParameter(pocketInfo, "pocketInfo");
        this.d = pocketInfo;
    }

    @Override // pcd.g0
    public final String b() {
        return this.d.f234876b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f0) && Intrinsics.f(this.d, ((f0) obj2).d);
    }

    @Override // pcd.g0
    public final String getPocketId() {
        return this.d.f234875a;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
