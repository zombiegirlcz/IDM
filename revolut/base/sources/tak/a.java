package tak;

import aii.e;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingPaymentContract$InputData f269354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f269355b;

    public a(PendingPaymentContract$InputData.Apm inputData, d extension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.f269354a = inputData;
        this.f269355b = extension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f269354a, aVar.f269354a) && Intrinsics.f(this.f269355b, aVar.f269355b);
    }

    public final int hashCode() {
        return this.f269355b.hashCode() + (this.f269354a.hashCode() * 31);
    }
}
