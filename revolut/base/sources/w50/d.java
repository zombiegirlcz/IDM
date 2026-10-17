package w50;

import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vim.e f294654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vim.d f294655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f294656c;
    public final ArrayList d;
    public final boolean e;

    public d(vim.e calendarDatesRange, vim.e eVar, Date currentDate, ArrayList availableDates, boolean z) {
        Intrinsics.checkNotNullParameter(calendarDatesRange, "calendarDatesRange");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(availableDates, "availableDates");
        this.f294654a = calendarDatesRange;
        this.f294655b = eVar;
        this.f294656c = currentDate;
        this.d = availableDates;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f294654a.equals(dVar.f294654a) && Intrinsics.f(this.f294655b, dVar.f294655b) && this.f294656c.equals(dVar.f294656c) && this.d.equals(dVar.d) && this.e == dVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f294654a.hashCode() * 31;
        vim.d dVar = this.f294655b;
        return Boolean.hashCode(this.e) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, t61.a.e(this.f294656c, (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31), 31);
    }
}
