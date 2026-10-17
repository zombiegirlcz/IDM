package qod;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f248157g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f248158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f248159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f248160c;
    public final boolean d;
    public final boolean e;
    public final Integer f;

    public c(d quality, List activeCountries, String initiallyFocusedCountry, boolean z, Integer num) {
        boolean z3 = f248157g || z;
        Intrinsics.checkNotNullParameter(quality, "quality");
        Intrinsics.checkNotNullParameter(activeCountries, "activeCountries");
        Intrinsics.checkNotNullParameter(initiallyFocusedCountry, "initiallyFocusedCountry");
        this.f248158a = quality;
        this.f248159b = activeCountries;
        this.f248160c = initiallyFocusedCountry;
        this.d = z;
        this.e = z3;
        this.f = num;
        f248157g = true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f248158a == cVar.f248158a && Intrinsics.f(this.f248159b, cVar.f248159b) && Intrinsics.f(this.f248160c, cVar.f248160c) && this.d == cVar.d && this.e == cVar.e && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(p.a.c(p.a.d(this.f248158a.hashCode() * 31, 31, this.f248159b), 31, this.f248160c), 31, this.d), 31, this.e);
        Integer num = this.f;
        return iC + (num == null ? 0 : num.hashCode());
    }
}
