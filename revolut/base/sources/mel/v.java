package mel;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f204778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f204779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ej0.b f204780c;

    public v(Instant date, j0 j0Var, ej0.b price) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(price, "price");
        this.f204778a = date;
        this.f204779b = j0Var;
        this.f204780c = price;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f204778a, vVar.f204778a) && this.f204779b == vVar.f204779b && Intrinsics.f(this.f204780c, vVar.f204780c);
    }

    public final int hashCode() {
        int iHashCode = this.f204778a.hashCode() * 31;
        j0 j0Var = this.f204779b;
        return this.f204780c.hashCode() + ((iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31);
    }
}
