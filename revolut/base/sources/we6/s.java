package we6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f296673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296674b;

    public s(dj0.d topupAmount, String pocketId) {
        Intrinsics.checkNotNullParameter(topupAmount, "topupAmount");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f296673a = topupAmount;
        this.f296674b = pocketId;
    }

    public final String b() {
        return this.f296674b;
    }

    public final dj0.d c() {
        return this.f296673a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f296673a, sVar.f296673a) && Intrinsics.f(this.f296674b, sVar.f296674b);
    }

    public final int hashCode() {
        return this.f296674b.hashCode() + (this.f296673a.hashCode() * 31);
    }
}
