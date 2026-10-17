package o45;

import java.time.LocalDate;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class f0 {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f222050c;
    public final LocalDateTime d;
    public final LocalDate e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f222051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f222052h;
    public final boolean i;

    public /* synthetic */ f0(int i, String str, String str2, LocalDate localDate, LocalDateTime localDateTime, LocalDate localDate2, String str3, long j2, long j3, boolean z) {
        if (511 != (i & 511)) {
            qlm.j1.f(d0.f222037a.getDescriptor(), i, 511);
            throw null;
        }
        this.f222048a = str;
        this.f222049b = str2;
        this.f222050c = localDate;
        this.d = localDateTime;
        this.e = localDate2;
        this.f = str3;
        this.f222051g = j2;
        this.f222052h = j3;
        this.i = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f222048a, f0Var.f222048a) && Intrinsics.f(this.f222049b, f0Var.f222049b) && Intrinsics.f(this.f222050c, f0Var.f222050c) && Intrinsics.f(this.d, f0Var.d) && Intrinsics.f(this.e, f0Var.e) && Intrinsics.f(this.f, f0Var.f) && this.f222051g == f0Var.f222051g && this.f222052h == f0Var.f222052h && this.i == f0Var.i;
    }

    public final int hashCode() {
        int iHashCode = this.f222048a.hashCode() * 31;
        String str = this.f222049b;
        int iA = wp5.y.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f222050c);
        LocalDateTime localDateTime = this.d;
        int iHashCode2 = (iA + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDate localDate = this.e;
        return Boolean.hashCode(this.i) + a0.d.c(a0.d.c(p.a.c((iHashCode2 + (localDate != null ? localDate.hashCode() : 0)) * 31, 31, this.f), 31, this.f222051g), 31, this.f222052h);
    }

    public f0(String id10, String str, LocalDate repaymentDate, LocalDateTime localDateTime, LocalDate localDate, String currency, long j2, long j3, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(repaymentDate, "repaymentDate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f222048a = id10;
        this.f222049b = str;
        this.f222050c = repaymentDate;
        this.d = localDateTime;
        this.e = localDate;
        this.f = currency;
        this.f222051g = j2;
        this.f222052h = j3;
        this.i = z;
    }
}
