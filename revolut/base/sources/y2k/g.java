package y2k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferNote.NewZealandNote f310674a;

    public g(TransferNote.NewZealandNote note) {
        Intrinsics.checkNotNullParameter(note, "note");
        this.f310674a = note;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f310674a, ((g) obj2).f310674a);
    }

    public final int hashCode() {
        return this.f310674a.hashCode();
    }
}
