package o45;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class y0 {

    @NotNull
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f222141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f222142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f222143c;

    public /* synthetic */ y0(int i, long j2, long j3, LocalDate localDate) {
        if (7 != (i & 7)) {
            qlm.j1.f(w0.f222120a.getDescriptor(), i, 7);
            throw null;
        }
        this.f222141a = j2;
        this.f222142b = j3;
        this.f222143c = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return this.f222141a == y0Var.f222141a && this.f222142b == y0Var.f222142b && Intrinsics.f(this.f222143c, y0Var.f222143c);
    }

    public final int hashCode() {
        return this.f222143c.hashCode() + a0.d.c(Long.hashCode(this.f222141a) * 31, 31, this.f222142b);
    }

    public y0(long j2, long j3, LocalDate fundsExpirationDate) {
        Intrinsics.checkNotNullParameter(fundsExpirationDate, "fundsExpirationDate");
        this.f222141a = j2;
        this.f222142b = j3;
        this.f222143c = fundsExpirationDate;
    }
}
