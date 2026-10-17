package m1h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f201493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f201494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f201495c;
    public final od0.i d;

    public f(boolean z, xi0.b targetCurrency, xi0.b sourceCurrency, od0.i tradingAccount) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        this.f201493a = z;
        this.f201494b = targetCurrency;
        this.f201495c = sourceCurrency;
        this.d = tradingAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f201493a == fVar.f201493a && Intrinsics.f(this.f201494b, fVar.f201494b) && Intrinsics.f(this.f201495c, fVar.f201495c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h30.l.j(this.f201495c, h30.l.j(this.f201494b, Boolean.hashCode(this.f201493a) * 31, 31), 31);
    }
}
