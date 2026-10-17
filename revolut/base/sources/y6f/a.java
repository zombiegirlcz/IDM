package y6f;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f311263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f311264b;

    public a(Clause value, Clause clause) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f311263a = value;
        this.f311264b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f311263a, aVar.f311263a) && Intrinsics.f(this.f311264b, aVar.f311264b);
    }

    public final int hashCode() {
        int iHashCode = this.f311263a.hashCode() * 31;
        Clause clause = this.f311264b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
