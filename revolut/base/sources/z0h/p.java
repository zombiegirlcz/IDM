package z0h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f318544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f318545b;

    public p(o type, b footerVariant) {
        Intrinsics.checkNotNullParameter("https://www.revolut.com/legal/precious-metals/?geo-redirect=true", "termsOfBusinessUrl");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(footerVariant, "footerVariant");
        this.f318544a = type;
        this.f318545b = footerVariant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f318544a == pVar.f318544a && this.f318545b == pVar.f318545b;
    }

    public final int hashCode() {
        return this.f318545b.hashCode() + ((this.f318544a.hashCode() - 1898153863) * 31);
    }
}
