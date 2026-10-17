package o45;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class t0 {

    @NotNull
    public static final s0 Companion = new s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f222107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f222108c;
    public final String d;

    public /* synthetic */ t0(int i, String str, String str2, String str3, LocalDate localDate) {
        if (15 != (i & 15)) {
            qlm.j1.f(r0.f222096a.getDescriptor(), i, 15);
            throw null;
        }
        this.f222106a = str;
        this.f222107b = localDate;
        this.f222108c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f222106a, t0Var.f222106a) && Intrinsics.f(this.f222107b, t0Var.f222107b) && Intrinsics.f(this.f222108c, t0Var.f222108c) && Intrinsics.f(this.d, t0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(wp5.y.a(this.f222106a.hashCode() * 31, 31, this.f222107b), 31, this.f222108c);
    }

    public t0(String id10, String rate, String rateType, LocalDate effectiveDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(rateType, "rateType");
        this.f222106a = id10;
        this.f222107b = effectiveDate;
        this.f222108c = rate;
        this.d = rateType;
    }
}
