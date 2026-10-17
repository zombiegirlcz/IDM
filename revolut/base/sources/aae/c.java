package aae;

import cli.j;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import qua.p;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f2805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f2806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f2807c;

    public c(p recurringPayment, LocalDate selectedDate, LocalDate minAvailableDate) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(minAvailableDate, "minAvailableDate");
        this.f2805a = recurringPayment;
        this.f2806b = selectedDate;
        this.f2807c = minAvailableDate;
    }

    public static c a(c cVar, LocalDate selectedDate) {
        p recurringPayment = cVar.f2805a;
        LocalDate minAvailableDate = cVar.f2807c;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(minAvailableDate, "minAvailableDate");
        return new c(recurringPayment, selectedDate, minAvailableDate);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f2805a, cVar.f2805a) && Intrinsics.f(this.f2806b, cVar.f2806b) && Intrinsics.f(this.f2807c, cVar.f2807c);
    }

    public final int hashCode() {
        return this.f2807c.hashCode() + y.a(this.f2805a.hashCode() * 31, 31, this.f2806b);
    }
}
