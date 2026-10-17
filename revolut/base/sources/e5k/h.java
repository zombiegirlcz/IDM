package e5k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferNote.StructuredNote f122833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f122834b;

    public h(TransferNote.StructuredNote transferNote, List referenceOptions) {
        Intrinsics.checkNotNullParameter(transferNote, "transferNote");
        Intrinsics.checkNotNullParameter(referenceOptions, "referenceOptions");
        this.f122833a = transferNote;
        this.f122834b = referenceOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f122833a, hVar.f122833a) && Intrinsics.f(this.f122834b, hVar.f122834b);
    }

    public final int hashCode() {
        return this.f122834b.hashCode() + (this.f122833a.hashCode() * 31);
    }
}
