package m8c;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f203473a;

    public k(Data deferredPaymentData) {
        Intrinsics.checkNotNullParameter(deferredPaymentData, "deferredPaymentData");
        this.f203473a = deferredPaymentData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f203473a, ((k) obj2).f203473a);
    }

    public final int hashCode() {
        return this.f203473a.hashCode();
    }
}
