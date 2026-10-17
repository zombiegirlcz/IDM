package h61;

import com.revolut.domain.models.transactions.ThreeDSTransaction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreeDSTransaction f149581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f149582b;

    public a(ThreeDSTransaction threeDSTransaction, boolean z) {
        this.f149581a = threeDSTransaction;
        this.f149582b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f149581a, aVar.f149581a) && this.f149582b == aVar.f149582b;
    }

    public final int hashCode() {
        ThreeDSTransaction threeDSTransaction = this.f149581a;
        return Boolean.hashCode(this.f149582b) + ((threeDSTransaction == null ? 0 : threeDSTransaction.hashCode()) * 31);
    }
}
