package fgc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final co3.a f135029b;

    public a(String rewardId, co3.a aVar) {
        Intrinsics.checkNotNullParameter(rewardId, "rewardId");
        this.f135028a = rewardId;
        this.f135029b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f135028a, aVar.f135028a) && Intrinsics.f(this.f135029b, aVar.f135029b);
    }

    public final int hashCode() {
        int iHashCode = this.f135028a.hashCode() * 31;
        co3.a aVar = this.f135029b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
