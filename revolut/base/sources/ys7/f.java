package ys7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements xx4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f316422a;

    public f(String policyId) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        this.f316422a = policyId;
    }

    @Override // ne0.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String getKey() {
        return j6.a.q("insurance-credit-details-", this.f316422a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f316422a, ((f) obj2).f316422a);
    }

    public final int hashCode() {
        return this.f316422a.hashCode();
    }
}
