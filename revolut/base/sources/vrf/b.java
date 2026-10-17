package vrf;

import com.revolut.feature.transfer.models.quotes.TransferQuoteSplit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferQuoteSplit f291579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f291580b;

    public b(TransferQuoteSplit quoteSplit, int i) {
        Intrinsics.checkNotNullParameter(quoteSplit, "quoteSplit");
        this.f291579a = quoteSplit;
        this.f291580b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f291579a, bVar.f291579a) && this.f291580b == bVar.f291580b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f291580b) + (this.f291579a.f92287a.hashCode() * 31);
    }
}
