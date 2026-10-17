package y2k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferNote.NewZealandNote f310672a;

    public e(TransferNote.NewZealandNote newZealandNote) {
        Intrinsics.checkNotNullParameter(newZealandNote, "newZealandNote");
        this.f310672a = newZealandNote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f310672a, ((e) obj2).f310672a);
    }

    public final int hashCode() {
        return this.f310672a.hashCode();
    }
}
