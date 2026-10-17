package ql4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f247184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f247185b;

    public u(String facilityId, List transactionIds) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        this.f247184a = facilityId;
        this.f247185b = transactionIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f247184a, uVar.f247184a) && Intrinsics.f(this.f247185b, uVar.f247185b);
    }

    public final int hashCode() {
        return this.f247185b.hashCode() + (this.f247184a.hashCode() * 31);
    }
}
