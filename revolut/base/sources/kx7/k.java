package kx7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f190468b;

    public k(String policyId, String documentType) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f190467a = policyId;
        this.f190468b = documentType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f190467a, kVar.f190467a) && Intrinsics.f(this.f190468b, kVar.f190468b);
    }

    public final int hashCode() {
        return this.f190468b.hashCode() + (this.f190467a.hashCode() * 31);
    }
}
