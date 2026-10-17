package cmf;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f25224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yk5.a f25225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f25226c;

    public d(a3 transaction, yk5.a aVar) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f25224a = transaction;
        this.f25225b = aVar;
        this.f25226c = yhm.j.b(new bvb.a(this, 26));
    }

    public final n a() {
        return (n) this.f25226c.getValue();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f25224a, dVar.f25224a) && Intrinsics.f(this.f25225b, dVar.f25225b);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f25224a.hashCode() * 31, 31, false);
        yk5.a aVar = this.f25225b;
        return Boolean.hashCode(false) + j6.a.c((iC + (aVar == null ? 0 : aVar.hashCode())) * 923521, 31, false);
    }
}
