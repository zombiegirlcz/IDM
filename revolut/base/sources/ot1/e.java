package ot1;

import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BizumTransferData f229399a;

    public e(BizumTransferData transferData) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        this.f229399a = transferData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f229399a, ((e) obj2).f229399a);
    }

    public final int hashCode() {
        return this.f229399a.hashCode();
    }
}
