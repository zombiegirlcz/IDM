package com.revolut.feature.categorisation.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/categorisation/api/model/PeriodPreferenceType;", "Landroid/os/Parcelable;", "", "WEEK", "MONTH", "YEAR", "feature_categorization_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PeriodPreferenceType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PeriodPreferenceType[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<PeriodPreferenceType> CREATOR;
    public static final PeriodPreferenceType MONTH;
    public static final PeriodPreferenceType WEEK;
    public static final PeriodPreferenceType YEAR;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PeriodPreferenceType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PeriodPreferenceType[i];
        }
    }

    static {
        PeriodPreferenceType periodPreferenceType = new PeriodPreferenceType("WEEK", 0);
        WEEK = periodPreferenceType;
        PeriodPreferenceType periodPreferenceType2 = new PeriodPreferenceType("MONTH", 1);
        MONTH = periodPreferenceType2;
        PeriodPreferenceType periodPreferenceType3 = new PeriodPreferenceType("YEAR", 2);
        YEAR = periodPreferenceType3;
        PeriodPreferenceType[] periodPreferenceTypeArr = {periodPreferenceType, periodPreferenceType2, periodPreferenceType3};
        $VALUES = periodPreferenceTypeArr;
        $ENTRIES = s.n(periodPreferenceTypeArr);
        CREATOR = new a();
    }

    public static PeriodPreferenceType valueOf(String str) {
        return (PeriodPreferenceType) Enum.valueOf(PeriodPreferenceType.class, str);
    }

    public static PeriodPreferenceType[] values() {
        return (PeriodPreferenceType[]) $VALUES.clone();
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
