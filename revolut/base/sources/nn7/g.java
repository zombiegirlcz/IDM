package nn7;

import cli.o;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vim.e f217477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vim.e f217478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f217479c;

    public g(vim.e availableDates, vim.e selectedDates, Date currentDate) {
        Intrinsics.checkNotNullParameter(availableDates, "availableDates");
        Intrinsics.checkNotNullParameter(selectedDates, "selectedDates");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        this.f217477a = availableDates;
        this.f217478b = selectedDates;
        this.f217479c = currentDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f217477a.equals(gVar.f217477a) && this.f217478b.equals(gVar.f217478b) && Intrinsics.f(this.f217479c, gVar.f217479c);
    }

    public final int hashCode() {
        return this.f217479c.hashCode() + ((this.f217478b.hashCode() + (this.f217477a.hashCode() * 31)) * 31);
    }
}
