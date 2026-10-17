package ieb;

import java.time.LocalDate;
import java.time.LocalTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f160690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalTime f160691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f160692c;

    public i(LocalDate date, LocalTime time, int i) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        this.f160690a = date;
        this.f160691b = time;
        this.f160692c = i;
    }

    public static i a(i iVar, LocalDate date, LocalTime time, int i, int i2) {
        if ((i2 & 1) != 0) {
            date = iVar.f160690a;
        }
        if ((i2 & 2) != 0) {
            time = iVar.f160691b;
        }
        if ((i2 & 4) != 0) {
            i = iVar.f160692c;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        return new i(date, time, i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f160690a, iVar.f160690a) && Intrinsics.f(this.f160691b, iVar.f160691b) && this.f160692c == iVar.f160692c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f160692c) + ((this.f160691b.hashCode() + (this.f160690a.hashCode() * 31)) * 31);
    }
}
