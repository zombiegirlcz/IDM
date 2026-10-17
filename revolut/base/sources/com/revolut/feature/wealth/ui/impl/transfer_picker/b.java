package com.revolut.feature.wealth.ui.impl.transfer_picker;

import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$TransferAccount;
import kotlin.jvm.internal.Intrinsics;
import snh.i;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthTransferPickerControllerContract$TransferAccount.Robo f96084a;

    public b(WealthTransferPickerControllerContract$TransferAccount.Robo account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f96084a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f96084a, ((b) obj2).f96084a);
    }

    public final int hashCode() {
        return this.f96084a.hashCode();
    }
}
