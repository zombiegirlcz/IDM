package mm1;

import kotlin.jvm.internal.Intrinsics;
import lk0.f;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f207127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f207128b;

    public d(int i, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f207127a = i;
        this.f207128b = query;
    }

    @Override // lk0.f
    /* JADX INFO: renamed from: a */
    public final int getF71990a() {
        return 100;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f207127a == dVar.f207127a && Intrinsics.f(this.f207128b, dVar.f207128b);
    }

    public final int hashCode() {
        return this.f207128b.hashCode() + j6.a.b(this.f207127a, Integer.hashCode(100) * 31, 31);
    }
}
