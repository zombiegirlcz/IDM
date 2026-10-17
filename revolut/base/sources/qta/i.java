package qta;

import h30.l;
import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements Serializable {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f249055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f249056c;
    public final BigDecimal d;
    public final xi0.b e;
    public final xi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f249057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f249058h;

    public i(String id10, h state, BigDecimal targetRate, BigDecimal bigDecimal, xi0.b currencyFrom, xi0.b currencyTo, long j2, long j3) {
        BigDecimal currentRate = BigDecimal.ZERO;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(targetRate, "targetRate");
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        Intrinsics.checkNotNullParameter(currencyFrom, "currencyFrom");
        Intrinsics.checkNotNullParameter(currencyTo, "currencyTo");
        this.f249054a = id10;
        this.f249055b = state;
        this.f249056c = targetRate;
        this.d = bigDecimal;
        this.e = currencyFrom;
        this.f = currencyTo;
        this.f249057g = j2;
        this.f249058h = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        if (!Intrinsics.f(this.f249054a, iVar.f249054a) || this.f249055b != iVar.f249055b || !this.f249056c.equals(iVar.f249056c) || !Intrinsics.f(this.d, iVar.d)) {
            return false;
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        return Intrinsics.f(bigDecimal, bigDecimal) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && this.f249057g == iVar.f249057g && this.f249058h == iVar.f249058h;
    }

    public final int hashCode() {
        int iD = t61.a.d(this.f249056c, (this.f249055b.hashCode() + (this.f249054a.hashCode() * 31)) * 31, 31);
        BigDecimal bigDecimal = this.d;
        return Long.hashCode(this.f249058h) + a0.d.c(l.j(this.f, l.j(this.e, t61.a.d(BigDecimal.ZERO, (iD + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31, 31), 31), 31), 31, this.f249057g);
    }
}
