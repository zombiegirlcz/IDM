package cm6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f25150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25151b;

    public e(dj0.d topupAmount, String pocketId) {
        Intrinsics.checkNotNullParameter(topupAmount, "topupAmount");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f25150a = topupAmount;
        this.f25151b = pocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f25150a, eVar.f25150a) && Intrinsics.f(this.f25151b, eVar.f25151b);
    }

    public final int hashCode() {
        return this.f25151b.hashCode() + (this.f25150a.hashCode() * 31);
    }
}
