package com.revolut.feature.apm.bills.core.api.model.search.boleto;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/search/boleto/BillBoletoAliasType;", "Landroid/os/Parcelable;", "", "CNPJ", "CPF", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BillBoletoAliasType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BillBoletoAliasType[] $VALUES;
    public static final BillBoletoAliasType CNPJ;
    public static final BillBoletoAliasType CPF;

    @NotNull
    public static final Parcelable.Creator<BillBoletoAliasType> CREATOR;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return BillBoletoAliasType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillBoletoAliasType[i];
        }
    }

    static {
        BillBoletoAliasType billBoletoAliasType = new BillBoletoAliasType("CNPJ", 0);
        CNPJ = billBoletoAliasType;
        BillBoletoAliasType billBoletoAliasType2 = new BillBoletoAliasType("CPF", 1);
        CPF = billBoletoAliasType2;
        BillBoletoAliasType[] billBoletoAliasTypeArr = {billBoletoAliasType, billBoletoAliasType2};
        $VALUES = billBoletoAliasTypeArr;
        $ENTRIES = s.n(billBoletoAliasTypeArr);
        CREATOR = new a();
    }

    public static BillBoletoAliasType valueOf(String str) {
        return (BillBoletoAliasType) Enum.valueOf(BillBoletoAliasType.class, str);
    }

    public static BillBoletoAliasType[] values() {
        return (BillBoletoAliasType[]) $VALUES.clone();
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
