package za8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f320576a;

    public d(String tradingRegId) {
        Intrinsics.checkNotNullParameter(tradingRegId, "tradingRegId");
        this.f320576a = tradingRegId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f320576a, ((d) obj2).f320576a);
    }

    public final int hashCode() {
        return this.f320576a.hashCode();
    }
}
