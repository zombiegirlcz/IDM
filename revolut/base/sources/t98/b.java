package t98;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268959a;

    public b(String tradingRegId) {
        Intrinsics.checkNotNullParameter(tradingRegId, "tradingRegId");
        this.f268959a = tradingRegId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f268959a, ((b) obj2).f268959a);
    }

    public final int hashCode() {
        return this.f268959a.hashCode();
    }
}
