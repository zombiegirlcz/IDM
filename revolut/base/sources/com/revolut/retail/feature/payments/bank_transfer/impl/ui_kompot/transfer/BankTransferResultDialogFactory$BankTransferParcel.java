package com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/transfer/BankTransferResultDialogFactory$BankTransferParcel", "Landroid/os/Parcelable;", "", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/transfer/BankTransferResultDialogFactory$BankTransferParcel;", "INVALID_USER_TAX_ID", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankTransferResultDialogFactory$BankTransferParcel implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BankTransferResultDialogFactory$BankTransferParcel[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<BankTransferResultDialogFactory$BankTransferParcel> CREATOR;
    public static final BankTransferResultDialogFactory$BankTransferParcel INVALID_USER_TAX_ID;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return BankTransferResultDialogFactory$BankTransferParcel.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BankTransferResultDialogFactory$BankTransferParcel[i];
        }
    }

    static {
        BankTransferResultDialogFactory$BankTransferParcel bankTransferResultDialogFactory$BankTransferParcel = new BankTransferResultDialogFactory$BankTransferParcel("INVALID_USER_TAX_ID", 0);
        INVALID_USER_TAX_ID = bankTransferResultDialogFactory$BankTransferParcel;
        BankTransferResultDialogFactory$BankTransferParcel[] bankTransferResultDialogFactory$BankTransferParcelArr = {bankTransferResultDialogFactory$BankTransferParcel};
        $VALUES = bankTransferResultDialogFactory$BankTransferParcelArr;
        $ENTRIES = s.n(bankTransferResultDialogFactory$BankTransferParcelArr);
        CREATOR = new a();
    }

    public static BankTransferResultDialogFactory$BankTransferParcel valueOf(String str) {
        return (BankTransferResultDialogFactory$BankTransferParcel) Enum.valueOf(BankTransferResultDialogFactory$BankTransferParcel.class, str);
    }

    public static BankTransferResultDialogFactory$BankTransferParcel[] values() {
        return (BankTransferResultDialogFactory$BankTransferParcel[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
