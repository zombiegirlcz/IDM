package rqd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f256522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f256523b;

    public b(String executionId, String transactionGroupId) {
        Intrinsics.checkNotNullParameter(executionId, "executionId");
        Intrinsics.checkNotNullParameter(transactionGroupId, "transactionGroupId");
        this.f256522a = executionId;
        this.f256523b = transactionGroupId;
    }

    @Override // rqd.c
    public final String a() {
        return this.f256522a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f256522a, bVar.f256522a) && Intrinsics.f(this.f256523b, bVar.f256523b);
    }

    public final int hashCode() {
        return this.f256523b.hashCode() + (this.f256522a.hashCode() * 31);
    }
}
