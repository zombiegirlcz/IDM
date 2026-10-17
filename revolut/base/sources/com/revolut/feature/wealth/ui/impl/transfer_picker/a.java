package com.revolut.feature.wealth.ui.impl.transfer_picker;

import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$TransferAccount;
import kotlin.jvm.internal.Intrinsics;
import snh.i;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthTransferPickerControllerContract$TransferAccount.Margin f96083a;

    public a(WealthTransferPickerControllerContract$TransferAccount.Margin account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f96083a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f96083a, ((a) obj2).f96083a);
    }

    public final int hashCode() {
        return this.f96083a.hashCode();
    }
}
