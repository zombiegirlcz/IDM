package yu4;

import cli.j;
import com.revolut.feature.credit.card.api.models.settings.CreditCardSettings$RepaymentPreferenceSettings$DueDateOption;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f316876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f316877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f316878c;
    public final List d;

    public d(int i, int i2, List dueDateSelections, List days) {
        Intrinsics.checkNotNullParameter(dueDateSelections, "dueDateSelections");
        Intrinsics.checkNotNullParameter(days, "days");
        this.f316876a = i;
        this.f316877b = i2;
        this.f316878c = dueDateSelections;
        this.d = days;
    }

    public final CreditCardSettings$RepaymentPreferenceSettings$DueDateOption a() {
        for (CreditCardSettings$RepaymentPreferenceSettings$DueDateOption creditCardSettings$RepaymentPreferenceSettings$DueDateOption : this.f316878c) {
            if (creditCardSettings$RepaymentPreferenceSettings$DueDateOption.f68861a == this.f316877b) {
                return creditCardSettings$RepaymentPreferenceSettings$DueDateOption;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f316876a == dVar.f316876a && this.f316877b == dVar.f316877b && Intrinsics.f(this.f316878c, dVar.f316878c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(j6.a.b(this.f316877b, Integer.hashCode(this.f316876a) * 31, 31), 31, this.f316878c);
    }
}
