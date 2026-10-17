package com.revolut.feature.apm.core.models.payments_authorisations;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/AmountType;", "Landroid/os/Parcelable;", "", "BALLOON", "FIXED", "USAGE_BASED", "VARIABLE", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AmountType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AmountType[] $VALUES;
    public static final AmountType BALLOON;

    @NotNull
    public static final Parcelable.Creator<AmountType> CREATOR;
    public static final AmountType FIXED;
    public static final AmountType USAGE_BASED;
    public static final AmountType VARIABLE;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return AmountType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AmountType[i];
        }
    }

    static {
        AmountType amountType = new AmountType("BALLOON", 0);
        BALLOON = amountType;
        AmountType amountType2 = new AmountType("FIXED", 1);
        FIXED = amountType2;
        AmountType amountType3 = new AmountType("USAGE_BASED", 2);
        USAGE_BASED = amountType3;
        AmountType amountType4 = new AmountType("VARIABLE", 3);
        VARIABLE = amountType4;
        AmountType[] amountTypeArr = {amountType, amountType2, amountType3, amountType4};
        $VALUES = amountTypeArr;
        $ENTRIES = s.n(amountTypeArr);
        CREATOR = new a();
    }

    public static AmountType valueOf(String str) {
        return (AmountType) Enum.valueOf(AmountType.class, str);
    }

    public static AmountType[] values() {
        return (AmountType[]) $VALUES.clone();
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
