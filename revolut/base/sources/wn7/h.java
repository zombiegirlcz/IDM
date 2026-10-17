package wn7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f298718a;

    public h(String policyId) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        this.f298718a = policyId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f298718a, ((h) obj2).f298718a);
    }

    public final int hashCode() {
        return this.f298718a.hashCode();
    }
}
