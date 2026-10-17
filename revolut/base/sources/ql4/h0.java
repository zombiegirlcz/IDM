package ql4;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f247126a;

    public h0(LocalDate endDate) {
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f247126a = endDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h0) && Intrinsics.f(this.f247126a, ((h0) obj2).f247126a);
    }

    public final int hashCode() {
        return this.f247126a.hashCode();
    }
}
