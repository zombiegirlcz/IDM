package rq7;

import com.revolut.feature.insurance_car.impl.data.model.Policy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Policy f256491a;

    public m(Policy policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        this.f256491a = policy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f256491a, ((m) obj2).f256491a);
    }

    public final int hashCode() {
        return this.f256491a.hashCode();
    }
}
