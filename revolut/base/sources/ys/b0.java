package ys;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f316338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f316339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f316340c;
    public final String d;

    public b0(x calendar, String year, String month, String day) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Intrinsics.checkNotNullParameter(year, "year");
        Intrinsics.checkNotNullParameter(month, "month");
        Intrinsics.checkNotNullParameter(day, "day");
        this.f316338a = calendar;
        this.f316339b = year;
        this.f316340c = month;
        this.d = day;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return this.f316338a == b0Var.f316338a && Intrinsics.f(this.f316339b, b0Var.f316339b) && Intrinsics.f(this.f316340c, b0Var.f316340c) && Intrinsics.f(this.d, b0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f316338a.hashCode() * 31, 31, this.f316339b), 31, this.f316340c);
    }
}
