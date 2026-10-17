package dm1;

import com.revolut.feature.apm.bills.billers.api.model.Biller;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Biller f115817a;

    public c(Biller selectedBiller) {
        Intrinsics.checkNotNullParameter(selectedBiller, "selectedBiller");
        this.f115817a = selectedBiller;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f115817a, ((c) obj2).f115817a);
    }

    public final int hashCode() {
        return this.f115817a.hashCode();
    }
}
