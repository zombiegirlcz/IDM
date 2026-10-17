package sqg;

import dcb.d;
import kotlin.jvm.internal.Intrinsics;
import srf.c;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements c, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final srf.b f265091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dcb.c f265092b;

    public a(srf.b amountBalanceValidatorData, dcb.c zeroAmountValidatorData) {
        Intrinsics.checkNotNullParameter(amountBalanceValidatorData, "amountBalanceValidatorData");
        Intrinsics.checkNotNullParameter(zeroAmountValidatorData, "zeroAmountValidatorData");
        this.f265091a = amountBalanceValidatorData;
        this.f265092b = zeroAmountValidatorData;
    }

    @Override // srf.c
    public final srf.b b() {
        return this.f265091a;
    }

    @Override // dcb.d
    public final dcb.c c() {
        return this.f265092b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f265091a, aVar.f265091a) && Intrinsics.f(this.f265092b, aVar.f265092b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f265092b.f112853a) + (this.f265091a.hashCode() * 31);
    }
}
