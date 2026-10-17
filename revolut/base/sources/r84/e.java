package r84;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f252354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f252355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f252356c;
    public final xi0.b d;

    public e(String str, Long l2, boolean z, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f252354a = str;
        this.f252355b = l2;
        this.f252356c = z;
        this.d = currency;
    }

    public static e a(e eVar, String str, Long l2, boolean z, int i) {
        if ((i & 1) != 0) {
            str = eVar.f252354a;
        }
        if ((i & 2) != 0) {
            l2 = eVar.f252355b;
        }
        if ((i & 4) != 0) {
            z = eVar.f252356c;
        }
        xi0.b currency = eVar.d;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new e(str, l2, z, currency);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f252354a, eVar.f252354a) && Intrinsics.f(this.f252355b, eVar.f252355b) && this.f252356c == eVar.f252356c && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        String str = this.f252354a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l2 = this.f252355b;
        return this.d.hashCode() + j6.a.c((iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.f252356c);
    }
}
