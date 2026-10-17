package skf;

import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f263937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WalletAutomation.DropsBelow f263938b;

    public b(p recurringPayment, WalletAutomation.DropsBelow automation) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(automation, "automation");
        this.f263937a = recurringPayment;
        this.f263938b = automation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f263937a, bVar.f263937a) && Intrinsics.f(this.f263938b, bVar.f263938b);
    }

    public final int hashCode() {
        return this.f263938b.hashCode() + (this.f263937a.hashCode() * 31);
    }
}
