package com.revolut.feature.apm.bills.core.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillTransferType;", "Landroid/os/Parcelable;", "", "DARF", "UTILITY", "BANK_SLIP", "BILL_PAYMENT", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BillTransferType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BillTransferType[] $VALUES;
    public static final BillTransferType BANK_SLIP;
    public static final BillTransferType BILL_PAYMENT;

    @NotNull
    public static final Parcelable.Creator<BillTransferType> CREATOR;
    public static final BillTransferType DARF;
    public static final BillTransferType UTILITY;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return BillTransferType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillTransferType[i];
        }
    }

    static {
        BillTransferType billTransferType = new BillTransferType("DARF", 0);
        DARF = billTransferType;
        BillTransferType billTransferType2 = new BillTransferType("UTILITY", 1);
        UTILITY = billTransferType2;
        BillTransferType billTransferType3 = new BillTransferType("BANK_SLIP", 2);
        BANK_SLIP = billTransferType3;
        BillTransferType billTransferType4 = new BillTransferType("BILL_PAYMENT", 3);
        BILL_PAYMENT = billTransferType4;
        BillTransferType[] billTransferTypeArr = {billTransferType, billTransferType2, billTransferType3, billTransferType4};
        $VALUES = billTransferTypeArr;
        $ENTRIES = s.n(billTransferTypeArr);
        CREATOR = new a();
    }

    public static BillTransferType valueOf(String str) {
        return (BillTransferType) Enum.valueOf(BillTransferType.class, str);
    }

    public static BillTransferType[] values() {
        return (BillTransferType[]) $VALUES.clone();
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
