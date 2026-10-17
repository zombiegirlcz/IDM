package ls4;

import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentAnticipationQuote;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentAnticipationQuotes;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import ql4.v;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f199611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardInstalmentAnticipationQuotes f199612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f199613c;

    public e(int i, CreditCardInstalmentAnticipationQuotes anticipationQuote, v instalmentType) {
        Intrinsics.checkNotNullParameter(anticipationQuote, "anticipationQuote");
        Intrinsics.checkNotNullParameter(instalmentType, "instalmentType");
        this.f199611a = i;
        this.f199612b = anticipationQuote;
        this.f199613c = instalmentType;
    }

    public final CreditCardInstalmentAnticipationQuote a() {
        for (CreditCardInstalmentAnticipationQuote creditCardInstalmentAnticipationQuote : this.f199612b.e) {
            if (creditCardInstalmentAnticipationQuote.f68783b == this.f199611a) {
                return creditCardInstalmentAnticipationQuote;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f199611a == eVar.f199611a && Intrinsics.f(this.f199612b, eVar.f199612b) && this.f199613c == eVar.f199613c;
    }

    public final int hashCode() {
        return this.f199613c.hashCode() + ((this.f199612b.hashCode() + (Integer.hashCode(this.f199611a) * 31)) * 31);
    }
}
