package qrb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f248701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f248702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f248703c;
    public final double d;
    public final double e;
    public final Double f;

    public /* synthetic */ n(int i, long j2, double d, double d5, double d6, double d10, Double d15) {
        if (63 != (i & 63)) {
            j1.f(l.f248700a.getDescriptor(), i, 63);
            throw null;
        }
        this.f248701a = j2;
        this.f248702b = d;
        this.f248703c = d5;
        this.d = d6;
        this.e = d10;
        this.f = d15;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f248701a == nVar.f248701a && Double.compare(this.f248702b, nVar.f248702b) == 0 && Double.compare(this.f248703c, nVar.f248703c) == 0 && Double.compare(this.d, nVar.d) == 0 && Double.compare(this.e, nVar.e) == 0 && Intrinsics.f(this.f, nVar.f);
    }

    public final int hashCode() {
        int iC = m72.b.c(m72.b.c(m72.b.c(m72.b.c(Long.hashCode(this.f248701a) * 31, this.f248702b, 31), this.f248703c, 31), this.d, 31), this.e, 31);
        Double d = this.f;
        return iC + (d == null ? 0 : d.hashCode());
    }
}
