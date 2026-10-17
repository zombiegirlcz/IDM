package dj0;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Serializable, Comparable {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xi0.b f115081c;
    public static final d d;
    public static final d e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f115082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f115083b;

    static {
        xi0.b.Companion.getClass();
        xi0.b bVarA = xi0.a.a("");
        f115081c = bVarA;
        d dVar = new d(0L, bVarA);
        d = dVar;
        e = dVar;
    }

    public d(long j2, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f115082a = j2;
        this.f115083b = currency;
    }

    public static d c(d dVar, long j2, xi0.b currency, int i) {
        if ((i & 1) != 0) {
            j2 = dVar.f115082a;
        }
        if ((i & 2) != 0) {
            currency = dVar.f115083b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new d(j2, currency);
    }

    public final d a() {
        return this.f115082a >= 0 ? this : l();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(d other) {
        Intrinsics.checkNotNullParameter(other, "other");
        boolean zF = Intrinsics.f(other, d);
        long j2 = this.f115082a;
        if (zF) {
            if (j2 > 0) {
                return 1;
            }
            return j2 < 0 ? -1 : 0;
        }
        if (j2 != 0) {
            long j3 = other.f115082a;
            xi0.b bVar = other.f115083b;
            if (j3 != 0) {
                xi0.b bVar2 = this.f115083b;
                if (!Intrinsics.f(bVar, bVar2)) {
                    throw new IllegalArgumentException(a0.d.s("can't compare currency with 2 different currencies first is ", bVar2.f306286a, " second is ", bVar.f306286a));
                }
                long j5 = j2 - other.f115082a;
                if (j5 > 0) {
                    return 1;
                }
                return j5 < 0 ? -1 : 0;
            }
        }
        long j16 = j2 - other.f115082a;
        if (j16 > 0) {
            return 1;
        }
        return j16 < 0 ? -1 : 0;
    }

    public final xi0.b d() {
        return this.f115083b;
    }

    public final boolean e(d other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return compareTo(other) >= 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f115082a == dVar.f115082a && Intrinsics.f(this.f115083b, dVar.f115083b);
    }

    public final boolean f(d other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return compareTo(other) > 0;
    }

    public final boolean h(d other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return compareTo(other) <= 0;
    }

    public final int hashCode() {
        return this.f115083b.hashCode() + (Long.hashCode(this.f115082a) * 31);
    }

    public final boolean i(d other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return compareTo(other) < 0;
    }

    public final boolean k() {
        return this.f115082a == 0;
    }

    public final d l() {
        return new d(-this.f115082a, this.f115083b);
    }
}
