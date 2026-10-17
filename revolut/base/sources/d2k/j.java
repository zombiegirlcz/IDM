package d2k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.PaymentsCountrySelector$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentsCountrySelector$InputData f110882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f110883b;

    public j(PaymentsCountrySelector$InputData inputData, k interactor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f110882a = inputData;
        this.f110883b = interactor;
    }

    public final PaymentsCountrySelector$InputData b() {
        return this.f110882a;
    }

    public final k c() {
        return this.f110883b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f110882a, jVar.f110882a) && Intrinsics.f(this.f110883b, jVar.f110883b);
    }

    public final int hashCode() {
        return this.f110883b.hashCode() + (this.f110882a.f101971a.hashCode() * 31);
    }
}
