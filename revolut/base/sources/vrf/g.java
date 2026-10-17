package vrf;

import com.revolut.feature.transfer.models.quotes.TransferQuoteSplitOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferQuoteSplitOption f291588a;

    public g() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f291588a, ((g) obj2).f291588a);
    }

    public final int hashCode() {
        TransferQuoteSplitOption transferQuoteSplitOption = this.f291588a;
        if (transferQuoteSplitOption == null) {
            return 0;
        }
        return transferQuoteSplitOption.hashCode();
    }

    public g(TransferQuoteSplitOption transferQuoteSplitOption) {
        this.f291588a = transferQuoteSplitOption;
    }
}
