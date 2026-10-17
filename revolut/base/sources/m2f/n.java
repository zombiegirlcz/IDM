package m2f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f201984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u2f.a f201986c;
    public final u2f.k d;
    public final String e;

    public n(int i, String providerName, u2f.a topUpResult, u2f.k unit, String topUpId) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(topUpResult, "topUpResult");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(topUpId, "topUpId");
        this.f201984a = i;
        this.f201985b = providerName;
        this.f201986c = topUpResult;
        this.d = unit;
        this.e = topUpId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f201984a == nVar.f201984a && Intrinsics.f(this.f201985b, nVar.f201985b) && this.f201986c == nVar.f201986c && this.d == nVar.d && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f201986c.hashCode() + p.a.c(Integer.hashCode(this.f201984a) * 31, 31, this.f201985b)) * 31)) * 31);
    }
}
