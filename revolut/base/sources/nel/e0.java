package nel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 extends a {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f214565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f214566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f214567c;
    public final List d;
    public final dj0.d e;
    public final ej0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f214568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d0 f214569h;
    public final c0 i;

    public e0(Integer num, BigDecimal bigDecimal, Integer num2, List underlyingAssetsRefs, dj0.d dVar, ej0.b bVar, LocalDate localDate, d0 d0Var, c0 c0Var) {
        Intrinsics.checkNotNullParameter(underlyingAssetsRefs, "underlyingAssetsRefs");
        this.f214565a = num;
        this.f214566b = bigDecimal;
        this.f214567c = num2;
        this.d = underlyingAssetsRefs;
        this.e = dVar;
        this.f = bVar;
        this.f214568g = localDate;
        this.f214569h = d0Var;
        this.i = c0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f214565a, e0Var.f214565a) && Intrinsics.f(this.f214566b, e0Var.f214566b) && Intrinsics.f(this.f214567c, e0Var.f214567c) && Intrinsics.f(this.d, e0Var.d) && Intrinsics.f(this.e, e0Var.e) && Intrinsics.f(this.f, e0Var.f) && Intrinsics.f(this.f214568g, e0Var.f214568g) && this.f214569h == e0Var.f214569h && this.i == e0Var.i;
    }

    public final int hashCode() {
        Integer num = this.f214565a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        BigDecimal bigDecimal = this.f214566b;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Integer num2 = this.f214567c;
        int iD = p.a.d((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.d);
        dj0.d dVar = this.e;
        int iHashCode3 = (iD + (dVar == null ? 0 : dVar.hashCode())) * 31;
        ej0.b bVar = this.f;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        LocalDate localDate = this.f214568g;
        int iHashCode5 = (iHashCode4 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        d0 d0Var = this.f214569h;
        int iHashCode6 = (iHashCode5 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        c0 c0Var = this.i;
        return iHashCode6 + (c0Var != null ? c0Var.hashCode() : 0);
    }
}
