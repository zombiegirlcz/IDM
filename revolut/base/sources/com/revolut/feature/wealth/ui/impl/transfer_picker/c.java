package com.revolut.feature.wealth.ui.impl.transfer_picker;

import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$TransferAccount;
import kotlin.jvm.internal.Intrinsics;
import snh.i;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthTransferPickerControllerContract$TransferAccount.Securities f96085a;

    public c(WealthTransferPickerControllerContract$TransferAccount.Securities account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f96085a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f96085a, ((c) obj2).f96085a);
    }

    public final int hashCode() {
        return this.f96085a.hashCode();
    }
}
