package c4k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferNote.StructuredNote f21308a;

    public f(TransferNote.StructuredNote newTransferNote) {
        Intrinsics.checkNotNullParameter(newTransferNote, "newTransferNote");
        this.f21308a = newTransferNote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f21308a, ((f) obj2).f21308a);
    }

    public final int hashCode() {
        return this.f21308a.hashCode();
    }
}
