package com.revolut.retail.feature.beneficiary.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/models/BeneficiaryIdentificationType;", "Landroid/os/Parcelable;", "", "BR_CPF", "BR_CNPJ", "feature_beneficiary_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BeneficiaryIdentificationType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BeneficiaryIdentificationType[] $VALUES;
    public static final BeneficiaryIdentificationType BR_CNPJ;
    public static final BeneficiaryIdentificationType BR_CPF;

    @NotNull
    public static final Parcelable.Creator<BeneficiaryIdentificationType> CREATOR;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return BeneficiaryIdentificationType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BeneficiaryIdentificationType[i];
        }
    }

    static {
        BeneficiaryIdentificationType beneficiaryIdentificationType = new BeneficiaryIdentificationType("BR_CPF", 0);
        BR_CPF = beneficiaryIdentificationType;
        BeneficiaryIdentificationType beneficiaryIdentificationType2 = new BeneficiaryIdentificationType("BR_CNPJ", 1);
        BR_CNPJ = beneficiaryIdentificationType2;
        BeneficiaryIdentificationType[] beneficiaryIdentificationTypeArr = {beneficiaryIdentificationType, beneficiaryIdentificationType2};
        $VALUES = beneficiaryIdentificationTypeArr;
        $ENTRIES = s.n(beneficiaryIdentificationTypeArr);
        CREATOR = new a();
    }

    public static BeneficiaryIdentificationType valueOf(String str) {
        return (BeneficiaryIdentificationType) Enum.valueOf(BeneficiaryIdentificationType.class, str);
    }

    public static BeneficiaryIdentificationType[] values() {
        return (BeneficiaryIdentificationType[]) $VALUES.clone();
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
