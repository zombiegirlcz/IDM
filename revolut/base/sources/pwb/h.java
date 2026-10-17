package pwb;

import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VoucherProductGroup f240382a;

    public h(VoucherProductGroup voucherProductGroup) {
        Intrinsics.checkNotNullParameter(voucherProductGroup, "voucherProductGroup");
        this.f240382a = voucherProductGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f240382a, ((h) obj2).f240382a);
    }

    public final int hashCode() {
        return this.f240382a.hashCode();
    }
}
