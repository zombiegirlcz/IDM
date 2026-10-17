package ql4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f247089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f247090b;

    public b(String facilityId, List transactionIds) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        this.f247089a = facilityId;
        this.f247090b = transactionIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f247089a, bVar.f247089a) && Intrinsics.f(this.f247090b, bVar.f247090b);
    }

    public final int hashCode() {
        return this.f247090b.hashCode() + (this.f247089a.hashCode() * 31);
    }
}
