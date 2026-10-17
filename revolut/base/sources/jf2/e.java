package jf2;

import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpiTransferFlowContract$Recipient f173641a;

    public e(UpiTransferFlowContract$Recipient recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f173641a = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f173641a, ((e) obj2).f173641a);
    }

    public final int hashCode() {
        return this.f173641a.hashCode();
    }
}
