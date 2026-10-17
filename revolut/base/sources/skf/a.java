package skf;

import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f263935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WalletAutomation.Exceeds f263936b;

    public a(p recurringPayment, WalletAutomation.Exceeds automation) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(automation, "automation");
        this.f263935a = recurringPayment;
        this.f263936b = automation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f263935a, aVar.f263935a) && Intrinsics.f(this.f263936b, aVar.f263936b);
    }

    public final int hashCode() {
        return this.f263936b.hashCode() + (this.f263935a.hashCode() * 31);
    }
}
