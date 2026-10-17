package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272639a;

    public b1(String counterpartyPocketId) {
        Intrinsics.checkNotNullParameter(counterpartyPocketId, "counterpartyPocketId");
        this.f272639a = counterpartyPocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b1) && Intrinsics.f(this.f272639a, ((b1) obj2).f272639a);
    }

    public final int hashCode() {
        return this.f272639a.hashCode();
    }
}
