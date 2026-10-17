package dm1;

import com.revolut.feature.apm.bills.billers.api.model.Biller;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Biller f115820a;

    public g(Biller biller) {
        Intrinsics.checkNotNullParameter(biller, "biller");
        this.f115820a = biller;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f115820a, ((g) obj2).f115820a);
    }

    public final int hashCode() {
        return this.f115820a.hashCode();
    }
}
