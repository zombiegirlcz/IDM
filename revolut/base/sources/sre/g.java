package sre;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265195b;

    public g(String str, String str2) {
        this.f265194a = str;
        this.f265195b = str2;
    }

    public final String a() {
        String str = this.f265194a;
        String strQ = str != null ? j6.a.q("_", str) : "";
        String str2 = this.f265195b;
        return p.a.p("all_terms", strQ, str2 != null ? j6.a.q("_", str2) : "");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f265194a, gVar.f265194a) && Intrinsics.f(this.f265195b, gVar.f265195b);
    }

    public final int hashCode() {
        String str = this.f265194a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f265195b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
