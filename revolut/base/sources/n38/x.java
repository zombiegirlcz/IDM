package n38;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f211966c;

    public x(String currency, String pocketType, String str) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f211964a = currency;
        this.f211965b = pocketType;
        this.f211966c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f211964a, xVar.f211964a) && Intrinsics.f(this.f211965b, xVar.f211965b) && Intrinsics.f(this.f211966c, xVar.f211966c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f211964a.hashCode() * 31, 31, this.f211965b);
        String str = this.f211966c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
