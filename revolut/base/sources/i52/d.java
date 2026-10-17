package i52;

import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferData f158553a;

    public d(TransferData transferData) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        this.f158553a = transferData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f158553a, ((d) obj2).f158553a);
    }

    public final int hashCode() {
        return this.f158553a.hashCode();
    }
}
