package fhi;

import java.time.LocalTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wgi.a f135240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalTime f135241b;

    public d(wgi.a alarmDay, LocalTime alarmTime) {
        Intrinsics.checkNotNullParameter(alarmDay, "alarmDay");
        Intrinsics.checkNotNullParameter(alarmTime, "alarmTime");
        this.f135240a = alarmDay;
        this.f135241b = alarmTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f135240a == dVar.f135240a && Intrinsics.f(this.f135241b, dVar.f135241b);
    }

    public final int hashCode() {
        return this.f135241b.hashCode() + (this.f135240a.hashCode() * 31);
    }
}
