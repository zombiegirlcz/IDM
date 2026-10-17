package xul;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f309119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f309120b;

    public i(dj0.d originalAmount, dj0.d convertedAmount) {
        Intrinsics.checkNotNullParameter(originalAmount, "originalAmount");
        Intrinsics.checkNotNullParameter(convertedAmount, "convertedAmount");
        this.f309119a = originalAmount;
        this.f309120b = convertedAmount;
    }

    @Override // xul.k
    public final dj0.d e0() {
        return this.f309119a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f309119a, iVar.f309119a) && Intrinsics.f(this.f309120b, iVar.f309120b);
    }

    public final int hashCode() {
        return this.f309120b.hashCode() + (this.f309119a.hashCode() * 31);
    }
}
