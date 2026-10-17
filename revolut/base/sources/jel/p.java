package jel;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends a {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f173531b;

    public p(String country, double d) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.f173530a = country;
        this.f173531b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f173530a, pVar.f173530a) && Double.compare(this.f173531b, pVar.f173531b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f173531b) + (this.f173530a.hashCode() * 31);
    }
}
