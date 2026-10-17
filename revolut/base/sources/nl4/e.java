package nl4;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f216994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f216995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f216996c;
    public final dj0.d d;
    public final boolean e;

    public e(boolean z, LocalDate statementDay, dj0.d spent, dj0.d threshold, boolean z3) {
        Intrinsics.checkNotNullParameter(statementDay, "statementDay");
        Intrinsics.checkNotNullParameter(spent, "spent");
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        this.f216994a = z;
        this.f216995b = statementDay;
        this.f216996c = spent;
        this.d = threshold;
        this.e = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f216994a == eVar.f216994a && Intrinsics.f(this.f216995b, eVar.f216995b) && Intrinsics.f(this.f216996c, eVar.f216996c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + v7.c(v7.c(y.a(Boolean.hashCode(this.f216994a) * 31, 31, this.f216995b), 31, this.f216996c), 31, this.d);
    }
}
