package ys;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f316336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final omi.b f316337b;

    public a0(LocalDate date, omi.b dataFormat) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(dataFormat, "dataFormat");
        this.f316336a = date;
        this.f316337b = dataFormat;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f316336a, a0Var.f316336a) && this.f316337b == a0Var.f316337b;
    }

    public final int hashCode() {
        return this.f316337b.hashCode() + (this.f316336a.hashCode() * 31);
    }
}
