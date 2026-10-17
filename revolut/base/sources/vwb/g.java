package vwb;

import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VoucherProductGroup f292692a;

    public g(VoucherProductGroup voucherProductGroup) {
        Intrinsics.checkNotNullParameter(voucherProductGroup, "voucherProductGroup");
        this.f292692a = voucherProductGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f292692a, ((g) obj2).f292692a);
    }

    public final int hashCode() {
        return this.f292692a.hashCode();
    }
}
