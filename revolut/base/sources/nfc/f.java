package nfc;

import aii.r;
import com.revolut.feature.acquiring.card_reader.order.api.model.VatSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VatSelection f214891a;

    public f(VatSelection vatSelection) {
        Intrinsics.checkNotNullParameter(vatSelection, "vatSelection");
        this.f214891a = vatSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f214891a, ((f) obj2).f214891a);
    }

    public final int hashCode() {
        return this.f214891a.hashCode();
    }
}
