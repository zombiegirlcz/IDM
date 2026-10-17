package m0g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f201146a;

    public f(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f201146a = currency;
    }

    public final String a() {
        return p.a.o(this.f201146a.f306286a, 16);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f201146a, ((f) obj2).f201146a);
    }

    public final int hashCode() {
        return Integer.hashCode(16) + (this.f201146a.hashCode() * 31);
    }
}
