package urd;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f282269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f282270b;

    public a0(long j2, LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f282269a = date;
        this.f282270b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f282269a, a0Var.f282269a) && this.f282270b == a0Var.f282270b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f282270b) + (this.f282269a.hashCode() * 31);
    }
}
