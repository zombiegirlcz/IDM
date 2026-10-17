package ys;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f316342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f316343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f316344c;

    public c0(x calendar, LocalDate startDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f316342a = calendar;
        this.f316343b = startDate;
        this.f316344c = endDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f316342a == c0Var.f316342a && Intrinsics.f(this.f316343b, c0Var.f316343b) && Intrinsics.f(this.f316344c, c0Var.f316344c);
    }

    public final int hashCode() {
        return this.f316344c.hashCode() + wp5.y.a(this.f316342a.hashCode() * 31, 31, this.f316343b);
    }
}
