package ll4;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f196508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f196509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f196510c;
    public final long d;
    public final String e;

    public c0(LocalDate statementDate, String fileName, long j2, long j3, String cycleId) {
        Intrinsics.checkNotNullParameter(statementDate, "statementDate");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(cycleId, "cycleId");
        this.f196508a = statementDate;
        this.f196509b = fileName;
        this.f196510c = j2;
        this.d = j3;
        this.e = cycleId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f196508a, c0Var.f196508a) && Intrinsics.f(this.f196509b, c0Var.f196509b) && this.f196510c == c0Var.f196510c && this.d == c0Var.d && Intrinsics.f(this.e, c0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + a0.d.c(a0.d.c(p.a.c(this.f196508a.hashCode() * 31, 31, this.f196509b), 31, this.f196510c), 31, this.d);
    }
}
