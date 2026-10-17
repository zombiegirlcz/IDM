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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillTransferPayerType;", "Landroid/os/Parcelable;", "", "PF", "PJ", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BillTransferPayerType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BillTransferPayerType[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<BillTransferPayerType> CREATOR;
    public static final BillTransferPayerType PF;
    public static final BillTransferPayerType PJ;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return BillTransferPayerType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillTransferPayerType[i];
        }
    }

    static {
        BillTransferPayerType billTransferPayerType = new BillTransferPayerType("PF", 0);
        PF = billTransferPayerType;
        BillTransferPayerType billTransferPayerType2 = new BillTransferPayerType("PJ", 1);
        PJ = billTransferPayerType2;
        BillTransferPayerType[] billTransferPayerTypeArr = {billTransferPayerType, billTransferPayerType2};
        $VALUES = billTransferPayerTypeArr;
        $ENTRIES = s.n(billTransferPayerTypeArr);
        CREATOR = new a();
    }

    public static BillTransferPayerType valueOf(String str) {
        return (BillTransferPayerType) Enum.valueOf(BillTransferPayerType.class, str);
    }

    public static BillTransferPayerType[] values() {
        return (BillTransferPayerType[]) $VALUES.clone();
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
