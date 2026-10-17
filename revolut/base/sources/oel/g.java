package oel;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f224635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f224636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f224637c;

    public g(String title, String description, Instant date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f224635a = date;
        this.f224636b = title;
        this.f224637c = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f224635a, gVar.f224635a) && Intrinsics.f(this.f224636b, gVar.f224636b) && Intrinsics.f(this.f224637c, gVar.f224637c);
    }

    public final int hashCode() {
        return this.f224637c.hashCode() + p.a.c(this.f224635a.hashCode() * 31, 31, this.f224636b);
    }
}
