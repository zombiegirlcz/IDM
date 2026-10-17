package ah9;

import com.revolut.feature.apm.bills.billers.api.model.Biller;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Biller f4914a;

    public e(Biller biller) {
        Intrinsics.checkNotNullParameter(biller, "biller");
        this.f4914a = biller;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f4914a, ((e) obj2).f4914a);
    }

    public final int hashCode() {
        return this.f4914a.hashCode();
    }
}
