package buf;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManualTransferData f18804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyRequest f18805b;

    public h(MoneyRequest moneyRequest, ManualTransferData transferData) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(moneyRequest, "moneyRequest");
        this.f18804a = transferData;
        this.f18805b = moneyRequest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f18804a, hVar.f18804a) && Intrinsics.f(this.f18805b, hVar.f18805b);
    }

    public final int hashCode() {
        return this.f18805b.hashCode() + (this.f18804a.hashCode() * 31);
    }
}
