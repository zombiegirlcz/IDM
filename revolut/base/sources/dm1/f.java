package dm1;

import com.revolut.feature.apm.bills.billers.api.model.Biller;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Biller f115819a;

    public f(Biller biller) {
        Intrinsics.checkNotNullParameter(biller, "biller");
        this.f115819a = biller;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f115819a, ((f) obj2).f115819a);
    }

    public final int hashCode() {
        return this.f115819a.hashCode();
    }
}
