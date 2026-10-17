package dcb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements srf.c, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final srf.b f112848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f112849b;

    public a(srf.b amountBalanceValidatorData, c zeroAmountValidatorData) {
        Intrinsics.checkNotNullParameter(amountBalanceValidatorData, "amountBalanceValidatorData");
        Intrinsics.checkNotNullParameter(zeroAmountValidatorData, "zeroAmountValidatorData");
        this.f112848a = amountBalanceValidatorData;
        this.f112849b = zeroAmountValidatorData;
    }

    @Override // srf.c
    public final srf.b b() {
        return this.f112848a;
    }

    @Override // dcb.d
    public final c c() {
        return this.f112849b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f112848a, aVar.f112848a) && Intrinsics.f(this.f112849b, aVar.f112849b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f112849b.f112853a) + (this.f112848a.hashCode() * 31);
    }
}
