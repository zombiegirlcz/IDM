package lpd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lzi.c f198969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f198970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f198971c;
    public final boolean d;
    public final d e;

    public e(lzi.c cycle, boolean z, int i, boolean z3, d choice) {
        Intrinsics.checkNotNullParameter(cycle, "cycle");
        Intrinsics.checkNotNullParameter(choice, "choice");
        this.f198969a = cycle;
        this.f198970b = z;
        this.f198971c = i;
        this.d = z3;
        this.e = choice;
    }

    public static e a(e eVar, int i, d choice, int i2) {
        lzi.c cycle = eVar.f198969a;
        boolean z = eVar.f198970b;
        if ((i2 & 4) != 0) {
            i = eVar.f198971c;
        }
        int i3 = i;
        boolean z3 = (i2 & 8) != 0 ? eVar.d : true;
        Intrinsics.checkNotNullParameter(cycle, "cycle");
        Intrinsics.checkNotNullParameter(choice, "choice");
        return new e(cycle, z, i3, z3, choice);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f198969a, eVar.f198969a) && this.f198970b == eVar.f198970b && this.f198971c == eVar.f198971c && this.d == eVar.d && this.e == eVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(j6.a.b(this.f198971c, j6.a.c(this.f198969a.hashCode() * 31, 31, this.f198970b), 31), 31, this.d);
    }
}
