package ls4;

import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentAnticipationQuote;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardInstalmentAnticipationQuote f199616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f199617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f199618c;

    public h(CreditCardInstalmentAnticipationQuote quote, LocalDate currentCycleDueDate, LocalDate lastInstalmentOldDueDate) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(currentCycleDueDate, "currentCycleDueDate");
        Intrinsics.checkNotNullParameter(lastInstalmentOldDueDate, "lastInstalmentOldDueDate");
        this.f199616a = quote;
        this.f199617b = currentCycleDueDate;
        this.f199618c = lastInstalmentOldDueDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f199616a, hVar.f199616a) && Intrinsics.f(this.f199617b, hVar.f199617b) && Intrinsics.f(this.f199618c, hVar.f199618c);
    }

    public final int hashCode() {
        return this.f199618c.hashCode() + y.a(this.f199616a.hashCode() * 31, 31, this.f199617b);
    }
}
