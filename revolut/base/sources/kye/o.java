package kye;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f190803b;

    public o(String currency, String str) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f190802a = currency;
        this.f190803b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f190802a, oVar.f190802a) && Intrinsics.f(this.f190803b, oVar.f190803b);
    }

    public final int hashCode() {
        int iHashCode = this.f190802a.hashCode() * 31;
        String str = this.f190803b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
