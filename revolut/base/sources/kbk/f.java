package kbk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f182622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f182623b;

    public f(Long l2, e postClaimingFlow) {
        Intrinsics.checkNotNullParameter(postClaimingFlow, "postClaimingFlow");
        this.f182622a = l2;
        this.f182623b = postClaimingFlow;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f182622a, fVar.f182622a) && this.f182623b == fVar.f182623b;
    }

    public final int hashCode() {
        Long l2 = this.f182622a;
        return this.f182623b.hashCode() + ((l2 == null ? 0 : l2.hashCode()) * 31);
    }
}
