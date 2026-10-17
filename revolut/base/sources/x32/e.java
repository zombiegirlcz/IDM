package x32;

import cli.o;
import kotlin.jvm.internal.Intrinsics;
import mx0.qb;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f302623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qb f302624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f302625c;
    public final int d;

    public e(boolean z, qb scanState, int i, int i2) {
        Intrinsics.checkNotNullParameter(scanState, "scanState");
        this.f302623a = z;
        this.f302624b = scanState;
        this.f302625c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f302623a == eVar.f302623a && this.f302624b == eVar.f302624b && this.f302625c == eVar.f302625c && this.d == eVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f302625c, (this.f302624b.hashCode() + (Boolean.hashCode(this.f302623a) * 31)) * 31, 31);
    }
}
