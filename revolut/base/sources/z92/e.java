package z92;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f320301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f320302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f320303c;
    public final String d;

    public e(String amount, String currency, String qrCodeType, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(qrCodeType, "qrCodeType");
        this.f320301a = amount;
        this.f320302b = currency;
        this.f320303c = z;
        this.d = qrCodeType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f320301a, eVar.f320301a) && Intrinsics.f(this.f320302b, eVar.f320302b) && this.f320303c == eVar.f320303c && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(p.a.c(this.f320301a.hashCode() * 31, 31, this.f320302b), 31, this.f320303c);
    }
}
