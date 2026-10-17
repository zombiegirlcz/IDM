package v7e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f286587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f286588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f286589c;
    public final boolean d;

    public f(xi0.b currency, List list, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f286587a = currency;
        this.f286588b = list;
        this.f286589c = z;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f286587a, fVar.f286587a) && Intrinsics.f(this.f286588b, fVar.f286588b) && this.f286589c == fVar.f286589c && this.d == fVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f286587a.hashCode() * 31;
        List list = this.f286588b;
        return Boolean.hashCode(this.d) + j6.a.c((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.f286589c);
    }
}
