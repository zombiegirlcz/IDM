package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272765a;

    public g3(String billAccountId) {
        Intrinsics.checkNotNullParameter(billAccountId, "billAccountId");
        this.f272765a = billAccountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g3) && Intrinsics.f(this.f272765a, ((g3) obj2).f272765a);
    }

    public final int hashCode() {
        return this.f272765a.hashCode();
    }
}
