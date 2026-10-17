package nn7;

import cli.j;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vim.d f217473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vim.d f217474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f217475c;

    public e(vim.d availableDates, vim.d selectedDates, LocalDate currentDate) {
        Intrinsics.checkNotNullParameter(availableDates, "availableDates");
        Intrinsics.checkNotNullParameter(selectedDates, "selectedDates");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        this.f217473a = availableDates;
        this.f217474b = selectedDates;
        this.f217475c = currentDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f217473a, eVar.f217473a) && Intrinsics.f(this.f217474b, eVar.f217474b) && Intrinsics.f(this.f217475c, eVar.f217475c);
    }

    public final int hashCode() {
        return this.f217475c.hashCode() + ((this.f217474b.hashCode() + (this.f217473a.hashCode() * 31)) * 31);
    }
}
