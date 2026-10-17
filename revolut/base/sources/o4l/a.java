package o4l;

import h30.l;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;
import nel.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f222295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZonedDateTime f222296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f222297c;

    public a(p0 type, ZonedDateTime start, ZonedDateTime end2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        this.f222295a = type;
        this.f222296b = start;
        this.f222297c = end2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f222295a == aVar.f222295a && Intrinsics.f(this.f222296b, aVar.f222296b) && Intrinsics.f(this.f222297c, aVar.f222297c);
    }

    public final int hashCode() {
        return this.f222297c.hashCode() + l.h(this.f222296b, this.f222295a.hashCode() * 31, 31);
    }
}
