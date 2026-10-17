package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4 f273027b;

    public r4(String str, s4 promisedAmount) {
        Intrinsics.checkNotNullParameter(promisedAmount, "promisedAmount");
        this.f273026a = str;
        this.f273027b = promisedAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj2;
        return Intrinsics.f(this.f273026a, r4Var.f273026a) && Intrinsics.f(this.f273027b, r4Var.f273027b);
    }

    public final int hashCode() {
        String str = this.f273026a;
        return this.f273027b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
