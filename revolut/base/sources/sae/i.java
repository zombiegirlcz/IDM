package sae;

import com.revolut.data.model.Data;
import com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerScreenContract$SelectedBalanceInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f261389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentBalancePickerScreenContract$SelectedBalanceInfo f261390b;

    public i(Data domainContentData, PaymentBalancePickerScreenContract$SelectedBalanceInfo selectedBalanceInfo) {
        Intrinsics.checkNotNullParameter(domainContentData, "domainContentData");
        Intrinsics.checkNotNullParameter(selectedBalanceInfo, "selectedBalanceInfo");
        this.f261389a = domainContentData;
        this.f261390b = selectedBalanceInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f261389a, iVar.f261389a) && Intrinsics.f(this.f261390b, iVar.f261390b);
    }

    public final int hashCode() {
        return this.f261390b.hashCode() + (this.f261389a.hashCode() * 31);
    }
}
