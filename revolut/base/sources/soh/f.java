package soh;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f264836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f264837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f264838c;

    public f(i min, i max, BigDecimal step) {
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        Intrinsics.checkNotNullParameter(step, "step");
        this.f264836a = min;
        this.f264837b = max;
        this.f264838c = step;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f264836a, fVar.f264836a) && Intrinsics.f(this.f264837b, fVar.f264837b) && Intrinsics.f(this.f264838c, fVar.f264838c);
    }

    public final int hashCode() {
        return this.f264838c.hashCode() + ((this.f264837b.hashCode() + (this.f264836a.hashCode() * 31)) * 31);
    }
}
