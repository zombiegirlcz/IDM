package ns4;

import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentAnticipationQuote;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardInstalmentAnticipationQuote f218740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f218741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f218742c;

    public e(CreditCardInstalmentAnticipationQuote quote, LocalDate currentCycleDueDate, LocalDate lastInstalmentOldDueDate) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(currentCycleDueDate, "currentCycleDueDate");
        Intrinsics.checkNotNullParameter(lastInstalmentOldDueDate, "lastInstalmentOldDueDate");
        this.f218740a = quote;
        this.f218741b = currentCycleDueDate;
        this.f218742c = lastInstalmentOldDueDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f218740a, eVar.f218740a) && Intrinsics.f(this.f218741b, eVar.f218741b) && Intrinsics.f(this.f218742c, eVar.f218742c);
    }

    public final int hashCode() {
        return this.f218742c.hashCode() + y.a(this.f218740a.hashCode() * 31, 31, this.f218741b);
    }
}
