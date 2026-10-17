package ej0;

import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements Serializable, Comparable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f126702c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f126703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f126704b;

    static {
        xi0.b.Companion.getClass();
        xi0.b bVarA = xi0.a.a("");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        f126702c = new b(bigDecimalValueOf, bVarA);
    }

    public b(BigDecimal value, xi0.b currency) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f126703a = value;
        this.f126704b = currency;
    }

    public static b b(b bVar, BigDecimal value, xi0.b currency, int i) {
        if ((i & 1) != 0) {
            value = bVar.f126703a;
        }
        if ((i & 2) != 0) {
            currency = bVar.f126704b;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new b(value, currency);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(b other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (Intrinsics.f(this.f126704b, other.f126704b)) {
            return this.f126703a.compareTo(other.f126703a);
        }
        throw new IllegalStateException("Can't compare money with 2 different currencies");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f126703a, bVar.f126703a) && Intrinsics.f(this.f126704b, bVar.f126704b);
    }

    public final int hashCode() {
        return this.f126704b.hashCode() + (this.f126703a.hashCode() * 31);
    }
}
