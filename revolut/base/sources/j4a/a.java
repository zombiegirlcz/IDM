package j4a;

import aii.r;
import com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WhoToTransferActionItem f171330a;

    public a(WhoToTransferActionItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f171330a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f171330a, ((a) obj2).f171330a);
    }

    public final int hashCode() {
        return this.f171330a.hashCode();
    }
}
