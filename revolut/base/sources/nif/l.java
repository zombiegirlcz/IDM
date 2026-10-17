package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f215905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215906b;

    public l(long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f215905a = j2;
        this.f215906b = currency;
    }

    public final long a() {
        return this.f215905a;
    }

    public final String b() {
        return this.f215906b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f215905a == lVar.f215905a && Intrinsics.f(this.f215906b, lVar.f215906b);
    }

    public final int hashCode() {
        return this.f215906b.hashCode() + (Long.hashCode(this.f215905a) * 31);
    }
}
