package ys;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f316351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f316352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f316353c;
    public final String d;

    public j(x calendar, String year, String month, String day) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Intrinsics.checkNotNullParameter(year, "year");
        Intrinsics.checkNotNullParameter(month, "month");
        Intrinsics.checkNotNullParameter(day, "day");
        this.f316351a = calendar;
        this.f316352b = year;
        this.f316353c = month;
        this.d = day;
    }

    public static j a(j jVar, String year, String month, String day, int i) {
        x calendar = jVar.f316351a;
        if ((i & 2) != 0) {
            year = jVar.f316352b;
        }
        if ((i & 4) != 0) {
            month = jVar.f316353c;
        }
        if ((i & 8) != 0) {
            day = jVar.d;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Intrinsics.checkNotNullParameter(year, "year");
        Intrinsics.checkNotNullParameter(month, "month");
        Intrinsics.checkNotNullParameter(day, "day");
        return new j(calendar, year, month, day);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f316351a == jVar.f316351a && Intrinsics.f(this.f316352b, jVar.f316352b) && Intrinsics.f(this.f316353c, jVar.f316353c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f316351a.hashCode() * 31, 31, this.f316352b), 31, this.f316353c);
    }
}
