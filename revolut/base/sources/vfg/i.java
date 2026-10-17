package vfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends lk0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f288622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f288623b;

    public i(int i, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f288622a = i;
        this.f288623b = query;
    }

    @Override // lk0.f
    /* JADX INFO: renamed from: a */
    public final int getF71990a() {
        return 20;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f288622a == iVar.f288622a && Intrinsics.f(this.f288623b, iVar.f288623b);
    }

    public final int hashCode() {
        return this.f288623b.hashCode() + j6.a.b(this.f288622a, Integer.hashCode(20) * 31, 31);
    }
}
