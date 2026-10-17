package wjh;

import kotlin.jvm.internal.Intrinsics;
import kp0.w0;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f298102b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String beneficiaryId) {
        super(w0.h(beneficiaryId));
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        this.f298102b = beneficiaryId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f298102b, ((i) obj2).f298102b);
    }

    public final int hashCode() {
        return this.f298102b.hashCode();
    }
}
