package v4g;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.a f286077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f286078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f286079c;

    public g(com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.a travellers, Data payment, Set selectedBaggageTokens) {
        Intrinsics.checkNotNullParameter(travellers, "travellers");
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(selectedBaggageTokens, "selectedBaggageTokens");
        this.f286077a = travellers;
        this.f286078b = payment;
        this.f286079c = selectedBaggageTokens;
    }

    public static g a(g gVar, Data payment, Set selectedBaggageTokens, int i) {
        com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.a travellers = gVar.f286077a;
        if ((i & 2) != 0) {
            payment = gVar.f286078b;
        }
        if ((i & 4) != 0) {
            selectedBaggageTokens = gVar.f286079c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(travellers, "travellers");
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(selectedBaggageTokens, "selectedBaggageTokens");
        return new g(travellers, payment, selectedBaggageTokens);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f286077a, gVar.f286077a) && Intrinsics.f(this.f286078b, gVar.f286078b) && Intrinsics.f(this.f286079c, gVar.f286079c);
    }

    public final int hashCode() {
        return this.f286079c.hashCode() + kii.e.c(this.f286078b, this.f286077a.hashCode() * 31, 31);
    }
}
