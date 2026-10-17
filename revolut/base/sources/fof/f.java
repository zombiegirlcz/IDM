package fof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wk5.e f136952b;

    public f(String counterpartyId, wk5.e counterpartyOwnershipMethod) {
        Intrinsics.checkNotNullParameter(counterpartyId, "counterpartyId");
        Intrinsics.checkNotNullParameter(counterpartyOwnershipMethod, "counterpartyOwnershipMethod");
        this.f136951a = counterpartyId;
        this.f136952b = counterpartyOwnershipMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f136951a, fVar.f136951a) && this.f136952b == fVar.f136952b;
    }

    public final int hashCode() {
        return this.f136952b.hashCode() + (this.f136951a.hashCode() * 31);
    }
}
