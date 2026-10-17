package com.revolut.feature.wealth.ui.impl.transfer_picker;

import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$TransferAccount;
import kotlin.jvm.internal.Intrinsics;
import snh.i;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthTransferPickerControllerContract$TransferAccount.TaxAdvantageAccount f96086a;

    public d(WealthTransferPickerControllerContract$TransferAccount.TaxAdvantageAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f96086a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f96086a, ((d) obj2).f96086a);
    }

    public final int hashCode() {
        return this.f96086a.hashCode();
    }
}
