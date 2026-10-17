package fn1;

import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillSearchBoletoResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillSearchBoletoResult f136508a;

    public c(BillSearchBoletoResult decodeResult) {
        Intrinsics.checkNotNullParameter(decodeResult, "decodeResult");
        this.f136508a = decodeResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f136508a, ((c) obj2).f136508a);
    }

    public final int hashCode() {
        return this.f136508a.hashCode();
    }
}
