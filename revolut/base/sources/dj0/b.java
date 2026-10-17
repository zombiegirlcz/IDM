package dj0;

import java.io.Serializable;
import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements Serializable, Comparable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigInteger f115079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f115080b;

    public b(BigInteger amount, xi0.b currency) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f115079a = amount;
        this.f115080b = currency;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        b other = (b) obj2;
        Intrinsics.checkNotNullParameter(other, "other");
        if (Intrinsics.f(this.f115080b, other.f115080b)) {
            return this.f115079a.compareTo(other.f115079a);
        }
        throw new IllegalArgumentException("Can't compare money with different currencies");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f115079a, bVar.f115079a) && Intrinsics.f(this.f115080b, bVar.f115080b);
    }

    public final int hashCode() {
        return this.f115080b.hashCode() + (this.f115079a.hashCode() * 31);
    }
}
