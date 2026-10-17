package pig;

import hfg.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f236488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hfg.c f236490c;
    public final t0 d;
    public final String e;

    public l(int i, String providerName, hfg.c topUpResult, t0 unit, String topUpId) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(topUpResult, "topUpResult");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(topUpId, "topUpId");
        this.f236488a = i;
        this.f236489b = providerName;
        this.f236490c = topUpResult;
        this.d = unit;
        this.e = topUpId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f236488a == lVar.f236488a && Intrinsics.f(this.f236489b, lVar.f236489b) && this.f236490c == lVar.f236490c && this.d == lVar.d && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f236490c.hashCode() + p.a.c(Integer.hashCode(this.f236488a) * 31, 31, this.f236489b)) * 31)) * 31);
    }
}
