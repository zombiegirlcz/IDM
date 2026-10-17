package c6h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21802b;

    public c(String portfolioId, String str) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f21801a = portfolioId;
        this.f21802b = str;
    }

    public final String a() {
        String str = this.f21802b;
        if (str == null) {
            str = "initial";
        }
        return a0.d.s("margin_required_minimum:", this.f21801a, ":", str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f21801a, cVar.f21801a) && Intrinsics.f(this.f21802b, cVar.f21802b);
    }

    public final int hashCode() {
        int iHashCode = this.f21801a.hashCode() * 31;
        String str = this.f21802b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
