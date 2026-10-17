package ipk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f167760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f167761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f167762c;
    public final a d;
    public final List e;

    public f(double d, String currencyFrom, String currencyTo, a duration, List plot) {
        Intrinsics.checkNotNullParameter(currencyFrom, "currencyFrom");
        Intrinsics.checkNotNullParameter(currencyTo, "currencyTo");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(plot, "plot");
        this.f167760a = d;
        this.f167761b = currencyFrom;
        this.f167762c = currencyTo;
        this.d = duration;
        this.e = plot;
    }

    public final String a() {
        return this.f167761b;
    }

    public final String b() {
        return this.f167762c;
    }

    public final a c() {
        return this.d;
    }

    public final List d() {
        return this.e;
    }

    public final double e() {
        return this.f167760a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Double.compare(this.f167760a, fVar.f167760a) == 0 && Intrinsics.f(this.f167761b, fVar.f167761b) && Intrinsics.f(this.f167762c, fVar.f167762c) && this.d == fVar.d && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + p.a.c(p.a.c(Double.hashCode(this.f167760a) * 31, 31, this.f167761b), 31, this.f167762c)) * 31);
    }
}
