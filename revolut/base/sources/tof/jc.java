package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class jc implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic f272867b;

    public jc(String portfolioId, ic accountType) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f272866a = portfolioId;
        this.f272867b = accountType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof jc)) {
            return false;
        }
        jc jcVar = (jc) obj2;
        return Intrinsics.f(this.f272866a, jcVar.f272866a) && this.f272867b == jcVar.f272867b;
    }

    public final int hashCode() {
        return this.f272867b.hashCode() + (this.f272866a.hashCode() * 31);
    }
}
