package d28;

import com.revolut.feature.wealth.api.ui.invest.transactions.details.pager.InvestTransactionDetailsPagerContract$Descriptor;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestTransactionDetailsPagerContract$Descriptor f110780a;

    public d(InvestTransactionDetailsPagerContract$Descriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ModalDestination.Style.FullscreenPaged style = ModalDestination.Style.FullscreenPaged.f98310a;
        Intrinsics.checkNotNullParameter(style, "style");
        this.f110780a = descriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d) || !this.f110780a.equals(((d) obj2).f110780a)) {
            return false;
        }
        Object obj3 = ModalDestination.Style.FullscreenPaged.f98310a;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return ModalDestination.Style.FullscreenPaged.f98310a.hashCode() + (this.f110780a.f95355a.hashCode() * 31);
    }
}
