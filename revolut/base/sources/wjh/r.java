package wjh;

import kotlin.jvm.internal.Intrinsics;
import kp0.w0;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f298110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f298111b;

    public r(String beneficiaryId) {
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        this.f298110a = beneficiaryId;
        this.f298111b = w0.h(beneficiaryId);
    }

    @Override // wjh.t
    public final String B0() {
        return this.f298111b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f298110a, ((r) obj2).f298110a);
    }

    public final int hashCode() {
        return this.f298110a.hashCode();
    }
}
