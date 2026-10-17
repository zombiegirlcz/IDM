package n2f;

import cli.j;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f211534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f211535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f211536c;

    public c(double d, double d5, double d6) {
        this.f211534a = d;
        this.f211535b = d5;
        this.f211536c = d6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Double.compare(this.f211534a, cVar.f211534a) == 0 && Double.compare(this.f211535b, cVar.f211535b) == 0 && Double.compare(this.f211536c, cVar.f211536c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f211536c) + m72.b.c(Double.hashCode(this.f211534a) * 31, this.f211535b, 31);
    }
}
