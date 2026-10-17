package jeb;

import cli.j;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f173248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f173249b;

    public a(LocalDate selectedDate, List availableDates) {
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(availableDates, "availableDates");
        this.f173248a = selectedDate;
        this.f173249b = availableDates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f173248a, aVar.f173248a) && Intrinsics.f(this.f173249b, aVar.f173249b);
    }

    public final int hashCode() {
        return this.f173249b.hashCode() + (this.f173248a.hashCode() * 31);
    }
}
