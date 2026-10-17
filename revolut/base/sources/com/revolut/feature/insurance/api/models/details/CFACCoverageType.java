package com.revolut.feature.insurance.api.models.details;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/insurance/api/models/details/CFACCoverageType;", "Landroid/os/Parcelable;", "", "TRANSPORTATION", "ACCOMMODATION", "TRANSPORTATION_BOOKINGS", "SPORT_RENTALS", "EVENTS", "SPORT_RENTALS_AND_EVENTS", "ATTRACTIONS", "UNKNOWN", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CFACCoverageType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CFACCoverageType[] $VALUES;
    public static final CFACCoverageType ACCOMMODATION;
    public static final CFACCoverageType ATTRACTIONS;

    @NotNull
    public static final Parcelable.Creator<CFACCoverageType> CREATOR;
    public static final CFACCoverageType EVENTS;
    public static final CFACCoverageType SPORT_RENTALS;
    public static final CFACCoverageType SPORT_RENTALS_AND_EVENTS;
    public static final CFACCoverageType TRANSPORTATION;
    public static final CFACCoverageType TRANSPORTATION_BOOKINGS;
    public static final CFACCoverageType UNKNOWN;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return CFACCoverageType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACCoverageType[i];
        }
    }

    static {
        CFACCoverageType cFACCoverageType = new CFACCoverageType("TRANSPORTATION", 0);
        TRANSPORTATION = cFACCoverageType;
        CFACCoverageType cFACCoverageType2 = new CFACCoverageType("ACCOMMODATION", 1);
        ACCOMMODATION = cFACCoverageType2;
        CFACCoverageType cFACCoverageType3 = new CFACCoverageType("TRANSPORTATION_BOOKINGS", 2);
        TRANSPORTATION_BOOKINGS = cFACCoverageType3;
        CFACCoverageType cFACCoverageType4 = new CFACCoverageType("SPORT_RENTALS", 3);
        SPORT_RENTALS = cFACCoverageType4;
        CFACCoverageType cFACCoverageType5 = new CFACCoverageType("EVENTS", 4);
        EVENTS = cFACCoverageType5;
        CFACCoverageType cFACCoverageType6 = new CFACCoverageType("SPORT_RENTALS_AND_EVENTS", 5);
        SPORT_RENTALS_AND_EVENTS = cFACCoverageType6;
        CFACCoverageType cFACCoverageType7 = new CFACCoverageType("ATTRACTIONS", 6);
        ATTRACTIONS = cFACCoverageType7;
        CFACCoverageType cFACCoverageType8 = new CFACCoverageType("UNKNOWN", 7);
        UNKNOWN = cFACCoverageType8;
        CFACCoverageType[] cFACCoverageTypeArr = {cFACCoverageType, cFACCoverageType2, cFACCoverageType3, cFACCoverageType4, cFACCoverageType5, cFACCoverageType6, cFACCoverageType7, cFACCoverageType8};
        $VALUES = cFACCoverageTypeArr;
        $ENTRIES = s.n(cFACCoverageTypeArr);
        CREATOR = new a();
    }

    public static CFACCoverageType valueOf(String str) {
        return (CFACCoverageType) Enum.valueOf(CFACCoverageType.class, str);
    }

    public static CFACCoverageType[] values() {
        return (CFACCoverageType[]) $VALUES.clone();
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
