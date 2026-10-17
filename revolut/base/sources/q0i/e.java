package q0i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f241293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f241294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f241295c;

    public e(xi0.b currency, c balance, boolean z) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f241293a = currency;
        this.f241294b = balance;
        this.f241295c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f241293a, eVar.f241293a) && Intrinsics.f(this.f241294b, eVar.f241294b) && this.f241295c == eVar.f241295c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f241295c) + ((this.f241294b.hashCode() + (this.f241293a.hashCode() * 31)) * 31);
    }
}
