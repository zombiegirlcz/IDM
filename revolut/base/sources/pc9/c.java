package pc9;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f234832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f234833b;

    public c(double d, double d5) {
        this.f234832a = d;
        this.f234833b = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Double.compare(this.f234832a, cVar.f234832a) == 0 && Double.compare(this.f234833b, cVar.f234833b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f234833b) + (Double.hashCode(this.f234832a) * 31);
    }
}
